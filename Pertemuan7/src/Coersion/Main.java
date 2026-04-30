package Coersion;

/* Nama File : Main.java
 * Deskripsi : Main class yang merealisasikan konsep Polimorfisme Ad Hoc Coercion,
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
*/

public class Main {
    public static void main(String[] args) {
        //a
        System.out.println("===== A. Ilustrasi Polimorfisme Ad Hoc Coersion =====");
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;
        String nilaiString = Integer.toString(nilaiInt);
 
        System.out.println("Sebagai integer  : " + nilaiInt);
        System.out.println("Sebagai karakter : " + nilaiChar);
        System.out.println("Sebagai real     : " + nilaiDouble);
        System.out.println("Sebagai String   : " + nilaiString);

        //b
        System.out.println("\n===== B. Real dikembalikan ke Integer =====");
        int hasilB = RealtoInteger.toInt(nilaiDouble);
        System.out.println("Nilai real    : " + nilaiDouble);
        System.out.println("Nilai integer : " + hasilB);

        //c
        System.out.println("\n===== C. String X & Y -> Konkat di S dan penjumlahan di Z =====");
        String X = "1234";
        String Y = "5678";
        String S = PenjumlahantoInt.konkat(X, Y);
        int Z = PenjumlahantoInt.penjumlahan(X, Y);
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("S (konkat) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);

        //d
        System.out.println("\n===== D. String P & Q -> Konkatenasi R dan Penjumlahan D =====");
        String P = "12.34";
        String Q = "56.78";
        String R = PenjumlahantoReal.konkat(P, Q);
        double D = PenjumlahantoReal.penjumlahan(P, Q);
        System.out.println("P = " + P);
        System.out.println("Q = " + Q);
        System.out.println("R (konkat) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        //e
        System.out.println("\n===== E. Integer A dari nilai S =====");
        Integer A = HasilKonversiA.hasilKon(S);
        System.out.println("S = " + S);
        System.out.println("A = " + A);

        //f
        System.out.println("\n===== F. String T dari nilai A =====");
        String T = HasilKonversiT.hasilKon(A);
        System.out.println("A = " + A);
        System.out.println("T = " + T);
    }
}
