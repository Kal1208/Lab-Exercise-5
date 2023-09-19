package com.example.mobprogchoices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Abutton;
    private Button Bbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Abutton = (Button) findViewById(R.id.Abutton);
        Abutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStatements();
            }
        });

        Bbutton = (Button) findViewById(R.id.Bbutton);
        Bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openArithmeticOperations();
            }
        });

    }

    public void  openStatements() {
        Intent intent = new Intent(this, Statements.class);
        startActivity(intent);
    }

    public void  openArithmeticOperations() {
        Intent intent = new Intent(this, ArithmeticOperations.class);
        startActivity(intent);
    }

}