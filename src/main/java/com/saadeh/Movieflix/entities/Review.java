package com.saadeh.Movieflix.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_review")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    private String text;
}
