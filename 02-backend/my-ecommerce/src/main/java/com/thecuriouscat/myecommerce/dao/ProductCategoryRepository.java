package com.thecuriouscat.myecommerce.dao;

import com.thecuriouscat.myecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/5/22
 */

//@Repository
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
//collectionResourceRel: name of JSON entry, path: /product-category
//the default don't work for resource-specified given data
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {


}
