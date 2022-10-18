/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal3;

/**
 *
 * @author asus
 */
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
//      Pada baris ini terjadi error karena kurang titik koma (;)
//      p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
//      Pada baris ini perlu ditambahkan umur
        p1.umur = 17;
        
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
//      Pada baris ini perlu ditambahkan tahun
//      System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
