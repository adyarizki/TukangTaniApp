package com.example.project_uts.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.project_uts.ViewPager;
import com.example.project_uts.R;

public class splash extends AppCompatActivity {

    /*NAMA  : Ady Aprilriyan Rizki
     * NIM   : 10116107
     * Kelas : IF-3
     * Tanggal Pengerjaan : 19-21 Mei 2019*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //menjalanakan splash activity dalam beberapa detik
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //apa yang terjadi
                Intent intent = new Intent(splash.this, ViewPager.class);
                startActivity(intent);
                //splash hilang
                finish();
            }
        }, 3000);
    }
}
