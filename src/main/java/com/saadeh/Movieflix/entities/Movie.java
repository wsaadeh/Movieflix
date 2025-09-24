package com.saadeh.Movieflix.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_movie")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String title;
    private String subtitle;
    private Integer year;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String synopsis;
}
