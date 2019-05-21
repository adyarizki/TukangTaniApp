package com.example.project_uts;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project_uts.model.ModelFriend;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.MahasiswaViewHolder> {


    /*NAMA  : Ady Aprilriyan Rizki
     * NIM   : 10116107
     * Kelas : IF-3
     * Tanggal Pengerjaan : 19-21 Mei 2019*/

    private ArrayList<ModelFriend> dataList;

    public AdapterRecyclerView(ArrayList<ModelFriend> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.customlistview, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.t_nama.setText(dataList.get(position).getNama());
        holder.t_nim.setText(dataList.get(position).getNpm());
        holder.t_nohp.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView t_nama, t_nim, t_nohp;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            t_nama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            t_nim = (TextView) itemView.findViewById(R.id.txt_nim_mahasiswa);
            t_nohp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}