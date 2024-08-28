package com.example.dua;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeNamaja extends AppCompatActivity {
LinearLayout bglay1,bglay2,bglay3;

TextView namajtext1,namajtext2,namajtext3;
ImageView namajimage;
Namaj_different_parts_of_dua namajDifferentPartsOfDua = new Namaj_different_parts_of_dua();
    private boolean shouldChangeStatusBarTintToDark;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_namaja);

        getSupportFragmentManager().beginTransaction().replace(R.id.namajframelay,namajDifferentPartsOfDua ).commit();


       //StatusBar icon color change=====
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) { View decor = getWindow().getDecorView();

            if (shouldChangeStatusBarTintToDark) { decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            }
            else {
                 decor.setSystemUiVisibility(0); } }
        getWindow().setStatusBarColor(Color.parseColor("#1f9370"));

       // back button code==========
        namajimage = findViewById(R.id.namajimage);

        namajimage .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Namaj background code=========
        bglay1 = findViewById(R.id.bglay1);
        bglay2 = findViewById(R.id.bglay2);
        bglay3 = findViewById(R.id.bglay3);


        namajtext1 = findViewById(R.id.namajtext1);
        namajtext2 = findViewById(R.id.namajtext2);
        namajtext3 = findViewById(R.id.namajtext3);

        bglay1.setBackgroundResource(R.drawable.namaj_bg_style1);
        bglay2.setBackgroundResource(R.drawable.namaj_bg_style2);
        bglay3.setBackgroundResource(R.drawable.namaj_bg_style2);
        namajtext1.setTextColor(Color.parseColor("#ffffff"));



        bglay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //background code==========
                bglay1.setBackgroundResource(R.drawable.namaj_bg_style1);
                bglay2.setBackgroundResource(R.drawable.namaj_bg_style2);
                bglay3.setBackgroundResource(R.drawable.namaj_bg_style2);

                //textColor code==========
                namajtext1.setTextColor(Color.parseColor("#ffffff"));
                namajtext2.setTextColor(Color.parseColor("#000000"));
                namajtext3.setTextColor(Color.parseColor("#000000"));
                // listview code======



            }

        });

        bglay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //background code==========
                bglay1.setBackgroundResource(R.drawable.namaj_bg_style2);
                bglay2.setBackgroundResource(R.drawable.namaj_bg_style1);
                bglay3.setBackgroundResource(R.drawable.namaj_bg_style2);

                //textColor code==========
                namajtext1.setTextColor(Color.parseColor("#000000"));
                namajtext2.setTextColor(Color.parseColor("#ffffff"));
                namajtext3.setTextColor(Color.parseColor("#000000"));




            }
        });

        bglay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //background code==========
                bglay1.setBackgroundResource(R.drawable.namaj_bg_style2);
                bglay2.setBackgroundResource(R.drawable.namaj_bg_style2);
                bglay3.setBackgroundResource(R.drawable.namaj_bg_style1);

                //textColor code==========
                namajtext1.setTextColor(Color.parseColor("#000000"));
                namajtext2.setTextColor(Color.parseColor("#000000"));
                namajtext3.setTextColor(Color.parseColor("#ffffff"));

            }
        });



    }//onCreate close here=======





}