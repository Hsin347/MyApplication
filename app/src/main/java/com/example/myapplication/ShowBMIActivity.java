package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ShowBMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bmi);

        TextView textView5 =(TextView) findViewById(R.id.textView5);
        TextView Showbmi =(TextView) findViewById(R.id.textView6);
        ImageView view1=(ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String h = bundle.getString("height");
        String w = bundle.getString("weight");

        double bmi = Double.parseDouble(w)/ (Double.parseDouble(h)/100.0 * Double.parseDouble(h)/100.0);
        DecimalFormat df = new DecimalFormat("#.#");

        String msg="";

        if(bmi<18.5){msg=getString(R.string.strtooLow);
            view1.setImageResource(R.drawable.b1);}
        else if(bmi<24){msg=getString(R.string.strstd);
            view1.setImageResource(R.drawable.b2);}
        else if(bmi>24){msg=getString(R.string.strtoohigh);
            view1.setImageResource(R.drawable.b3);}
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
        Showbmi.setText(getString(R.string.strshowbmi)+String.valueOf(df.format(bmi)));

    }

    }

