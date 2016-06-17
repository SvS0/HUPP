package com.example.jessatalaya.hupp.models.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class CleasingTask
{
    private int id;
    private String task;
    private int globalRate;
    private Cleasing cleasing;
    private List<Rate> rate = new ArrayList<>();
    private List<Furniture> furniture = new ArrayList<>();

    public CleasingTask() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getGlobalRate() {
        return globalRate;
    }

    public void setGlobalRate(int globalRate) {
        this.globalRate = globalRate;
    }

    public Cleasing getCleasing() {
        return cleasing;
    }

    public void setCleasing(Cleasing cleasing) {
        this.cleasing = cleasing;
    }

    public List<Rate> getRate() {
        return rate;
    }

    public void setRate(List<Rate> rate) {
        this.rate = rate;
    }

    public List<Furniture> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<Furniture> furniture) {
        this.furniture = furniture;
    }

    @Override
    public String toString()
    {
        return "CleasingTask{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", globalRate=" + globalRate +
                ", cleasing=" + cleasing +
                ", rate=" + rate +
                ", furniture=" + furniture +
                '}';
    }
}
