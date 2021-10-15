package com.example.helloandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.helloandroid3.dialogs.HelloDialog;
import com.example.helloandroid3.listeners.SpinnerListener;

public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private Button bName,bRandom;
    private TextView tName;
    private Spinner sColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName=findViewById(R.id.eName);
        bName=findViewById(R.id.bName);
        tName=findViewById(R.id.tName);
        bRandom=findViewById(R.id.bRandom);
        sColor=findViewById(R.id.sColor);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.color_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sColor.setAdapter(adapter);
        SpinnerListener sl=new SpinnerListener(bName);
        sColor.setOnItemSelectedListener(sl);
    }
    public void clicked(View view)
    {
        HelloDialog helloDialog;
        switch(view.getId())
        {
            case R.id.bName:
                tName.setText("Hello, "+eName.getText());
                helloDialog=new HelloDialog("Hello, "+eName.getText());
                helloDialog.show(getSupportFragmentManager(),"mock");
                break;
            case R.id.bRandom:
                tName.setText("Hello, Random");
                helloDialog=new HelloDialog("Hello, Random");
                helloDialog.show(getSupportFragmentManager(),"mock");
                break;
        }
    }
}