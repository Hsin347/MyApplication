package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        EditText a = findViewById(R.id.editText2);
        TextView b = findViewById(R.id.textView2);
        EditText h = (EditText) findViewById(R.id.editText3);
        EditText w =(EditText) findViewById(R.id.editText4);
        double h_value = Double.parseDouble(h.getText().toString());
        double w_value = Double.parseDouble(w.getText().toString());
        double bmi = w_value/ (h_value/100.0 * h_value/100.0);


           b.setText(a.getText().toString()+", 你的BMI是: "+String.valueOf(bmi));
    }
}
