package com.beini.core.service.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.core.entity.product.ProductAttribute;
import com.beini.core.repository.product.ProductAttributeRepository;
import com.beini.core.service.product.ProductAttributeService;
@Service
public class ProductAttributeServiceImpl implements ProductAttributeService {
	@Autowired
	private ProductAttributeRepository repository;
	@Override
	public Page<ProductAttribute> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public ProductAttribute findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public ProductAttribute save(ProductAttribute bean) {
		return repository.save(bean);
	}

	@Override
	public ProductAttribute update(ProductAttribute bean) {
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
