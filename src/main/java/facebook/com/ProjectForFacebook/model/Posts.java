package facebook.com.ProjectForFacebook.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Posts {

    @Id
    @Column
    private Long postid;


    @Column(name = "Post_Type")
    private String posttype; //it can be text,audio,video

    @Column(name = "Likes_On_Post")
    private int likes;

    @Column(name = "Post_Content")
    private String content;

    @Column(name = "number_Of_Shares")
    private int numberOfShares;

//    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JsonIgnore
//    private List<Comment> commentss ;
    @OneToOne(cascade = CascadeType.ALL)
    private Comment comments;

    public Posts()
    {

    }
    public Posts(Long postid, String posttype, int likes, String content, int numberOfShares,Comment comments) {
        this.postid = postid;
        this.posttype = posttype;
        this.likes = likes;
        this.content = content;
        this.numberOfShares = numberOfShares;
        this.comments = comments;
    }

    public Long getPostid() {
        System.out.println("get postId method is called");
        return postid;
    }

    public void setPostid(Long postid)
    {
        System.out.println("set postId method is called");
        this.postid = postid;
    }

    public String getPosttype() {
        System.out.println("get postType method is called");
        return posttype;
    }

    public void setPosttype(String posttype) {
        System.out.println("set postType method is called");
        this.posttype = posttype;
    }

    public int getLikes() {
        System.out.println("getLikes method is called in post class");
        return likes;
    }

    public void setLikes(int likes) {
        System.out.println("set Likes method is called");
        this.likes = likes;
    }

    public String getContent() {
        System.out.println("getContent method is called in posts class");
        return content;
    }

    public void setContent(String comment) {
        System.out.println("Set content method is called in posts class");
        this.content = comment;
    }

    public int getNumberOfShares() {
        System.out.println("getNumberOfShares method is called in posts class");
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        System.out.println("Set NumberOfComments method is called");
        this.numberOfShares = numberOfShares;
    }

    public Comment getComments() {
        return comments;
    }

    public void setComments(Comment comments) {
        this.comments = comments;
    }
}
