/**
 *  NIM          : 13020240011
 *  Nama         : Ilham Khairudin Putra
 *  Hari/Tanggal : Minggu/19 April 2026
 *  Waktu        : 15.34
 */

public class Buah{

   private String nama;
   private int stok;
   private double harga;

   Buah(String nama, double harga, int stok){
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
   } 

    public String getInfo(){
        return nama + " Rp " + harga +" (stok: " + stok + "kg)";  
    }

    public double hitungTotal(int qty){
        return harga * qty;
    }

    public boolean tersedia(int qty){
        if (stok >= qty){
            stok -= qty;
            return true;
        }
        return false;
    }
}