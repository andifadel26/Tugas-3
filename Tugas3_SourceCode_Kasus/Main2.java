/**
 *  NIM          : 13020240011
 *  Nama         : Ilham Khairudin Putra
 *  Hari/Tanggal : Minggu/19 April 2026
 *  Waktu        : 02.17
 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner masukan = new Scanner(System.in);

        System.out.print("Nama  : ");
        String nama = masukan.nextLine();

        System.out.print("NIM   : ");
        String nim = masukan.nextLine();

        System.out.print("Jml MK: ");
        int jumlahMK = masukan.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jumlahMK);
        
        mhs.inputNilai(); 
        mhs.tampilRapor();

        System.out.printf("Rata   : %.2f%n", mhs.hitungRataRata());
        System.out.println("Grade  : " + mhs.tentukanGrade());
        System.out.println("Lulus  : " + mhs.lulus());
    }
}