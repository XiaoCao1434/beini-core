package com.beini.core.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.core.entity.product.ProductSpecification;

public interface ProductSpecificationRepository extends JpaRepository<ProductSpecification, String>, JpaSpecificationExecutor<ProductSpecification> {

}
