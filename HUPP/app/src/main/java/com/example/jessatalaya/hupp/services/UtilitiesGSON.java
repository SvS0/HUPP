package com.example.jessatalaya.hupp.services;

import com.example.jessatalaya.hupp.models.business.Tenant;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

/**
 * Created by Jesús Atalaya on 17/06/2016.
 */
public class UtilitiesGSON
{

    public static Tenant TenantJSONtoJava(String data){

        Gson gson = new GsonBuilder().create();
        Tenant tenant = gson.fromJson(data, Tenant.class);

        return tenant;
    }

    public static String JavaToJSON(Object data){
        Gson gson = new GsonBuilder().create();
        return gson.toJson(data);
    }


}

