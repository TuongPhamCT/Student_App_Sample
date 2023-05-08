package com.example.buoi3_01;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.Serializable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class StudentListAdapter extends ArrayAdapter<Student> {
    private Context context;
    private int resource;
    private List<Student> students;
    public StudentListAdapter(Context context, int resource, List<Student> students)
    {
        super(context, resource, students);
        this.resource = resource;
        this.students = students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent)
    {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(this.getContext());
            v = vi.inflate(this.resource, null);
        }
        Student s = getItem(position);
        if (s != null) {
            TextView nameTextView = (TextView) v.findViewById(R.id.tvName);
            TextView idTextView = (TextView) v.findViewById(R.id.tvID);
            TextView dobTextView = (TextView) v.findViewById(R.id.tvDob);
            TextView lopTextView = (TextView) v.findViewById(R.id.tvLop);
            ImageView avtImageView = (ImageView) v.findViewById(R.id.ivAvt);
            Button buttonReadMore = (Button) v.findViewById(R.id.btnReadMore);
            buttonReadMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getContext(), DetailActivity.class);
                    intent.putExtra("Student", s);
                    getContext().startActivity(intent);
                }
            });

            if (nameTextView!= null)
                nameTextView.setText("Name: " + s.getName());
            if (idTextView != null)
                idTextView.setText("ID: " + s.getId());
            if (dobTextView!= null)
                dobTextView.setText("Dob: " + s.getDob());
            if (lopTextView!= null)
                lopTextView.setText("Class: " + s.getLop());
            if (avtImageView!= null)
                avtImageView.setImageResource(s.getImage());
        }
        return v;
    }
}
