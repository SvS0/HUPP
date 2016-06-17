package com.example.jessatalaya.hupp.models.business;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class Rate
{
    private int id;
    private int rate;
    private Tenant tenant;

    public Rate() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id=" + id +
                ", rate=" + rate +
                ", tenant=" + tenant +
                '}';
    }
}
