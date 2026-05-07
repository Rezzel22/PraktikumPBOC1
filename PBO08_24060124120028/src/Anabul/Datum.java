package Anabul;

public class Datum<G> {
    /* Atribut */
    private G isi;

    /*Konstruktor */
        // Konstruktor tak berparameter
    Datum() {    
        this.isi = null;
    }

        // Konstruktor berparameter
    Datum(G isi) {
        this.isi = isi;
    }

    /*Selektor */
    public G getIsi() {
        return this.isi;
    }

    /*Mutator */
    public void setIsi(G isibaru) {
        this.isi = isibaru;
    }

    public static void main(String args[]) {
        /* Kamus */
        Anabul a;
        Kucing k;
        Datum<Anabul> DA;
        Datum<Kucing> DK;

        /* Algoritma */
        a = new Anjing("Blacky");
        k = new Kucing("Mimi");
        a.Gerak(); a.Bersuara();
        k.Gerak(); k.Bersuara();

        DA = new Datum<>();
        DA.setIsi(a);
        DA.getIsi().Gerak(); DA.getIsi().Bersuara();
        
        DK = new Datum<>(k);
        DK.getIsi().Gerak(); DK.getIsi().Bersuara();
        
        DK.setIsi(new Anggora("wowo"));
        DK.getIsi().Gerak(); DK.getIsi().Bersuara();
        
        k = new Kembangtelon("wiwi");
        DK.setIsi(k);
        DK.getIsi().Gerak(); DK.getIsi().Bersuara();

        // DK.setIsi(new Anjing("Hachiko"))     (Gagal karena anjing bukan subclasnya kucing);

        DA.setIsi(k);
        DA.getIsi().Gerak(); DA.getIsi().Bersuara();
        
    }
}