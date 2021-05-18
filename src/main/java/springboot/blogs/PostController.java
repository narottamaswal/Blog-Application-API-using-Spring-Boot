package springboot.blogs;

import java.util.List;
import springboot.blogs.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import javax.validation.Valid;


@RestController
public class PostController {
	@Autowired
	private PostService postService;	
	
	//Returns all the posts
	@GetMapping("/posts")  
	private List<Post> getAllPosts(){  
		return postService.getAllPosts();  
	}  
	
	//Returns a post with a a given id
	@GetMapping("/posts/{postid}")  
	private Post getPost(@PathVariable("postid") int postid){  
		return postService.getPostById(postid);  
	} 
	
	//Deletes a post with a given id
	@DeleteMapping("/posts/{postid}")  
	private String deletePost(@PathVariable("postid") int postid){  
		postService.delete(postid);
		return "Post with id "+postid+" deleted"; 
	}
	
	//Saves a post
	@PostMapping("/posts")  
	private Post savePost(@RequestBody Post post){  
		postService.save(post);  
		return post; 
	}
	
	//Updates a post with a given id
	@PutMapping("/posts/{postid}")  
	private String updatePost(@RequestBody Post post,@PathVariable("postid") int postid){  
		postService.update(post,postid);  
		return "Post with id "+postid+" updated"; 
	}  

}
