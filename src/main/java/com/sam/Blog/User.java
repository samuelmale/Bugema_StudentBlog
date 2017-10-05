package com.sam.Blog;

import java.awt.Image;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="user")
public class User {
Image profilePicture;
//@Column(name="userName")
String userName;
//@Column(name="lastName")
String lastName;
//@Id
//@Column(name="id")
//@GeneratedValue
Long id;
Set<Post> posts;
String password;
String comfirmPassword;
public User(){}
public User(String username,String lastName,String password){
	this.userName=username;
	this.lastName=lastName;
	this.password=password;
}
public User(String userName2, Long id) {
	this.id=id;
	this.userName=userName2;
}
public String getComfirmPassword(){
	return comfirmPassword;
}
public void setComfirmPassword(String pass){
	this.comfirmPassword=pass;
}
public void setProfilePicture(Image pic)
{
this.profilePicture=pic;	
}
public Image getProfilePic(){
	return profilePicture;
}
public String getUserName() {
	return userName;
}
public void setUserName(String firstName) {
	this.userName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Set<Post> getPosts() {
	return posts;
}
public void setPosts(Set<Post> posts) {
	this.posts = posts;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
    return "User{" + "id=" + id + ", userName='" + userName + '\'' +
        ", passwordHash='" + password + '\'' +
        ", last name='" + lastName + '\'' + '}';
}
}
