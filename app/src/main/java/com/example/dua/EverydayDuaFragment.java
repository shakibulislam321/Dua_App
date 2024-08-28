package com.example.dua;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class EverydayDuaFragment extends Fragment {

    ListView ervrylist;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();

    HashMap<String,String> hashMap = new HashMap<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View myview = inflater.inflate(R.layout.fragment_everyday_dua, container, false);
        ervrylist = myview.findViewById(R.id.ervrylist);

        hashMap = new HashMap<>();
        hashMap.put("name","০১");
        hashMap.put("name1","ঘুমানোর আগের দোয়া");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০২");
        hashMap.put("name1","ঘুম থেকে উঠার পরে যে দোয়া");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৩");
        hashMap.put("name1","খাবার খাওয়ার আগে যে দোয়া");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৪");
        hashMap.put("name1","খাবার খাওয়া শেষে যে দোয়া পড়তে");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৫");
        hashMap.put("name1","টয়লেটে প্রবেশ করার দোয়া");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৬");
        hashMap.put("name1","টয়লেট থেকে বের হওয়ার দোয়া");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৭");
        hashMap.put("name1","দুনিয়া-আখিরাতের কল্যাণ চেয়ে দোয়া");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৮");
        hashMap.put("name1","আল্লাহর গযব থেকে মুক্ত থাকার দোয়া");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৯");
        hashMap.put("name1","ঋণগ্রস্ত ও চিন্তিত অবস্থা থেকে মুক্ত থাকার দোয়া");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","১০");
        hashMap.put("name1","শত্রুর দেহা থেকে মুক্ত থাকার");
        arrayList.add(hashMap);

        MyAdapter myAdapter = new MyAdapter();
        ervrylist.setAdapter(myAdapter);




        return myview;
    }//onCreateView close here=======

    private class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView1 = layoutInflater.inflate(R.layout.everyday_item_list,parent,false);

            TextView everytext1 = myView1.findViewById(R.id.everytext1);
            TextView everytext2 = myView1.findViewById(R.id.everytext2);
            HashMap<String,String> hashMap = arrayList.get(position);
            everytext1.setText(hashMap.get("name"));
            everytext2.setText(hashMap.get("name1"));




            return myView1;
        }
    }


}