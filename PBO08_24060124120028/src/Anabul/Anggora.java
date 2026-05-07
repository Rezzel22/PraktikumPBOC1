package Anabul;
/* Nama File : Anggora.java
 * Deskripsi : Polimorfisme universal tipe Generic 
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 5/5/2026
 */

public class Anggora extends Kucing {
    /* Atribut */

    /* Konstruktor */
    
    // Konstruktor tak berparameter
    Anggora() {
        super();
    }
    
    // Konstruktor berparameter
    Anggora(String Nama) {
        super(Nama);
    }

    // Konstruktor berparameter + bobot
    Anggora(String Nama, int bobot) {
        super(Nama, bobot);
    }

    /*Method Tambahan */
    @Override
    public void Gerak() {
        System.out.println("Anggora "+ (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}
