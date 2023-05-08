package com.example.buoi3_01;

import android.media.Image;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    protected String name;
    protected String dob;
    protected String lop;
    protected String id;
    protected int image;

    protected ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String ten, String id, String date, String lop, int image, ArrayList<Subject> arr)
    {
        this.name = ten;
        this.id = id;
        this.dob = date;
        this.lop = lop;
        this.image = image;
        this.subjects = arr;
    }

    public String getDob() {
        return dob;
    }

    public int getImage() {
        return image;
    }

    public String getLop() {
        return lop;
    }

    public String getId() {return id;}

    public ArrayList<Subject> getSubjects() {return subjects;}

    public String getName() {
        return name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {this.id = id;}
}
