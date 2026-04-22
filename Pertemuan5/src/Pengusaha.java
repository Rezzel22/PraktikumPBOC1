/* Nama File : Pengusaha.java
 * Deskripsi : Subclass dari Manusia untuk jenis Pengusaha yang mengimplementasikan Pajak
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 15/04/2026
*/

import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    /*atribut */
    private String npwp;
    private static int counterPengusaha = 0;

    /*konstruktor */
    public Pengusaha(String nama, int tahun, String alamat, double pendapatan, String npwp){
        super(nama, tahun, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /*Selektor */
    // Selektor NPWP
    public String getNpwp() {
        return this.npwp;
    }

    // Selektor Static Counter
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    /*Mutator */
    // Mutator NPWP
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    /*Implementasi Interface */
    //Menghitung Masa kerja
    @Override
    public int hitungMasaKerja() {
        return LocalDate.now().getYear() - tgl_mulai_kerja.getYear() + 2;
    }

    // Menghitung Pajak
    @Override
    public double hitungPajak() {
        return 0.15 * this.getPendapatan();
    }

    /*Method Output */
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP                : " + npwp);
        System.out.println("Masa Kerja          : " + hitungMasaKerja());
        System.out.println("Pajak               : " + hitungPajak());
    }
}