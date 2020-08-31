package com.konstantinov.yaoptovik.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class State {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("actuality_date")
    @Expose
    private String actualityDate;//поменял со Integer
    @SerializedName("registration_date")
    @Expose
    private String registrationDate;
    @SerializedName("liquidation_date")
    @Expose
    private Object liquidationDate;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActualityDate() {
        return actualityDate;
    }

    public void setActualityDate(String actualityDate) {
        this.actualityDate = actualityDate;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Object getLiquidationDate() {
        return liquidationDate;
    }

    public void setLiquidationDate(Object liquidationDate) {
        this.liquidationDate = liquidationDate;
    }

}
