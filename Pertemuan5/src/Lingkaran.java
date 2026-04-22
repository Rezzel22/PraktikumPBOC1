/* Nama File : Lingkaran.java
 * Deskripsi : Subclass dari BangunDatar untuk semua jenis Lingkaran yang mengimplementasikan IResize
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 15/04/2026
 */


public class Lingkaran extends BangunDatar implements IResize{
    /*Atribut */
    private double jari;
    private static int counterLingkaran;

    /*Konstruktor */
    public Lingkaran(){
    super(1, "", "");
    counterLingkaran++;
    }

    /*Konstruktor dengan parameter */
    public Lingkaran(double jari, String warna, String border){
        super(1,warna,border);
        this.jari = jari;
        counterLingkaran++;
    }

    /*Selektor */
    public double getJari(){
        return jari;
    }

    /*Mutator */
    public void setJari(double jari){
        this.jari = jari;
    }

    /*Method Tambahan */
        //Override dari abstract class
    public double getLuas(){
        return Math.PI * (jari * jari);
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    /*Method implementasi Interface */
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

    /*Method untuk menampilkan Lingkaran */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari  : " + jari);
        System.out.println("Jumlah Lingkaran : "+ counterLingkaran);
    }
}