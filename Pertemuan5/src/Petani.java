/* Nama File : Petani.java
 * Deskripsi : Subclass dari Manusia untuk jenis Petani yang mengimplementasikan Pajak
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 15/04/2026
 */

import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
     /*atribut */
    private String asal_kota;
    private static int counterPetani = 0;

    /*konstruktor */
    public Petani(String nama, int tahun, String alamat, double pendapatan, String asal_kota){
        super(nama, tahun, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /*Selektor */
    // Selektor Asal Kota
    public String getAsalKota() {
        return this.asal_kota;
    }

    // Selektor Static Counter
    public static int getCounterPetani() {
        return counterPetani;
    }

    /*Mutator */
    // Mutator Asal Kota
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    /*Implementasi Interface */
    //Menghitung Masa kerja
    @Override
    public int hitungMasaKerja() {
        return LocalDate.now().getYear() - tgl_mulai_kerja.getYear() + 0;
    }

    // Menghitung Pajak
    @Override
    public double hitungPajak() {
        return 0;
    }

    /*Method Output */
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota           : " + asal_kota);
        System.out.println("Masa Kerja          : " + hitungMasaKerja());
        System.out.println("Pajak               : " + hitungPajak());
    }
}
