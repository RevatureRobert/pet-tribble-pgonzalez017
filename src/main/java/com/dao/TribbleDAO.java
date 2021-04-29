package com.dao;

import com.models.Tribble;
import com.util.ConnectionConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TribbleDAO implements GenericDAO<Tribble>{

    Connection c = ConnectionConfig.getInstance();

    @Override
    public void save(Tribble tribble) {
        String sql = "insert into tribbles (id, labs_id, hair) VALUES (default, ?, ?)";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, tribble.getLabId());
            ps.setInt(2, tribble.getHair());
            ps.execute();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from tribbles where id = ?";
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
    public void update(Tribble tribble) {
        String sql = "update tribbles set labs_id = ?, hair = ? where id = ?";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, tribble.getLabId());
            ps.setInt(2, tribble.getHair());
            ps.setInt(3, tribble.getId());
            ps.execute();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Tribble findById(int id) {
        String sql = "select * from tribbles where id = ?";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Tribble tribble = new Tribble();
            while(rs.next()){
                tribble.setId(rs.getInt("id"));
                tribble.setLabId(rs.getInt("labs_id"));
                tribble.setHair(rs.getInt("hair"));
            }
            return tribble;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Tribble> getAll() {
        String sql = "select * from tribbles";
        try{
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Tribble> tribbles = new ArrayList<Tribble>();
            Tribble tribble;
            while(rs.next()){
                tribble = new Tribble();
                tribble.setId(rs.getInt("id"));
                tribble.setLabId(rs.getInt("labs_id"));
                tribble.setHair(rs.getInt("hair"));
                tribbles.add(tribble);
            }
            return tribbles;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
