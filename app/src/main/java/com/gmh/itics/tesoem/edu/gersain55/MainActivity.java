package com.gmh.itics.tesoem.edu.gersain55;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Mensaje(View v){
        Toast.makeText(this, "WELCOME MY FRIEND", Toast.LENGTH_SHORT).show();
    }
}
