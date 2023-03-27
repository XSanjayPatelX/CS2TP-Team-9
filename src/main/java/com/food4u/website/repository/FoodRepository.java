package com.food4u.website.repository;

import com.food4u.website.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<FoodItem, Integer> {

    @Query(value="select * from food_item e where e.name like %:keyword% or e.category like %:keyword%", nativeQuery = true)
    List<FoodItem> findByKeyword(@Param("keyword") String keyword);


}
