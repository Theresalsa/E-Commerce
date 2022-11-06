package com.thecuriouscat.myecommerce.dao;

import com.thecuriouscat.myecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/5/22
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
