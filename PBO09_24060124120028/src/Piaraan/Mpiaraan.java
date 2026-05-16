package Piaraan;

public class Mpiaraan {
    public static void main(String args[]) {
        /* Kamus */
        Piaraan P;
        Anabul dequeued;

        /* Algoritma */
        P = new Piaraan();
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Kucing("Scoobert", 67));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Anjing("Browny"));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Anggora("Poobert", 34));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Burung("Jade"));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Kembangtelon("Goobert", 23));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.enqueueAnabul(new Anjing("Blacky"));
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());

        P.showJenisAnabul();
        System.out.println("Ada " + P.countKucing() + " kucing dengan total bobot " + P.bobotKucing() + " kg");
        
        dequeued = P.dequeueAnabul();
        P.showJenisAnabul();
        System.out.println("Diambil " + dequeued.getClass().getSimpleName() + " " + dequeued.getNama() + " dari koleksi.");
        System.out.println("Anabul pada depan antrian saat ini adalah " + P.getAnabul().getNama());
        System.out.printf("Ada %d Anabul dalam antrian.\n", P.getNbElm());
    }
}
