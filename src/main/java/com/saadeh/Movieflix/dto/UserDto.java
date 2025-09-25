package com.saadeh.Movieflix.dto;

import com.saadeh.Movieflix.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private Long id;
    private String name;
    private String email;

    public UserDto(User entity){
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
    }

}
