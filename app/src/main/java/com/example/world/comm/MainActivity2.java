package com.example.world.comm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.annotation.SuppressLint;
import com.example.world.R;

public class MainActivity2 extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private Button singup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username=(EditText) findViewById(R.id.Email);
        password=(EditText) findViewById(R.id.Password);
        login=(Button) findViewById(R.id.btn2);
        singup=(Button) findViewById(R.id.btn21);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}