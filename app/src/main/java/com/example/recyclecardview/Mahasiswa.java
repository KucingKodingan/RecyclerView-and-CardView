package com.example.recyclecardview;

import android.graphics.drawable.Drawable;

public class Mahasiswa {
    private String nim, nama, kelas;
    private Integer gambar;

    public Mahasiswa(String nim, String nama, String kelas, Integer gambar){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.gambar = gambar;
    }

    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String getKelas(){
        return kelas;
    }
    public void setGambar(Integer gambar){
        this.gambar = gambar;
    }
    public Integer getGambar(){
        return gambar;
    }
}
