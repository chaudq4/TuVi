package com.chau.duong.tuvi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    LaSo laSo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        laSo= new LaSo(Constants.DiaChi.Thân,9,3, Constants.DiaChi.Sửu, Constants.NamNu.Nam);
        laSo.init();
        Log.d(TAG, laSo.toString());
    }
}