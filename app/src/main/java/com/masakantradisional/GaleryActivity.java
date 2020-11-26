package com.masakantradisional;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.masakantradisional.model.MasakanTradisional;

import java.util.List;

public class GaleryActivity  extends AppCompatActivity {

    List<MasakanTradisional> masakanTradisionals;
    int indeksTampil = 0;
    String namaMasakanTradisional;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txKhas,txAsal,txDeskripsi,txJudul;
    ImageView ivFotoMasakanTradisional;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_khas_xml);
        Intent intent = getIntent();
        namaMasakanTradisional = intent.getStringExtra(MainActivity.NAMA_GALERI_KEY);
        masakanTradisionals = DataProvider.getMasakanTradisionalsByTipe(this,namaMasakanTradisional);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> masakanTradisionalPertama());
        btnTerakhir.setOnClickListener(view -> masakanTradisionalTerakhir());
        btnSebelumnya.setOnClickListener(view -> masakanTradisionalSebelumnya());
        btnBerikutnya.setOnClickListener(view -> masakanTradisionalBerikutnya());

        txKhas = findViewById(R.id.txKhas);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoMasakanTradisional = findViewById(R.id.gambarMasakanTradisional);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam Khas "+namaMasakanTradisional);
    }

    private void masakanTradisionalPertama() {
    }


    private void tampilkanProfil() {
        MasakanTradisional k = masakanTradisionals.get(indeksTampil);
        Log.d("NASIGORENG","Menampilkan nasigoreng "+k.getNama());
        txKhas.setText(k.getKhas());
        txAsal.setText(k.getAsal());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoMasakanTradisional.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void MasakanTradisionalPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void masakanTradisionalTerakhir() {
        int posAkhir = masakanTradisionals.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void masakanTradisionalBerikutnya() {
        if (indeksTampil == masakanTradisionals.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void masakanTradisionalSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}
