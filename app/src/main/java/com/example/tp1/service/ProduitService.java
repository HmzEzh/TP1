package com.example.tp1.service;


import android.util.Log;

import com.example.tp1.beans.Pizza;
import com.example.tp1.dao.IDao;


import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Pizza> {
    private static final String TAG = "FruitService";
    private List<Pizza> pizzas;
    private static ProduitService service_instance;
    public static ProduitService getInstance(){
        if(service_instance==null){
            service_instance = new ProduitService();
        }
        return service_instance;
    }
    private ProduitService() {
        this.pizzas = new ArrayList<>();
    }
    @Override
    public boolean create(Pizza o) {
        Log.d(TAG, "Create : "+o.getId()+"");
        return pizzas.add(o);
    }

    @Override
    public boolean update(Pizza o) {
        return true;
    }

    @Override
    public boolean delet(Pizza o) {
        Log.d(TAG, "delete : "+o.getId()+"");
        return pizzas.remove(o);
    }

    @Override
    public List<Pizza> findAll() {
        Log.d(TAG, "FindAll");
        return pizzas;

    }

    @Override
    public Pizza findById(int id) {
        for(Pizza pizza:pizzas){
            if(pizza.getId() == id){
                return pizza;
            }
        }
        return null;
    }
}
