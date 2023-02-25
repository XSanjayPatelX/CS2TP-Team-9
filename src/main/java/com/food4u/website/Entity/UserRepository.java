package com.food4u.website.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT user FROM User user WHERE user.email_address = ?1")
    public User findByEmail(String email_address);

//    @Query("SELECT * FROM users u WHERE u.password = ?1")
//    public User findByEmail(String email);
}
