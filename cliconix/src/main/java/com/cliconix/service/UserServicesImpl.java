package com.cliconix.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliconix.dao.UserRepository;
import com.cliconix.model.User;


@Service
@Transactional
public class UserServicesImpl implements UserServices {
	
	
	@Autowired
	UserRepository repo;

	
	@Override
	public List<User> showUserServ() {
		
		return repo.findAll();
	}


	@Override
	public void insertBuyerServe(User user) {
		repo.save(user);
		
	}


	@Override
	public void deleteBuyerServe(int ids) {
		repo.deleteById(ids);
		
	}


	@Override
	public void editUserServe(User user) {
		repo.save(user);
		
	}


	
	
	
	
	

}
