package com.beini.core.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.beini.core.entity.product.ProductStatistics;

public interface ProductStatisticsRepository extends JpaRepository<ProductStatistics, Integer>, JpaSpecificationExecutor<ProductStatistics> {

}
