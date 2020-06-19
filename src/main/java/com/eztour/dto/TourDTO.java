package com.eztour.dto;

public class TourDTO {

    private String tourName;

    private String tourDecription;

    private int tourPrice;

    private int tourDuring;

    private String tourStart;

    private String tourEnd;

    private String tourPhoto;

    private int tourCompany;

    private int tourType;

    private int country;

    private int startCity;

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourDecription() {
        return tourDecription;
    }

    public void setTourDecription(String tourDecription) {
        this.tourDecription = tourDecription;
    }

    public int getTourPrice() {
        return tourPrice;
    }

    public void setTourPrice(int tourPrice) {
        this.tourPrice = tourPrice;
    }

    public int getTourDuring() {
        return tourDuring;
    }

    public void setTourDuring(int tourDuring) {
        this.tourDuring = tourDuring;
    }

    public String getTourStart() {
        return tourStart;
    }

    public void setTourStart(String tourStart) {
        this.tourStart = tourStart;
    }

    public String getTourEnd() {
        return tourEnd;
    }

    public void setTourEnd(String tourEnd) {
        this.tourEnd = tourEnd;
    }

    public String getTourPhoto() {
        return tourPhoto;
    }

    public void setTourPhoto(String tourPhoto) {
        this.tourPhoto = tourPhoto;
    }

    public int getTourCompany() {
        return tourCompany;
    }

    public void setTourCompany(int tourCompany) {
        this.tourCompany = tourCompany;
    }

    public int getTourType() {
        return tourType;
    }

    public void setTourType(int tourType) {
        this.tourType = tourType;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getStartCity() {
        return startCity;
    }

    public void setStartCity(int startCity) {
        this.startCity = startCity;
    }
}
