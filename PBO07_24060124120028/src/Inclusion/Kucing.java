package Inclusion;

/* Nama File : Anjing.java
 * Deskripsi : Kelas anak dari Anabul yang merepresentasikan Kucing.
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class Kucing extends Anabul {
    /* Atribut */
 
    /* Konstruktor */
 
    // Konstruktor tanpa parameter
    public Kucing() {
        super();
    }
 
    // Konstruktor dengan parameter nama
    public Kucing(String nama) {
        super(nama);
    }
 
    /* Method */
 
    // Override Gerak: kucing bergerak dengan melata
    @Override
    public void Gerak() {
        System.out.println("Kucing " + (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }
 
    // Override Bersuara: kucing berbunyi meong
    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}