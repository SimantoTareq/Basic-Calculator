package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button add,sub,mul,div;

    TextView textView;
    EditText editText,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.addbtn);
        sub = findViewById(R.id.subbtn);
        mul = findViewById(R.id.mulbtn);
        div = findViewById(R.id.divbtn);


        textView = findViewById(R.id.textViewId);
        editText= findViewById(R.id.editTextId);
        editText2 = findViewById(R.id.editTextId2);


        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);












    }



    double num1, num2,total;
    @Override

    public void onClick(View view) {
        if (view.getId() == R.id.addbtn) {
            num1=Double.parseDouble(editText.getText().toString());
            num2=Double.parseDouble(editText2.getText().toString());
            total = num1+num2;
            textView.setText(String.valueOf(total));

        } else if (view.getId() == R.id.subbtn) {
            num1=Double.parseDouble(editText.getText().toString());
            num2=Double.parseDouble(editText2.getText().toString());
            total = num1-num2;
            textView.setText(String.valueOf(total));

        }else if (view.getId()==R.id.mulbtn){
            num1=Double.parseDouble(editText.getText().toString());
            num2=Double.parseDouble(editText2.getText().toString());
            total = num1*num2;
            textView.setText(String.valueOf(total));

        }else if (view.getId()==R.id.divbtn){
            num1=Double.parseDouble(editText.getText().toString());
            num2=Double.parseDouble(editText2.getText().toString());
            total = num1/num2;
            textView.setText(String.valueOf(total));

        }
    }
}