/* Nama File : BangunDatar.java
 * Deskripsi : Abstract class untuk semua jenis bangun datar
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 15/04/2026
 */

public abstract class BangunDatar {
    /*Atribut */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar; 

    /*Konstruktor */
        //Tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

        //Konstruktor Dengan Parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    
    /*Selektor */
    public int getJmlSisi(){
        return jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    /*Mutator */
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String Warna){
        this.warna = Warna;
    }

    public void setBorder(String Border){
        this.border = Border;
    }

    /*Method Tambahan */
        //Method abstract
    public abstract double getLuas();
    public abstract double getKeliling();

        //Method perbandingan
    public boolean IsEqualLuas(BangunDatar x){
        return this.getLuas() == x.getLuas();
    }

    public boolean IsEqualKeliling(BangunDatar x){
        return this.getKeliling() == x.getKeliling();
    }

    /*Method Menampilkan BangunDatar */
    public void printInfo(){
        System.out.println("Jumlah sisi : "+ jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : "+ border);
    }
    
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah BangunDatar : "+ counterBangunDatar);
    }
}