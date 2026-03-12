public class BangunDatar {
    /*Atribut */
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar; 

    /*Konstruktor */
    public BangunDatar(){
        counterBangunDatar++;
    }

    //Konstruktor untuk Bagian 2
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