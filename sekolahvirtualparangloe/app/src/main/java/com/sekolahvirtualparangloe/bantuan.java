package com.sekolahvirtualparangloe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class bantuan extends AppCompatActivity {

    private ExpandableListView listView;
    private Expandablebantuan listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);

        listView = (ExpandableListView)findViewById(R.id.Expbantuan);
        initData();
        listAdapter = new Expandablebantuan(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Tentang Aplikasi");
        listDataHeader.add("Tujuan Pembuatan");
        listDataHeader.add("Cara Penggunaan");

        List<String> Aplikasi = new ArrayList<>();
        Aplikasi.add("Sebuah aplikasi pengenalan sekolah menggunakan media virtual reality gambar 360 derajat");


        List<String> Tujuann = new ArrayList<>();
        Tujuann.add("Untuk mengetahui kondisi keadaan sekitar sekolah tanpa mengunjungi sekolah tersebut");


        List<String> Penggunaan = new ArrayList<>();
        Penggunaan.add("Untuk melihat data sekolah");
        Penggunaan.add(" - Pilih Sekolah");
        Penggunaan.add(" - Pilih data Sekolah");
        Penggunaan.add(" - Pilih Nama Sekolah");
        Penggunaan.add("Untuk melihat virtual sekolah");
        Penggunaan.add(" - Pilih Sekolah");
        Penggunaan.add(" - Pilih Virtual Sekolah");
        Penggunaan.add(" - Pilih Nama Sekolah");
        Penggunaan.add(" - Pilih Halaman Yang Ingin Anda Lihat");

        listHash.put(listDataHeader.get(0),Aplikasi);
        listHash.put(listDataHeader.get(1),Tujuann);
        listHash.put(listDataHeader.get(2),Penggunaan);
    }
}

