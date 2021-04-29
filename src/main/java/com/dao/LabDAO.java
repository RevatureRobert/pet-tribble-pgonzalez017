package com.dao;

import com.models.Lab;
import com.models.Tribble;
import com.util.ConnectionConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LabDAO implements GenericDAO<Lab>{

    Connection c = ConnectionConfig.getInstance();

    @Override
    public void save(Lab lab) {
        String sql = "insert into labs (id, lab_name) VALUES (default, ?)";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, lab.getName());
            ps.execute();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from labs where id = ?";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Lab lab) {
        String sql = "update labs set lab_name = ? where id = ?";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, lab.getName());
            ps.setInt(2, lab.getId());
            ps.execute();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Lab findById(int id) {
        String sql = "select * from labs where id = ?";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Lab lab = new Lab();
            while(rs.next()){
                lab.setId(rs.getInt("id"));
                lab.setName(rs.getString("lab_name"));
            }
            return lab;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List getAll() {
        String sql = "select * from labs";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Lab> labs = new ArrayList<Lab>();
            Lab lab;
            while(rs.next()){
                lab = new Lab();
                lab.setId(rs.getInt("id"));
                lab.setName(rs.getString("lab_name"));
                labs.add(lab);
            }
            return labs;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
