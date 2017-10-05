package com.sam.Blog;

import java.util.ArrayList;
import java.util.List;

public class BlogSystem {
	Post post;
	static List<User> users ;	
	
	BlogSystem(){}
	
	public void addMember(User user)
	{
		users = new ArrayList<User>();
	users.add(user);
	System.out.println("Member added");
	}
	
	
	
	

}
