package com.saadeh.Movieflix.controllers;

import com.saadeh.Movieflix.dto.MovieCardDto;
import com.saadeh.Movieflix.dto.MovieDetailsDto;
import com.saadeh.Movieflix.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @PreAuthorize("hasAnyRole('VISITOR', 'MEMBER')")
    @GetMapping
    public ResponseEntity<Page<MovieCardDto>> findAllPaged(Pageable pageable){
        return ResponseEntity.ok().body(service.findAllPaged(pageable));
    }

    @PreAuthorize("hasAnyRole('VISITOR', 'MEMBER')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<MovieDetailsDto> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }
}
