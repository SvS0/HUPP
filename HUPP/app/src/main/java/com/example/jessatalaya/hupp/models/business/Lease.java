package com.example.jessatalaya.hupp.models.business;

import java.util.Date;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class Lease
{
    private int id;
    private Tenant tenant;
    private House house;
    private Date beginning;
    private Date finish;

    public Lease() { }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Date getBeginning() {
        return beginning;
    }

    public void setBeginning(Date beginning) {
        this.beginning = beginning;
    }

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

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Lease{" +
                "id=" + id +
                ", tenant=" + tenant +
                ", house=" + house +
                ", beginning=" + beginning +
                ", finish=" + finish +
                '}';
    }
}
