package com.example.dtanp.masoi;

import android.app.Activity;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dtanp.masoi.adapter.CustomAdapter;
import com.example.dtanp.masoi.model.Phong;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

public class room extends Activity {

    ListView listroom;
    List<Phong> list;
    Button btnnew;
    ImageView imgback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        listroom=findViewById(R.id.listroom);
        list=new ArrayList<>();
        Phong p2 = new Phong("abc",303,"tao ne",4000,4);
        Phong p1 = new Phong("abc",304,"tao ne",4000,4);
        Phong p3 = new Phong("abc",305,"tao ne",4000,4);
        Phong p4 = new Phong("abc",306,"tao ne",4000,4);
        Phong p5 = new Phong("abc",307,"tao ne",4000,4);
        Phong p6 = new Phong("abc",308,"tao ne",4000,4);
        Phong p7 = new Phong("abc",309,"tao ne",4000,4);
        Phong p8 = new Phong("abc",310,"tao ne",4000,4);
        Phong p9 = new Phong("abc",311,"tao ne",4000,4);
        Phong p10 = new Phong("abc",313,"tao ne",4000,4);
        Phong p11 = new Phong("abc",323,"tao ne",4000,4);
        Phong p12 = new Phong("abc",333,"tao ne",4000,4);
        Phong p13 = new Phong("abc",343,"tao ne",4000,4);
        Phong p14 = new Phong("abc",353,"tao ne",4000,4);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
        list.add(p11);
        list.add(p12);
        list.add(p13);
        list.add(p14);
        CustomAdapter adapter = new CustomAdapter(this,R.layout.custom_adapter,list);
        adapter.notifyDataSetChanged();
        listroom.setAdapter(adapter);
        listroom.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
            }
        });
        btnnew =findViewById(R.id.btnnew);
        imgback =  findViewById(R.id.imgback);
        imgback.setClickable(true);
        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("back");
            }
        });



    }
}
