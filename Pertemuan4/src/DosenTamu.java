/* Nama File : DosenTamu.java
 * Deskripsi : Subclass dari Dosen untuk dosen tamu
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 19/03/2026
 */

public class DosenTamu extends Dosen{
    /* Atribut */
    private String nidk;
    private String tanggalBerakhirKontrak;

    /* Konstruktor */
        //Konstruktor tanpa parameter
    public DosenTamu() {
        super();
        nidk = "";
        tanggalBerakhirKontrak = "";
    }

        //Konstruktor dengan parameter
    public DosenTamu(String nip, String nama, String tglLahir, String tmt,
                     double gajiPokok, String fakultas,
                     String nidk, String tanggalBerakhirKontrak) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    /* Selektor */
    public String getNidk() {
        return nidk;
    }

    public String getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    /* Mutator */
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setTanggalBerakhirKontrak(String tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    /* Method hitung tunjangan */
    @Override
    public double hitungTunjangan() {
        // 2.5% × gaji pokok
        return 0.025 * gajiPokok;
    }

    /* Method print info */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("NIDK          : " + nidk);
        System.out.println("Akhir Kontrak : " + tanggalBerakhirKontrak);
        System.out.println("Tunjangan     : " + hitungTunjangan());
    }
}
