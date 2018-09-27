package com.example.iqbalpriansyah.finalandroid;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        //sebuah statment pengecekan agar fragment hanya dibuat sekali saja.
        if (savedInstanceState == null) {

            BodyPartFragment bodyPart; // inisiasi memanggil class bodypartsfragment
            FragmentManager fm = getSupportFragmentManager();

            bodyPart = new BodyPartFragment();
            bodyPart.setImageid(BodyImageAsset.getCloths());
            bodyPart.setIndexImg(0);
            fm.beginTransaction().add(R.id.clotsContainer, bodyPart).commit();

            bodyPart = new BodyPartFragment();
            bodyPart.setImageid(BodyImageAsset.getJeans());
            bodyPart.setIndexImg(0);
            fm.beginTransaction().add(R.id.jeansContainer, bodyPart).commit();
        }
    }
}
