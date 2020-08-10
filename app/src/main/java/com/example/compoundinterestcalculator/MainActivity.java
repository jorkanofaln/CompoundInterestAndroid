package com.example.compoundinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;
import com.example.compoundinterestcalculator.Calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaring attributes and creating class
    private Button futureValueBtn;
    private Button presentValueBtn;
    private EditText editTextInterest;
    private EditText editTextTime;
    private EditText editTextValue;
    private TextView editTextResult;
    Calculator calculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        futureValueBtn = (Button) findViewById(R.id.futureValueBtn);
        presentValueBtn = (Button) findViewById(R.id.presentValueBtn);
        editTextInterest = (EditText) findViewById(R.id.editTextInterest);
        editTextTime = (EditText) findViewById(R.id.editTextTime);
        editTextValue = (EditText) findViewById(R.id.editTextValue);
        editTextResult = (TextView) findViewById(R.id.resultView);
        editTextResult.setText("");
        futureValueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.setInterest(Double.valueOf(editTextInterest.getText().toString()));
                calculator.setTime(Double.valueOf(editTextTime.getText().toString()));
                calculator.setValue(Double.valueOf(editTextValue.getText().toString()));
                editTextInterest.setText(Double.toString(calculator.calculateFutureValue()));
            }
        });
        futureValueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double interestRate = Double.valueOf(editTextInterest.getText().toString())/100;
                System.out.println(interestRate);
                calculator.setInterest(interestRate);
                calculator.setTime(Double.valueOf(editTextTime.getText().toString()));
                calculator.setValue(Double.valueOf(editTextValue.getText().toString()));
                editTextInterest.setText(Double.toString(calculator.calculateFutureValue()));
            }
        });
        presentValueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double interestRate = Double.valueOf(editTextInterest.getText().toString())/100;
                System.out.println(interestRate);
                calculator.setInterest(interestRate);
                calculator.setTime(Double.valueOf(editTextTime.getText().toString()));
                calculator.setValue(Double.valueOf(editTextValue.getText().toString()));
                editTextInterest.setText(Double.toString(calculator.calculatePresentValue()));
            }
        });
    }
}