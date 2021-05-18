package springboot.blogs;
import org.springframework.data.jpa.repository.JpaRepository;
import springboot.blogs.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{

}
