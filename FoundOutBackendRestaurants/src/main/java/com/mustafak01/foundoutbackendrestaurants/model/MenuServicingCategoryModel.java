package com.mustafak01.foundoutbackendrestaurants.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu_servicing_categories")
public class MenuServicingCategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "servicings_category_id",unique = true)
    int serviceId;

    @Column(name = "servicings_category_name")
    String categoryName;//içecek,yemek,vs

    @OneToMany(mappedBy = "menuServicingCategoryModel",cascade = CascadeType.ALL,orphanRemoval = true)
    List<MenuModel> menuModels ;
}
