package Coersion;

/* Nama File : PenjumlahantoReal.java
 * Deskripsi : method untuk penjumlahan dua objek String berisi angka bulat ke Real (double) menggunakan Integer.parseDouble().
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class PenjumlahantoReal {
    //method untuk konkat kedua variabel
    public static String konkat(String x, String y) {
        return x + y;
    }
 
    //method untuk menjumlahkan kedua input string dan menghasilkan output real
    public static double penjumlahan(String p, String q) {
        return Double.parseDouble(p) + Double.parseDouble(q);
    }
}
