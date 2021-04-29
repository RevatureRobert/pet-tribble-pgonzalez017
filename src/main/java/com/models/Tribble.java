package com.models;

public class Tribble {
    private int id;
    private int labId;
    private int hair;

    public Tribble(){ }

    public Tribble(int id, int labId, int hair){
        this.id = id;
        this.labId = labId;
        this.hair = hair;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLabId() {
        return labId;
    }

    public void setLabId(int labId) {
        this.labId = labId;
    }

    public int getHair() {
        return hair;
    }

    public void setHair(int hair) {
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Tribble{" +
                "id=" + id +
                ", labId=" + labId +
                ", hair=" + hair +
                '}';
    }

}
