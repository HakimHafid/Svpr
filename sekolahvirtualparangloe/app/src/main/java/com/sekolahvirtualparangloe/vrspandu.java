package com.sekolahvirtualparangloe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Proses pemanggilan fungsi tombol / intent menu pilihan gambar sd

import androidx.appcompat.app.AppCompatActivity;

public class vrspandu extends AppCompatActivity {

    Button prosestampildepansmp;
    Button prosestampilkirismp;
    Button prosestampiltengahsmp;
    Button prosestampilkanansmp;
    Button prosestampilbelakangsmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrspandu);

        prosestampildepansmp = findViewById(R.id.btndepansmp);
        prosestampilkirismp = findViewById(R.id.btnkirismp);
        prosestampiltengahsmp = findViewById(R.id.btntengahsmp);
        prosestampilkanansmp = findViewById(R.id.btnkanansmp);
        prosestampilbelakangsmp = findViewById(R.id.btnbelakangsmp);

        prosestampildepansmp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrspandu.this,prosestampildepansmp.class);
                startActivity(i);

            }
        });

        prosestampilkirismp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrspandu.this,prosestampilkirismp.class);
                startActivity(i);

            }
        });

        prosestampiltengahsmp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrspandu.this,prosestampiltengahsmp.class);
                startActivity(i);

            }
        });

        prosestampilkanansmp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrspandu.this,prosestampilkanansmp.class);
                startActivity(i);

            }
        });

        prosestampilbelakangsmp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(vrspandu.this,prosestampilbelakangsmp.class);
                startActivity(i);

            }
        });



    }
}
