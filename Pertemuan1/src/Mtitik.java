/*Nama File     : Titik.java
 *Deskripsi     : Berisi atribut dan method dalam class titik
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 19/2/2026 */

public class Mtitik {
    public static void main(String[] args) {

        // Membuat objek titik T1 menggunakan konstruktor default
        Titik T1 = new Titik();

        // Mengatur nilai absis (x) dari titik menjadi 3
        T1.setabsis(3);

        // Mengatur nilai ordinat (y) dari titik menjadi 4
        T1.setordinat(4);

        // Menampilkan koordinat titik T1
        T1.printTitik();

        // Menggeser titik T1 sejauh 3 pada sumbu x dan 4 pada sumbu y
        T1.geser(3,4);

        // Menampilkan kembali posisi titik setelah digeser
        T1.printTitik();
    }
}