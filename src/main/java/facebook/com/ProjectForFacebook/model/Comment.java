package facebook.com.ProjectForFacebook.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    @Column
    private int noOfComments;

    @Column
    private String nameOfCommenter;

    @Column
    private String comment;



    public Comment()
    {

    }
    public Comment(int noOfComments, String nameOfCommenter, String comment) {
        this.noOfComments = noOfComments;
        this.nameOfCommenter = nameOfCommenter;
        this.comment = comment;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public int getNoOfComments() {
        return noOfComments;
    }

    public void setNoOfComments(int noOfComments) {
        this.noOfComments = noOfComments;
    }

    public String getNameOfCommenter() {
        return nameOfCommenter;
    }

    public void setNameOfCommenter(String nameOfCommenter) {
        this.nameOfCommenter = nameOfCommenter;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}



