package com.saadeh.Movieflix.services;

import com.saadeh.Movieflix.dto.RoleDto;
import com.saadeh.Movieflix.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository repository;

    @Transactional(readOnly = true)
    public List<RoleDto> findAll(){
        return repository.findAll().stream().map(RoleDto::new).toList();
    }

}
