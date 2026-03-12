public class Lingkaran extends BangunDatar{
    /*Atribut */
    private double jari;
    private static int counterLingkaran;

    /*Konstruktor */
    public Lingkaran(){
        setJmlSisi(1);
        counterLingkaran++;
    }

    /*Konstruktor dengan parameter */
    public Lingkaran(double jari, String warna, String border){
        super(4,warna,border);
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

    /*Method untuk menampilkan Lingkaran */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari  : " + jari);
        System.out.println("Jumlah Persegi : "+ counterLingkaran);
    }
}
