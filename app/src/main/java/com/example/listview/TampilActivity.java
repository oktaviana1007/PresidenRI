package com.example.listview;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TampilActivity extends AppCompatActivity {
    private TextView nama, desk;
    private ImageView foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);
        nama = findViewById(R.id.Nama);
        desk = findViewById(R.id.Deskripsi);
        foto = findViewById(R.id.poto);
        showData();
    }
    @SuppressLint("SetTextI18n")
    private void showData() {
        String pres = getIntent().getExtras().getString("MyName");
        switch (pres) {
            case "soekarno":
                nama.setText(" Dr.(H.C.) Ir. H. Soekarno");
                foto.setImageDrawable(getResources().getDrawable(R.drawable.soekarno));
                desk.setText(" adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967, 81 Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.");
                break;
            case "soeharto":
                nama.setText(" Jenderal Besar TNI (Purn.) H. M. Soeharto");
                foto.setImageDrawable(getResources().getDrawable(R.drawable.soeharto));
                desk.setText(" (lahir di Kemusuk, Yogyakarta, 8 Juni 1921 – meninggal di Jakarta, 27 Januari 2008 pada umur 86 tahun) adalah Presiden kedua Indonesia yang menjabat dari tahun 1967 sampai 1998, menggantikan Soekarno. Di dunia internasional, terutama di Dunia Barat, Soeharto sering dirujuk dengan sebutan populer \"The Smiling General\" (bahasa Indonesia: \"Sang Jenderal yang Tersenyum\") karena raut mukanya yang senantiasa tersenyum dan menunjukkan keramahan. Meski begitu, dengan berbagai kontroversi yang terjadi ia sering juga disebut sebagai diktator bagi yang berseberangan dengannya.");
                break;
            case "habibie":
                nama.setText(" Prof. Dr. Ing. H. Bacharuddin Jusuf Habibie");
                foto.setImageDrawable(getResources().getDrawable(R.drawable.habibie));
                desk.setText(" (lahir di Parepare, Sulawesi Selatan, 25 Juni 1936 – meninggal di Jakarta, 11 September 2019 pada umur 83 tahun) adalah Presiden Republik Indonesia yang ketiga. Sebelumnya, B.J. Habibie menjabat sebagai Wakil Presiden Republik Indonesia ke-7, menggantikan Try Sutrisno. B. J. Habibie menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1998.");
                break;
            case "gusdur":
                nama.setText(" Dr.(H.C.) K. H. Abdurrahman Wahid ");
                foto.setImageDrawable(getResources().getDrawable(R.drawable.gusdur));
                desk.setText("atau yang akrab disapa Gus Dur (lahir di Jombang, Jawa Timur, 7 September 1940 – meninggal di Jakarta, 30 Desember 2009 pada umur 69 tahun) adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001. Ia menggantikan Presiden B.J. Habibie setelah dipilih oleh Majelis Permusyawaratan Rakyat hasil Pemilu 1999. Penyelenggaraan pemerintahannya dibantu oleh Kabinet Persatuan Nasional. Masa kepresidenan Abdurrahman Wahid dimulai pada 20 Oktober 1999 dan berakhir pada Sidang Istimewa MPR pada tahun 2001. Tepat 23 Juli 2001, kepemimpinannya digantikan oleh Megawati Soekarnoputri setelah mandatnya dicabut oleh MPR. Abdurrahman Wahid adalah mantan ketua Tanfidziyah (badan eksekutif) Nahdlatul Ulama dan pendiri Partai Kebangkitan Bangsa (PKB).");
                break;
            case "megawati":
                nama.setText(" Dr.(H.C.) Hj. Dyah Permata Megawati Setyawati Soekarnoputri ");
                foto.setImageDrawable(getResources().getDrawable(R.drawable.megawati));
                desk.setText("atau umumnya lebih dikenal sebagai Megawati Soekarnoputri atau biasa disapa dengan panggilan \"Mbak Mega\" (lahir di Yogyakarta, 23 Januari 1947; umur 72 tahun) adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 sampai 20 Oktober 2004. Ia merupakan presiden wanita Indonesia pertama dan puteri dari presiden Indonesia pertama, Soekarno, yang kemudian mengikuti jejak ayahnya menjadi Presiden Indonesia. Pada 20 September 2004, ia kalah suara dari Susilo Bambang Yudhoyono dalam Pemilu Presiden 2004 putaran yang kedua");
                break;
            case "sby":
                nama.setText(" Prof. Dr. H. Susilo Bambang Yudhoyono, M.A., GCB., AC. ");
                foto.setImageDrawable(getResources().getDrawable(R.drawable.sby));
                desk.setText("(lahir di Tremas, Arjosari, Pacitan, Jawa Timur, Indonesia, 9 September 1949; umur 70 tahun) adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014.Ia adalah Presiden pertama di Indonesia yang dipilih melalui jalur pemilu. Ia, bersama Wakil Presiden Muhammad Jusuf Kalla, terpilih dalam Pemilu Presiden 2004. Ia berhasil melanjutkan pemerintahannya untuk periode kedua dengan kembali memenangkan Pemilu Presiden 2009, kali ini bersama Wakil Presiden Boediono. Sejak era reformasi dimulai, Susilo Bambang Yudhoyono merupakan Presiden Indonesia pertama yang menyelesaikan masa kepresidenan selama 5 tahun dan berhasil terpilih kembali untuk periode kedua.");
                break;
            case "jokowi":
                nama.setText(" Ir. H. Joko Widodo ");
                foto.setImageDrawable(getResources().getDrawable(R.drawable.jokowi));
                desk.setText("(lahir di Surakarta, Jawa Tengah, 21 Juni 1961; umur 58 tahun) adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014. Jokowi pernah menjabat Gubernur DKI Jakarta sejak 15 Oktober 2012 hingga 16 Oktober 2014 didampingi Basuki Tjahaja Purnama sebagai wakil gubernur. Sebelumnya, ia adalah Wali Kota Surakarta (Solo), sejak 28 Juli 2005 hingga 1 Oktober 2012 didampingi F.X. Hadi Rudyatmo sebagai wakil wali kota. Dua tahun menjalani periode keduanya menjadi Wali Kota Solo, Jokowi ditunjuk oleh partainya, Partai Demokrasi Indonesia Perjuangan (PDI-P), untuk bertarung dalam pemilihan Gubernur DKI Jakarta berpasangan dengan Basuki Tjahaja Purnama (Ahok).");
                break;
        }
    }
}
