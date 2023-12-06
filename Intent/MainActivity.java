package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);

    }

    public void Click(View view) {
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("Name1","Hari");
        i.putExtra("Name2","Krishnan");
        startActivity(i);
    }
}