/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
}

class Peminjaman {
    private Buku buku;
    private String peminjam;
    private Date tanggalPeminjaman;

    public Peminjaman(Buku buku, String peminjam, Date tanggalPeminjaman) {
        this.buku = buku;
        this.peminjam = peminjam;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Buku getBuku() {
        return buku;
    }

    public String getPeminjam() {
        return peminjam;
    }

    
    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }
}

