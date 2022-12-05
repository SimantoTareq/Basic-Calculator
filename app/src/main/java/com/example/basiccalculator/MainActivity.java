package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button,button2;

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnId);
        button2 = findViewById(R.id.btnId2);

        textView = findViewById(R.id.textViewId);
        editText= findViewById(R.id.editTextId);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);









    }




    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnId) {

        } else if (view.getId() == R.id.btnId2) {

        }
    }
}