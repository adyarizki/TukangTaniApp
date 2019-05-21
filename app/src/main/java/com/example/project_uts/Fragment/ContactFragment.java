package com.example.project_uts.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.project_uts.R;

public class ContactFragment extends Fragment {

    /*NAMA  : Ady Aprilriyan Rizki
     * NIM   : 10116107
     * Kelas : IF-3
     * Tanggal Pengerjaan : 19-21 Mei 2019*/


        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_contact, container, false);
        Button btnphone = (Button) view.findViewById(R.id.call);
        Button btnins = (Button) view.findViewById(R.id.ig);
        Button btnfb = (Button) view.findViewById(R.id.fb);
        Button btngmail = (Button) view.findViewById(R.id.gmail);
        btnphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = getString(R.string.nomeradi);
                String dial = "tel:" + phone;
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse(dial));
                startActivity(intent);
            }
        });
        btnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlfb ="https://www.facebook.com/ady.rizki.39";
                Intent bukafb=new Intent(Intent.ACTION_VIEW);
                bukafb.setData(Uri.parse(urlfb));
                startActivity(bukafb);
            }
        });
        btnins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlig ="https://www.instagram.com/daun_kalapa";
                Intent bukaig=new Intent(Intent.ACTION_VIEW);
                bukaig.setData(Uri.parse(urlig));
                startActivity(bukaig);
            }
        });
        btngmail.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
               emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Menyapa");
               emailIntent.putExtra(Intent.EXTRA_TEXT, "Hai, Ady.");
               emailIntent.setData(Uri.parse("mailto:adyaprilriyanrizki@gmail.com"));
               startActivity(Intent.createChooser(emailIntent, "Send feedback"));
            }
        });return view;
    }
}
