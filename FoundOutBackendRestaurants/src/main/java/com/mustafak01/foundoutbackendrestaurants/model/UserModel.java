package com.mustafak01.foundoutbackendrestaurants.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

/*@Getter
@Setter*/
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_restaurant_id",unique = true)
    private Long id;

    @Column(name = "user_restaurant_password")
    private String password;

    @Column(name = "user_restaurant_email",unique = true)
    private String email;

    @Column(name = "user_restaurant_phoneNumber")
    private String phoneNumber;

    @Column(name = "user_restaurant_title",unique = true)
    private String title;

    @Column(name = "user_restaurant_address")
    private String address;

    @OneToMany(mappedBy = "userModel",cascade = CascadeType.ALL,orphanRemoval = true)
    List<MenuModel> menuModels;

    public UserModel(Long id, String password,String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }
}
