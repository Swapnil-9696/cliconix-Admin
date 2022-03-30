package com.cliconix.dao;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cliconix.model.User;




@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
	
	

}
