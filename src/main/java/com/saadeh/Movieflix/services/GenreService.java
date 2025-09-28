package com.saadeh.Movieflix.services;

import com.saadeh.Movieflix.dto.GenreDto;
import com.saadeh.Movieflix.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GenreService {

    @Autowired
    private GenreRepository repository;

    @Transactional(readOnly = true)
    public List<GenreDto> findAll() {
        return repository.findAll().stream().map(x-> new GenreDto(x)).toList();
    }
}
