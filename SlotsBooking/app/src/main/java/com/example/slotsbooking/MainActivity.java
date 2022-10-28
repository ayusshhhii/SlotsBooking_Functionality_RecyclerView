package com.example.slotsbooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    //GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("05:00 AM");
        nestedList1.add("06:00 AM");
        nestedList1.add("07:00 AM");
        nestedList1.add("08:00 AM");
        nestedList1.add("09:00 AM");
        nestedList1.add("10:00 AM");
        nestedList1.add("11:00 AM");

        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("12:00 PM");
        nestedList2.add("01:00 PM");
        nestedList2.add("02:00 PM");
        nestedList2.add("03:00 PM");
        nestedList2.add("04:00 PM");

        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("05:00 PM");
        nestedList3.add("06:00 PM");
        nestedList3.add("07:00 PM");
        nestedList3.add("08:00 PM");

        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("09:00 PM");
        nestedList4.add("10:00 PM");
        nestedList4.add("11:00 PM");
        nestedList4.add("12:00 PM");
        nestedList4.add("01:00 AM");
        nestedList4.add("02:00 AM");
        nestedList4.add("03:00 AM");
        nestedList4.add("04:00 AM");

        mList.add(new DataModel(nestedList1 , "Morning"));
        mList.add(new DataModel( nestedList2,"Afternoon"));
        mList.add(new DataModel( nestedList3,"Evening"));
        mList.add(new DataModel(nestedList4 ,"Night"));

        //gridLayoutManager= new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);

        adapter = new ItemAdapter(mList);
        //recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}