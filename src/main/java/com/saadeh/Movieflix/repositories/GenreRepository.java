package com.saadeh.Movieflix.repositories;

import com.saadeh.Movieflix.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
