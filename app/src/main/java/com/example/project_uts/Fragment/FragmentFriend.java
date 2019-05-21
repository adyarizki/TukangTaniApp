package com.example.project_uts.Fragment;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.project_uts.AdapterRecyclerView;
import com.example.project_uts.R;
import com.example.project_uts.model.ModelFriend;

import java.util.ArrayList;

public class FragmentFriend extends Fragment {


    /*NAMA  : Ady Aprilriyan Rizki
     * NIM   : 10116107
     * Kelas : IF-3
     * Tanggal Pengerjaan : 19-21 Mei 2019*/

    private RecyclerView recyclerView;
    private AdapterRecyclerView adapter;
    private ArrayList<ModelFriend> mahasiswaArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_listview, container, false);

        addData();

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        adapter = new AdapterRecyclerView(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return view;
    }


    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new ModelFriend("Gilang M.", "10116105", "064337384"));
        mahasiswaArrayList.add(new ModelFriend("M. Iskandar", "10116121", "07394389"));
        mahasiswaArrayList.add(new ModelFriend("Ryan Yusuf H.", "10116109", "08473734"));
        mahasiswaArrayList.add(new ModelFriend("Ilham Ramadhan", "10116100", "085373463"));
        mahasiswaArrayList.add(new ModelFriend("Erry Nurhadi Aldo", "10116095", "0847437384"));
        mahasiswaArrayList.add(new ModelFriend("AA suheri daud", "101161096", "0734883443"));
    }
}
