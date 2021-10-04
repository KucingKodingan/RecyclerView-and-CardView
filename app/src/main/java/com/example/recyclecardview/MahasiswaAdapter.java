package com.example.recyclecardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> listMahasiswa;

    public MahasiswaAdapter(ArrayList<Mahasiswa> listMahasiswa){
        this.listMahasiswa = listMahasiswa;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.tvNim.setText(listMahasiswa.get(position).getNim());
        holder.tvNama.setText(listMahasiswa.get(position).getNama());
        holder.tvKelas.setText(listMahasiswa.get(position).getKelas());
        holder.ivGambar.setImageResource(listMahasiswa.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return (listMahasiswa != null) ? listMahasiswa.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNim, tvNama, tvKelas;
        private ImageView ivGambar;
        public MahasiswaViewHolder(View view){
            super(view);

            tvNim = view.findViewById(R.id.tvNim);
            tvNama = view.findViewById(R.id.tvNama);
            tvKelas = view.findViewById(R.id.tvKelas);
            ivGambar = view.findViewById(R.id.ivGambar);
        }
    }
}
