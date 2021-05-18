package springboot.blogs;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
public class CommentController {
	@Autowired
	private CommentService commentService;	
	
	@GetMapping("/posts/{postid}/comments")
	private List<Comment> getAllComments(@PathVariable("postid") int postid,Pageable page){
		return commentService.getAllCommentsByPostId(postid,page);
	}  
	
	@PostMapping("/posts/{postid}/comments")  
	private Comment saveComment(@RequestBody Comment comment,@PathVariable("postid") int postid){  
		commentService.save(comment,postid);  
		return comment;  
	} 
}
