package com.sekolahvirtualparangloe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class virtualsekolah extends AppCompatActivity {

    Button virtualsdpeo;
    Button virtualspandu;
    Button virtualsmapar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtualsekolah);

        virtualsdpeo = findViewById(R.id.btnvrsdpeo);
        virtualspandu = findViewById(R.id.btnvrspandu);
        virtualsmapar = findViewById(R.id.btnvrsmapar);

        virtualsdpeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(virtualsekolah.this,vrsdpeo.class);
                startActivity(i);

            }
        });

        virtualspandu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(virtualsekolah.this,vrspandu.class);
                startActivity(i);

            }
        });

        virtualsmapar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(virtualsekolah.this,vrsmapar.class);
                startActivity(i);

            }
        });

    }
}
