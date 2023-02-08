package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstnum;
    private EditText secondnum;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView ans1;
    private TextView ans2;
    private TextView ans3;
    private TextView ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnum=(EditText) findViewById(R.id.txtfnum);
        secondnum=(EditText) findViewById(R.id.txtsnum);
        add=(Button) findViewById(R.id.btnadd);
        sub=(Button) findViewById(R.id.btnsub);
        mul=(Button) findViewById(R.id.btnmul);
        div=(Button) findViewById(R.id.btndiv);
        ans1=(TextView) findViewById(R.id.res1);
        ans2=(TextView) findViewById(R.id.res2);
        ans3=(TextView) findViewById(R.id.res3);
        ans4=(TextView) findViewById(R.id.res4);
    }

    public void Addition(View view) {
        float num1=Float.parseFloat(firstnum.getText().toString());
        float num2=Float.parseFloat(secondnum.getText().toString());
        float result=num1+num2;
        ans1.setText("Result is " +result);
    }

    public void divition(View view) {
        float num1=Float.parseFloat(firstnum.getText().toString());
        float num2=Float.parseFloat(secondnum.getText().toString());
        float result=num1/num2;
        ans4.setText("Result is " +result);
    }
    public void Subtraction(View view) {
        float num1=Float.parseFloat(firstnum.getText().toString());
        float num2=Float.parseFloat(secondnum.getText().toString());
        float result=num1-num2;
        ans2.setText("Result is " +result);
    }
    public void Multiplication(View view) {
        float num1=Float.parseFloat(firstnum.getText().toString());
        float num2=Float.parseFloat(secondnum.getText().toString());
        float result=num1*num2;
        ans3.setText("Result is " +result);
    }

    }
