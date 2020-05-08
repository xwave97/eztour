package com.eztour.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "photos", schema = "eztourism")
public class PhotosEntity {
    private int photoId;
    private String photoName;

    @Id
    @Column(name = "photo_id")
    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    @Basic
    @Column(name = "photo_path")
    public String getPhoto() {
        return photoName;
    }

    public void setPhoto(String photo) {
        this.photoName = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotosEntity that = (PhotosEntity) o;
        return photoId == that.photoId &&
                Objects.equals(photoName, that.photoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoId, photoName);
    }
}
