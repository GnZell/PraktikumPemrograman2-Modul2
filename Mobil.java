/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal2;

import java.text.DecimalFormat;

/**
 *
 * @author asus
 */
class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    String pemilik;

    
    // Deklarasi Formater
    DecimalFormat dfharga = new DecimalFormat("###,###,###");
    DecimalFormat dfpajak = new DecimalFormat("#,###,###");
    
    void info() {      
        
        System.out.println("Merek Mobil: " + this.merek);
        System.out.println("Harga: Rp. " + dfharga.format(this.harga));
        System.out.println("Tahun Keluaran: " + this.tahun_keluaran);
        System.out.println("Kapasitas: " + this.kapasitas + "cc");
    }
    
    void setPemilik(String pemilik) {
         this.pemilik = pemilik;
    }
    
    String getPemilik() {
        return this.pemilik;
    }
    
    String getPajak() {
        int pajak = harga * 2 / 100;
        return dfpajak.format(pajak);
    }
}