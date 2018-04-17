package com.beini.core.service.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.core.entity.product.ProductSpecification;
import com.beini.core.repository.product.ProductSpecificationRepository;
import com.beini.core.service.product.ProductSpecificationService;
@Service
public class ProductSpecificationServiceImpl implements ProductSpecificationService {
	@Autowired
	private ProductSpecificationRepository repository;
	@Override
	public Page<ProductSpecification> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public ProductSpecification findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public ProductSpecification save(ProductSpecification bean) {
		return repository.save(bean);
	}

	@Override
	public ProductSpecification update(ProductSpecification bean) {
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
