package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson=new Gson();
        String json=gson.toJson(new Person("Mrian","Hrichuc"));
        System.out.println(json);
    }
}