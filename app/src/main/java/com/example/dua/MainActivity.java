package com.example.dua;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottom_nav;
  HomeFragment homeFragment = new HomeFragment();
   QuranFragment quranFragment = new QuranFragment();
   TasbihFragment tasbihFragment = new TasbihFragment();
   PhotoFragment photoFragment = new PhotoFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_nav=findViewById(R.id.bottom_nav);





        //Bottom_navigation Code here---------------------
        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,homeFragment ).commit();
        bottom_nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
         @Override
         public boolean onNavigationItemSelected(@NonNull MenuItem item) {
             if (item.getItemId()==R.id.home) {
                 getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,homeFragment ).commit();
                return true;
             }
            else if (item.getItemId()==R.id.quran) {
                 getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, quranFragment).commit();
                 return true;
             }
            else if (item.getItemId()==R.id.tasbih) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout, tasbihFragment).commit();
                 return true;
             }
            else if (item.getItemId()==R.id.photo) {
                 getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,photoFragment ).commit();
                 return true;
             }


             return true;
         }
     });
    }

}