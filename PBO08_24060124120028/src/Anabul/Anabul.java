package Anabul;

/* Nama File : Anabul.java
 * Deskripsi : Kelas induk yang merepresentasikan hewan peliharaan 
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class Anabul {
 
    /* Atribut */
    private String nama;
 
    /* Konstruktor */
 
        // Konstruktor tanpa parameter
    public Anabul() {
        nama = "n/a";
    }
 
        //Konstruktor dengan parameter nama
    public Anabul(String nama) {
        this.nama = nama;
    }
 
    /* Selektor */
 
    // Fungsi untuk mengambil nama anabul
    public String getNama() {
        return nama;
    }
 
    /* Mutator */
 
    // Prosedeur untuk mengubah nama anabul
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    /* Fungsi dan prosedur Lainnya*/
 
    // Prosedur gerak, akan di-override oleh kelas anak
    public void Gerak() {
        System.out.println("Anabul " + (this.getNama() == "" ? "" : this.getNama() + " ") + "bergerak.");
    }
 
    // Prosedur bersuara, akan di-override oleh kelas anak
    public void Bersuara() {
        System.out.println( "Anabul bersuara.");
    }
}