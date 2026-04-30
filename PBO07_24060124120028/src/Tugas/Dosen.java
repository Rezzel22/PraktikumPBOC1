package Tugas;

/* Nama File : Dosen.java
 * Deskripsi : Kelas anak dari CivitasAkademika yang merepresentasikan Dosen.
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class Dosen extends CivitasAkademika {
    /* Atribut */
    private String NIP;

    /*Konstruktor */
    // Konstruktor
    Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }
    
    // Getter Nomor (NIP)
    public String getNomor() {
        return this.NIP;
    }
}
