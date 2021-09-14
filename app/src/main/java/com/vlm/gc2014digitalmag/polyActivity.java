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

        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/bdu-fellowship-c6b49.appspot.com/o/62076777_695120370947454_3871601353042165760_n.jpg?alt=media&token=944e7d7f-eff0-4698-96a9-8b05f961d46a");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/bdu-fellowship-c6b49.appspot.com/o/62076777_695120370947454_3871601353042165760_n.jpg?alt=media&token=944e7d7f-eff0-4698-96a9-8b05f961d46a");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/bdu-fellowship-c6b49.appspot.com/o/62076777_695120370947454_3871601353042165760_n.jpg?alt=media&token=944e7d7f-eff0-4698-96a9-8b05f961d46a");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/bdu-fellowship-c6b49.appspot.com/o/62076777_695120370947454_3871601353042165760_n.jpg?alt=media&token=944e7d7f-eff0-4698-96a9-8b05f961d46a");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/bdu-fellowship-c6b49.appspot.com/o/62076777_695120370947454_3871601353042165760_n.jpg?alt=media&token=944e7d7f-eff0-4698-96a9-8b05f961d46a");

        lastwordlist.add("Mathias");
        lastwordlist.add("yididia");
        lastwordlist.add("abebe");
        lastwordlist.add("kebede");
        lastwordlist.add("Abdissa");

      //  imgArrylist.addAll(lastwordlist);

        rcvMain=findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new GridLayoutManager(this,2));
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(polyActivity.this,imgArrylist,lastwordlist);
        rcvMain.setAdapter(recyclerViewAdapter);
    }
}