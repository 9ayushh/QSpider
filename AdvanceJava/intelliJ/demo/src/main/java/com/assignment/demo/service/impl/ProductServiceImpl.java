package com.assignment.demo.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.demo.dao.ProductRepository;
import com.assignment.demo.entity.Product;
import com.assignment.demo.exception.ProductNotFoundException;
import com.assignment.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product createProduct(Product product) {
		product.setId(null);
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		Product existingProduct = getProductById(id);
		existingProduct.setName(product.getName());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setBrand(product.getBrand());
		existingProduct.setRating(product.getRating());
		existingProduct.setActive(product.isActive());
		return productRepository.save(existingProduct);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.delete(getProductById(id));
	}

	@Override
	public List<Product> getActiveProducts() {
		return productRepository.findByActiveTrue();
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productRepository.findProductsByCategory(category);
	}

	@Override
	public List<Product> getProductsByBrand(String brand) {
		return productRepository.findProductsByBrand(brand);
	}

	@Override
	public List<Product> getProductsByPriceGreaterThan(BigDecimal price) {
		return productRepository.findProductsByPriceGreaterThan(price);
	}

	@Override
	public List<Product> getProductsByPriceLessThan(BigDecimal price) {
		return productRepository.findProductsByPriceLessThan(price);
	}

	@Override
	public List<Product> getProductsByPriceBetween(BigDecimal min, BigDecimal max) {
		return productRepository.findProductsByPriceBetween(min, max);
	}
}
