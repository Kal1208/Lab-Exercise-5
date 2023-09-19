package com.example.mobprogchoices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Statements extends AppCompatActivity {

    private Button NameButton;
    TextView StatementTitle;
    EditText InputName;
    private Button BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statements);

        BackButton = (Button) findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

    StatementTitle = findViewById(R.id.StatementTitle);
    InputName = findViewById(R.id.InputName);
    }

    public void updateText(View view) {
        StatementTitle.setText("Hello " + InputName.getText());
    }

    public void clearText(View view) {
        StatementTitle.setText("");
        InputName.setText("");
    }

    public void  openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}