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
    private List<Lease> leases = new ArrayList<Lease>();
    private List<Room> rooms = new ArrayList<>();

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

    public List<Lease> getLeases() {
        return leases;
    }

    public void setLeases(List<Lease> leases) {
        this.leases = leases;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
