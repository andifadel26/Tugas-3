/**
 *  NIM          : 13020240011
 *  Nama         : Ilham Khairudin Putra
 *  Hari/Tanggal : Sabtu/18 April 2026
 *  Waktu        : 23.56
 */

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        char lagi;
        Scanner masukan = new Scanner(System.in);


        do{
            System.out.print("\nAngka 1    : ");
            double angka1 = masukan.nextDouble();

            System.out.print("Angka 2    : ");
            double angka2 = masukan.nextDouble();

            System.out.print("Operator   : ");
            char operator = masukan.next().charAt(0);

        Kalkulator k = new Kalkulator(angka1,angka2,operator);
        switch (operator) {
            case '+':
                k.tambah();
                break;
            case '-':
                k.kurang();
                break;
            case '*':
                k.kali();
                break;
            case '/':
                k.bagi();
                break;
        }

        k.tampilHasil();

        System.out.print("\nHitung lagi? (y/n): ");
        lagi = masukan.next().charAt(0);
        if (lagi != 'y'){
            System.out.println("\nProgram selesai. ");
        }
        }while (lagi == 'y');

    }
}