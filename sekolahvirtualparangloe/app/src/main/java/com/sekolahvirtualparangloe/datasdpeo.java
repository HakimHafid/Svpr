package com.sekolahvirtualparangloe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class datasdpeo extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableSd listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datasdpeo);

        listView = (ExpandableListView)findViewById(R.id.Expsdpeo);
        initData();
        listAdapter = new ExpandableSd(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Identitas");
        listDataHeader.add("Sarana Dan Prasarana");
        listDataHeader.add("Lokasi");

        List<String> Identitas = new ArrayList<>();
        Identitas.add("Status : Negeri");
        Identitas.add("Bentuk Pendidikan : Sekolah Dasar");


        List<String> JumlahRuangan = new ArrayList<>();
        JumlahRuangan.add("Ruang Kelas : 6");
        JumlahRuangan.add("Ruang Perpustakaan: 1");
        JumlahRuangan.add("Ruang Laboratorium : 0");


        List<String> Alamat = new ArrayList<>();
        Alamat.add("Alamat : Balanga");
        Alamat.add("Dusun : Bontonompo");
        Alamat.add("Desa / Kelurahan : Belabori");
        Alamat.add("Kecamatan : Parangloe");
        Alamat.add("Kabupaten : Gowa");
        Alamat.add("Provinsi : Sulawesi Selatan");


        listHash.put(listDataHeader.get(0),Identitas);
        listHash.put(listDataHeader.get(1),JumlahRuangan);
        listHash.put(listDataHeader.get(2),Alamat);
    }
}
