package com.example.tp1.dao;

import java.util.List;

public interface IDao <T>{
    boolean create(T o);
    boolean update(T o);
    boolean delet(T o);
    List<T> findAll();
    T findById(int id);
}
