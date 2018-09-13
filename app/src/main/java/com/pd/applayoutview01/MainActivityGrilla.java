package com.pd.applayoutview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityGrilla extends AppCompatActivity {
    GridView gvgrilla;
    List<Libro> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grilla);
        gvgrilla = (GridView) findViewById(R.id.gvGrilla);

        data.add(new Libro("1","Perros hambrientos","Perro tarapotino"));
        data.add(new Libro("2","Perros hambrientos2","Perro tarapotino"));
        data.add(new Libro("3","Perros hambrientos3","Perro tarapotino"));
        data.add(new Libro("4","Perros hambrientos4","Perro tarapotino"));
        data.add(new Libro("6","Perros hambrientos5","Perro tarapotino"));

        gvgrilla.setAdapter(new ListArrayAdapter(MainActivityGrilla.this,data));
    }
}
