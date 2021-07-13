package facebook.com.ProjectForFacebook.controller;

import facebook.com.ProjectForFacebook.model.Posts;
import facebook.com.ProjectForFacebook.service.FacebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {


    @Autowired
    FacebookService facebookService;

    @GetMapping("/fb")
    public String Welcome()
    {
        return "Welcome";
    }

    //Get all post by this method
    @GetMapping("/poster")
    public List<Posts> getAllPosts()
    {
        System.out.println("Get all method called---------------------------------");
        return facebookService.getAllPosts();
    }

//    //get post by id
//    @GetMapping("/poster/{id}")
//    public Posts getPosts(@PathVariable("id") int id)
//    {
//        System.out.println("Get post by id-----------------------");
//        return facebookService.getPostById(id);
//    }

    //Post mapping is used for insert the data
    @PostMapping("/poster")
    public Long savePost(@RequestBody Posts posts)
    {
        System.out.println("Post method in controller called------------------------");
        facebookService.saveOrUpdate(posts);
        return posts.getPostid();
    }

    //put mapping is basically used to update the posts
    @PutMapping("/poster")
    public Posts update(@RequestBody Posts posts)
    {
        System.out.println("Update method in controller called-------------------");
        facebookService.saveOrUpdate(posts);
        return posts;
    }

    //this method is basically used to delete a particular record
    @DeleteMapping("/poster/{posterid}")
    public void deletePost(@PathVariable("postid") int posterid)
    {
        facebookService.delete(posterid);
    }


}
