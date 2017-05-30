package com.example.fajar.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class rv extends AppCompatActivity {

    RecyclerView rv;
    List<ProfModel> profList = new ArrayList<>();
    ProfAdapter profAdapter;
    ProfModel profModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv);

        rv = (RecyclerView) findViewById(R.id.rv);
        profAdapter = new ProfAdapter(getApplicationContext(), profList);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(lm);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(profAdapter);

        data();
    }

    private void tambahdata(int gambar, String eng, String indo) {
        profModel = new ProfModel(gambar, eng, indo);
        profList.add(profModel);
    }

    private void data() {
        tambahdata(R.drawable.chef, "Chef", "Koki");
        tambahdata(R.drawable.doctor, "Doctor", "Dokter");
        tambahdata(R.drawable.farmer, "Farmer", "Petani");
        tambahdata(R.drawable.judge, "Judge", "Hakim");
        tambahdata(R.drawable.pilot, "Pilot", "Pilot");
        tambahdata(R.drawable.policeman, "Policeman", "Polisi");
        tambahdata(R.drawable.teacher, "Teacher", "Guru");
        tambahdata(R.drawable.writer, "Writer", "Penulis");
    }
}
