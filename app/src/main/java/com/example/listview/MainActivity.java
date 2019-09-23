package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import android.os.Handler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnMoveActivity;
    private Button tentangKami;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity = (Button)findViewById(R.id.btn_pindah);
        btnMoveActivity.setOnClickListener(this);
        tentangKami = (Button)findViewById(R.id.btn_pindah2);
        tentangKami.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_pindah:
                Intent moveIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_pindah2:
                Intent inte = new Intent(MainActivity.this, TentangKami.class);
                startActivity(inte);
                break;

        }

    }
}
