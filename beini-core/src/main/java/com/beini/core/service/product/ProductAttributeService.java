package com.beini.core.service.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.core.entity.product.ProductAttribute;

public interface ProductAttributeService {
	/*查询*/
	Page<ProductAttribute> findAll(Pageable pageable);
	ProductAttribute findById(String id);
	/*更新*/
	ProductAttribute save(ProductAttribute bean);
	ProductAttribute update(ProductAttribute bean);
	void delete(String... id);
}
