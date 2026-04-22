/* Nama File : Persegi.java
 * Deskripsi : Subclass dari BangunDatar untuk semua jenis Persegi yang mengimplementasikan IResize
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 15/04/2026
 */

public class Persegi extends BangunDatar implements IResize{
    /*Atribut */
    private double sisi;
    private static int counterPersegi;

    /*Konstruktor */
    public Persegi(){
        setJmlSisi(4);
        counterPersegi++;
    }

    //Kontruktor dengan parameter
    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
        counterPersegi++;
    }

    /*Selektor */
    public double getSisi(){
        return sisi;
    }

    /*Mutator */
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    /*Method Tambahan */
        //Override dari abstract class
    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    /*Method implementasi interface */
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/ 100;
    }

    /*Method untuk menampilkan Persegi */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Jumlah Persegi : "+ counterPersegi);
    }
}