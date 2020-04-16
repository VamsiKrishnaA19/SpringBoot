package com.pnc.springboot.SpringBootSwagger2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pnc.springboot.SpringBootSwagger2.model.Product;

@RestController
@RequestMapping(value="/pncbank")
public class RestfulWebserviceController {

	private static List<Product> products = new ArrayList<Product>();
	static {
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Product1");
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Product2");
		products.add(p1);
		products.add(p2);
	}
	
	@PostMapping
	public String addProduct(@RequestBody Product product) {
		products.add(product);
		return "Product added successfully...";
	}
	
	@PutMapping(value="/product/{id}")
	public String updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
		products.remove(id);
		products.add(product);
		return "Product updated successfully...";
	}
	
	@GetMapping(value="/product/{id}")
	public Product getProductByID(@PathVariable("id") int id) {
		return products.get(id);
	}
	
	@GetMapping(value="/products")
	public List<Product> getAllProducts() {
		return products;
	}
	
	@DeleteMapping(value="/product/{id}")
	public Product deleteProduct(@PathVariable("id") int id) {
		return products.remove(id);
	}
}
