package com.brillicaservices.gurjas.recyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements RecyclerAdapter.ListItemClickListener{

    RecyclerView recyclerView;

    StudentModel studentModel;

    RecyclerAdapter recyclerAdapter;

    ArrayList<StudentModel> studentModelArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view_sample);

        studentModelArrayList.add(new StudentModel("Sakshi"));
        studentModelArrayList.add(new StudentModel("Karan"));
        studentModelArrayList.add(new StudentModel("Jayesh"));
        studentModelArrayList.add(new StudentModel("Rajita"));
        studentModelArrayList.add(new StudentModel("Yugal"));
        studentModelArrayList.add(new StudentModel("Rohit"));
        studentModelArrayList.add(new StudentModel("Anjali"));
        studentModelArrayList.add(new StudentModel("Pragati"));
        studentModelArrayList.add(new StudentModel("Ruchir"));
        studentModelArrayList.add(new StudentModel("Dipesh"));
        studentModelArrayList.add(new StudentModel("Prachi"));
        studentModelArrayList.add(new StudentModel("Medhaavi"));
        studentModelArrayList.add(new StudentModel("Vikash"));
        studentModelArrayList.add(new StudentModel("Shivam"));
        studentModelArrayList.add(new StudentModel("Suraj"));


        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerAdapter = new
                RecyclerAdapter(studentModelArrayList,
                this);

        recyclerView.setAdapter(recyclerAdapter);
    }


    @Override
    public void onListItemClickListener(int clickedItemIndex) {
        Toast.makeText(getApplicationContext(), studentModelArrayList.get(clickedItemIndex).studentName, Toast.LENGTH_SHORT).show();
    }
}
