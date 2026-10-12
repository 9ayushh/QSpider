package com.assignment.demo.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.entity.Product;
import com.assignment.demo.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/active")
	public List<Product> getActiveProducts() {
		return productService.getActiveProducts();
	}

	@GetMapping("/category/{category}")
	public List<Product> getProductsByCategory(@PathVariable String category) {
		return productService.getProductsByCategory(category);
	}

	@GetMapping("/brand/{brand}")
	public List<Product> getProductsByBrand(@PathVariable String brand) {
		return productService.getProductsByBrand(brand);
	}

	@GetMapping("/price/greater-than/{price}")
	public List<Product> getProductsByPriceGreaterThan(@PathVariable BigDecimal price) {
		return productService.getProductsByPriceGreaterThan(price);
	}

	@GetMapping("/price/less-than/{price}")
	public List<Product> getProductsByPriceLessThan(@PathVariable BigDecimal price) {
		return productService.getProductsByPriceLessThan(price);
	}

	@GetMapping("/price")
	public List<Product> getProductsByPriceBetween(@RequestParam BigDecimal min, @RequestParam BigDecimal max) {
		return productService.getProductsByPriceBetween(min, max);
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return ResponseEntity.noContent().build();
	}
}
