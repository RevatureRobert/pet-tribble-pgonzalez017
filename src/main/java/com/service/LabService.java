package com.service;

import com.dao.LabDAO;
import com.models.Lab;

import java.util.List;

public class LabService {
    private static LabDAO labDAO;

    public Lab findById(int id){
        return labDAO.findById(id);
    }

    public List<Lab> getAll(){
        return labDAO.getAll();
    }

    public void save(Lab lab){
        labDAO.save(lab);
    }

    public void deleteById(int id){
        labDAO.deleteById(id);
    }

    public void update(Lab lab){
        labDAO.update(lab);
    }

    public LabService(){
        labDAO = new LabDAO();
    }
}
