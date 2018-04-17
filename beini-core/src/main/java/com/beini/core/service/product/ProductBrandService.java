package com.beini.core.service.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.core.entity.product.ProductBrand;

public interface ProductBrandService {
	/*查询*/
	Page<ProductBrand> findAll(Pageable pageable);
	ProductBrand findById(String id);
	/*更新*/
	ProductBrand save(ProductBrand bean);
	ProductBrand update(ProductBrand bean);
	void delete(String... id);
}
