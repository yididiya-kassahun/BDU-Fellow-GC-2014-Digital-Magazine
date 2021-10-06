package com.vlm.gc2014digitalmag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class polyActivity extends AppCompatActivity {
    RecyclerView rcvMain;
    ArrayList<String> imgArrylist=new ArrayList<>();
    ArrayList<String> lastwordlist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poly);

        imgArrylist.add("");
        imgArrylist.add("");
        imgArrylist.add("");
        imgArrylist.add("");
        imgArrylist.add("");
        imgArrylist.add("");
        imgArrylist.add("");

        lastwordlist.add("");
        lastwordlist.add("");
        lastwordlist.add("");
        lastwordlist.add("");
        lastwordlist.add("");
        lastwordlist.add("");
        lastwordlist.add("");

      //  imgArrylist.addAll(lastwordlist);

        rcvMain=findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new GridLayoutManager(this,2));
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(polyActivity.this,imgArrylist,lastwordlist);
        rcvMain.setAdapter(recyclerViewAdapter);
    }
}