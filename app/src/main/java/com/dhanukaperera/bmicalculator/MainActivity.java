package com.dhanukaperera.bmicalculator;

import android.support.v7.app.AppCompatActivity;
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

    public void calculateBMI(View v){
        EditText editTextHeight = (EditText) findViewById(R.id.txt_height);
        EditText editTextWeight = (EditText) findViewById(R.id.txt_weight);
        TextView textViewDisplayBMI = (TextView) findViewById(R.id.txt_displayBIM);

        double height = Double.parseDouble(editTextHeight.getText().toString());
        double weight = Double.parseDouble(editTextWeight.getText().toString());

        double bmi = weight / (height * height);

        textViewDisplayBMI.setText(Double.toString(bmi));
    }
}
