package facebook.com.ProjectForFacebook.repository;

import facebook.com.ProjectForFacebook.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
