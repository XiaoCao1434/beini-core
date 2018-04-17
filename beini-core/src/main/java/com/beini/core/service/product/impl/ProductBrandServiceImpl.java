package com.beini.core.service.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.core.entity.product.ProductBrand;
import com.beini.core.repository.product.ProductBrandRepository;
import com.beini.core.service.product.ProductBrandService;
@Service
public class ProductBrandServiceImpl implements ProductBrandService {
	@Autowired
	private ProductBrandRepository repository;
	@Override
	public Page<ProductBrand> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public ProductBrand findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public ProductBrand save(ProductBrand bean) {
		return repository.save(bean);
	}

	@Override
	public ProductBrand update(ProductBrand bean) {
		return repository.save(bean);
	}

	@Override
	public void delete(String... id) {
		try {
			for(String str:id) {
				repository.delete(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
