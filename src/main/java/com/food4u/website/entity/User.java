package com.food4u.website.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User
{
    private static final long serialVersionUID = 1L;

    @Column(nullable=false, unique=true, name="email")
    private String email;

    @Column(nullable=false)
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false, name="first_name")
    private String firstName;

    @Column(nullable=false, name="last_name")
    private String lastName;

    @Column(nullable=true)
    private String admin;

    @Column(nullable=true, name="join_date")
    private Date joinDate;

    @Column(nullable=true, name="address_line1")
    private String address1;

    @Column(nullable=true, name="address_line2")
    private String address2;

    @Column(nullable=true)
    private String city;

    @Column(nullable=true)
    private String postcode;

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private List<Role> roles = new ArrayList<>();


}
