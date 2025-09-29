package com.saadeh.Movieflix.dto;

import com.saadeh.Movieflix.entities.Movie;
import com.saadeh.Movieflix.entities.Review;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReviewDto {
    private Long id;

    @NotBlank(message = "Field Required")
    private String text;

    @NotNull(message = "Field Required")
    private Long movieId;

    private Long userId;
    private String userName;
    private String userEmail;

    public ReviewDto(Review entity){
        id = entity.getId();
        text = entity.getText();
        movieId = entity.getMovie().getId();
        userId = entity.getUser().getId();
        userName = entity.getUser().getName();
        userEmail = entity.getUser().getEmail();
    }

}
