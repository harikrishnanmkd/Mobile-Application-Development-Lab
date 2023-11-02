package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2, ep1;
    RadioGroup r;
    RadioButton m, f;
    Switch s;
    CheckBox c;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()){
                    Toast.makeText(MainActivity.this, "Submit Success", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Submit Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validate() {
        boolean flag=false;
        String fn=et1.getText().toString();
        String ln=et2.getText().toString();
        String p=ep1.getText().toString();

        if(fn.equals("")){
            Toast.makeText(this, "First name cant be empty", Toast.LENGTH_SHORT).show();
        }
        else if (ln.equals("")){
            Toast.makeText(this, "Last name cant be empty", Toast.LENGTH_SHORT).show();
        }
        else if (p.length()<=3){
            Toast.makeText(this, "Password should contain atleast 3 characters", Toast.LENGTH_SHORT).show();
        }
        else if (!m.isChecked() && !f.isChecked()){
            Toast.makeText(this, "Gender must be chosen", Toast.LENGTH_SHORT).show();
        }
        else if (!s.isChecked()){
            Toast.makeText(this, "Must be a new User", Toast.LENGTH_SHORT).show();
        }
        else if (!c.isChecked()){
            Toast.makeText(this, "Must agree to proceed", Toast.LENGTH_SHORT).show();
        }
        else {
            flag=true;
            Toast.makeText(this, "Successfully Registered", Toast.LENGTH_SHORT).show();
        }
        return flag;
    }


    private void initUI() {
        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        ep1 = findViewById(R.id.editPassword);
        r = findViewById(R.id.radioGroup);
        m = findViewById(R.id.radioButton1);
        f = findViewById(R.id.radioButton2);
        s = findViewById(R.id.switch1);
        c = findViewById(R.id.checkBox);
        b = findViewById(R.id.button);
    }
}