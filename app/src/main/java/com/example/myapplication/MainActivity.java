package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText h;
    private EditText w;
    private EditText a;
    private EditText o;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        a = findViewById(R.id.editText2);
        h = (EditText) findViewById(R.id.editText3);
        w = (EditText) findViewById(R.id.editText4);

    }

    public void show(View view) {
        TextView b = findViewById(R.id.textView2);
        ImageView view1=(ImageView) findViewById(R.id.imageView5);

        double h_value = Double.parseDouble(h.getText().toString());
        double w_value = Double.parseDouble(w.getText().toString());
        double bmi = w_value/ (h_value/100.0 * h_value/100.0);
        DecimalFormat df = new DecimalFormat("#.#");

           b.setText(a.getText().toString()+", 你的BMI是: "+String.valueOf(df.format(bmi)));

        String msg;
        if(bmi<18.5){msg="體重過輕";
            Toast.makeText(this, "體重過輕", Toast.LENGTH_LONG).show();
            view1.setImageResource(R.drawable.b1);
            }
        else if(bmi<24){msg="體重正常";
            Toast.makeText(this, "體重正常", Toast.LENGTH_LONG).show();
            view1.setImageResource(R.drawable.b2);}
        else if(bmi>24){msg="體重過重";
            Toast.makeText(this, "體重過重", Toast.LENGTH_LONG).show();
            view1.setImageResource(R.drawable.b3);}
    }
    public void Nextpage(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("height",h.getText().toString());
        bundle.putString("weight",w.getText().toString());
        bundle.putString("name",a.getText().toString());

        Intent intent = new Intent(this,ShowBMIActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }
}
