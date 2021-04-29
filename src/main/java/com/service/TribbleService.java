package com.service;

import com.dao.LabDAO;
import com.dao.TribbleDAO;
import com.models.Tribble;

import java.util.List;

public class TribbleService {

    private static TribbleDAO tribbleDAO;

    public Tribble findById(int id){
        return tribbleDAO.findById(id);
    }

    public List<Tribble> getAll(){
        return tribbleDAO.getAll();
    }

    public void save(Tribble tribble){
        tribbleDAO.save(tribble);
    }

    public void deleteById(int id){
        tribbleDAO.deleteById(id);
    }

    public void update(Tribble tribble){
        tribbleDAO.update(tribble);
    }

    public TribbleService(){
        tribbleDAO = new TribbleDAO();
    }
}
