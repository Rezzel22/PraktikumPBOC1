package Piaraan;

/* Nama File : Piaraan.java
 * Deskripsi : Kelas koleksi yang mengoleksi objek generik
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 07/05/2026
 */


// import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    /*atribut */
    private int NbElm = 0;
    private Queue<Anabul> Lanabul;
    
    /*Konstruktor */

    //Kontruktor tanpa parameter
    Piaraan() {
        this.NbElm = 0;
        this.Lanabul = new LinkedList<>();
    }

    /*Selektor */

    public int getNbElm() {
        return this.NbElm;
    }

    public void enqueueAnabul(Anabul anabul) {
       Lanabul.add(anabul);
       NbElm++;
    }

    // Mengembalikan elemen terdepan dari Antrian
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    /*Mutator */

    /*Method Tamnbahan */

    //Memeriksa apakah anabul input merupakan anggota dari Anabul
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    //Menghapus dan mengembalikan elemen terdepan dari Queue
    public Anabul dequeueAnabul() {
        Anabul tempAnabul = Lanabul.poll();
        if(tempAnabul != null){
            NbElm--;
        }
        return tempAnabul;
    }

    // Count Anabul yang merupakan Kucing
    public int countKucing() {
        /* Kamus Lokal */
        int count;

        /* Algoritma */
        count = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    //Count Bobot Anabul yang merupakan Kucing
    public int bobotKucing() {
        /* Kamus Lokal */
        int BT;

        /* Algoritma */
        BT = 0;

        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                BT = BT + ((Kucing)a).getBobot();
            }
        }

        return BT;
    }

    //Menampilkan Anabul
    public void showJenisAnabul() {
        int k = 1;
        for (Anabul a : Lanabul ) {
            System.out.printf(k + ". "+ a.getClass()+ " | " + a.getNama());
            k++;
        }
    }

}
