package com.example.dtanp.masoi;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Ban extends Activity {

    Button btnss;
    ImageView imgnhanvat;
    LinearLayout linearLayout;
    TextView txtthoigian;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban);
        btnss = findViewById(R.id.btnss);
        imgnhanvat = findViewById(R.id.imgnhanvat);
        imgnhanvat.setImageAlpha(0);
        txtthoigian = findViewById(R.id.txtthoigian);
        txtthoigian.setAlpha(1);

    }
}
