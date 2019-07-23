package com.example.landactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonFirebase;
            Button buttonMap;
            Button buttonIntro;
            Button buttonHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHelp=(Button) findViewById(R.id.buttonHelp);
        buttonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help();
            }
        });

        buttonIntro=(Button) findViewById(R.id.buttonIntro);
        buttonIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Introduction();
            }
        });

        buttonFirebase=(Button) findViewById(R.id.buttonFirebase);
        buttonFirebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase();
            }
        });

        buttonMap=(Button) findViewById(R.id.buttonMap);
        buttonMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MapsActivity();
            }
        });


    }

    public void  Introduction(){
        Intent intent=new Intent(this,Introduction.class);
        startActivity(intent);
    }

    public void  Firebase(){
        Intent intent=new Intent(this,Firebase.class);
        startActivity(intent);
    }

    public void  MapsActivity(){
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void  Help(){
        Intent intent=new Intent(this,Help.class);
        startActivity(intent);
    }

}
