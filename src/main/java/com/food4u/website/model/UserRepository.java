package com.food4u.website.model;

import org.springframework.data.repository.CrudRepository;

import com.food4u.website.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
