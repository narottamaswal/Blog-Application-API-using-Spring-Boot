package springboot.blogs;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class CommentService {
	@Autowired
	CommentRepository commentRepository;

	@Autowired
	PostRepository postRepository;

	@Autowired
	PostService postService;

	public List<Comment> getAllCommentsByPostId(int postid,Pageable page){  
		return commentRepository.findByPostId(postid, page).getContent();  
	}  
	public void save(Comment comment,int postid){
		Post p = postService.getPostById(postid);
		comment.setPost(p);
		commentRepository.save(comment);
	}  
}
