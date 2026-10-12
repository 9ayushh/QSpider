package com.assignment.demo.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assignment.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByActiveTrue();

	@Query("SELECT p FROM Product p WHERE p.category = :category")
	List<Product> findProductsByCategory(@Param("category") String category);

	@Query("SELECT p FROM Product p WHERE p.brand = :brand")
	List<Product> findProductsByBrand(@Param("brand") String brand);

	@Query("SELECT p FROM Product p WHERE p.price > :price")
	List<Product> findProductsByPriceGreaterThan(@Param("price") BigDecimal price);

	@Query("SELECT p FROM Product p WHERE p.price < :price")
	List<Product> findProductsByPriceLessThan(@Param("price") BigDecimal price);

	@Query("SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max")
	List<Product> findProductsByPriceBetween(@Param("min") BigDecimal min, @Param("max") BigDecimal max);
}
