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
    private Room room;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Lease{" +
                "id=" + id +
                ", tenant=" + tenant.getId() +
                ", house=" + house.getId() +
                ", room=" + room.getId() +
                ", beginning=" + beginning +
                ", finish=" + finish +
                "'}'";
    }
}
