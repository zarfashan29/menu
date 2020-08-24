package com.app.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    List<fooddata> myFoodlist;
    fooddata mfooddata = new fooddata();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Main2Activity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        myFoodlist = new ArrayList<>();
        mfooddata = new fooddata("Desi Food", "ORDER NOW" ,"Starting from Rs. 350 only",R.drawable.image1);
        myFoodlist.add(mfooddata);
        mfooddata = new fooddata("Street Food",  "ORDER NOW", "Starting from Rs. 50 only", R.drawable.image2);
        myFoodlist.add(mfooddata);
        mfooddata = new fooddata("Fast Food", "ORDER NOW", "Rs.120", R.drawable.image3);
        myFoodlist.add(mfooddata);
        myadpt myadpt = new myadpt(Main2Activity.this,myFoodlist);
        mRecyclerView.setAdapter(myadpt);

    }
}
