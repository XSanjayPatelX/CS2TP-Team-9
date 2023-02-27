package com.example.demo.Food_Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Food_ItemRepository extends JpaRepository<Food_Item, Integer> {
}
