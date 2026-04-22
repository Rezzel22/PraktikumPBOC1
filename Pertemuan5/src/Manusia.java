/* Nama File : Manusia.java
 * Deskripsi : Abstract class untuk semua jenis Manusia
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 15/04/2026
 */

import java.time.*;

public abstract class Manusia {
    /*atribut */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    /*Konstruktor */
        //konstruktor tanpa parameter
    public Manusia(){
        counterMns ++;
    }

        //kontruktor dengan parameter
    public Manusia(String nama, int tahun, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.of(tahun, 1, 1);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /*Selektor */
    // Selektor Nama
    public String getNama(){
        return nama;
    }

    //Selektoy Tanggal Mulai kerja
    public LocalDate getTglMulaiKerja(){
        return tgl_mulai_kerja;
    }

    //Selektor Alamat
    public String getAlamat(){
        return alamat;
    }

    //Selektor Pendapatan
    public double getPendapatan(){
        return pendapatan;
    }

    //Selektor Conter Manusia
    public static int getCounterMns(){
        return counterMns;
    }
    /*Mutator */

    //Mutator Nama
    public void setNama(String nama ){
        this.nama = nama;
    }

    //Mutator Tanggal Mulai Kerja
    public void setTglMulaiKerja(LocalDate tglMulaiKerja){
        this.tgl_mulai_kerja = tglMulaiKerja;
    }

    //Mutator Alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //Mutator Pendapatan
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    /*Method Output */
    public void cetakInfo(){
        System.out.println("Nama                 : " + nama);
        System.out.println("Tanggal Mulai Kerja  : " + this.tgl_mulai_kerja.toString());
        System.out.println("Alamat               : " + alamat);
        System.out.println("Pendapatan           : " + pendapatan);
    }
}
