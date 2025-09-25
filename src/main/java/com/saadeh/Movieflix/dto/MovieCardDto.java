package com.saadeh.Movieflix.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MovieCardDto {
    private Long id;
    private String title;
    private String subTitle;
    private Integer year;
    private String imgUrl;
}
