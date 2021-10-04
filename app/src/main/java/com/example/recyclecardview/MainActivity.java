package com.example.recyclecardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    private MahasiswaAdapter mahasiswaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
        recyclerView = findViewById(R.id.recyclerView);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    void getData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("218280084","Munir","Informatika B", R.drawable.ic_baseline_accessible_24));
        mahasiswaArrayList.add(new Mahasiswa("2182","misb","b", R.drawable.ic_baseline_add_24));
        mahasiswaArrayList.add(new Mahasiswa("1313123","adfasf","99", R.drawable.ic_baseline_perm_data_setting_24));
        mahasiswaArrayList.add(new Mahasiswa("11313","fasdfafasd","dsafas", R.drawable.ic_baseline_accessible_24));
    }
}