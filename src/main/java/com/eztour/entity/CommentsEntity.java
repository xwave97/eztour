package com.eztour.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "comments")
public class CommentsEntity {
    private int commentId;
    private String commentText;
    private UsersEntity userId;
    private TourCompanyEntity tourCompanyId;

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
    @JoinColumn(name = "fk_user_id", referencedColumnName = "user_id")
    public UsersEntity getUserId() {
        return userId;
    }

    public void setUserId(UsersEntity userId) {
        this.userId = userId;
    }

    @ManyToOne
    @JoinColumn(name = "fk_tourcomp_id", referencedColumnName = "tourcomp_id")
    public TourCompanyEntity getTourCompanyId() {
        return tourCompanyId;
    }

    public void setTourCompanyId(TourCompanyEntity tourCompanyId) {
        this.tourCompanyId = tourCompanyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsEntity that = (CommentsEntity) o;
        return commentId == that.commentId &&
                Objects.equals(commentText, that.commentText) &&

                Objects.equals(userId, that.userId) &&
                Objects.equals(tourCompanyId, that.tourCompanyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, commentText, userId, userId);
    }

}
