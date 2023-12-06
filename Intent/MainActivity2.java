package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        Bundle extra=getIntent().getExtras();
        String text1=extra.getString("Name1");
        String text2=extra.getString("Name2");
        t1.setText("Name 1: "+text1);
        t2.setText("Name 2: "+text2);
    }
}