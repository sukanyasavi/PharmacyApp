package com.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.model.ProductOrders;
@Repository
public interface ProductOrdersRepository extends JpaRepository<ProductOrders,Long>{

}
