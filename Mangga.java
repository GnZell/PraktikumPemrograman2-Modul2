/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2.Soal1;

/**
 *
 * @author asus
 */
public class Mangga {

    int jumlahpembelian, harga;
    float berat;
    public void nama(String nama){
        System.out.println("Nama Mangga : " + nama);
    }
    
    public void berat(float berat){
        this.berat = berat;
        System.out.println("Berat : " + berat + " kg");
    }
    
    public void beli(int jumlah) {
        jumlahpembelian = jumlah;
        System.out.println("Jumlah Beli : " + jumlah);
    }
    
    public void totalBerat(){
        System.out.println("Total berat : " + jumlahpembelian * berat + " kg");
    }
    
    public void totalHarga(){
        System.out.println("Total harga : Rp. " + harga * jumlahpembelian);
    }
}