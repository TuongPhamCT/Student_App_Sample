package com.example.buoi3_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ListView lvSTD;
    private ArrayList<Student> Arr = new ArrayList<Student>();
    private StudentListAdapter adt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvSTD = (ListView) findViewById(R.id.listView);

        ArrayList<Subject> subjects1 = new ArrayList<>();
        subjects1.add(new Subject("SE001", "Cong Nghe Phan Mem"));
        subjects1.add(new Subject("SE002", "Ky Thuat Thong Tin"));

        ArrayList<Subject> subjects2 = new ArrayList<>();
        subjects2.add(new Subject("SE001", "CNPM"));
        subjects2.add(new Subject("SE002", "Ky Thuat Thong Tin"));
        subjects2.add(new Subject("SS003", "Tu Tuong Ho Chi Minh"));
        subjects2.add(new Subject("SS004", "Kinh Te Chinh Tri"));

        ArrayList<Subject> subjects3 = new ArrayList<>();
        subjects3.add(new Subject("SE001", "Cong Nghe Phan Mem"));
        subjects3.add(new Subject("SE002", "Ky Thuat Thong Tin"));
        subjects3.add(new Subject("SS007", "Ky Nang Nghe Nghiep"));

        Arr.add(new Student("Pham Thanh Tuong", "21522775", "12/05/2003", "KTPM2021", R.drawable.profile, subjects1));
        Arr.add(new Student("Nguyen Trong Tin", "22222222", "02/01/2003", "KTPM2021", R.drawable.im_one, subjects2));
        Arr.add(new Student("Nguyen Lam Hai", "33333333", "01/02/2003", "KTPM2021", R.drawable.im_two, subjects3));

        adt = new StudentListAdapter(getApplicationContext(),R.layout.list_student_layout, Arr);
        lvSTD.setAdapter(adt);
    }


}