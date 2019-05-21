package com.example.project_uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewPager extends AppCompatActivity {

    /*NAMA  : Ady Aprilriyan Rizki
     * NIM   : 10116107
     * Kelas : IF-3
     * Tanggal Pengerjaan : 19-21 Mei 2019*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.view.ViewPager viewPager =(android.support.v4.view.ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPageAdapter(this));


    }
    public void Pindah(View view){
        Intent intent = new Intent(ViewPager.this, Main2Activity.class);
        startActivity(intent);
    }
}
