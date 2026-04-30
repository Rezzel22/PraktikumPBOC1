package Tugas;

/* Nama File : CivitasAkademika.java
 * Deskripsi : Kelas induk yang merealisasikan Polimorfisme tipe Inclusion
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public abstract class CivitasAkademika {
    /* Atribut */
    String nama;
    
    /* Methods */
    CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public abstract String getNomor();
}