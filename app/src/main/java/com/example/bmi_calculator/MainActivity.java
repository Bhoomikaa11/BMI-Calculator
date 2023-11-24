package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      EditText weight,heightFT,heightIn;
      Button buttoncal;
      TextView showresult;

      weight = findViewById(R.id.weight);
        heightFT = findViewById(R.id.heightFT);
        heightIn = findViewById(R.id.heightIN);
        buttoncal = findViewById(R.id.buttoncal);
        showresult = findViewById(R.id.showresult);

        buttoncal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int weight1 = Integer.parseInt(weight.getText().toString());
                int ftheight = Integer.parseInt(heightFT.getText().toString());
                int inheight = Integer.parseInt(heightIn.getText().toString());

                    int totalIn = ftheight*12 + inheight ;

                    double totalcm =totalIn*2.53;

                    double totalM = totalcm/100;

                    double bmi = weight1/(totalM*totalM) ;


                    if(bmi <18.5)
                    {
                        showresult.setText("you are underweight");

                    } else if (bmi>=18.5 || bmi<24.9) {
                        showresult.setText("you are healthy!!");
                        
                    }
                    else if (bmi>25 || bmi<29.9)
                    {
                        showresult.setText("you are overweight");
                    }
                    else
                    {
                        showresult.setText("you are obese!!");
                    }
            }
        });
    }


}