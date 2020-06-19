package com.eztour.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tours")
public class TourEntity {

    @Id
    @Column(name = "tour_id")
    private int tourId;

    @Basic
    @Column(name = "tour_name")
    private String tourName;

    @Basic
    @Column(name = "tour_decription")
    private String tourDecription;

    @Basic
    @Column(name = "tour_price")
    private int tourPrice;

    @Basic
    @Column(name = "tour_during")
    private int tourDuring;

    @Basic
    @Column(name = "tour_start")
        private String tourStart;

    @Basic
    @Column(name = "tour_end")
    private String tourEnd;

    @Basic
    @Column(name = "tour_photo")
    private String tourPhoto;

    @ManyToOne
    @JoinColumn(name = "fk_tourcomp_id", referencedColumnName = "tourcomp_id")
    private TourCompanyEntity tourCompany;

    @ManyToOne
    @JoinColumn(name = "fk_tourtype_id", referencedColumnName = "tour_type_id")
    private TourTypeEntity tourType;

    @ManyToOne
    @JoinColumn(name = "fk_country_id", referencedColumnName = "country_id")
        private CountryEntity country;

    @ManyToOne
    @JoinColumn(name = "fk_start_city", referencedColumnName = "start_city_id")
    private StartCityEntity startCity;

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

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

    public TourCompanyEntity getTourCompany() {
        return tourCompany;
    }

    public void setTourCompany(TourCompanyEntity tourCompany) {
        this.tourCompany = tourCompany;
    }

    public TourTypeEntity getTourType() {
        return tourType;
    }

    public void setTourType(TourTypeEntity tourType) {
        this.tourType = tourType;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public StartCityEntity getStartCity() {
        return startCity;
    }

    public void setStartCity(StartCityEntity startCity) {
        this.startCity = startCity;
    }
}
