package com.johnprinz.animaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Elephant dumbo = new Elephant(15, 1500);
        dumbo.hungerLevel = 5;


        Log.i("info", "age: " + dumbo.age + " hunger: " + dumbo.hungerLevel);

        dumbo.eat();
        Log.i("info", "age: " + dumbo.age + " hunger: " + dumbo.hungerLevel);

    }
}
