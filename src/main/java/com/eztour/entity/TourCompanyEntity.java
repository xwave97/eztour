package com.eztour.entity;

import javax.persistence.*;

@Entity
@Table(name = "tourcomps")
public class TourCompanyEntity {

    private int tourCompId;
    private String tourCompName;
    private double tourCompRate;
    private String tourCompAdress;
    private String tourCompUrl;
    private String tourCompPhoto;
    private String tourCompDecription;


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

    @Basic
    @Column(name = "tourcomp_adress")
    public String getTourCompAdress() {
        return tourCompAdress;
    }

    public void setTourCompAdress(String tourCompAdress) {
        this.tourCompAdress = tourCompAdress;
    }

    @Basic
    @Column(name = "tourcomp_urladress")
    public String getTourCompUrl() {
        return tourCompUrl;
    }

    public void setTourCompUrl(String tourCompUrl) {
        this.tourCompUrl = tourCompUrl;
    }

    @Basic
    @Column(name = "tourcomp_photo")
    public String getTourCompPhoto() {
        return tourCompPhoto;
    }

    public void setTourCompPhoto(String tourCompPhoto) {
        this.tourCompPhoto = tourCompPhoto;
    }


    @Basic
    @Column(name = "tourcomp_decription")
    public String getTourCompDecription() {
        return tourCompDecription;
    }

    public void setTourCompDecription(String tourCompDecription) {
        this.tourCompDecription = tourCompDecription;
    }


}
