/* Nama File : Tendik.java
 * Deskripsi : Subclass dari Pegawai untuk tenaga kependidikan
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 19/03/2026
 */

public class Tendik extends Pegawai {
    /*Atribut */
    private String bidang;

    /*Konstruktor */
        //Konstruktor tanpa parameter
    public Tendik() {
        super();
        bidang = "";
    }

        //Konstruktor dengan Parameter
    public Tendik(String nip, String nama, String tglLahir, String tmt, double gajiPokok, 
                  String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    /*Selektor */
    public String getBidang() {
        return bidang;
    }

    /*Mutator */
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    /*Method hitung tunjangan */
    @Override
    public double hitungTunjangan() {
        // 1% × masa kerja × gaji pokok
        return 0.01 * hitungMasaKerja() * gajiPokok;
    }

    /*Method print info */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan     : Tenaga Kependidikan");
        System.out.println("Bidang      : " + bidang);
        System.out.println("Tunjangan       : " + hitungTunjangan());
    }
}

