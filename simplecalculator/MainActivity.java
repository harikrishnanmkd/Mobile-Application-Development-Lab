package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Plus, Sub, Div, Mul, C;
    EditText ET1, ET2;
    TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET1 = findViewById(R.id.ET1);
        ET2 = findViewById(R.id.ET2);
        T1 = findViewById(R.id.T1);
        Plus = findViewById(R.id.PlusButton);
        Sub = findViewById(R.id.SubButton);
        Div = findViewById(R.id.DivButton);
        Mul = findViewById(R.id.MulButton);


    }

    public void sum(View view) {

        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a + b;
        T1.setText("Result: " + c);
    }


    public void Sub(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a - b;
        T1.setText("Result: " + c);

    }

    public void Div(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a / b;
        if(a==Float.parseFloat(ET1.getText().toString()) & b==0){
            T1.setText("Cannot divided by 0");

        } else {
            T1.setText("Result: " + c);
        }

    }

    public void Mul(View view) {
        float a = Float.parseFloat(ET1.getText().toString());
        float b = Float.parseFloat(ET2.getText().toString());
        float c = a * b;
        T1.setText("Result: " + c);

    }
}