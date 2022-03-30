package com.cliconix.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliconix.dao.ProductRepository;
import com.cliconix.model.Product;


@Service
@Transactional
public class ProductServicesImpl implements ProductServices  {

	@Autowired
	ProductRepository repo;
	
	@Override
	public List<Product> showProductServ() {
		
		return (List<Product>) repo.findAll();
	}

	@Override
	public void addProductServe(Product product) {
		repo.save(product);
		
	}

	@Override
	public void deleteProductServe(int ids) {
		repo.deleteById(ids);
		
	}

	@Override
	public void editProductServe(Product product) {
		repo.save(product);
		
	}

}
