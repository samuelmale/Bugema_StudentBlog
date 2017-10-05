package com.sam.Blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BloggerController {

	@Autowired
	PostService service;

	@RequestMapping("/mainBlog")
	String getBlog(Model model){
		User user = new User();
		model.addAttribute("user",user);
		List<Post> posts =service.getLatest5Post();
		model.addAttribute("posts",posts);
		
		return "mainBlog";
	}
	
	@RequestMapping("/demoMenu")
	String getLoginView(Model model){
		
		
		return "demoMenu";
	}
	@RequestMapping(value="/registration",method= RequestMethod.POST) 
	String registerUser( Model model,@ModelAttribute("user")User user)
	{
	BlogSystem system = new BlogSystem();
	//System.out.println(system.users.size());
	system.addMember(user);
	
	
	
		return "";
	}
	@RequestMapping("/login")
	String logIn()
	{
		
	return "login";	
	}
	@RequestMapping("/welcome")
	String welcome(Model model)
	{
		User user = new User();
		model.addAttribute("user",user);
		return "welcome";
		
	}
	

}
