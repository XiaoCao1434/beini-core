package com.beini.core.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.core.entity.product.ProductAndAttribute;

public interface ProductAndAttributeRepository extends JpaRepository<ProductAndAttribute, Integer>, JpaSpecificationExecutor<ProductAndAttribute> {

}
