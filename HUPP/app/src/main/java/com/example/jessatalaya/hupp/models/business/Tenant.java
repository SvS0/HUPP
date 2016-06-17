package com.example.jessatalaya.hupp.models.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class Tenant
{
    private int id;
    private String name;
    private List<Lease> houseLeases = new ArrayList<>();
    private List<Lease> roomLeases = new ArrayList<>();

    public Tenant() { }

    public Tenant(String name)
    {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lease> getHouseLeases() {
        return houseLeases;
    }

    public void setHouseLeases(List<Lease> houseLeases) {
        this.houseLeases = houseLeases;
    }

    public void addHouseLease(Lease lease){
        this.houseLeases.add(lease);
        lease.setTenant(this);
    }

    public List<Lease> getRoomLeases() {
        return roomLeases;
    }

    public void setRoomLeases(List<Lease> roomLeases) {
        this.roomLeases = roomLeases;
    }

    public void addRoomLease(Lease lease){
        this.roomLeases.add(lease);
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", houseLeases=" + houseLeases +
                ", roomLeases=" + roomLeases +
                '}';
    }
}


