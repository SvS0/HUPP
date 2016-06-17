package com.example.jessatalaya.hupp.models.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class Room
{
    private int id;
    private String name;
    private House house;
    private List<Lease> leases = new ArrayList<Lease>();

    public Room() { }

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

    public List<Lease> getLeases() {
        return leases;
    }

    public void setLeases(List<Lease> leases) {
        this.leases = leases;
    }

    public void addLease(Lease lease){
        this.leases.add(lease);
        lease.setRoom(this);
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", house=" + house.getId() +
                ", leases=" + leases +
                '}';
    }
}
