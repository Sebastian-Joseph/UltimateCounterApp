package com.kean.edu.ultimatecounterapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    public Button add;
    public Button reset;
    public Button subtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.plus);
        subtract = (Button) findViewById(R.id.minus);
        reset = (Button) findViewById(R.id.reset);
        TextView counterDisplay = (TextView) findViewById(R.id.counter);
        UltimateCounter ultimateCounter = new UltimateCounter();

        add.setOnClickListener(View -> {
            ultimateCounter.add();
            counterDisplay.setText(ultimateCounter.display());
        });

        subtract.setOnClickListener(View -> {
            ultimateCounter.subtract();
            counterDisplay.setText(ultimateCounter.display());
        });

        reset.setOnClickListener(View -> {
            ultimateCounter.reset();
            counterDisplay.setText(ultimateCounter.display());
        });

    }
}