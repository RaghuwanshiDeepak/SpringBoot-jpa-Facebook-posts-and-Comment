package facebook.com.ProjectForFacebook.service;

import facebook.com.ProjectForFacebook.model.Posts;
import facebook.com.ProjectForFacebook.repository.FacebookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacebookService {

    @Autowired
    FacebookRepository facebookRepository;

    public List<Posts> getAllPosts()
    {
        List<Posts> posts = new ArrayList<Posts>();
        facebookRepository.findAll().forEach(posts1 -> posts.add(posts1));
        return posts;
    }

    public Posts getPostById(int id)
    {
        return facebookRepository.findById(id).get();
    }

    public void saveOrUpdate(Posts posts)
    {
        facebookRepository.save(posts);
    }

    public void delete(int id)
    {
        facebookRepository.deleteById(id);
    }

    public void update(Posts posts , int bookid)
    {
        facebookRepository.save(posts);
    }

}
