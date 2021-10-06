package com.vlm.gc2014digitalmag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class selamActivity extends AppCompatActivity {

    RecyclerView rcvMain;
    ArrayList<String> imgArrylist=new ArrayList<>();
    ArrayList<String> lastwordlist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selam);

        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fabigiya_tadesse.jpg?alt=media&token=3621c2c8-fd9c-4120-b594-c043f61769ad");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Faklillu_arado.JPG?alt=media&token=bbb08b89-235e-4958-ac8f-4f0fa26dadd0");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fbereket_kassa.jpg?alt=media&token=3e2a1717-fd3b-4433-811b-b3c06e47d9c3");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fbereket_tadesse.jpg?alt=media&token=b316dade-97a0-4fe0-ac8b-80ab4f1e1eb7");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fbereket_tefera.jpg?alt=media&token=56fa8ad5-20e6-4cbd-9f49-1052026d71f1");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fbetel_birhanu.jpg?alt=media&token=12dfd47b-40b2-45c2-9971-03c8c48a2eed");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fbetel_petros.jpg?alt=media&token=4160c667-8486-4aba-bb98-80010134aca4");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fbiruktawit_sisay.jpg?alt=media&token=a89ac084-31a3-4200-b7b0-38a483a05718");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Feba_edosa.jpg?alt=media&token=2b28dc59-c925-42ed-b159-b778df007ced");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fehitalem_yishak.jpg?alt=media&token=41e4915d-ad10-4e14-b33d-179242ddbf5c");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fgedion_adissie.jpg?alt=media&token=8a4072fc-a955-4f2a-b237-01898791adb7");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fhabtamu_tamiru.jpg?alt=media&token=b412b6f2-cd60-4d62-8e8d-a51af2a7eff2");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fhana_zeleke.jpg?alt=media&token=560eb57d-32fc-40a0-8dd0-55442d03f478");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fjorge_dubale.jpg?alt=media&token=10915bd1-e330-4737-bd1f-b364ab65fabc");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Flidya_tadele.jpg?alt=media&token=c244d408-26b7-40c1-a835-4518ac339f14");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fmihret_girma.jpg?alt=media&token=e4663702-1f7c-40da-b694-7378a077236f");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fmihret_mola.jpg?alt=media&token=81ee5b2d-c406-4a15-bc07-1da9d023aa7f");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fmisiker_shiferaw.jpg?alt=media&token=754c15d6-5dfb-4a33-9f00-a6603c34e3ad");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Ftesfaye_abera.jpg?alt=media&token=d84ff4f5-c3f4-4f63-ab6d-7cd43bce27eb");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Ftewachew_bresawu.jpg?alt=media&token=7118abdd-3dcc-479d-85f4-db0ef61f1f63");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Ftibeb_fikadu.jpg?alt=media&token=e8aa254a-fa17-4066-8a94-eb8d618405c2");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Ftigist_ashenafi.jpg?alt=media&token=8afe8cac-4ecc-4a69-94f6-01c0e57eb7eb");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fyeabfiker_endale.jpg?alt=media&token=8a189bc6-e316-4c11-a81e-0dd274fa2426");
        imgArrylist.add("https://firebasestorage.googleapis.com/v0/b/graduate-digital-magazine.appspot.com/o/selam%20campus%2Fyonathan_tesfaye.jpg?alt=media&token=9c6744de-5138-4266-8fce-8a52510564db");

        lastwordlist.add("Name: Abigiya Tadesse");
        lastwordlist.add("Name: Aklilu Arado");
        lastwordlist.add("Name: Bereket Kassa");
        lastwordlist.add("Name: Bereket Tadesse");
        lastwordlist.add("Name: Bereket Tefera");
        lastwordlist.add("Name: Betel Birhanu");
        lastwordlist.add("Name: Betel Petros");
        lastwordlist.add("Name: Biruktawit Sisay");
        lastwordlist.add("Name: Eba Edosa");
        lastwordlist.add("Name: Ehitalem Yishak");
        lastwordlist.add("Name: Gedion Adissie");
        lastwordlist.add("Name: Habtamu Tamiru");
        lastwordlist.add("Name: Hana Zeleke");
        lastwordlist.add("Name: Jorge Dubale");
        lastwordlist.add("Name: Lidya Tadele");
        lastwordlist.add("Name: Mihret Girma");
        lastwordlist.add("Name: Mihret Mola");
        lastwordlist.add("Name: Misker Shiferaw");
        lastwordlist.add("Name: Tesfaye Abera");
        lastwordlist.add("Name: Tewachew Bresaw");
        lastwordlist.add("Name: Tibeb Fikadu");
        lastwordlist.add("Name: Tigist Ashenafi");
        lastwordlist.add("Name: Yeabfiker Endale");
        lastwordlist.add("Name: Yonatan Tesfaye");

        //  imgArrylist.addAll(lastwordlist);

        rcvMain=findViewById(R.id.rcvMain3);
        rcvMain.setLayoutManager(new GridLayoutManager(this,2));
        selamRecyclerViewAdapter recyclerViewAdapter3= new selamRecyclerViewAdapter(selamActivity.this,imgArrylist,lastwordlist);
        rcvMain.setAdapter(recyclerViewAdapter3);
    }
}