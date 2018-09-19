package com.example.dtanp.masoi.model;

public class Phong {
    private String id;
    private int sophong;
    private String tenphong;
    private int cuoc;
    private int songuoi;

    public Phong() {
    }

    public Phong(String id, int sophong, String tenphong, int cuoc, int songuoi) {
        this.id = id;
        this.sophong = sophong;
        this.tenphong = tenphong;
        this.cuoc = cuoc;
        this.songuoi = songuoi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSophong() {
        return sophong;
    }

    public void setSophong(int sophong) {
        this.sophong = sophong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public int getCuoc() {
        return cuoc;
    }

    public void setCuoc(int cuoc) {
        this.cuoc = cuoc;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }
}
