package com.saadeh.Movieflix.services;

import com.saadeh.Movieflix.dto.ReviewDto;
import com.saadeh.Movieflix.entities.Review;
import com.saadeh.Movieflix.entities.User;
import com.saadeh.Movieflix.repositories.MovieRepository;
import com.saadeh.Movieflix.repositories.ReviewRepository;
import com.saadeh.Movieflix.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService service;

    @Transactional
    public ReviewDto insert(ReviewDto dto){
        Review entity = new Review();
        copyDtoToEntity(dto,entity);
        repository.save(entity);
        return new ReviewDto(entity);
    }

    private void copyDtoToEntity(ReviewDto dto, Review entity) {
        entity.setId(dto.getId());
        entity.setText(dto.getText());
        entity.setMovie(movieRepository.getReferenceById(dto.getMovieId()));
        entity.setUser(userRepository.getReferenceById(service.getProfile().getId()));
    }

    @Transactional(readOnly = true)
    public List<ReviewDto> findAll() {
        return repository.findAll().stream().map(x-> new ReviewDto(x)).toList();
    }
}
