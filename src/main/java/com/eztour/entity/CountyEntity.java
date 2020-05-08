package com.eztour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries", schema = "eztourism", catalog = "")
public class CountyEntity {
    private int countryId;
    private  String counryName;

    @Id
    @Column(name = "countty_id")
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Column(name = "country_name")
    public String getCounryName() {
        return counryName;
    }

    public void setCounryName(String counryName) {
        this.counryName = counryName;
    }
}
