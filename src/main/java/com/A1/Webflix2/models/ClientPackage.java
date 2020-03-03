package com.A1.Webflix2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientPackage {

    @Column(name = "name")
    private String packageName;

    private float monthlyCost;

    private int maxLocations;

    @Column(nullable = true)
    private Integer maxDuration;

    @Id
    private String code;

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public float getMonthlyCost() {
        return this.monthlyCost;
    }

    public void setMonthlyCost(float monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public int getMaxLocations() {
        return this.maxLocations;
    }

    public void setMaxLocations(int maxLocations) {
        this.maxLocations = maxLocations;
    }

    public int getMaxDuration() {
        return this.maxDuration;
    }

    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
