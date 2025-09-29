package com.saadeh.Movieflix.controllers;

import com.saadeh.Movieflix.dto.RoleDto;
import com.saadeh.Movieflix.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/roles")
public class RoleController {

    @Autowired
    private RoleService service;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public ResponseEntity<List<RoleDto>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }
}
