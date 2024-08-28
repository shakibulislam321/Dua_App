package com.example.dua;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;


public class HomeFragment extends Fragment {
LinearLayout lay3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                View myview=inflater.inflate(R.layout.fragment_home, container, false);

        lay3 = myview.findViewById(R.id.lay3);


        lay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(),HomeNamaja.class);
                startActivity(myIntent);
            }
        });




        //status bar color code here===========
        getActivity().getWindow().setStatusBarColor(Color.parseColor("#239d78"));





        return myview;
    }
}