package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=(EditText)findViewById(R.id.username);
        edit2=(EditText)findViewById(R.id.password);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("username",edit1.getText().toString().trim());
                intent.putExtra("password",edit2.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}