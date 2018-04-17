package com.beini.core.service.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.core.entity.product.ProductCategory;
import com.beini.core.repository.product.ProductCategoryRepository;
import com.beini.core.service.product.ProductCategoryService;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	@Autowired
	private ProductCategoryRepository repository;
	@Override
	public Page<ProductCategory> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public ProductCategory findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public ProductCategory save(ProductCategory bean) {
		return repository.save(bean);
	}

	@Override
	public ProductCategory update(ProductCategory bean) {
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
