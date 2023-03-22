package com.food4u.website.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "estimated_delivery", nullable = false)
    private LocalDateTime estimatedDelivery;

    @Column(name = "is_delivered", nullable = false)
    private boolean isDelivered;

    @Column(name = "is_ordered", nullable = false)
    private boolean isOrdered;

    public Orders(User user, LocalDateTime orderDate, LocalDateTime estimatedDelivery, boolean isDelivered, boolean isOrdered) {
        this.user = user;
        this.orderDate = orderDate;
        this.estimatedDelivery = estimatedDelivery;
        this.isDelivered = isDelivered;
        this.isOrdered = isOrdered;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getEstimatedDelivery() {
        return estimatedDelivery;
    }

    public void setEstimatedDelivery(LocalDateTime estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", orderDate=" + orderDate +
                ", estimatedDelivery=" + estimatedDelivery +
                ", isDelivered=" + isDelivered +
                ", isOrdered=" + isOrdered +
                '}';
    }
}