package com.beini.core.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.core.entity.product.ProductCategory;

public interface ProductCategoryRepository extends JpaSpecificationExecutor<ProductCategory>,JpaRepository<ProductCategory, String>{

}
