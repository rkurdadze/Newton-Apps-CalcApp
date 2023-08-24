package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button diffButton, sumButton, multButton, divButton;
    private EditText varAEdit, varBEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumButton = findViewById(R.id.sumBtn);
        varAEdit = findViewById(R.id.varAEdit);
        varBEdit = findViewById(R.id.varBEdit);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(varAEdit.getText().toString());
                int b = Integer.parseInt(varBEdit.getText().toString());
                int res = a+b;
                TextView resultText = findViewById(R.id.resultView);
                resultText.setText(String.valueOf(res));
            }
        });

    }
}