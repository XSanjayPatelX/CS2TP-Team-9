package com.food4u.website.entity;

import com.food4u.website.security.CustomUserDetails;
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

    //@OneToMany(cascade = CascadeType.ALL)
    //private List<OrderItem> orderItems;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "estimated_delivery", nullable = false)
    private LocalDateTime estimatedDelivery;

    @Column(name = "is_delivered", nullable = false)
    private boolean isDelivered;

    @Column(nullable = false)
    private float total;

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
            name="orders_order_item",
            joinColumns={@JoinColumn(name="ORDER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ORDER_ITEM_ID", referencedColumnName="ID")})
    private List<OrderItem> orderItems;

    public Orders(User user, LocalDateTime orderDate, LocalDateTime estimatedDelivery, boolean isDelivered, boolean isOrdered) {
        this.user = user;
        this.orderDate = orderDate;
        this.estimatedDelivery = estimatedDelivery;
        this.isDelivered = isDelivered;
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", orderDate=" + orderDate +
                ", estimatedDelivery=" + estimatedDelivery +
                ", isDelivered=" + isDelivered +
                '}';
    }
}