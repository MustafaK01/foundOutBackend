package com.mustafak01.foundoutbackendrestaurants.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CommentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id",unique = true)
    private Long id;

    @Column(name = "comment",unique = false,nullable = false)
    private String comment;

    @Column(name = "user_name",nullable = false)
    private String userName;

    @Column(name = "created_date")
    private String createdDate;

    @ManyToOne
    @JoinColumn(name = "user_restaurant_id")
    UserModel userModel;
}
