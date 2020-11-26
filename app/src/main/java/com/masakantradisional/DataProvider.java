package com.masakantradisional;

import android.content.Context;

import com.masakantradisional.model.MasakanTradisional;
import com.masakantradisional.model.NasiGoreng;
import com.masakantradisional.model.Soto;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<MasakanTradisional> masakanTradisionals = new ArrayList<>();

    private static List<NasiGoreng> initDataNasiGoreng(Context ctx) {
        List<NasiGoreng> nasiGorengs = new ArrayList<>();
        nasiGorengs.add(new NasiGoreng("Medan", "Medan",
                "Nasi goreng ini juga populer di Medan. Kamu bisa mencoba kedai Semalam Suntuk yang letaknya berada di seberang Istana Maimun atau di Jalan Brigjen Katamso. Yang menarik dari makanan ini selain dagingnya yang banyak adalah rasa pedasnya begitu kuat. Meski begitu, tetap enak disantap. Satu porsinya bisa kamu beli dengan harga sekitar Rp16.000. Murah sekali bukan?", R.drawable.nasi_goreng_semalam_suntuk_medan));
        nasiGorengs.add(new NasiGoreng("Padang", "Padang",
                "Nasi Padang dan Rumah Makan Minang sudah seperti sebuah warisan yang melegenda. jati diri dan kebanggaan masyarakat bersuku dan berbudaya. Namun di tempat asalnya, nasi goreng juga menjadi hidangan istimewa. Salah satunya adalah  Patai Bofet Mi-Mien yang mulai berjualan sejak tahun 1973. Ada banyak pilihan menu yang menggoda. Langsung saja datang ke lokasinya di Jl. Thamrin No.Kel, Alang Laweh, Padang Selatan, Kota Padang.", R.drawable.nasi_goreng_pantai_padang));
        nasiGorengs.add(new NasiGoreng("Jambi", "Jambi",
                "Namanya unik dan bikin penasaran. Ide ini muncul dari resep risoles. Jadi kamu akan mendapatkan hidangan resoles yang nampak gurih berukuran jumbo. Untuk menyantap yang ada di dalam resoles itu, kamu harus membelahnya. Di bagian dalam sudah ada yang di masak dengan bumbu spesial. Nasi Goreng Montok ini berada di Jalan Ir. Haji Juanda, Simpang III Sipin, Baru, Kota Jambi.", R.drawable.nasi_goreng_montok_jambi));
        nasiGorengs.add(new NasiGoreng("Palembang", "Palembang",
                "Jika berbicara tentang Palembang, jadi ingat pempek. Bumi Sriwijaya ini sudah seperti surganya kuliner enak dengan rasa khas. Tak hanya pempek, kamu juga bisa mencoba hidangan ini. Datang saja ke Rumah Makan Cipta Rasa. Tempatnya nyaman dengan kelezatan terjamin. hidangan yang ditawarkan memiliki tekstur lembut, pokoknya lemak nian.", R.drawable.nasi_goreng_merah_palembang));
        nasiGorengs.add(new NasiGoreng("Aceh", "Banda Aceh",
                "Cita rasa kuliner Aceh sudah jadi buah bibir dan primadona di Nusantara. Jika kamu punya kesempatan untuk berkunjung ke Banda Aceh, jangan lupa mencicipinya di JL. Panglima Polem, No. 87-89. Menu ini terkenal karena memiliki rasa yang tak berubah dari dulu. Bumbunya begitu mantap dan meresap rata. ", R.drawable.nasi_goreng_daus_banda_aceh));
        return nasiGorengs;
    }

    private static List<Soto> initDataSoto(Context ctx) {
        List<Soto> sotos = new ArrayList<>();
        sotos.add(new Soto("Bandung", "Bandung",
                "Kebanyakan soto memang dimasak dengan aneka bumbu rempah, tapi soto bandung tidak. Sotonya Kota Kembang ini justru dimasak dengan bumbu sederhana dan isian yang tidak seramai soto lainnya.\n" +
                        "\n" +
                        "Soto bandung berisi daging sapi yang dipotong berbentuk dadu, potongan lobak, dan taburan kacang kedelai.", R.drawable.soto_bandung));
        sotos.add(new Soto("Banjar", "kalimantan Banjarmasin ",
                "Pulau Kalimantan punya sajian soto yang juga terkenal, soto banjar namanya. Sesuai dengan namanya, soto ini berasal dari Banjarmasin. Kekayaan rempah sangat terasa dari kuah soto banjar ini.\n" +
                        "\n" +
                        "Bumbu rempah seperti kayu manis, biji pala, dan cengkeh jadi cita rasa khas soto ini. Untuk isiannya, soto banjar menggunakan suwiran daging ayam, perkedel kentang, rebusan telur, dan disantap dengan ketupat. ", R.drawable.soto_banjar));
        sotos.add(new Soto("Betawi", "Jakarta",
                "Popularitas soto betawi bisa dibilang sangat tinggi. Hampir di setiap daerah, Moms bisa menemukan soto ini. Soto yang asalnya dari Jakarta ini memang punya cita rasa istimewa! Kuah santannya yang gurih berpadu sempurna dengan bumbu rempah dari pala, cengkeh, dan kapulaga.", R.drawable.soto_betawi));
        sotos.add(new Soto("Lamongan", "Jawa Timur",
                "Soto lain yang tidak kalah pamor adalah soto lamongan. Soto lamongan ini punya ciri khas bubuk koya yang gurih. Bubuk koya yang terbuat dari campuran bawang goreng dan kerupuk udang itu memang menambah cita rasa soto berkuah kuning ini.\n" +
                        "\n" +
                        "Soal isian, soto lamongan umumnya terdiri dari kol, sohun, dan suwiran daging ayam kampung. Soto ini juga biasanya disajikan dengan nasi hangat.", R.drawable.soto_lamongan));
        sotos.add(new Soto("Bogor", "Jawa Barat",
                "Soto mie bogor beda lagi. Jika kebanyakan soto disajikan dengan nasi hangat, soto mie bogor ini disajikan dengan mi kuning.\n" +
                        "\n" +
                        "Untuk isiannya, soto mie bogor terdiri dari daging sapi, tomat, dan risoles. Kuahnya memang bening, tapi cita rasanya begitu enak.", R.drawable.soto_mie_bogor));

        return sotos;
    }
    private static void initAllMasakanTradisionals(Context ctx) {
        masakanTradisionals.addAll(initDataNasiGoreng(ctx));
        masakanTradisionals.addAll(initDataSoto(ctx));

    }

    public static List<MasakanTradisional> getAllMasakanTradisional(Context ctx) {
        if (masakanTradisionals.size() == 0) {
            initAllMasakanTradisionals(ctx);
        }
        return  masakanTradisionals;
    }

    public static List<MasakanTradisional> getMasakanTradisionalsByTipe(Context ctx, String nama) {
        List<MasakanTradisional> masakanTradisionalsByType = new ArrayList<>();
        if (masakanTradisionals.size() == 0) {
            initAllMasakanTradisionals(ctx);
        }
        for (MasakanTradisional h : masakanTradisionals) {
            if (h.getNama().equals(nama)) {
                masakanTradisionalsByType.add(h);
            }
        }
        return masakanTradisionalsByType;
    }

}


