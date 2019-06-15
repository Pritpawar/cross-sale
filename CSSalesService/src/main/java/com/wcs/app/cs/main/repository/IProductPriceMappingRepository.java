package com.wcs.app.cs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcs.app.cs.main.model.ProductPriceMapping;

public interface IProductPriceMappingRepository extends JpaRepository<ProductPriceMapping,Integer> {

}
