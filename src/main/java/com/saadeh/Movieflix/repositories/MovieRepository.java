package com.saadeh.Movieflix.repositories;

import com.saadeh.Movieflix.dto.MovieCardDto;
import com.saadeh.Movieflix.entities.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query("SELECT obj FROM Movie obj JOIN FETCH obj.genre WHERE obj.genre.id = :genreId")
    Page<MovieCardDto> searchAll(Long genreId, Pageable pageable);
}
