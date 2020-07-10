package com.sekolahvirtualparangloe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Proses pemanggilan fungsi tombol / intent menu pilihan gambar sd

import androidx.appcompat.app.AppCompatActivity;

public class vrsdpeo extends AppCompatActivity {

    Button prosestampildepansd;
    Button prosestampilkirisd;
    Button prosestampiltengahsd;
    Button prosestampilkanansd;
    Button prosestampilbelakangsd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrsdpeo);

        prosestampildepansd = findViewById(R.id.btndepansd);
        prosestampilkirisd = findViewById(R.id.btnkirisd);
        prosestampiltengahsd = findViewById(R.id.btntengahsd);
        prosestampilkanansd = findViewById(R.id.btnkanansd);
        prosestampilbelakangsd = findViewById(R.id.btnbelakangsd);

        prosestampildepansd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsdpeo.this,prosestampildepansd.class);
                startActivity(i);

            }
        });

        prosestampilkirisd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsdpeo.this,prosestampilkirisd.class);
                startActivity(i);

            }
        });

        prosestampiltengahsd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsdpeo.this,prosestampiltengahsd.class);
                startActivity(i);

            }
        });

        prosestampilkanansd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsdpeo.this,prosestampilkanansd.class);
                startActivity(i);

            }
        });

        prosestampilbelakangsd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsdpeo.this,prosestampilbelakangsd.class);
                startActivity(i);

            }
        });



    }
}
