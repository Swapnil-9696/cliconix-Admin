package com.cliconix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cliconix.model.Product;

import com.cliconix.service.ProductServices;


@RestController
public class ProductController {
	

	
	@Autowired
	private ProductServices Productserv;
	
	
	
	@GetMapping("/showProduct")
	public List<Product> showProduct() {
		
		List<Product> allProducts = Productserv.showProductServ();
		return allProducts;
	}
	
	@PostMapping("/addProduct")
	public String insertProduct(@RequestBody Product product) {
		Productserv.addProductServe(product);

		return "Product added successfully...";
	}
	
	
	@DeleteMapping("/deleteProduct/{Pid}")
	public String deleteProduct(@PathVariable("Pid") String id) {
		int ids = Integer.parseInt(id);
		Productserv.deleteProductServe(ids);
		return "Product deleted successfully..!!";
	}
	
	
	@PutMapping("/editProduct")
	public String editProduct(@RequestBody Product product) {
		Productserv.editProductServe(product);
		return "Product updated successfully...";
	}
	
	

	
}














