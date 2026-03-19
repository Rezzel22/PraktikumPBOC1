/* Nama File : DosenTetap.java
 * Deskripsi : Subclass dari Dosen untuk dosen tetap
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 19/03/2026
 */

public class DosenTetap extends Dosen{
    /* Atribut */
    private String nidn;

    /*Konstruktor */
        //Konstruktor tanpa paarmeter
    public DosenTetap() {
        super();
        nidn = "";
    }

        //Konstruktor dengan parameter
    public DosenTetap(String nip, String nama, String tglLahir, String tmt, 
                      double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    /*Selektor */
    public String getNidn() {
        return nidn;
    }

    /*Mutator */
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    /*Method hitung tunjangan */
    @Override
    public double hitungTunjangan() {
        // 2% × masa kerja × gaji pokok
        return 0.02 * hitungMasaKerja() * gajiPokok;
    }

    /*Method BUP */
    public int getBUP() {
        return 65;
    }

    /*Method print info */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("NIDN          : " + nidn);
        System.out.println("BUP           : " + getBUP());
        System.out.println("Tunjangan     : " + hitungTunjangan());
    }
}
