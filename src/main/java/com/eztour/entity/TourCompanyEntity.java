package com.eztour.entity;

import javax.persistence.*;

@Entity
@Table(name = "tourcomps")
public class TourCompanyEntity {

    private int tourCompId;
    private String tourCompName;
    private double tourCompRate;

    @Id
    @Column(name = "tourcomp_id")
    public int getTourCompId() {
        return tourCompId;
    }

    public void setTourCompId(int tourCompId) {
        this.tourCompId = tourCompId;
    }

    @Basic
    @Column(name = "tourcomp_name")
    public String getTourCompName() {
        return tourCompName;
    }

    public void setTourCompName(String tourCompName) {
        this.tourCompName = tourCompName;
    }

    @Basic
    @Column(name = "tourcomp_rate")
    public double getTourCompRate() {
        return tourCompRate;
    }

    public void setTourCompRate(double tourCompRate) {
        this.tourCompRate = tourCompRate;
    }
}
