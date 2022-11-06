package com.thecuriouscat.myecommerce.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/5/22
 */
@Entity
@Table(name = "product_category")
@Getter
@Setter
//@Data //NOT used due to known error with lombok's @Data with one-to-many and many-to-one db relationships
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

}
