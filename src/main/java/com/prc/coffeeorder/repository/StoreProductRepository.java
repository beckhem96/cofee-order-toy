package com.prc.coffeeorder.repository;

import com.prc.coffeeorder.domain.StoreProduct;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StoreProductRepository extends CrudRepository<StoreProduct, Integer> {
    Optional<StoreProduct> findByStoreIdAndProductId(int store, int productCode);
}
