package com.example.dua;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class MunajetFragment extends Fragment {
ListView listView1;

ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
HashMap<String,String> hashMap = new HashMap<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.fragment_munajet, container, false);





        //listView code here========
        listView1 = myview.findViewById(R.id.listview1);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا آتِنَا فِي الدُّنْيَا حَسَنَةً وَفِي الْآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা আতিনা ফিদ্দুনিয়া হাসানাতাঁও ওয়া ফিল্ আখিরাতি হাসানাতাও ওয়াকিনা আযাবান্নার।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের পালনকর্তা! আমাদিগকে দুনিয়া ও আখেরাতের কল্যাণ দান করো এবং আমাদেরকে দোযখের আযাব হতে রক্ষা করো।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-২");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا لَا تُؤَاخِذْنَا إِنْ نَسِينَا أَوْ أَخْطَأْنَا رَبَّنَا وَلَا تَحْمِلْ عَلَيْنَا إِصْرًا كَمَا حَمَلْتَهُ عَلَى الَّذِينَ مِنْ قَبْلِنَا رَبَّنَا وَلَا تُحَمِّلْنَا مَا لَا طَاقَةَ لَنَا بِهِ وَاعْفُ عَنَّا وَاغْفِرْ لَنَا وَارْحَمْنَا أَنْتَ مَوْلَانَا فَانصُرْنَا عَلَى الْقَوْمِ الْكَافِرِينَ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা-লা-তুআ-খিযনা ইন নাছীনা-আও আখতা'না-রাব্বানা ওয়ালা-তাহমিল আ'লাইনা-ইসরান কামা-হামালতাহু আলাল্লাযীনা মিন কাবলিনা-রাব্বানা-ওয়ালা তুহাম্মিলনা-মা-লা-ত্বা-কাতা লানা-বিহী ওয়া'ফু'আন্না-ওয়াগ ফিরলানা-ওয়ারহামনা-আনতা মাওলা-না-ফানসুরনা-'আলাল কাওমিল কা-ফিরীন।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের প্রতিপালক! যদি আমাদের ভ্রম হয় অথবা ত্রুটি হয় তজ্জন্যে আমাদেরকে ধৃত করবেন না, হে আমাদের পালনকর্তা, আমাদের পূর্ববর্তীদের উপর যেরূপ গুরুভার অর্পণ করেছিলেন, আমাদের উপর তদ্রুপ ভার অর্পণ করবেন না; হে আমাদের প্রভু, যা আমাদের শক্তির অতীত ঐরূপ ভার বহনে আমাদেরকে বাধ্য করবেন না এবং আমাদেরকে ক্ষমা করুন ও আমাদেরকে মার্জনা করুন এবং আমাদের উপর দয়া করুন; আপনিই আমাদের অভিভাবক। অতএব কাফের সম্প্রদায়ের বিরুদ্ধে আমাদেরকে সাহায্য করুন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-৩");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا هَبْ لَنَا مِنْ أَزْوَاجِنَا وَذُرِّيَّاتِنَا قُرَّةَ أَعْيُنِ وَاجْعَلْنَا لِلْمُتَّقِينَ إِمَامًا");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা-হাবলানা-মিন আঝওয়া-জিনা-ওয়া ঘুররিইইয়া-তিনা কুররাতা আ'ইউনিওঁ ওয়াজ'আলনা-লিলমুত্তাকীনা ইমা-মা।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের পরওয়ারদেগার! আমাদের স্ত্রীদের ও সন্তানদেরকে আমাদের জন্যে চোখের শীতলতা স্বরূপ করে দাও এবং আমাদেরকে মুত্তাকীদের জন্যে আদর্শ স্বরূপ করে দাও।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-৪");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا ظَلَمْنَا أَنفُسَنَا وَإِنْ لَمْ تَغْفِرْ لَنَا وَتَرْحَمْنَا لَنَكُونَنَّ مِنَ الْخَاسِرِينَ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা যালামনা আনফুসানা ওয়া ইল্লাম তাগফিরলানা ওয়া তারহামনা লানা কুনান্না মিনাল খাসেরীন।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের প্রভু! আমরা আমাদের নফসের উপর যুলুম করেছি, তুমি যদি আমাদের ক্ষমা না করো, আমাদের প্রতি করুণা না করো তবে আমরা ক্ষতিগ্রস্তদের অন্তর্ভুক্ত হয়ে যাব।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-৫");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا اصْرِفْ عَنَّا عَذَابَ جَهَنَّمَ إِنَّ عَذَابَهَا كَانَ غَرَامًا إِنَّهَا سَاءَتْ مُسْتَقَرٌّ وَمُقَاماً");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানাছরিফ 'আন্না আযাবা জাহান্নামা, ইন্না আযাবাহা কানা গারামা, ইন্নাহা সাআত মুস্তাক্বারাও ওয়া মুকামা।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের রব! আমাদের থেকে জাহান্নামের শাস্তি হটিয়ে দাও। নিশ্চয় এর শাস্তি নিশ্চিত বিনাশ। বসবাস ও আবাসস্থল হিসেবে তা কত নিকৃষ্ট জায়গা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-৬");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا لَا تُزِغْ قُلُوبَنَا بَعْدَ إِذْ هَدَيْتَنَا وَهَبْ لَنَا مِنْ لَدُنْكَ رَحْمَةً إِنَّكَ أَنْتَ الْوَهَّابُ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা লা তুযিগ্ কুলুবানা বা'দা ইয হাদায়তানা, ওয়া হাব লানা মিন লাদুনকা রাহমাতান ইন্নাকা আনতাল ওয়াহ্হাব।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের পালনকর্তা! আমাদের হেদায়াত দানের পর আমাদের হৃদয়কে বক্র করে দিও না। আর তোমার পক্ষ থেকে আমাদেরকে রহমত দান করো। নিশ্চয় তুমিই অধিক দানকারী।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-৭");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا اغْفِرْ لَنَا وَلِإِخْوَانِنَا الَّذِينَ سَبَقُونَا بِالْإِيمَانِ وَلَا تَجْعَلْ فِي قُلُوبِنَا غِلًّا لِلَّذِينَ آمَنُوا رَبَّنَا إِنَّكَ رَءُوفٌ رَحِيمٌ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানাগফিরলানা-ওয়া লিইখওয়া-নিনাল্লাযীনা ছাবকূনা-বিল ঈমা-নি ওয়ালা-তাজ'আল ফী কুলুবিনা-গিল্লাল লিল্লাযীনা আ-মানু রাব্বানাইন্নাকা রাউফুর রাহীম।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের প্রতিপালক! আমাদেরকে এবং ঈমানে অগ্রণী আমাদের ভ্রাতাদেরকে ক্ষমা করুন। আর মুমিনদের বিরুদ্ধে আমাদের অন্তরে হিংসা-বিদ্বেষ রাখবেন না। হে আমাদের প্রতিপালক! আপনি তো দয়াদ্র, পরম দয়ালু।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-৮");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","اللهمَّ إِنِّي أَعُوذُ بِكَ مِنْ عَذَابِ جَهَنَّمَ، وَمِنْ عَذَابِ الْقَبْرِ، وَمِنْ فِتْنَةِ الْمَحْيا وَالْمَمَاتِ، وَمِنْ فِتْنَةِ الْمَسِيحِ الدَّجالِ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","আল্লাহুম্মা ইন্নি আ'উযুবিকা মিত আ'যাবি জাহান্নাম, ওয়া মিন আ'যাবিল ক্ববর্, ওয়া মিত ফিতনাতিল মাহিয়া ওয়াল মামাতি, ওয়া মিন ফিতনাতিল মাছিহিদদাজ্জাল।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আল্লাহ্! নিশ্চয় আমি তোমার কাছে আশ্রয় প্রার্থনা করি জাহান্নামের শাস্তি থেকে, কবরের আযাব থেকে, জীবন-মৃত্যুর ফিৎনা থেকে এবং মাসীহ দাজ্জালের ফিৎনা থেকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-৯");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","اللهمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْهَمَّ وَالْحُزْنِ، وَأَعُوذُ بكَ مِنَ الْعَجْزِ وَالْكَسْلِ، وَمِنَ الْبُخْلِ وَالْجُبْنِ وأَعُوذُ بِكَ مِنْ غَلَبَةِ الدَّيْنِ، وَقَهْرِ الرِّجَالِ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","আল্লাহুম্মা ইন্নি আ'উযুবিকা মিনাল হাম্মে ওয়াল হুজনে, ওয়া আ'উযুবিকা মিনাল আ'জযে ওয়াল কাছলে, ওয়া মিনাল বুখলে ওয়াল জুবনে, ওয়া আ'উযুবিকা মিন গালাবাতিদদাইনে, ওয়া ক্বাহরির রিজাল।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আল্লাহ্! আমি তোমার কাছে আশ্রয় প্রার্থনা করছি দুশ্চিন্তা ও দুর্ভাবনা থেকে, তোমার কাছে আশ্রয় কামনা করছি অপরাগতা ও অলসতা থেকে,কাপুরুষতা ও কৃপণতা থেকে এবং আশ্রয় চাচ্ছি ঋণের বোঝা ও মানুষের বলপ্রয়োগ থেকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১০");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا تَقَبَّلْ مِنَّا إِنَّكَ أَنْتَ السَّمِيعُ الْعَلِيمُ - رَبَّنَا وَاجْعَلْنَا مُسْلِمَيْنِ لَكَ وَمِنْ ذُرِّيَّتِنَا أُمَّةً مُسْلِمَةً لَكَ وَأَرِنَا مَنَاسِكَنَا وَتُبْ عَلَيْنَا إِنَّكَ أَنْتَ التَّوَّابُ الرَّحِيمُ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা-তাকাব্বাল মিন্না-ইন্নাকা আনতাছ ছামী'উল 'আলীম। রাব্বানা-ওয়াজা'আলনা-মুছলিমাইনি লাকা ওয়ামিন ঘুররিইইয়াতিনা-উম্মাতাম মুছলিমাতাল্লাকা ওয়া আরিনা-মানা-ছিকানা-ওয়াতুব 'আলাইনা-ইন্নাকা আনতাত্তাওওয়া-বুর রাহীম।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের প্রতিপালক! আমাদের কে কবুল করো। নিশ্চয়ই তুমি শ্রবণকারী, সর্বজ্ঞ। হে আমাদের প্রতিপালক! আমাদের উভয়কে তোমার আজ্ঞাবহ করো এবং আমাদের বংশধর থেকেও একটি অনুগত দল সৃষ্টি করো,আমাদের হজ্বের রীতিনীতি বলে দাও এবং আমাদের ক্ষমা করো। নিশ্চয় তুমি তওবা কবুলকারী ও দয়ালু।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১১");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا أَفْرِغْ عَلَيْنَا صَبْرًا وَثَبِّتْ أَقْدَامَنَا وَانْصُرْنَا عَلَى الْقَوْمِ الْكَافِرِينَ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা-আফরিগ আলাইনা-সাবরাওঁ ওয়া ছাব্বিত আকদা-মানা-ওয়ানসুরনা-'আলাল কাওমিল কা-ফরীন।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের পালনকর্তা, আমাদের মনে ধৈর্য্য সৃষ্টি করে দাও এবং আমাদেরকে দৃঢ়পদ রাখ-আর আমাদের সাহায্য করো সে কাফের জাতির বিরুদ্ধে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১২");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبِّ اغْفِرْ لِي وَلِوَالِدَيَّ وَلِمَنْ دَخَلَ بَيْتِيَ مُؤْمِنًا وَلِلْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ وَلَا تَزِدِ الظَّالِمِينَ إِلَّا تَبَارًا");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বিগফিরলী ওয়ালিওয়া-লিদাইইয়া ওয়া লিমান দাখালা বাইতিয়া মু'মিনাওঁ ওয়া লিলমু'মিনীনা ওয়াল মু'মিনা-তি ওয়ালা- তাঝিদিজ্জা-লিমীনা ইল্লা-তাবা-রা-।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমার পালনকর্তা! আপনি আমাকে, আমার পিতা-মাতাকে, যারা মুমিন হয়ে আমার গৃহে প্রবেশ করে-তাদেরকে এবং মুমিন পুরুষ ও মুমিন নারীদেরকে ক্ষমা করুন এবং যালেমদের কেবল ধ্বংসই বৃদ্ধি করুন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১৩");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","حَسْبِيَ اللَّهُ لَا إِلَهَ إِلَّا هُوَ عَلَيْهِ تَوَكَّلْتُ وَهُوَ رَبُّ الْعَرْشِ الْعَظِيمِ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","হাছবিয়াল্লা-হু লা-ইলা-হা ইল্লা-হুওয়া 'আলাইহি তাওয়াক্কালতু ওয়া হুওয়া রাব্বুল 'আরশিল 'আজীম।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","আল্লাহই আমার জন্য যথেষ্ট, তিনি ব্যতীত আর কারো বন্দেগী নেই। আমি তাঁরই ভরসা করি এবং তিনিই মহান আরশের অধিপতি।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১৪");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا مَا خَلَقْتَ هَذَا بَاطِلًا سُبْحَانَكَ فَقِنَا عَذَابَ النَّارِ رَبَّنَا إِنَّكَ مَنْ تُدْخِلُ النَّارَ فَقَدْ أَخْزَيْتَهُ صلے وَمَا لِلظَّالِمِينَ مِنْ أَنْصَارٍ - رَبَّنَا إِنَّنَا سَمِعْنَا مُنَادِيًا يُنَادِي لِلْإِيمَانِ أَنْ آمِنُوا بِرَبِّكُمْ فَآمَنَّا رَبَّنَا فَاغْفِرْ لَنَا ذُنُوبَنَا وَكَفَّرْ عَنَّا سَيِّئَاتِنَا وَتَوَفَّنَا مَعَ الْأَبْرَارِ - رَبَّنَا وَآتِنَا مَا وَعَدْتَنَا عَلَى رُسُلِكَ وَلَا تُخْزِنَا يَوْمَ الْقِيَامَةِ إِنَّكَ لَا تُخْلِفُ الْمِيعَادَ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা-মা-খালাকতা হাযা-বা-তিলান ছুবহা-নাকা ফাকিনা-'আযা-বান্না-র। রাব্বানা ইন্নাকা মান তুদখিলিন্না-রা ফাকাদ আখঝাইতাহু ওয়ামা-লিজ্জা-লিমীনা মিন আনসা-র। রাব্বানা-ইন্নানা-ছামি'না-মুনা-দিআইঁ ইউনা-দী লিল ঈমা-নি আন আ-মিনূবিরাব্বিকুম ফাআমান্না-রাব্বানা-ফাগফিরলানা-যুনূ বানা-ওয়াকাফফির'আন্না-ছাইয়িআ -তিনাওয়াতাওয়াফফানা-মা'আল আব রা-র। রাব্বানা-ওয়া আ-তিনা- মা-ওয়া-'আত্তানা-'আলা-রুছুলিকা ওয়ালা-তুখঝিনা-ইয়াওমাল কিয়া-মাতি ইন্নাকা লা-তুখলিফুল মী'আ-দ।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","পরওয়ারদেগার! এসব তুমি অনর্থক সৃষ্টি করোনি। সকল পবিত্রতা তোমারই, আমাদিগকে তুমি দোযখের শাস্তি থেকে বাঁচাও। হে আমাদের পালনকর্তা! নিশ্চয় তুমি যাকে দোযখে নিক্ষেপ করলে তাকে সবসময়ে অপমানিত করলে; আর জালেমদের জন্যে তাে সাহায্যকারী নেই। হে আমাদের পালনকর্তা! আমরা নিশ্চিতরূপে শুনেছি একজন আহবানকারীকে ঈমানের প্রতি আহবান করতে যে, তোমাদের পালনকর্তার প্রতি ঈমান আন; তাই আমরা ঈমান এনেছি। হে আমাদের পালনকর্তা! অতঃপর আমাদের সকল গোনাহ মাফ কর এবং আমাদের সকল দোষত্রুটি দুর করে দাও, আর আমাদের মৃত্যু দাও নেক লোকদের সাথে। হে আমাদের পালনকর্তা! আমাদেরকে দাও, যা তুমি ওয়াদা করেছ তোমার রসূলগণের মাধ্যমে এবং কিয়ামতের দিন আমাদিগকে তুমি অপমানিত করো না। নিশ্চয় তুমি ওয়াদা খেলাফ করো না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১৫");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا أَخْرِجْنَا مِنْ هَذِهِ الْقَرْيَةِ الظَّالِمِ أَهْلُهَا وَاجْعَلْ لَنَا مِنْ لَدُنْكَ وَلِيًّا وَاجْعَلْ لَنَا مِنْ لَدُنْكَ نَصِيرًا");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা-আখরিজনা-মিন হাযিহিল কারইয়াতিজ্জা-লিমি আহলুহা- ওয়াজ'আল লানা-মিল্লাদুনকা ওয়ালিইইয়াওঁ ওয়াজ'আল লানা-মিল্লাদুনকা নাসীরা-।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের পালনকর্তা! আমাদিগকে এই জনপদ থেকে নিষ্কৃতি দান কর; এখানকার অধিবাসীরা যে, অত্যাচারী! আর তোমার পক্ষ থেকে আমাদের জন্য পক্ষালম্বনকারী নির্ধারণ করে দাও এবং তোমার পক্ষ থেকে আমাদের জন্য সাহায্যকারী নির্ধারণ করে দাও।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১৬");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","اللهمَّ مُقَلِّبَ الْقُلُوبِ ثَبَّتْ قُلُوبَنَا عَلَى دِينِكَ - اللهمَّ مُصَرِّفَ الْقُلُوْبِ صَرَّفَ قُلُوبَنا عَلَى طاعَتِكَ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","আল্লাহুম্মা মুক্বাল্লিবাল কুলুবি ছাব্বিত কুলুবানা আ'লা দিনিকা, আল্লাহুম্মা মুছাররিফাল কুলুবি ছররিফ কুলুবানা আ'লা ত্বাআ'তিকা।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে অন্তকরণের পরিবর্তনকারী আল্লাহ্! আমাদের অন্তরকে তোমার দ্বীনের উপর অটল অবিচল রাখ। হে হৃদয় সমূহের পরিবর্তনকারী আল্লাহ্! আমাদের হৃদয়গুলোকে তোমার আনুগত্যের দিকে ফিরিয়ে দাও।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১৭");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","اللهمَّ أَحْسِنُ عَاقِبَتَنا فِي الأُمُورِ كُلَّهَا، وَأَجِرْنا مِنْ خِزْيِ الدُّنْيَا وَعَذَابِ الْآخِرَةِ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","আল্লাহুম্মা আহছিন আ'কিবাতানা ফিল উমুরি কুল্লিহা, ওয়া আঝিরনা মিন খিজয়িদদুনিয়া ওয়া আ'জাবিল আখিরা।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আল্লাহ্! আমাদের প্রতিটি বিষয়ের শেষ পরিণতি সুন্দর কর। আর আমাদেরকে দুনিয়ার লাঞ্ছনা ও আখেরাতের শাস্তি থেকে আশ্রয় দান কর।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১৮");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","رَبَّنَا لَا تَجْعَلْنَا فِتْنَةً لِلَّذِينَ كَفَرُوا وَاغْفِرْ لَنَا رَبَّنَا إِنَّكَ أَنْتَ الْعَزِيزُ الْحَكِيمُ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","রাব্বানা-লা-তাজআ'লনা -ফিতনাতালিলল্লাযীনা কাফারূওয়াগফিরলানা-রাব্বানা- ইন্নাকা আনতাল 'আঝীঝুল হাকীম।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আমাদের পালনকর্তা! তুমি আমাদেরকে কাফেরদের জন্য পরীক্ষার পাত্র করো না। হে আমাদের পালনকর্তা! আমাদের ক্ষমা কর। নিশ্চয় তুমি পরাক্রমশালী, প্রজ্ঞাময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-১৯");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","اللهم آتِ أَنْفُسَنا تَقْوَاهَا، وَزَكَهَا أَنْتَ خَيْرُ مَنْ زكاها، أَنْتَ وَلِيُّهَا وَمَوْلاها");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","আল্লাহুম্মা আতি আনফুছানা তাকওয়াহা, ও যাক্কিহা আনতা খাইরু মান যাক্কাহা, আনতা ওয়ালিয়্যাহা ওয়া মাওলাহা।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আল্লাহ্ আমাদের আত্মাকে দান কর তাক্বওয়া, তাকে পবিত্র কর। তুমিই তাকে উত্তম পবিত্রকারী। তুমিই তার বন্ধু, অভিভাবক।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-২০");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","اللهمَّ إِنَّا نَعُوذُ بِكَ مِنْ عِلْمٍ لَا يَنْفَعُ، وَقَلْبِ لَا يَخْشَعُ، وَنَفْسِ لا تَشْبَعِ، وَدَعْوَةٍ لَا يُسْتَجَابُ لها");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","আল্লাহুম্মা ইন্না না'উজুবিকা মিত ই'লমিন লা ইয়ানফা'উ, ওয়া ক্বালবিন লা ইয়াখশা'উ, ওয়া নাফছিন লা তাশবা'উ, ওয়া দা'ওয়াতিন লা ইউছতাযাবু লাহা।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","হে আল্লাহ্! আমরা তোমার কাছে আশ্রয় কামনা করি এমন জ্ঞান থেকে যা কোন উপকার দেয় না, এমন হৃদয় থেকে যা ভীত হয় না, এমন আত্মা থেকে যা পরিতৃপ্ত হয় না এবং এমন দুআ থেকে যা কবুল করা হয় না।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","মুনাজাত-২১");
        hashMap.put("name1","আরবি");
        hashMap.put("name2","سُبْحَانَ رَبِّكَ رَبِّ الْعِزَّةِ عَمَّا يَصِفُونَ - وَسَلَامٌ عَلَى الْمُرْسَلِينَ - وَالْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ");
        hashMap.put("name3","বাংলা উচ্চারন");
        hashMap.put("name4","ছুবহা-না রাব্বিকা রাব্বিল 'ইঝঝাতি 'আম্মা-ইয়াসিফুন। ওয়া-ছালা-মুন 'আলাল মুরছালীন। ওয়াল হামদুলিল্লা-হি রাব্বিল 'আ-লামীন।");
        hashMap.put("name5","অর্থ");
        hashMap.put("name6","পবিত্র আপনার পরওয়ারদেগারের সত্তা, তিনি সম্মানিত ও পবিত্র যা তারা বর্ণনা করে তা থেকে। পয়গম্বরগণের প্রতি সালাম বর্ষিত হোক। সমস্ত প্রশংসা বিশ্বপালক আল্লাহর নিমিত্ত।");
        arrayList.add(hashMap);

        MyAdapter myAdapter = new MyAdapter();
        listView1.setAdapter(myAdapter);


        return myview;
    }//onCreate Close here=============



    //Adapter code here===========
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
            View myview1 = layoutInflater.inflate(R.layout.list_munajet_item,parent,false);



            //listView code  here=============
            TextView munajetText = myview1.findViewById(R.id.munajettext);
            TextView showtext1 = myview1.findViewById(R.id.showtext1);
            TextView showtext2 = myview1.findViewById(R.id.showtext2);
            TextView showtext3 = myview1.findViewById(R.id.showtext3);
            TextView showtext4 = myview1.findViewById(R.id.showtext4);
            TextView showtext5 = myview1.findViewById(R.id.showtext5);
            TextView showtext6 = myview1.findViewById(R.id.showtext6);


            HashMap<String,String> hashMap = arrayList.get(position);

            munajetText.setText(hashMap.get("name"));
            showtext1.setText(hashMap.get("name1"));
            showtext2.setText(hashMap.get("name2"));
            showtext3.setText(hashMap.get("name3"));
            showtext4.setText(hashMap.get("name4"));
            showtext5.setText(hashMap.get("name5"));
            showtext6.setText(hashMap.get("name6"));
            //listView code close here=============

            //expandable code here=====================
            RelativeLayout clickable_item = myview1.findViewById(R.id.clickabel_item);
            LinearLayout show_item = myview1.findViewById(R.id.show_item);
            ImageView arrowimg = myview1.findViewById( R.id.arrowimg);

            clickable_item.setOnClickListener(v ->{
                if (show_item.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(clickable_item,new AutoTransition());
                    show_item.setVisibility(View.VISIBLE);
                    arrowimg.setImageResource(R.drawable.up_arrow_icon);
                }else {
                    TransitionManager.beginDelayedTransition(clickable_item,new AutoTransition());
                    show_item.setVisibility(View.GONE);
                    arrowimg.setImageResource(R.drawable.down_arrow_icon);
                }
            });//expandable code close here=====================


            return myview1;
        }

    }//Adapter code close here======

}