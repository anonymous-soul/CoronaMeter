package com.example.coronameter;

public class OverviewClass {
    private String stateName;
    private int imgId;

    public OverviewClass(String stateName, int imgId) {
        this.stateName = stateName;
        this.imgId = imgId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
