/* Nama File : Pegawai.java
 * Deskripsi : Superclass untuk semua jenis pegawai
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 29/03/2026
 */

public class Pegawai {
    /*Atribut */
    protected String nip;
    protected String nama;
    protected String tglLahir;
    protected String tmt;
    protected double gajiPokok;

    /*Konstruktor */
        //Konstruktor tanpa Parameter
    public Pegawai() {
        nip = "";
        nama = "";
        tglLahir = "";
        tmt = "";
        gajiPokok = 0;
    }

        //Konstruktor dengan Parameter
    public Pegawai(String nip, String nama, String tglLahir, String tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    /*Selektor */
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public String getTmt() {
        return tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    /*Mutator */
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public void setTmt(String tmt) {
        this.tmt = tmt;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /*Method hitung Masa Kerja */
    public int hitungMasaKerja() {
        return 0;
    }

    /*method hitung Tunjangan */
    public double hitungTunjangan() {
        return 0;
    }

    /* Method print info */
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT           : " + tmt);
        System.out.println("Gaji Pokok    : " + gajiPokok);
    }
}
