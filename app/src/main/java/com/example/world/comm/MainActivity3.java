package com.example.world.comm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.world.R;

public class MainActivity3 extends AppCompatActivity {
    Button btnreg, btnAccount;
    EditText Name, FirstName, Email3, Password3,PovPassword;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Email3=findViewById(R.id.Email3);
        Name=findViewById(R.id.Name);
        FirstName=findViewById(R.id.FirstName);
        Password3=findViewById(R.id.Password3);
        PovPassword=findViewById(R.id.PovPassword);
        btnreg=findViewById(R.id.btnreg);
        btnAccount=findViewById(R.id.btnAccount);

        btnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}