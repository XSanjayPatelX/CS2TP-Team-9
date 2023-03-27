package com.food4u.website.repository;

import com.food4u.website.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

    @Query(value = "SELECT * FROM order_item WHERE order_id =?", nativeQuery = true)
    List<OrderItem> findAllByOrderId(int id);
}
