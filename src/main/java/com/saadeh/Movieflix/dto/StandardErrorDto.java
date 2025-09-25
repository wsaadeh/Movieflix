package com.saadeh.Movieflix.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
public class StandardErrorDto {
    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
