package com.example.buoi3_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_screen);
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        ImageView anh = (ImageView) findViewById(R.id.ivAvt1);
        TextView ten = (TextView) findViewById(R.id.tvName1);
        TextView id = (TextView) findViewById(R.id.tvID1);
        TextView birth = (TextView) findViewById(R.id.tvDob1);
        TextView lop = (TextView) findViewById(R.id.tvLop1);
        ListView monhoc = (ListView) findViewById(R.id.listSubject);
        Intent intent = getIntent();
        Student student = (Student)intent.getSerializableExtra("Student");
        anh.setImageResource(student.getImage());
        ten.setText("Name: " + student.getName());
        id.setText("ID: " + student.getId());
        birth.setText("Dob: " + student.getDob());
        lop.setText("Class: " + student.getLop());

        ArrayList<String> arrayList = new ArrayList<>();
        for (Subject subject: student.getSubjects()){
            arrayList.add(subject.getIdSubject() + "\t" + subject.getNameSubject());
        }
        monhoc.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList));

    }
}