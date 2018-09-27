package com.example.iqbalpriansyah.finalandroid;

import java.util.ArrayList;
import java.util.List;

public class BodyImageAsset {

    private static List<Integer> cloths = new ArrayList<Integer>() {
        {
            add(R.drawable.cloth1);
            add(R.drawable.cloth2);
            add(R.drawable.cloth3);
            add(R.drawable.cloth4);
        }
    };

    private static List<Integer> jeans = new ArrayList<Integer>() {
        {
            add(R.drawable.jeans1);
            add(R.drawable.jeans2);
            add(R.drawable.jeans3);
            add(R.drawable.jeans4);
        }
    };

    public static List<Integer> getCloths(){
        return cloths;
    }

    public static List<Integer> getJeans(){
        return jeans;
    }
}
