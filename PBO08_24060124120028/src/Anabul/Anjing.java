package Anabul;

public class Anjing extends Anabul {
    /* Atribut */

    /*Konstruktor */
        //Konstruktor tak berparameter
    Anjing() {
        super();
    }
    
        // Konstruktor berparameter
    Anjing(String Nama) {
        super(Nama);
    }

    /*Method Tambahan */
    @Override
    public void Gerak() {
        System.out.println("Anjing " + (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("guk-guk");
    }    
}
