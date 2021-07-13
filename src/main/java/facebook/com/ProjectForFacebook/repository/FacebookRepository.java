package facebook.com.ProjectForFacebook.repository;

import facebook.com.ProjectForFacebook.model.Posts;
import org.springframework.data.repository.CrudRepository;

public interface FacebookRepository extends CrudRepository<Posts,Integer> {

}
