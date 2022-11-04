package com.example.demo.posts;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@Autowired
	PostService ps;
	
	@RequestMapping("/post")
	public List<Post> getAllPosts(){
		return ps.getAllPosts();
	}
	
	@RequestMapping(value = "/post/{id}")
	public Post getPost(@PathVariable String id) {
		return ps.getPost(id);
	}
	
	@PostMapping("/post")
	public String addPost(@RequestBody Post post) {
		ps.addPost(post);
		return "Post added successfully";
	}
	
	@PutMapping("post/{id}")
	public String updatePost(@PathVariable String id, @RequestBody Post post) {
		ps.updateUser(id, post);
		return "post updated successfully";
	}
	
	@DeleteMapping("/post/{id}")
	public String deletePost(@PathVariable String id) {
		ps.deletePost(id);
		return "Post deleted successfully";
	}
}
