package edu.ntut.hw1_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "Hello World!!! Debug");
        Log.i("MainActivity", "Hello World!!! Info");
        setContentView(R.layout.activity_main);
    }
}