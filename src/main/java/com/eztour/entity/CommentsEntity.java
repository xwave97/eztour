package com.eztour.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "comments", schema = "eztourism", catalog = "")
public class CommentsEntity {
    private int commentId;
    private String commentText;
    private Integer commentLikes;
    private Integer commentDislikes;
    private Integer fkUserId;
    private Integer fkArticleId;

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

    @Basic
    @Column(name = "comment_likes")
    public Integer getCommentLikes() {
        return commentLikes;
    }

    public void setCommentLikes(Integer commentLikes) {
        this.commentLikes = commentLikes;
    }

    @Basic
    @Column(name = "comment_dislikes")
    public Integer getCommentDislikes() {
        return commentDislikes;
    }

    public void setCommentDislikes(Integer commentDislikes) {
        this.commentDislikes = commentDislikes;
    }

    @Basic
    @Column(name = "fk_user_id")
    public Integer getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Integer fkUserId) {
        this.fkUserId = fkUserId;
    }

    @Basic
    @Column(name = "fk_article_id")
    public Integer getFkArticleId() {
        return fkArticleId;
    }

    public void setFkArticleId(Integer fkArticleId) {
        this.fkArticleId = fkArticleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentsEntity that = (CommentsEntity) o;
        return commentId == that.commentId &&
                Objects.equals(commentText, that.commentText) &&
                Objects.equals(commentLikes, that.commentLikes) &&
                Objects.equals(commentDislikes, that.commentDislikes) &&
                Objects.equals(fkUserId, that.fkUserId) &&
                Objects.equals(fkArticleId, that.fkArticleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, commentText, commentLikes, commentDislikes, fkUserId, fkArticleId);
    }
}
