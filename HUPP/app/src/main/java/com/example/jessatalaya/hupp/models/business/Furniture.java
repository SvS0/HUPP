package com.example.jessatalaya.hupp.models.business;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class Furniture
{
    private int id;
    private String name;
    private List<Tenant> owner = new ArrayList<Tenant>();
    private Room room;

    public Furniture() {
    }

    public Furniture(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Tenant> getOwner() {
        return owner;
    }

    public void setOwner(List<Tenant> owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
