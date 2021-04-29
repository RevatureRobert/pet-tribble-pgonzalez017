package com;

import com.dao.LabDAO;
import com.dao.TribbleDAO;
import com.models.Lab;
import com.models.Tribble;

import java.util.List;

public class Driver {
    public static void main(String args[]){
        LabDAO labDAO = new LabDAO();
        TribbleDAO tribbleDAO = new TribbleDAO();
//        Lab lab = new Lab(1, "DeeDee");
//        Tribble tribble = new Tribble(0, 1, 45);
//
//        labDAO.save(lab);
//        tribbleDAO.save(tribble);
//
//        System.out.println(labDAO.getAll());        // Testing get all method
//        System.out.println(labDAO.findById(1));     // Testing find by Id method
//        labDAO.update(new Lab(2, "Dexter's Lab"));      // Testing Update Method
//        System.out.println(labDAO.getAll());
//        labDAO.deleteById(2);                       // Testing Delete Method
        System.out.println(labDAO.getAll());
//        System.out.println();
//
        System.out.println(tribbleDAO.getAll());     // Testing get all method
//        System.out.println(tribbleDAO.findById(1));     // Testing find by Id method
//        tribbleDAO.update(new Tribble(2, 1, 23));      // Testing Update Method
//        System.out.println(tribbleDAO.getAll());
//        tribbleDAO.deleteById(2);                       // Testing Delete Method
//        System.out.println(tribbleDAO.getAll());

    }
}
