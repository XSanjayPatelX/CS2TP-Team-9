package com.food4u.website.repository;

import com.food4u.website.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT user FROM User user WHERE user.email = ?1")
    User findByEmail(String email);

    boolean existsByEmail(String email);
}
