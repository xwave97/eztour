package com.eztour.entity;


import javax.persistence.*;

@Entity
@Table(name = "start_cities")
public class StartCityEntity {
    @Id
    @Column(name = "start_city_id")
    private int startCityId;

    @Basic
    @Column(name = "start_city_name")
    private String startCityName;


    public int getStartCityId() {
        return startCityId;
    }

    public void setStartCityId(int startCityId) {
        this.startCityId = startCityId;
    }

    public String getStartCityName() {
        return startCityName;
    }

    public void setStartCityName(String startCityName) {
        this.startCityName = startCityName;
    }
}
