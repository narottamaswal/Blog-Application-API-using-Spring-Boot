package springboot.blogs;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service; 
@Service  
public class PostService {
	@Autowired
	private PostRepository postRepository;
	public List<Post> getAllPosts() {  
		List<Post> posts = new ArrayList<Post>();  
		postRepository.findAll().forEach(post -> posts.add(post));  
		return posts;  
	}
	public Post getPostById(int id){  
		return postRepository.findById(id).get();  
	}  
	public void save(Post post){  
		postRepository.save(post);  
	}  
	public void delete(int id){  
		postRepository.deleteById(id);
	}  
	public void update(Post post,int id){
		Post p = getPostById(id);
		p.setTitle(post.getTitle());
		p.setContent(post.getContent());
		postRepository.save(p);
	}  
}

