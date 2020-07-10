package com.sekolahvirtualparangloe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class datasmapar extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableSmapar listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datasmapar);


        listView = (ExpandableListView)findViewById(R.id.Expsmapar);
        initData();
        listAdapter = new ExpandableSmapar(this,listDataHeader,listHash);
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
        Identitas.add("Bentuk Pendidikan : Sekolah Menengah Atas");

        List<String> JumlahRuangan = new ArrayList<>();
        JumlahRuangan.add("Ruang Kelas : 18");
        JumlahRuangan.add("Ruang Perpustakaan : 1");
        JumlahRuangan.add("Ruang Laboratorium : 3");

        List<String> Alamat = new ArrayList<>();
        Alamat.add("Alamat : Jl. Malino KM. 40 Parang");
        Alamat.add("Dusun : Parang");
        Alamat.add("Desa / Kelurahan : Lanna");
        Alamat.add("Kecamatan : Parangloe");
        Alamat.add("Kabupaten : Gowa");
        Alamat.add("Provinsi : Sulawesi Selatan");

        listHash.put(listDataHeader.get(0),Identitas);
        listHash.put(listDataHeader.get(1),JumlahRuangan);
        listHash.put(listDataHeader.get(2),Alamat);
    }
}

