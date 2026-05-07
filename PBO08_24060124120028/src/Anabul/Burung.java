package Anabul;

public class Burung extends Anabul {
    /* Atribut */

    /* Methods */
    
    /*Konstruktor */
        //Konstruktor tak berparameter
    Burung() {
        super();
    }
    
        //Konstruktor berparameter
    Burung(String Nama) {
        super(Nama);
    }

    /*Method Tambahan */
    @Override
    public void Gerak() {
        System.out.println("Burung " + (this.getNama() == "" ? "" : this.getNama() + " ") + "terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println("cuit cuit");
    }    
}
