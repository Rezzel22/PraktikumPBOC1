/*Nama File     : MGaris.java
 *Deskripsi     : Berisi program utama untuk menguji class Garis
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 19/2/2026 */

public class MGaris {
    public static void main(String[] args) {

        // Membuat beberapa titik
        Titik T1 = new Titik(0, 0);
        Titik T2 = new Titik(4, 4);
        Titik T3 = new Titik(0, 4);
        Titik T4 = new Titik(4, 0);

        // Membuat garis
        Garis G1 = new Garis(T1, T2);
        Garis G2 = new Garis(T3, T4);

        // Print garis
        System.out.println("Garis 1:");
        G1.printGaris();
        System.out.println("Panjang G1 = " + G1.PanjangGaris());
        System.out.println("Gradien G1 = " + G1.getGradien());
        System.out.println("Titik Tengah G1:");
        G1.getTitikTengah().printTitik();
        System.out.println("Persamaan G1: " + G1.getPersamaanGaris());

        System.out.println("\nGaris 2:");
        G2.printGaris();
        System.out.println("Panjang G2 = " + G2.PanjangGaris());
        System.out.println("Gradien G2 = " + G2.getGradien());
        System.out.println("Titik Tengah G2:");
        G2.getTitikTengah().printTitik();
        System.out.println("Persamaan G2: " + G2.getPersamaanGaris());

        // Cek relasi antar garis
        System.out.println("\nApakah G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        // Counter objek
        System.out.println("\nJumlah Objek Garis = " + Garis.getCounterGaris());
    }
}