package com.example.tp1.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp1.beans.Pizza;
import com.example.tp1.R;


import java.util.List;

public class Pizzaadapter extends BaseAdapter {
    private List<Pizza> items;
    private LayoutInflater inflater;
    public Pizzaadapter(Activity activity,List<Pizza> items){
        this.items=items;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return items.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
            view=inflater.inflate(R.layout.pizza_item,null);
        TextView nom = view.findViewById(R.id.nom);
        TextView nbrIngredients = view.findViewById(R.id.nbrIngredients);
        TextView duree = view.findViewById(R.id.duree);
        ImageView image = view.findViewById(R.id.image);
        TextView id = view.findViewById(R.id.id);

        nom.setText(items.get(i).getNom());
        nbrIngredients.setText(items.get(i).getNbrIngredients()+"");
        duree.setText(items.get(i).getDuree()+"");
        id.setText(items.get(i).getId()+"");
        image.setImageResource(items.get(i).getPhoto());

        return view;

    }
}
