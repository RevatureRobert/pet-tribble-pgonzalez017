package com.dao;

import java.util.List;

public interface GenericDAO<T> {
    public void save(T t);
    public void deleteById(int id);
    public void update(T t);
    public T findById(int id);
    public List<T> getAll();
}
