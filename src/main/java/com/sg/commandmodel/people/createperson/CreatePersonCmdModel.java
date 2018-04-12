package com.sg.commandmodel.people.createperson;

import java.time.LocalDate;

public class CreatePersonCmdModel {

    private String name;
    private String description;
    private String type;
    private Long[] orgIds;
    private Long[] powerIds;
    private LocalDate[] startDate;
    private LocalDate[] endDate;
    private Long imageId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long[] getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(Long[] orgIds) {
        this.orgIds = orgIds;
    }

    public Long[] getPowerIds() {
        return powerIds;
    }

    public void setPowerIds(Long[] powerIds) {
        this.powerIds = powerIds;
    }

    public LocalDate[] getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate[] startDate) {
        this.startDate = startDate;
    }

    public LocalDate[] getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate[] endDate) {
        this.endDate = endDate;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }
}
