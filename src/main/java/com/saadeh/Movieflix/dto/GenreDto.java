package com.saadeh.Movieflix.dto;

import com.saadeh.Movieflix.entities.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GenreDto {
    private Long id;
    private String name;

    public GenreDto(Genre entity){
        id = entity.getId();
        name = entity.getName();
    }
}
