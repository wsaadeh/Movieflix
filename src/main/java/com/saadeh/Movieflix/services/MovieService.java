package com.saadeh.Movieflix.services;

import com.saadeh.Movieflix.dto.MovieCardDto;
import com.saadeh.Movieflix.dto.MovieDetailsDto;
import com.saadeh.Movieflix.repositories.MovieRepository;
import com.saadeh.Movieflix.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieCardDto> findAllPaged(Pageable pageable){
        if (pageable.getSort().isEmpty()){
            pageable = PageRequest.of(pageable.getPageNumber(),pageable.getPageSize(),Sort.by("title").ascending());
        }
        return repository.findAll(pageable).map(MovieCardDto::new);
    }

    @Transactional(readOnly = true)
    public MovieDetailsDto findById(Long id) {

        return repository.findById(id)
                .stream()
                .map(MovieDetailsDto::new)
                .findFirst()
                .orElseThrow(()-> new ResourceNotFoundException("Entity not found."));
    }
}
