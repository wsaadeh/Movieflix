package com.saadeh.Movieflix.dto;

import com.saadeh.Movieflix.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoleDto {
    private Long id;
    private String authority;

    public RoleDto(Role entity){
        id= entity.getId();
        authority= entity.getAuthority();
    }
}
