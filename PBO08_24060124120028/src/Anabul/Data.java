package Anabul;
 
/* Nama File : Data.java
 * Deskripsi : Polimorfisme Universal tipe Generik (Larik Generik)
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 07/05/2026
 */

public class Data<G> {
    /* Atribut */
 
    private G[] ruang = (G[]) new Object[100];
    private int efektif = 0;
 
    /* Methods */
 
    // Fungsi getIsi mengembalikan elemen pada posisi idx
    public G getIsi(int idx) {
        return this.ruang[idx];
    }
 
    // Fungsi getSize mengembalikan banyak elemen efektif
    public int getSize() {
        return this.efektif;
    }
 
    // Prosedur setIsi mengisi elemen pada posisi idx
    public void setIsi(int idx, G isi) {
        if (idx <= this.efektif) {
            this.ruang[idx] = isi;
            if (idx == this.efektif) {
                this.efektif++;
            }
        }
    }
 
    // Prosedur printData mencetak semua elemen efektif
    public void printData() {
        /* Kamus Lokal */
        int i;
        G place;
        /* Algoritma */
        System.out.printf("[ ");
        for (i = 0; i < this.efektif; i++) {
            place = this.ruang[i];
            System.out.printf("%s ", place.getClass().getSimpleName());
        }
        System.out.printf("]\n");
    }
 
    // Main
    public static void main(String args[]) {
        /* Kamus */
        Data<Anabul> D;
        Anabul A;
 
        /* Algoritma */
        D = new Data<>();
        D.printData();
 
        A = new Kucing("Mimi");
        System.out.println("Ukuran Data: " + D.getSize());
 
        D.setIsi(1, A);
        D.printData(); // Mimi belum masuk, karena idx = 1 belum efektif
        System.out.println("Ukuran Data: " + D.getSize());
 
        D.setIsi(0, A);
        D.printData();
        System.out.println("Ukuran Data: " + D.getSize());
 
        A = new Kembangtelon();
        D.setIsi(1, A);
 
        A = new Anjing();
        D.setIsi(2, A);
 
        D.printData();
        System.out.println("Ukuran Data: " + D.getSize());
    }
}