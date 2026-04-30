package Coersion;

/* Nama File : PenjumlahantoInt.java
 * Deskripsi : method untuk penjumlahan dua objek String berisi angka bulat ke integer menggunakan Integer.parseInt().
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class PenjumlahantoInt {
    //method untuk konkat kedua variabel
    public static String konkat(String x, String y) {
        return x + y;
    }

    //method untuk menjumlahkan kedua input string dan menghasilkan output integer
    public static int penjumlahan(String x, String y) {
        return Integer.parseInt(x) + Integer.parseInt(y);
    }
}
