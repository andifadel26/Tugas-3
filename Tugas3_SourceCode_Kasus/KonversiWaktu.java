/**
 *  NIM          : 1302024002
 *  Nama         : Andi Muhammad Fadel
 *  Hari/Tanggal : Minggu/26 April 2026
 *  Waktu        : 16.10
 */

public class KonversiWaktu{

    private long totalDetik, detikSekarang, totalMenit;
    private long menitSekarang, totalJam, jamSekarang;

    public KonversiWaktu(long totalDetik){
        this.totalDetik = totalDetik;
    }

    public long detikSekarang(){
        detikSekarang = totalDetik % 60;
        return detikSekarang;
    }
    public long totalMenit(){
        totalMenit = totalDetik / 60;
        return totalMenit;
    }
    public long menitSekarang(){
        menitSekarang = totalMenit % 60;
        return menitSekarang;
    }
    public long totalJam(){
        totalJam = totalMenit / 60;
        return totalJam;
    }
    public long jamSekarang(){
        jamSekarang = totalJam % 24;
        return jamSekarang;
    }

    public void konversi(){
        detikSekarang();
        totalMenit();
        menitSekarang();
        totalJam();
        jamSekarang(); 
    }

    public void tampilkanWaktu(){
        System.out.println("\nTotal detik: "+ totalDetik);
        System.out.println("=================");
        System.out.printf("Waktu: %02d:%02d:%02d%n", jamSekarang, menitSekarang, detikSekarang );
        System.out.println("=================\n");

        System.out.println("Total Detik      : "+ totalDetik);
        System.out.println("detikSaat ini    : "+ detikSekarang);
        System.out.println("menitSaat ini    : "+ menitSekarang);
        System.out.println("jamSaat ini      : "+ jamSekarang);
    }
}