package com.example.buoi3_01;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Subject implements Serializable {
    protected String idSubject;
    protected String nameSubject;

    public Subject(String id, String n){
        idSubject = id;
        nameSubject = n;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }
}
