package com.beini.core.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.core.entity.product.ProductAttribute;

public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, String>, JpaSpecificationExecutor<ProductAttribute> {

}
