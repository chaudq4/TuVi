package com.chau.duong.tuvi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import static com.chau.duong.tuvi.Constants.DiaChi.*;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    LaSo laSo;
    Spinner spGio, spNgay, spThang, spNam;
    Button btnAnSao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        laSo = new LaSo(Thân, 9, 3, Constants.DiaChi.Sửu, Constants.NamNu.Nam);
        laSo.init();
        Log.d(TAG, laSo.toString());
    }

    private void initView() {
        spGio = findViewById(R.id.sp_gio);
        spNgay = findViewById(R.id.sp_ngay);
        spThang = findViewById(R.id.sp_thang);
        spNam = findViewById(R.id.sp_nam);
        Constants.DiaChi[] diaChis={Tý, Sửu, Dần, Mão, Thìn, Tị, Ngọ, Mùi, Thân, Dậu, Tuất, Hợi};
        ArrayAdapter<Constants.DiaChi> gioAdapter= new ArrayAdapter<>(this,R.layout.item_spiner,diaChis);
        gioAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spGio.setAdapter(gioAdapter);
        Integer[] ngay= new Integer[30];
        for(int i=0;i<30;i++) ngay[i]=i+1;
        ArrayAdapter<Integer> ngayAdapter= new ArrayAdapter<>(this,R.layout.item_spiner,ngay);
        ngayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        spNgay.setAdapter(ngayAdapter);
    }
}