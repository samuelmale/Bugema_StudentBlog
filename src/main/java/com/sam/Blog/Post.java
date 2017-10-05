package com.sam.Blog;
import java.util.Date;
public class Post {
	User author;
    Date date = new Date();
    String body;
    Long id;
    String title;
    public Post(){}
    public Post(String userName,Long id,String title,String body){
    	this.author = new User(userName,id);
    	this.body=body;
    	this.title=title;
    }
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
