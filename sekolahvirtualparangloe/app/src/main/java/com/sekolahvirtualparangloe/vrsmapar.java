package com.sekolahvirtualparangloe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Proses pemanggilan fungsi tombol / intent menu pilihan gambar

import androidx.appcompat.app.AppCompatActivity;

public class vrsmapar extends AppCompatActivity {

    Button prosestampildepansma;
    Button prosestampilkirisma;
    Button prosestampiltengahsma;
    Button prosestampilkanansma;
    Button prosestampilbelakangsma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrsmapar);

        prosestampildepansma = findViewById(R.id.btndepansma);
        prosestampilkirisma = findViewById(R.id.btnkirisma);
        prosestampiltengahsma = findViewById(R.id.btntengahsma);
        prosestampilkanansma = findViewById(R.id.btnkanansma);
        prosestampilbelakangsma = findViewById(R.id.btnbelakangsma);

        prosestampildepansma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsmapar.this,prosestampildepansma.class);
                startActivity(i);

            }
        });

        prosestampilkirisma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsmapar.this,prosestampilkirisma.class);
                startActivity(i);

            }
        });

        prosestampiltengahsma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsmapar.this,prosestampiltengahsma.class);
                startActivity(i);

            }
        });

        prosestampilkanansma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsmapar.this,prosestampilkanansma.class);
                startActivity(i);

            }
        });

        prosestampilbelakangsma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrsmapar.this,prosestampilbelakangsma.class);
                startActivity(i);

            }
        });



    }
}