package com.eztour.entity;

import javax.persistence.*;

@Entity
@Table(name = "tourcomps_comments")
public class TourCompsCommentEntity {
    private int commentId;
    private String commentText;
    private TourCompanyEntity tourCompanyComment;
    private UsersEntity userComment;

    @Id
    @Column(name = "comment_id")
    public int getCommentId() {
        return commentId;
    }


    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "comment_text")
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @ManyToOne
    @JoinColumn(name = "fk_tourcomp_id", referencedColumnName = "tourcomp_id")
    public TourCompanyEntity getTourCompanyComment() {
        return tourCompanyComment;
    }

    public void setTourCompanyComment(TourCompanyEntity tourCompanyComment) {
        this.tourCompanyComment = tourCompanyComment;
    }

    @ManyToOne
    @JoinColumn(name = "fk_user_id", referencedColumnName = "user_id")
    public UsersEntity getUserComment() {
        return userComment;
    }

    public void setUserComment(UsersEntity userComment) {
        this.userComment = userComment;
    }
}
