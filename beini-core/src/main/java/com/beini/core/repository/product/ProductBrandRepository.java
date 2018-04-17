package com.beini.core.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.core.entity.product.ProductBrand;

public interface ProductBrandRepository extends JpaRepository<ProductBrand, String>, JpaSpecificationExecutor<ProductBrand> {

}
