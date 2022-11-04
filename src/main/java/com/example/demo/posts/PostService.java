package com.example.demo.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepository;
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}
	
	public Post getPost(String id) {
//		Post post = getAllPosts().stream()
//				.filter(t->id.equals(t.getId()))
//				.findFirst()
//				.orElse(null);
//		return post;
		return postRepository.getOne(id);
	}
	
	public Post addPost(Post post) {
		return postRepository.save(post);
	}
	
	public void updateUser(String id, Post post) {
//		for(int i=0; i<getAllPosts().size(); i++) {
//			Post p = getAllPosts().get(i);
//			if(p.getId().equals(id)) {
//				getAllPosts().set(i, post);
//			}
//		}
		postRepository.save(post);
	}
	
	public void deletePost(String id) {
//		getAllPosts().removeIf(t->t.getId().equals(id));
		postRepository.deleteById(id);
	}

}
