package com.beini.core.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.core.entity.product.ProductDescription;

public interface ProductDescriptionRepository extends JpaRepository<ProductDescription, Integer>, JpaSpecificationExecutor<ProductDescription> {

}
