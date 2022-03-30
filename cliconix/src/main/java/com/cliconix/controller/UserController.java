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


import com.cliconix.model.User;
import com.cliconix.service.UserServices;




@RestController
public class UserController {	
	
	@Autowired
	private UserServices Userserv;
	
	
	
	
	
	
	@GetMapping("/showUser")
	public List<User> showUser() {
		List<User> allUsers = Userserv.showUserServ();
		return  allUsers;	
	}
	
	
	@PostMapping("/addUser")
	public String insertBuyer(@RequestBody User user) {
		Userserv.insertBuyerServe(user);
		return "User added successfully...";
	}
	
	@DeleteMapping("/deleteUser/{Uid}")
	public String deleteBuyer(@PathVariable("Uid") String id) {
		int ids = Integer.parseInt(id);
		Userserv.deleteBuyerServe(ids);
		return "UserdeleteBuyerServe deleted successfully..!!";
	}
	
	
	@PutMapping("/editUser")
	public String editSeller(@RequestBody User user) {
		Userserv.editUserServe(user);
		return "User updated successfully...";
	}
	
	
	
	

}


















