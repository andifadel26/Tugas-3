/**
 *  NIM          : 13020240002
 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Minggu/26 April 2026
 *  Waktu        : 15.20 */

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