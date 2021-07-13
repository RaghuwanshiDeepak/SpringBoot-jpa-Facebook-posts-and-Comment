package facebook.com.ProjectForFacebook.controller;

import facebook.com.ProjectForFacebook.model.Comment;
import facebook.com.ProjectForFacebook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;


    @GetMapping("/comment")
    public List<Comment> getAllComment()
    {
        System.out.println("Get method in Comment Controller");
        return commentService.getAllPosts();
    }

    @PostMapping("/comment")
    public Long saveComment(@RequestBody Comment comment)
    {
        System.out.println("Post method in comment controller called");
        commentService.saveOrUpdate(comment);
        return comment.getCommentId();
    }

    @PutMapping("/comment")
    public Comment update(@RequestBody Comment comment)
    {
        commentService.saveOrUpdate(comment);
        return comment;
    }

    @DeleteMapping("/comment/{commentid}")
    public void deleteComment(@PathVariable("commentid") Long commentid)
    {
        commentService.delete(commentid);
    }

}
