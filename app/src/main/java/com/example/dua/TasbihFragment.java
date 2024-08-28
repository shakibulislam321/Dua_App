package com.example.dua;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TasbihFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                View myview=inflater.inflate(R.layout.fragment_tasbih, container, false);
        getActivity().getWindow().setStatusBarColor(Color.GRAY);


        return myview;
    }
}