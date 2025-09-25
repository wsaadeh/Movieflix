package com.saadeh.Movieflix.projections;

public interface UserDetailsProjection {
    String getUserName();

    String getPassword();

    Long getRoleId();

    String getAuthority();
}
