/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal3;

/**
 *
 * @author asus
 */
//Pada baris ini terdapat kesalahan pada class, penamaan public class harus sama dengan nama file.java
//public class Employee {
public class Pegawai {
    public String nama;
//  Terdapat kesalahan pada tipe data, tipe data diubah menjadi string
//  public char asal;
    public String asal; 
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    
    public String getAsal() {
        return asal;
    }
    
//  Pada baris ini perlu di deklarasikan variabel j 
//  public void setJabatan () {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
