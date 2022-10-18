/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.Soal1;

/**
 *
 * @author asus
 */
public class PRAK201_2110817110007_SeptianDwiAnggoroMochtar {
    public static void main(String[] args){
        Mangga arumanis = new Mangga();
        arumanis.harga = 5000;
        arumanis.nama("Arumanis");
        arumanis.berat(0.3f);
        arumanis.beli(13);
        arumanis.totalBerat();
        arumanis.totalHarga();
        
        System.out.println("");
        
        Mangga manalagi = new Mangga();
        manalagi.harga = 7500;
        manalagi.nama("Manalagi");
        manalagi.berat(0.5f);
        manalagi.beli(17);
        manalagi.totalBerat();
        manalagi.totalHarga();
        
        System.out.println("");
        
        Mangga madu = new Mangga();
        madu.harga = 6500;
        madu.nama("Madu");
        madu.berat(0.375f);
        madu.beli(12);
        madu.totalBerat();
        madu.totalHarga();
    }
}
