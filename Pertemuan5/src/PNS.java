/* Nama File : PNS.java
 * Deskripsi : Subclass dari Manusia untuk semua jenis PNS yang mengimplementasikan Pajak
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 15/04/2026
    */

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    /*atribut */
    private String NIP;
    private static int counterPNS = 0;

    /*konstruktor */
    public PNS(String nama, int tahun, String alamat, double pendapatan, String NIP){
        super(nama, tahun, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    public PNS(String nama, int tahun, double pendapatan, String NIP){
        super(nama, tahun, "", pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    /*Selektor */
    // Selektor NIP
    public String getNIP() {
        return this.NIP;
    }

    // Selektor Static Counter
    public static int getCounterPNS() {
        return counterPNS;
    }

    /*Mutator */
    // Mutator NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    /*Implementasi Interface */
    //Menghitung Masa kerja
    @Override
    public int hitungMasaKerja() {
        return LocalDate.now().getYear() - tgl_mulai_kerja.getYear() + 8;
    }

    // Menghitung Pajak
    @Override
    public double hitungPajak() {
        return 0.1 * this.getPendapatan();
    };

    /*Method Output */
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP                 : " + NIP);
        System.out.println("Masa Kerja          : " + hitungMasaKerja());
        System.out.println("Pajak               : " + hitungPajak());
    }
}
