package com.nguyenngocgiahung.androidstudio_thicuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void batdau(View view){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
/*    public void huongdan(){
        Intent hd = new Intent(this,main_huong_dan.class);
        startActivity(hd);
    }*/
}