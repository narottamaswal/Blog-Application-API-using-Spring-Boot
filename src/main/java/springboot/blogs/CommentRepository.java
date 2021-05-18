package springboot.blogs;
import org.springframework.data.jpa.repository.JpaRepository;
import springboot.blogs.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommentRepository extends JpaRepository<Comment,Integer>{
    Page<Comment> findByPostId(int postId, Pageable pageable);

}
