public class Persegi extends BangunDatar{
    /*Atribut */
    private double sisi;
    private static int counterPersegi;

    /*Konstruktor */
    public Persegi(){
        setJmlSisi(4);
        counterPersegi++;
    }

    //Kontruktor Bagian 2
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

    /*Method untuk menampilkan Persegi */
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Jumlah Persegi : "+ counterPersegi);
    }
}