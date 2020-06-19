package com.eztour.entity;

import javax.persistence.*;

@Entity
@Table(name = "tour_types")
public class TourTypeEntity {

    @Id
    @Column(name = "tour_type_id")
    private int tourTypeId;

    @Basic
    @Column(name = "tour_type_name")
    private String tourTypeName;

    public int getTourTypeId() {
        return tourTypeId;
    }

    public void setTourTypeId(int tourTypeId) {
        this.tourTypeId = tourTypeId;
    }

    public String getTourTypeName() {
        return tourTypeName;
    }

    public void setTourTypeName(String tourTypeName) {
        this.tourTypeName = tourTypeName;
    }
}
