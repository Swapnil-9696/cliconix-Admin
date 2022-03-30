package com.cliconix.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cliconix.model.Product;



public interface ProductRepository extends JpaRepository<Product, Integer> {

}
