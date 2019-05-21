package com.example.project_uts;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.example.project_uts.Fragment.ContactFragment;
import com.example.project_uts.Fragment.FragmentFriend;
import com.example.project_uts.Fragment.HomeFragment;

public class Main2Activity extends AppCompatActivity {

    /*NAMA  : Ady Aprilriyan Rizki
    * NIM   : 10116107
    * Kelas : IF-3
    * Tanggal Pengerjaan : 19-21 Mei 2019*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navlistener);
        Button btnsubmit = (Button) findViewById(R.id.call);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
    }

    private  BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragemen = null;

                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                            selectedFragemen =new HomeFragment();
                            break;
                        case R.id.nav_contact:
                            selectedFragemen =new ContactFragment();
                            break;
                        case R.id.nav_list:
                            selectedFragemen =new FragmentFriend();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragemen).commit();

                    return true;
                }
            };

}
