package com.masakantradisional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;


    public class MainActivity extends AppCompatActivity {

        ImageButton btnNasiGoreng,btnSoto;
        public static final String NAMA_GALERI_KEY = "NAMA_GALERI";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            inisialisasiView();

        }

        private void inisialisasiView() {
            btnNasiGoreng = findViewById(R.id.btn_buka_khas_NasiGoreng);
            btnSoto = findViewById(R.id.btn_buka_khas_soto);
            btnNasiGoreng.setOnClickListener(view -> bukaGaleri("NasiGoreng"));
            btnSoto.setOnClickListener(view -> bukaGaleri("Soto"));

        }

        private void bukaGaleri(String namaMasakanTradisional) {
            Log.d("MAIN","Buka activity NasiGoreng");
            Intent intent = new Intent(this, GaleryActivity.class);
            intent.putExtra(NAMA_GALERI_KEY, namaMasakanTradisional);
            startActivity(intent);
        }


    }