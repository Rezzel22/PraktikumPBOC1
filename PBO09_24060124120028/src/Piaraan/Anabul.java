package Piaraan;

/* Nama File : Anabul.java
 * Deskripsi : Kelas induk yang merepresentasikan hewan peliharaan 
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class Anabul {
 
    /* Atribut */
    private String nama;
    private String Panggilan;

    /* Konstruktor */
 
    // Konstruktor tanpa parameter
    public Anabul() {
        nama = "n/a";
        Panggilan = "n/a";
    }
 
    //Konstruktor dengan parameter nama
    public Anabul(String panggilan) {
        this.Panggilan = panggilan;
    }
 
    /* Selektor */
 
    // Method untuk mengambil Panggilan anabul
    public String getPanggilan() {
        return Panggilan;
    }

    // Method untuk mengambil nama anabul
    public String getNama() {
        return nama;
    }

    /* Mutator */
 
    // Method untuk mengubah Panggilan anabul
    public void setPanggilan(String panggilan) {
        Panggilan = panggilan;
    }
    
    // Method untuk mengubah nama anabul
    public void setNama(String nama) {
        this.nama = nama;
    }

    /* Method */
 
    // Method gerak, akan di-override oleh kelas anak
    public void Gerak() {
        System.out.println("Anabul " + (this.getPanggilan() == "" ? "" : this.getPanggilan() + " ") + "bergerak.");
    }
 
    // Method bersuara, akan di-override oleh kelas anak
    public void Bersuara() {
        System.out.println( "Anabul bersuara.");
    }
}