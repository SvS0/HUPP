package com.example.jessatalaya.hupp.controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jessatalaya.hupp.R;
import com.example.jessatalaya.hupp.models.business.House;
import com.example.jessatalaya.hupp.models.business.Lease;
import com.example.jessatalaya.hupp.models.business.Room;
import com.example.jessatalaya.hupp.models.business.Tenant;
import com.example.jessatalaya.hupp.services.UtilitiesGSON;

public class HouseWorkspace extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_workspace);

        TextView text = (TextView) findViewById(R.id.text);

      /*  Tenant tenant = new Tenant();
        tenant.setId(1);
        tenant.setName("jesus");*/

        House house = new House();
        house.setName("CalGravat");
        house.setId(1);
        house.setAddress("Cami de Cal Gravat, 14");

      /*  Lease leaseHouse = new Lease();
        leaseHouse.setId(1);

        tenant.addHouseLease(leaseHouse);
        house.addLease(leaseHouse);*/

        Room room = new Room();
        room.setId(1);
        room.setName("suso's house");

        house.addRoom(room);

      /*  Lease leaseRoom = new Lease();
        leaseRoom.setId(2);

        tenant.addRoomLease(leaseRoom);
        room.addLease(leaseRoom);*/

        String t = UtilitiesGSON.JavaToJSON(house);
        text.setText(t);
    }
}
