package com.example.dua;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class DuaFragment extends Fragment {
    ListView listview;
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String> hashMap = new HashMap<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.fragment_dua, container, false);


       //listView code here===========
       listview = myview.findViewById(R.id.listview);

        hashMap = new HashMap<>();
        hashMap.put("name","০১");
        hashMap.put("name1","সূরা ফাতিহা");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");

        hashMap.put("title","সূরা ফাতিহা");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০২");
        hashMap.put("name1","সূরা নাস");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা নাস");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","০৩");
        hashMap.put("name1","সূরা ফালাক্ব");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা ফালাক্ব");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৪");
        hashMap.put("name1","সূরা ইখলাস");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা ইখলাস");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৫");
        hashMap.put("name1","সূরা লাহাব");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা লাহাব");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৬");
        hashMap.put("name1","সূরা নাসর");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা নাসর");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৭");
        hashMap.put("name1","সূরা কাওসার");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা কাওসার");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৮");
        hashMap.put("name1","সূরা কাফিরুন");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা কাফিরুন");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","০৯");
        hashMap.put("name1","সূরা মা‘উন");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা মা‘উন");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","১০");
        hashMap.put("name1","সূরা কূরাইশ");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা কূরাইশ");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","১১");
        hashMap.put("name1","সূরা ফীল");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা ফীল");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","১২");
        hashMap.put("name1","সূরা ক্বদর");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা ক্বদর");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","১৩");
        hashMap.put("name1","সূরা ত্বীন");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা ত্বীন");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","১৪");
        hashMap.put("name1","সূরা আসর");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা আসর");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","১৫");
        hashMap.put("name1","সূরা যিলযাল");
        hashMap.put("name2","আরবি,আরবি উচ্চারণ, বাংলা অনুবাদ।");
        hashMap.put("title","সূরা যিলযাল");
        hashMap.put("title2","2");
        hashMap.put("title3","3");
        hashMap.put("title4","4");
        arrayList.add(hashMap);



      MyAdapter myAdapter = new MyAdapter();
      listview.setAdapter(myAdapter);



        return myview;
    }//onCreateView Close here=========

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
            View myView1 =  layoutInflater.inflate(R.layout.sura_listview,parent,false );

           CardView card1 = myView1.findViewById(R.id.card1);


            //listView code here============
            TextView text1 = myView1.findViewById(R.id.text1);
            TextView text2 = myView1.findViewById(R.id.text2);
            TextView text3 = myView1.findViewById(R.id.text3);

            HashMap<String,String> hashMap = arrayList.get(position);

            String title = hashMap.get("title");
            String title2 = hashMap.get("title2");
            String title3 = hashMap.get("title3");
            String title4 = hashMap.get("title4");

            text1.setText(hashMap.get("name"));
            text2.setText(hashMap.get("name1"));
            text3.setText(hashMap.get("name2"));


           card1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   DuaActivity.TIITLE = title;
                   DuaActivity.TIITLE1 = title2;
                   DuaActivity.TIITLE2 = title3;
                   DuaActivity.TIITLE3 = title4;
                   Intent myIntent = new Intent(getActivity(),DuaActivity.class);
                   startActivity(myIntent);
               }
           });






            return myView1;
        }
    }

}