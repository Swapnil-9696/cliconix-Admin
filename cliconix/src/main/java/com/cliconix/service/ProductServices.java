package com.cliconix.service;

import java.util.List;

import com.cliconix.model.Product;


public interface ProductServices {
	
	List<Product> showProductServ();
	
	void addProductServe(Product product);
	
	void deleteProductServe(int ids);
	
	void editProductServe(Product product);
	
	

}
