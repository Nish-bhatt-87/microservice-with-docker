package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

	@GetMapping
	public String getStatus() {
		return "Application is up and running";
	}

	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/get")
	public List<Product> getProducts() {
		System.out.println("nish has finally understood docker compose");

		return productRepository.findAll();
	}
}
