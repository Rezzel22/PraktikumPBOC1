package Overloading;

/* Nama File : Mahasiswa.java
 * Deskripsi : Class Mahasiswa dengan implementasi polimerfisme overloading
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 30/04/2026
 */
 
public class Mahasiswa {
 
    /* Atribut */
    private String nim;
    private String nama;
    private String programStudi;
 
    /* Konstruktor */
 
    // Konstruktor tanpa parameter, menghasilkan objek dengan nilai default
    public Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        programStudi = "n/a";
    }
 
    // Konstruktor dengan tiga parameter, menginisialisasi seluruh atribut
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }
 
    // Konstruktor dengan satu parameter objek Mahasiswa lain (kloning)
    public Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }
 
    /* Selektor */
 
    // Method untuk mengambil NIM mahasiswa
    public String getNim() {
        return nim;
    }
 
    // Method untuk mengambil nama mahasiswa
    public String getNama() {
        return nama;
    }
 
    // Method untuk mengambil program studi mahasiswa
    public String getProgramStudi() {
        return programStudi;
    }
 
    /* Mutator */
    // Method untuk mengubah NIM mahasiswa
    public void setNim(String nim) {
        this.nim = nim;
    }
 
    // Method untuk mengubah nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    // Operator setProgramStudi varian 1: tanpa parameter, mengisi "Kosong"
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }
 
    // Operator setProgramStudi varian 2: satu parameter string, mengisi sesuai input
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
 
    // Operator setProgramStudi varian 3: satu parameter objek Mahasiswa lain,
    // mengisi programStudi sama dengan programStudi objek masukan
    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.programStudi;
    }
 
    /* Method Tambahan */
 
    // Method untuk menampilkan seluruh informasi mahasiswa
    public void printMhs() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Program Studi: " + programStudi);
    }
}
