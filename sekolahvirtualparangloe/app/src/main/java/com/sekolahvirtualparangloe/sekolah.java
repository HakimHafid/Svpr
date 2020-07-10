package com.sekolahvirtualparangloe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sekolah extends AppCompatActivity {

    Button toastheader;
    Button datasekolah;
    Button virtualsekolah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekolah);

        toastheader = findViewById(R.id.buttonheadersekolah);
        datasekolah = findViewById(R.id.btndtsekolah);
        virtualsekolah = findViewById(R.id.btnvrsekolah);

        toastheader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Plihan  Data Sekolah Untuk Mengetahui Data Sekolah Dan Pilihan Virtual Sekolah Untuk Melihat Halaman Setiap  Sekolah Menggunakan Teknologi Virual Reality",
                        Toast.LENGTH_LONG).show(); }
        });
        datasekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sekolah.this,datasekolah.class);
                startActivity(i);

            }
        });

        virtualsekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sekolah.this,virtualsekolah.class);
                startActivity(i);

            }
        });


    }
}
