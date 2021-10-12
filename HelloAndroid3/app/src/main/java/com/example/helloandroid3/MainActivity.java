package com.example.helloandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private Button bName,bRandom;
    private TextView tName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName=findViewById(R.id.eName);
        bName=findViewById(R.id.bName);
        tName=findViewById(R.id.tName);
        bRandom=findViewById(R.id.bRandom);
    }
    public void clicked(View view)
    {
        switch(view.getId())
        {
            case R.id.bName:
                tName.setText("Hello, "+eName.getText());
                break;
            case R.id.bRandom:
                tName.setText("Hello, Random");
                break;
        }
    }
}