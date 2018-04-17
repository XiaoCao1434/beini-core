package com.beini.core.service.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.beini.core.entity.product.ProductStatistics;
import com.beini.core.repository.product.ProductStatisticsRepository;
import com.beini.core.service.product.ProductStatisticsService;
@Service
public class ProductStatisticsServiceImpl implements ProductStatisticsService {
	@Autowired
	private ProductStatisticsRepository repository;

	@Override
	public Page<ProductStatistics> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public ProductStatistics findById(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public ProductStatistics save(ProductStatistics bean) {
		return repository.save(bean);
	}

	@Override
	public ProductStatistics update(ProductStatistics bean) {
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
