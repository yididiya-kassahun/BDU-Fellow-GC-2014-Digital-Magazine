package com.vlm.gc2014digitalmag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class pedaActivity extends AppCompatActivity {

    RecyclerView rcvMain;
    ArrayList<String> imgArrylist=new ArrayList<>();
    ArrayList<String> lastwordlist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peda);

        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/abenezer.jpg?alt=media&token=a0ab1f1d-3c6d-47e5-9012-374f9a099c35");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/eyob.jpg?alt=media&token=7d398e53-021d-4c90-8d21-1317860fb97e");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/firehiwot_abebe.jpg?alt=media&token=098a1b96-9964-4657-b0c2-86709c183130");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/herani_kidane.jpg?alt=media&token=2f6b3c22-42f0-4cac-b268-9f62c9b44009");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/kansu_wube.jpg?alt=media&token=0c725e54-c8cb-409d-85b5-5e072c19aa2e");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/kefa_fida.jpg?alt=media&token=0f480fc3-02ca-4538-bcd6-a60fc589ec1b");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/kidst_uma.jpg?alt=media&token=5dbe1e4c-975b-488e-b5c3-891fa2e0c4a2");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/mitku_tasisa.jpg?alt=media&token=629b2a3a-d01b-4954-a1d2-d8095ded65dc");
        imgArrylist.add("");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/negede_nasa.jpg?alt=media&token=c674c633-3fe7-4ad5-bc05-0f831cfc8bde");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/nigus_kebede.jpg?alt=media&token=cd676d8d-a0df-413b-88b0-8ac9dacd9c35");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/rohobot_israel.jpg?alt=media&token=d4cc69bf-50a9-4f13-b70f-30855fae383d");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/tadios_kefiyalew.jpg?alt=media&token=d11e6dbd-6612-4fde-b633-5d22c4810d27");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/taye_desta.jpg?alt=media&token=319327d1-3de8-4830-9849-15cb92d0797a");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/tesfahun_tagesse.jpg?alt=media&token=eb225f60-869f-4cad-acb3-5b643a40c232");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/yosef_tilahun.jpg?alt=media&token=73601ac7-1b56-45ad-bc6a-b39efb58325c");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/zekarias_tsegaye.jpg?alt=media&token=00d825d9-4217-46cd-be7b-ba170cc4811e");

        lastwordlist.add("Name: Abenezer");
        lastwordlist.add("Name: Eyob");
        lastwordlist.add("Name: Firehiwot Abebe");
        lastwordlist.add("Name: Herani Kidane");
        lastwordlist.add("Name: kansu wube");
        lastwordlist.add("Name: Kefa Fida");
        lastwordlist.add("Name: Kidst Uma");
        lastwordlist.add("Name: Mitku Tasisa");
        lastwordlist.add("Name: Nataniya ");
        lastwordlist.add("Name: Negede Nasa");
        lastwordlist.add("Name: Nigus Kebede");
        lastwordlist.add("Name: Rohobot Israel");
        lastwordlist.add("Name: Tadios Kefyalew");
        lastwordlist.add("Name: Taye Desta");
        lastwordlist.add("Name: Tesfahun Tagesse");
        lastwordlist.add("Name: Yosef Tilahun");
        lastwordlist.add("Name: Zekarias Tsegaye");

        //  imgArrylist.addAll(lastwordlist);

        rcvMain=findViewById(R.id.rcvMain2);
        rcvMain.setLayoutManager(new GridLayoutManager(this,2));
        pedaRecyclerViewAdapter recyclerViewAdapter2= new pedaRecyclerViewAdapter(pedaActivity.this,imgArrylist,lastwordlist);
        rcvMain.setAdapter(recyclerViewAdapter2);
    }
}