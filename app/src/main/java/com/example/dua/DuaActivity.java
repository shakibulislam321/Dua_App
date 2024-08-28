package com.example.dua;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DuaActivity extends AppCompatActivity {
TextView suratext1,suratext2,suratext3,suratext4;
    public static String TIITLE = "";
    public static String TIITLE1 = "";
    public static String TIITLE2 = "";
    public static String TIITLE3 = "";
    ImageView suraimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        getWindow().setStatusBarColor(Color.parseColor("#038C7F"));

        suratext1 = findViewById(R.id.suratext1);
        suratext2 = findViewById(R.id.suratext2);
        suratext3 = findViewById(R.id.suratext3);
        suratext4 = findViewById(R.id.suratext4);
        suraimage = findViewById(R.id.suraimage);

        suratext1.setText(TIITLE);
        suratext2.setText(TIITLE1);
        suratext3.setText(TIITLE2);
        suratext4.setText(TIITLE3);

        suraimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });







    }
}