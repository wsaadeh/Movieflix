package com.saadeh.Movieflix.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @EqualsAndHashCode.Include
    private String email;
    private String password;
}
