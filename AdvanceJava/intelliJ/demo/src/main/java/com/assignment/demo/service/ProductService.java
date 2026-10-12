package com.assignment.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.assignment.demo.entity.Product;

public interface ProductService {
	Product createProduct(Product product);

	List<Product> getAllProducts();

	Product getProductById(Long id);

	Product updateProduct(Long id, Product product);

	void deleteProduct(Long id);

	List<Product> getActiveProducts();

	List<Product> getProductsByCategory(String category);

	List<Product> getProductsByBrand(String brand);

	List<Product> getProductsByPriceGreaterThan(BigDecimal price);

	List<Product> getProductsByPriceLessThan(BigDecimal price);

	List<Product> getProductsByPriceBetween(BigDecimal min, BigDecimal max);
}
