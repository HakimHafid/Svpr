package com.sekolahvirtualparangloe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
public class datasekolah extends AppCompatActivity {

    Button datasdpeo;
    Button dataspandu;
    Button datasmapar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datasekolah);

        datasdpeo = findViewById(R.id.btndatasdpeo);
        dataspandu = findViewById(R.id.btndataspandu);
        datasmapar = findViewById(R.id.btndatasmapar);


        datasdpeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(datasekolah.this,datasdpeo.class);
                startActivity(i);

            }
        });

        dataspandu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(datasekolah.this,dataspandu.class);
                startActivity(i);

            }
        });

        datasmapar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(datasekolah.this,datasmapar.class);
                startActivity(i);

            }
        });

    }
}
