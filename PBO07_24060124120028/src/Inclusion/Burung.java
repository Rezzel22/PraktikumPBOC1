package Inclusion;

/* Nama File : Burung.java
 * Deskripsi : Kelas anak dari Anabul yang merepresentasikan burung.
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class Burung extends Anabul {
 
    /* Atribut */
 
    /* Konstruktor */
 
    // Konstruktor tanpa parameter
    public Burung() {
        super();
    }
 
    // Konstruktor dengan parameter nama
    public Burung(String nama) {
        super(nama);
    }
 
    /* Method */
 
    // Override Gerak: burung bergerak dengan terbang
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang.");
    }
 
    // Override Bersuara: burung berbunyi cuit
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara: cuit!");
    }
}