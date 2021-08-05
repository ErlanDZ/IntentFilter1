package com.example.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-YYYY");
        String date = sdfDate.format(new Date(System.currentTimeMillis()));

        TextView tvDate = findViewById(R.id.tvDate);
        tvDate.setText(date);
    }
}