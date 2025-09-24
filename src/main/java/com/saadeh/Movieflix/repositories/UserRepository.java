package com.saadeh.Movieflix.repositories;

import com.saadeh.Movieflix.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
