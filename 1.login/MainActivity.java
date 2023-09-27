package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.username);
        e2=findViewById(R.id.password);
        btn=findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u=e1.getText().toString();
                String p=e2.getText().toString();
                if(u.equals("Harikrishnan")&& p.equals("123456"))
                {
                    Toast.makeText(MainActivity.this, "Login Succesfully", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Login Faild", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}