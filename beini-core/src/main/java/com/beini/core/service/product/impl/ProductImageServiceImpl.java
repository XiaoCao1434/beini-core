package com.beini.core.service.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.core.entity.product.ProductImage;
import com.beini.core.repository.product.ProductImageRepository;
import com.beini.core.service.product.ProductImageService;
@Service
public class ProductImageServiceImpl implements ProductImageService {
	@Autowired
	private ProductImageRepository repository;

	@Override
	public Page<ProductImage> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public ProductImage findById(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public ProductImage save(ProductImage bean) {
		return repository.save(bean);
	}

	@Override
	public ProductImage update(ProductImage bean) {
		return repository.save(bean);
	}

	@Override
	public void delete(Integer... id) {
		try {
			for(Integer key:id) {
				repository.delete(key);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
