package com.jafa.ejemploratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvName1, tvName2;
    Button btnRate1, btnRate2;
    RatingBar rbStar1, rbStar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName1 = findViewById(R.id.lblName1);
        tvName2 = findViewById(R.id.lblName2);
        btnRate1 = findViewById(R.id.button1);
        btnRate2 = findViewById(R.id.button2);
        rbStar1 = findViewById(R.id.ratingBar1);
        rbStar2 = findViewById(R.id.ratingBar2);
    }
    public void contar1(View v){
        String nombre = tvName1.getText().toString();
       float resultado = rbStar1.getRating();
        Toast.makeText(MainActivity.this,nombre+" ha sido calificado con "+resultado+" estrellas :D", Toast.LENGTH_SHORT).show();
    }
    public void contar2(View v){
        String nombre = tvName2.getText().toString();
        float resultado = rbStar2.getRating();
        Toast.makeText(MainActivity.this,nombre+" ha sido calificado con "+resultado+" estrellas :D", Toast.LENGTH_SHORT).show();
    }
}