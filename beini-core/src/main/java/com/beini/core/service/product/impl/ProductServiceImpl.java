package com.beini.core.service.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.core.entity.product.Product;
import com.beini.core.repository.product.ProductRepository;
import com.beini.core.service.product.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repository;
	@Override
	public Page<Product> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public Product findById(String id) {
		return repository.findOne(id);
	}

	@Override
	public Product save(Product bean) {
		return repository.save(bean);
	}

	@Override
	public Product update(Product bean) {
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
