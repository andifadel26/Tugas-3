/**
 *  NIM          : 13020240002
 *  Nama         : Andi Muhammad Fadel *  Hari/Tanggal : Minggu/26 April 2026
 *  Waktu        : 18.15
 */

import java.util.Scanner;

public class Main4{
    public static void main(String [] args){

        long totalDetik;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        totalDetik = masukan.nextLong();

        KonversiWaktu kw = new KonversiWaktu(totalDetik);
        kw.konversi();
        kw.tampilkanWaktu();
    }
}