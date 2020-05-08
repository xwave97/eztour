package com.eztour.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sections", schema = "eztourism", catalog = "")
public class SectionsEntity {
    private int sectionId;
    private String sectionName;
    private Integer fkPhotoId;

    @Id
    @Column(name = "section_id")
    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    @Basic
    @Column(name = "section_name")
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Basic
    @Column(name = "fk_photo_id")
    public Integer getFkPhotoId() {
        return fkPhotoId;
    }

    public void setFkPhotoId(Integer fkPhotoId) {
        this.fkPhotoId = fkPhotoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SectionsEntity that = (SectionsEntity) o;
        return sectionId == that.sectionId &&
                Objects.equals(sectionName, that.sectionName) &&
                Objects.equals(fkPhotoId, that.fkPhotoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionId, sectionName, fkPhotoId);
    }
}
