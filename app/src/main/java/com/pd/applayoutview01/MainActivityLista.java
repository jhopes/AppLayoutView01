package com.pd.applayoutview01;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityLista extends AppCompatActivity {
    ListView lvlista;
    List<Libro> data = new ArrayList<>();
    //String[] frutas={"Mango", "Cirhuela", "Uva", "Zandia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lista);
        lvlista = (ListView) findViewById(R.id.lvLista);
        /*ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,frutas);
        listFrutas.setAdapter(adapter);
        listFrutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Snackbar.make(view,"name="+frutas[i],Snackbar.LENGTH_SHORT).show();
            }
        });*/
        data.add(new Libro("1","Perros hambrientos","Perro tarapotino"));
        data.add(new Libro("2","Perros hambrientos2","Perro tarapotino"));
        data.add(new Libro("3","Perros hambrientos3","Perro tarapotino"));
        data.add(new Libro("4","Perros hambrientos4","Perro tarapotino"));
        data.add(new Libro("6","Perros hambrientos5","Perro tarapotino"));

        lvlista.setAdapter(new ListArrayAdapter(MainActivityLista.this,data));
        lvlista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Libro li =data.get(i);
                Snackbar.make(view,"name="+li.getId(),Snackbar.LENGTH_SHORT).show();
            }
        });
        }
}
