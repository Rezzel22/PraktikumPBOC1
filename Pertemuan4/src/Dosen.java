/* Nama File : Dosen.java
 * Deskripsi : Subclass dari Pegawai untuk dosen
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 19/03/2026
 */

public class Dosen extends Pegawai {
    /*Atribut */
    protected String fakultas;

    /*Konstruktor */
        //Konstruktor tanpa parameter
    public Dosen() {
        super();
        fakultas = "";
    }

        //Konstruktor dengan parameter
    public Dosen(String nip, String nama, String tglLahir, String tmt, double gajiPokok, 
                 String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    /*Selektor */
    public String getFakultas() {
        return fakultas;
    }

    /*Mutator */
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    /*Method print info */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan     : Dosen");
        System.out.println("Fakultas    : " + fakultas);
    }
}
