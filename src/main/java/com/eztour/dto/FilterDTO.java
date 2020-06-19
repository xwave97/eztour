package com.eztour.dto;

public class FilterDTO {
    private int startCityId;
    private int tourTypeId;

    public int getStartCityId() {
        return startCityId;
    }

    public void setStartCityId(int startCityId) {
        this.startCityId = startCityId;
    }

    public int getTourTypeId() {
        return tourTypeId;
    }

    public void setTourTypeId(int tourTypeId) {
        this.tourTypeId = tourTypeId;
    }
}
