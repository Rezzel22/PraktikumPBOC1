package Piaraan;

public class Kembangtelon extends Kucing {
    /* Atribut */

    /*Konstruktor*/
        // Konstruktor tak berparameter
    Kembangtelon() {
        super();
    }
    
        // Konstruktor berparameter
    Kembangtelon(String Nama) {
        super(Nama);
    }

        // Konstruktor berparameter + bobot
    Kembangtelon(String Nama, int bobot) {
        super(Nama, bobot);
    }

    /*Method Lainnya */
    @Override
    public void Gerak() {
        System.out.println("Kembangtelon "+ (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}
