package com.abdurrahman.wapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number, massage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        massage = findViewById(R.id.massage);
    }

    public void Go(View view) {
        String num, mass;
        num = number.getText().toString();
        mass = massage.getText().toString();
        if (num.isEmpty() || mass.isEmpty()){
            Toast.makeText(this, "Some edittext Empty", Toast.LENGTH_SHORT).show();
        }else if (!num.contains("+")){
            Toast.makeText(this, "Enter Country code", Toast.LENGTH_SHORT).show();
        }else {
            String link = "https://wa.me/"+num+"?text="+mass;
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));
        }

    }
}