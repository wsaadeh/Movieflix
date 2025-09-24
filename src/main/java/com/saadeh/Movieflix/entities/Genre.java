package com.saadeh.Movieflix.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_genre")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
}
