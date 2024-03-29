package com.example.nathaniel.crunchtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b = (Button)findViewById(R.id.button);
        final EditText e = (EditText)findViewById(R.id.editText);
        final EditText e2 = (EditText)findViewById(R.id.editText2);
        final TextView caloriesBurned = (TextView)findViewById(R.id.textView2);
        final TextView convertTo = (TextView)findViewById(R.id.textView3);
        final Spinner inputSpin = (Spinner)findViewById(R.id.spinner);
        final Spinner outputSpin = (Spinner)findViewById(R.id.spinner2);
        final ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "";
                if (toggle.isChecked()) {
                    number = e2.getText().toString();
                }
                else {
                    number = e.getText().toString();
                }
                if (number.length() != 0) {
                    int input = Integer.parseInt(number);
                    String inputEx = inputSpin.getSelectedItem().toString();
                    String outputEx = outputSpin.getSelectedItem().toString();
                    int inEx = 0;
                    int outEx = 0;
                    if (inputEx.equals("minutes of Cycling")) {
                        inEx = 12;
                    }
                    else if (inputEx.equals("minutes of Jogging")) {
                        inEx = 12;
                    }
                    else if (inputEx.equals("minutes of Jumping Jacks")) {
                        inEx = 10;
                    }
                    else if (inputEx.equals("minutes of Leg-lift")) {
                        inEx = 25;
                    }
                    else if (inputEx.equals("minutes of Plank")) {
                        inEx = 25;
                    }
                    else if (inputEx.equals("reps of Pullups")) {
                        inEx = 100;
                    }
                    else if (inputEx.equals("reps of Pushups")) {
                        inEx = 350;
                    }
                    else if (inputEx.equals("reps of Situps")) {
                        inEx = 200;
                    }
                    else if (inputEx.equals("reps of Squats")) {
                        inEx = 225;
                    }
                    else if (inputEx.equals("minutes of Stair-Climbing")) {
                        inEx = 15;
                    }
                    else if (inputEx.equals("minutes of Swimming")) {
                        inEx = 13;
                    }
                    else if (inputEx.equals("minutes of Walking")) {
                        inEx = 20;
                    }
                    if (outputEx.equals("minutes of Cycling")) {
                        outEx = 12;
                    }
                    else if (outputEx.equals("minutes of Jogging")) {
                        outEx = 12;
                    }
                    else if (outputEx.equals("minutes of Jumping Jacks")) {
                        outEx = 10;
                    }
                    else if (outputEx.equals("minutes of Leg-lift")) {
                        outEx = 25;
                    }
                    else if (outputEx.equals("minutes of Plank")) {
                        outEx = 25;
                    }
                    else if (outputEx.equals("reps of Pullups")) {
                        outEx = 100;
                    }
                    else if (outputEx.equals("reps of Pushups")) {
                        outEx = 350;
                    }
                    else if (outputEx.equals("reps of Situps")) {
                        outEx = 200;
                    }
                    else if (outputEx.equals("reps of Squats")) {
                        outEx = 225;
                    }
                    else if (outputEx.equals("minutes of Stair-Climbing")) {
                        outEx = 15;
                    }
                    else if (outputEx.equals("minutes of Swimming")) {
                        outEx = 13;
                    }
                    else if (outputEx.equals("minutes of Walking")) {
                        outEx = 20;
                    }
                    if (toggle.isChecked()) {

                    }
                    if (toggle.isChecked()) {
                        int ex1 = calToEx(input, inEx);
                        int ex2 = calToEx(input, outEx);
                        e.setText(ex1 + "");
                        convertTo.setText(ex2 + "");
                    }
                    else {
                        int calories = exToCal(input, inEx);
                        int otherEx = calToEx(calories, outEx);
                        e2.setText(calories +"");
                        convertTo.setText(otherEx + "");
                    }
                }
            }
        });
    }

    private int exToCal(int in, int ex) {
        return 100 * in / ex;
    }

    private int calToEx(int in, int ex) {
        return in * ex / 100;
    }
}
