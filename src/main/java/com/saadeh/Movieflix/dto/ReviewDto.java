package com.saadeh.Movieflix.dto;

import com.saadeh.Movieflix.entities.Movie;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ReviewDto {
    private Long id;

    @NotBlank(message = "Field Required")
    private String text;

    @NotBlank(message = "Field Required")
    private Movie movieId;

    private Long userId;
    private String userName;
    private String userEmail;

}
