package com.beini.core.service.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.beini.core.entity.product.ProductAndAttribute;

public interface ProductAndAttributeService {
	
	/*查询*/
	Page<ProductAndAttribute> findAll(Pageable pageable);
	ProductAndAttribute findById(Integer id);
	/*更新*/
	ProductAndAttribute save(ProductAndAttribute bean);
	ProductAndAttribute update(ProductAndAttribute bean);
	void delete(Integer... id);
}
