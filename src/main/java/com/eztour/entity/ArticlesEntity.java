package com.eztour.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "articles", schema = "eztourism", catalog = "")
public class ArticlesEntity {
    private int articleId;
    private String articleHeader;
    private String articleText;
    private Integer articleLikes;
    private Integer articleDislikes;
//    private Integer fkUserId;
    private PhotosEntity photo;
//    private Integer fkSectionId;

    @Id
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "article_header")
    public String getArticleHeader() {
        return articleHeader;
    }

    public void setArticleHeader(String articleHeader) {
        this.articleHeader = articleHeader;
    }

    @Basic
    @Column(name = "article_text")
    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    @Basic
    @Column(name = "article_likes")
    public Integer getArticleLikes() {
        return articleLikes;
    }

    public void setArticleLikes(Integer articleLikes) {
        this.articleLikes = articleLikes;
    }

    @Basic
    @Column(name = "article_dislikes")
    public Integer getArticleDislikes() {
        return articleDislikes;
    }

    public void setArticleDislikes(Integer articleDislikes) {
        this.articleDislikes = articleDislikes;
    }

//    @Basic
//    @Column(name = "fk_user_id")
//    public Integer getFkUserId() {
//        return fkUserId;
//    }
//
//    public void setFkUserId(Integer fkUserId) {
//        this.fkUserId = fkUserId;
//    }

    @ManyToOne
    @JoinColumn(name = "fk_photo_id", referencedColumnName = "photo_id")
    public PhotosEntity getPhoto() {
        return photo;
    }

    public void setPhoto(PhotosEntity photo) {
        this.photo = photo;
    }

//    @Basic
//    @Column(name = "fk_section_id")
//    public Integer getFkSectionId() {
//        return fkSectionId;
//    }
//
//    public void setFkSectionId(Integer fkSectionId) {
//        this.fkSectionId = fkSectionId;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticlesEntity that = (ArticlesEntity) o;
        return articleId == that.articleId &&
                Objects.equals(articleHeader, that.articleHeader) &&
                Objects.equals(articleText, that.articleText) &&
                Objects.equals(articleLikes, that.articleLikes) &&
                Objects.equals(articleDislikes, that.articleDislikes);
//                Objects.equals(fkUserId, that.fkUserId) &&
//                Objects.equals(fkPhotoId, that.fkPhotoId) &&
//                Objects.equals(fkSectionId, that.fkSectionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, articleHeader, articleText, articleLikes, articleDislikes);
    }
}
