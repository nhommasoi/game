package com.example.dtanp.masoi;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Host extends Activity {
    Button btnbatdau;
    ImageView imgnhanvat;

    TextView txtthoigian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        btnbatdau = findViewById(R.id.btnbatdau);
        imgnhanvat = findViewById(R.id.imgnhanvat);
        imgnhanvat.setImageAlpha(0);
        txtthoigian = findViewById(R.id.txtthoigian);
        txtthoigian.setAlpha(1);
    }
}
