package com.sg.commandmodel.sighting.createsighting;

import java.time.LocalDate;

public class CreateSightingCmdModel {


    private Long[] personIds;
    private Long locationId;
    private LocalDate date;
    private String description;

    public Long[] getPersonIds() {
        return personIds;
    }

    public void setPersonIds(Long[] personIds) {
        this.personIds = personIds;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
