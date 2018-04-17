package com.beini.core.service.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.core.entity.product.Product;

public interface ProductService {
	/*查询*/
	Page<Product> findAll(Pageable pageable);
	Product findById(String id);
	/*更新*/
	Product save(Product bean);
	Product update(Product bean);
	void delete(String... id);
}
