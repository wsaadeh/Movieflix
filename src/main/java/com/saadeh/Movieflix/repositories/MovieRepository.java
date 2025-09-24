package com.saadeh.Movieflix.repositories;

import com.saadeh.Movieflix.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
