package com.saadeh.Movieflix.repositories;

import com.saadeh.Movieflix.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
