/**
 *  NIM          : 13020240002 *  Nama         : Andi Muhammad Fadel *  Hari/Tanggal : Minggu/26 April 2026
 *  Waktu        : 17.05 */

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args){
        
        int pilih;
        double total=0;
        int qty;

        Scanner masukan = new Scanner(System.in);

        Buah[] katalog = new Buah[3];

        katalog[0] = new Buah("Apel       Rp", 15000, 10);
        katalog[1] = new Buah("Jeruk      Rp", 12000, 8);
        katalog[2] = new Buah("Mangga     Rp", 20000, 5);

        for (int i = 0; i < katalog.length; i++){
            System.out.println((i+1) + ", " + katalog[i].getInfo());
        }

        do{
        System.out.print("\nPilih (0=stop): ");
        pilih = masukan.nextInt();

        if(pilih == 0) break;

        System.out.print("Jumlah (kg): ");
        qty = masukan.nextInt();

        Buah b = katalog[pilih - 1];

        if (b.tersedia(qty)){
            double total2 = b.hitungTotal(qty);
            total += total2;

           System.out.printf("OK +Rp%.0f\n", total2);
        }else {
            System.out.println("Stok tidak cukup!");
        }


        }while(pilih != 0);
        System.out.printf("Total : Rp%.0f", total);
    }
}           