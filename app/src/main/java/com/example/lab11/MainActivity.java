package com.example.lab11;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;
    ArrayList<Shoe>imagesArraylist;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);

        imagesArraylist=new ArrayList<>();
        String url="https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/a5da47dc-5323-4424-a192-463a51f2d802/%E0%B8%A3%E0%B8%AD%E0%B8%87%E0%B9%80%E0%B8%97%E0%B9%89%E0%B8%B2%E0%B8%9C%E0%B8%B9%E0%B9%89-air-force-1-07-F0nKtg.png";
        String url2="https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/7587f702-83cb-4dbc-8355-35f07adcb057/%E0%B8%A3%E0%B8%AD%E0%B8%87%E0%B9%80%E0%B8%97%E0%B9%89%E0%B8%B2%E0%B8%A7%E0%B8%B4%E0%B9%88%E0%B8%87%E0%B9%82%E0%B8%A3%E0%B9%89%E0%B8%94%E0%B8%A3%E0%B8%B1%E0%B8%99%E0%B8%99%E0%B8%B4%E0%B9%88%E0%B8%87%E0%B8%9C%E0%B8%B9%E0%B9%89-structure-25-Vnp1d0.png";
        String url3="https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/8397fa2b-f6b8-414f-b84b-c1f420f07f28/%E0%B8%A3%E0%B8%AD%E0%B8%87%E0%B9%80%E0%B8%97%E0%B9%89%E0%B8%B2%E0%B9%81%E0%B8%95%E0%B8%B0%E0%B8%9C%E0%B8%B9%E0%B9%89-calm-K7mr3W.png";
        String url4="https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/735fe693-ec6c-4465-b007-8a72547b52ef/%E0%B8%A3%E0%B8%AD%E0%B8%87%E0%B9%80%E0%B8%97%E0%B9%89%E0%B8%B2%E0%B8%AA%E0%B8%95%E0%B8%B1%E0%B9%8A%E0%B8%94%E0%B8%9F%E0%B8%B8%E0%B8%95%E0%B8%9A%E0%B8%AD%E0%B8%A5%E0%B8%AA%E0%B8%B3%E0%B8%AB%E0%B8%A3%E0%B8%B1%E0%B8%9A%E0%B8%9E%E0%B8%B7%E0%B9%89%E0%B8%99%E0%B8%AA%E0%B8%99%E0%B8%B2%E0%B8%A1%E0%B8%AB%E0%B8%8D%E0%B9%89%E0%B8%B2%E0%B9%80%E0%B8%97%E0%B8%B5%E0%B8%A2%E0%B8%A1-phantom-gx-elite-CRPX0r.png";

        imagesArraylist.add(new Shoe(url,"ไลฟ์สไตล์"));
        imagesArraylist.add(new Shoe(url2,"รองเท้าวิ่ง"));
        imagesArraylist.add(new Shoe(url3,"รองเท้าแตะ"));
        imagesArraylist.add(new Shoe(url4, "รองเท้าฟุตบอล"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new MyAdapter(MainActivity.this,imagesArraylist);
        recyclerView.setAdapter(adapter);
    }
}