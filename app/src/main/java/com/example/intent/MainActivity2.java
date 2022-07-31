package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView1=(TextView)findViewById(R.id.txt1);
        textView2=(TextView)findViewById(R.id.txt2);

        Intent intent=getIntent();
        textView1.setText(intent.getStringExtra("username"));
        textView2.setText(intent.getStringExtra("password"));
    }
}