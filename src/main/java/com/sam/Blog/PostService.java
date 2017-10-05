package com.sam.Blog;

import java.util.List;



public interface PostService {
	public List<Post> getLatest5Post();
	public Post createPost(Post post);
    public void deletePost(Long id);
    public Post editPost(Post post);
    public List<Post> findAll();
}
