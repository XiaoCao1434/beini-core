package com.beini.core.service.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.core.entity.product.ProductSpecification;

public interface ProductSpecificationService {
	/*查询*/
	Page<ProductSpecification> findAll(Pageable pageable);
	ProductSpecification findById(String id);
	/*更新*/
	ProductSpecification save(ProductSpecification bean);
	ProductSpecification update(ProductSpecification bean);
	void delete(String... id);
}
