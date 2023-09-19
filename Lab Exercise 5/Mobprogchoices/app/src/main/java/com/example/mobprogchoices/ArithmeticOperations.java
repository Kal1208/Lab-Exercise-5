package com.example.mobprogchoices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ArithmeticOperations extends AppCompatActivity {

    private Button BackButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic_operations);

        BackButton2 = (Button) findViewById(R.id.BackButton2);
        BackButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivty();
            }
        });

    }

    public void Addition(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        int Num1 = Integer.parseInt(et1.getText().toString());
        int Num2 = Integer.parseInt(et2.getText().toString());
        int Sum = (Num1+Num2);
        et3.setText("The Sum is " + Sum);
    }

    public void Subtraction(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        int Num1 = Integer.parseInt(et1.getText().toString());
        int Num2 = Integer.parseInt(et2.getText().toString());
        int Difference = (Num1-Num2);
        et3.setText("The Difference is " + Difference);
    }

    public void Multiplication(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        int Num1 = Integer.parseInt(et1.getText().toString());
        int Num2 = Integer.parseInt(et2.getText().toString());
        int Product = (Num1*Num2);
        et3.setText("The Product is " + Product);
    }

    public void Quotient(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        double Num1 = Integer.parseInt(et1.getText().toString());
        double Num2 = Integer.parseInt(et2.getText().toString());
        double Quotient = (Num1/Num2);
        et3.setText("The Quotient is " + Quotient);
    }

    public void openMainActivty() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clearText2(View view) {
        EditText et1 =(EditText)findViewById(R.id.Num1);
        EditText et2 =(EditText)findViewById(R.id.Num2);
        EditText et3 =(EditText)findViewById(R.id.Result);
        et1.setText("");
        et2.setText("");
        et3.setText("");
    }
}