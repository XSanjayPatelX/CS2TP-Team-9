package com.food4u.website.repository;

import com.food4u.website.entity.FoodItem;
import com.food4u.website.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodItem, Integer> {
    FoodItem findById(int id);
}
