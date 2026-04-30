package Tugas;

/* Nama File : Mahasiswa.java
 * Deskripsi : Kelas anak dari CivitasAkademika yang merepresentasikan Mahasiswa.
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */

public class Mahasiswa extends CivitasAkademika {
    /* Atribut */
    private String NIM;
    private Dosen dosen_wali;

    /*Konstruktor */

    // Konstruktor
    Mahasiswa(String nama, String NIM) {
        super(nama);
        this.NIM = NIM;
    }
    
    // Konstruktor dengan Dosen Wali
    Mahasiswa(String nama, String NIM, Dosen dosen_wali) {
        super(nama);
        this.NIM = NIM;
        this.dosen_wali = dosen_wali;
    }
    
    // Getter Nomor (NIM)
    public String getNomor() {
        return this.NIM;
    }
    
    // Getter Dosen Wali
    public Dosen getDosenWali() {
        return this.dosen_wali;
    }
    
    // Point I (setWali)
    public void setDosenWali(Dosen dosen_wali) {
        this.dosen_wali = dosen_wali;
    }
    
    // Point J (tampilDataMahasiswa)
    public void tampilDataMahasiswa() {
        System.out.println("========== Data Mahasiswa ==========");
        System.out.printf("NIM\t\t: %s\n", this.getNomor());
        System.out.printf("Nama\t\t: %s\n", this.getNama());
        System.out.printf("Dosen Wali\t: %s\n", this.getDosenWali().getNama());
        System.out.println("====================================");
    }
}