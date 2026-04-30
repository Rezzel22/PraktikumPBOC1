package Inclusion;

/* Nama File : Anjing.java
 * Deskripsi : Kelas anak dari Anabul yang merepresentasikan anjing.
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class Anjing extends Anabul {
    /* Atribut */
 
    /* Konstruktor */
 
    // Konstruktor tanpa parameter
    public Anjing() {
        super();
    }
 
    // Konstruktor dengan parameter nama
    public Anjing(String nama) {
        super(nama);
    }
 
    /* Method */
 
    // Override Gerak: anjing bergerak dengan melata
    @Override
    public void Gerak() {
        System.out.println("Anjing " + (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }
 
    // Override Bersuara: anjing bersuara guk-guk
    @Override
    public void Bersuara() {
        System.out.println("guk-guk");
    }
}
