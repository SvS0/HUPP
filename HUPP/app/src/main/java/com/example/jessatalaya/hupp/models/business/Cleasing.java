package com.example.jessatalaya.hupp.models.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class Cleasing
{
    private int id;
    private List<CleasingTask> task = new ArrayList<CleasingTask>();
    private Room room;
    private Date beginning;
    private Date finish;
    private Date done;
    private Tenant tenant;
    private int rating;

    public Cleasing() {
    }


}
