package com.pd.applayoutview01;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListArrayAdapter extends ArrayAdapter {

    private Context context;
    private List<Libro> data;

    public ListArrayAdapter(Activity context, List<Libro> data) {
        super(context,R.layout.adapter,data);
        this.context = context;
        this.data = data;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.adapter, null);

        TextView titulo = (TextView) item.findViewById(R.id.tvTitulo);
        titulo.setText("Título: " + data.get(position).getTitulo());

        TextView subtitulo = (TextView) item.findViewById(R.id.tvSubTitulo);
        subtitulo.setText("Sub título: " + data.get(position).getSubtitulo());
       return (View) item;
    }
}
