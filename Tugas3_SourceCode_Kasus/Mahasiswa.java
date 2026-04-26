/**
 *  NIM          : 13020240002 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Minggu/26 April 2026
 *  Waktu        : 16.20
 */

import java.util.Scanner;

public class Mahasiswa {

    private String nama, nim;
    private int jumlahMK;
    private int nilai[];

    Scanner masukan = new Scanner(System.in);

    public Mahasiswa(String nama, String nim, int jumlahMK) {
        this.nama = nama;
        this.nim = nim;
        this.jumlahMK = jumlahMK;
        this.nilai = new int[jumlahMK];
    }

    public void tampilRapor(){
        System.out.println("\n=== RAPOR ===");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : ");
        for (int i = 0 ; i < jumlahMK; i++) {
            System.out.println("   MK-"+ (i+1) + " : " + nilai[i]);
        }
    }

    public void inputNilai(){
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nilai MK-"+ (i+1) + ": ");
            nilai[i] = masukan.nextInt();
        }
    }
    public double hitungRataRata(){
        int total = 0;
        for (int i = 0; i < jumlahMK; i++) {
            total += nilai[i];
        }
        return (double) total / jumlahMK;
    }

    public char tentukanGrade(){
        if(hitungRataRata() >= 85){
            return 'A';
        }else if(hitungRataRata() >= 75){
            return 'B';
        }else if(hitungRataRata() >= 60){
            return 'C';
        }else{
            return 'D';
        }  
    }

    public boolean lulus(){
        if(hitungRataRata() >= 60){
            return true;
        } else {
            return false;
        }
    }
    
}