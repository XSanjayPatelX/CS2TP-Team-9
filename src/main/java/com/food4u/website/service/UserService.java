package com.food4u.website.service;

import com.food4u.website.dto.UserDto;
import com.food4u.website.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
