package com.sam.Blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class PostImplementation implements PostService {
	
    static long y=100;
    
    static List<Post> posts = new ArrayList<Post>(){{
    	
	add(new Post("Samuel",y,"JSP iclude Action Tag Tutorial","Include action tag is used for "
			+ "including another resource to the current JSP page. The included resource can be a static page in HTML,"
			+ " JSP page or Servlet. We can also pass parameters and their values to the resource which we are including."
			+ " Below I have shared two examples of <jsp:include>, one which includes a page without passing any parameters"
			+ " and in second example we are passing few parameters to the page which is being included."));
	add(new Post("Tandy",(y++),"Lambda Expressions","One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains "
			+ "only one method, then the syntax of anonymous classes may seem unwieldy and unclear. In these cases, you're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone"
			+ " clicks a button. Lambda expressions enable you to do this, to treat functionality as method argument, or code as data."
			+"The previous section, Anonymous Classes, shows you how to implement a base class without giving it a name. Although this is often more concise than a named class, "
            + "for classes with only one method, even an anonymous class seems a bit excessive and cumbersome. Lambda expressions let you express "
            + "instances of single-method classes more compactly."+"This section covers the following topics:"));
	add(new Post("Dalima",(y++),"Kampala International","One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains "
			+ "only one method, then the syntax of anonymous classes may seem unwieldy and unclear. In these cases, you're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone"
			+ " clicks a button. Lambda expressions enable you to do this, to treat functionality as method argument, or code as data."
			+"The previous section, Anonymous Classes, shows you how to implement a base class without giving it a name. Although this is often more concise than a named class, "
            + "for classes with only one method, even an anonymous class seems a bit excessive and cumbersome. Lambda expressions let you express "
            + "instances of single-method classes more compactly."+"This section covers the following topics:"));
	add(new Post("Jona",(y++),"Life in Nakulabye","One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains "
			+ "only one method, then the syntax of anonymous classes may seem unwieldy and unclear. In these cases, you're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone"
			+ " clicks a button. Lambda expressions enable you to do this, to treat functionality as method argument, or code as data."
			+"The previous section, Anonymous Classes, shows you how to implement a base class without giving it a name. Although this is often more concise than a named class, "
            + "for classes with only one method, even an anonymous class seems a bit excessive and cumbersome. Lambda expressions let you express "
            + "instances of single-method classes more compactly."+"This section covers the following topics:"));}};
	public List<Post> getLatest5Post() {
		return posts.stream().sorted((a,b) -> a.getDate().compareTo(b.getDate())).limit(5).collect(Collectors.toList());	
	}

	public Post createPost(Post post) {
		post.setId(PostImplementation.posts.stream().mapToLong(p -> p.getId()).max().getAsLong()+1);
		PostImplementation.posts.add(post);
		return post;
	}

	public void deletePost(Long id) {
		for (Post p : PostImplementation.posts) 
			if(p.getId()==id){
				posts.remove(p);
				break;
			};
	}

	public Post editPost(Post post) {
		for (Post p : PostImplementation.posts) 
			if(Objects.equals(p.getId(), post.getId())){
				return post;
			};
		
		//Not sure of this code!
		return null;
	}

	public List<Post> findAll() {
		return PostImplementation.posts;
	
	}

}
