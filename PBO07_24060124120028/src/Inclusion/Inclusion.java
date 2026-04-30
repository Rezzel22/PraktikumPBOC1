package Inclusion;

/* Nama File : Inclusion.java
 * Deskripsi : Main class yang mensimulasikan Polimorfisme Inclusion
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class Inclusion {
    /* Atribut */
 
    /* Methods */
    public static void main(String args[]) {
 
        /* Kamus */
        Anabul A;
 
        /* Algoritma */
 
        // A bertipe Anabul, diisi objek Kucing (inclusion)
        System.out.println("===== Kucing =====");
        A = new Kucing("Mochi");
        A.Gerak();
        A.Bersuara();
 
        System.out.println();
 
        // A bertipe Anabul, diisi objek Anjing (inclusion)
        System.out.println("===== Anjing =====");
        A = new Anjing("Brownie");
        A.Gerak();
        A.Bersuara();
 
        System.out.println();
 
        // A bertipe Anabul, diisi objek Burung (inclusion)
        System.out.println("===== Burung =====");
        A = new Burung("Kiwi");
        A.Gerak();
        A.Bersuara();
    }
}
