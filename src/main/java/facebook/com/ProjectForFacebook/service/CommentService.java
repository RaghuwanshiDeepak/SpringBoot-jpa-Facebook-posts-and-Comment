package facebook.com.ProjectForFacebook.service;

import facebook.com.ProjectForFacebook.model.Comment;
import facebook.com.ProjectForFacebook.model.Posts;
import facebook.com.ProjectForFacebook.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository;
    
    public List<Comment> getAllPosts() {
        List<Comment> comments = new ArrayList<Comment>();
       commentRepository.findAll().forEach(comment1 -> comments.add(comment1) );
        return comments;
    }

    public void saveOrUpdate(Comment comment) {

        System.out.println("SaveOrUpdate method is called in Comment Service class");
        commentRepository.save(comment);
    }

    public void delete(Long commentid) {
        commentRepository.deleteById(commentid);
    }
}
