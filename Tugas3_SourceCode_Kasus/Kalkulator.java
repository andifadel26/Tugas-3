/**
 *  NIM          : 13020240002
 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Minggu/26 April 2026
 *  Waktu        : 15.35
 */

public class Kalkulator {

    private double angka1, angka2;
    private char operator;
    double hasil;

    public Kalkulator(double angka1, double angka2, char operator) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;

    }
    public void tampilHasil(){
        if(operator == '/' && angka2 == 0){
            System.out.println("Error: pembagian dengan nol!");
            System.out.printf("Hasil %.2f %c %,.2f = %.2f%n", angka1, operator, angka2, hasil);
        } else {
            System.out.printf("Hasil %.2f %c %,.2f = %.2f%n", angka1, operator, angka2, hasil);
        }
       
    }
    public double tambah(){
        hasil = angka1 + angka2;
        return hasil;
    }

    public double kurang(){
        hasil = angka1 - angka2;
        return hasil;
    }

    public double kali(){
        hasil = angka1 * angka2;
        return hasil;    
    }

    public double bagi(){
        if(angka2 == 0){
            return 0;
        }else{
        hasil = angka1 / angka2;
        return hasil;
        }
    }

}
