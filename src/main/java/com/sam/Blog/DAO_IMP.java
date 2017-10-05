package com.sam.Blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;



@Repository
public class DAO_IMP implements DAO_SERVICE{
	
	@Autowired
	SessionFactory sessionFac;

	public void saveUser(User u) {
		
		
	}

	public void deleteUser(User u) {
		
		
	}
	
	
	
	

}
