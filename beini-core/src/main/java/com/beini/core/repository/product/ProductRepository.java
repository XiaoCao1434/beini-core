package com.beini.core.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.core.entity.product.Product;

public interface ProductRepository extends JpaSpecificationExecutor<Product>, JpaRepository<Product, String> {

}
