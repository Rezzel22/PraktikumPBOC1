package Anabul;

public class OperatorGenerik {
    /* Atribut */
 

    /*Fungsi dan Prosedur tambahan */
        // Prosedur Generik menukar dua variabel
    public <G> void Tukar(Datum<G> a, Datum<G> b) {
        /* Kamus Lokal */
        G temp;
        /* Algoritma */
        temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
 
        // Fungsi Generik mengembalikan jumlah bobot dua keturunan Kucing
    public <G extends Kucing> int Bobot2(Datum<G> k1, Datum<G> k2) {
        return k1.getIsi().getBobot() + k2.getIsi().getBobot();
    }
 
    public static void main(String args[]) {
        /* Kamus */
        OperatorGenerik og;
        Datum<Integer> a, b;
        Datum<String> s1, s2;
        Datum<Anabul> da1, da2;
        Datum<Kucing> dk1, dk2;
 
        /*Algoritma */
 
        // Inisialisasi objek
        og = new OperatorGenerik();
 
        a = new Datum<>();
        a.setIsi(3);
        b = new Datum<>();
        b.setIsi(6);
 
        da1 = new Datum<>(new Anjing("Blacky"));
        da2 = new Datum<>(new Kucing("Mimi"));
 
        // --- Tukar sesama Integer (Point A) ---
        System.out.printf("Bilangan bulat a = %d dan bilangan bulat b = %d\n", a.getIsi(), b.getIsi());
        og.Tukar(a, b);
        System.out.printf("Bilangan bulat a = %d dan bilangan bulat b = %d\n", a.getIsi(), b.getIsi());
 
        // --- Tukar sesama String (Point B) ---
        s1 = new Datum<>();
        s1.setIsi("Halo");
        s2 = new Datum<>();
        s2.setIsi("Dunia");
        System.out.printf("String s1: %s, String s2: %s\n", s1.getIsi(), s2.getIsi());
        og.Tukar(s1, s2);
        System.out.printf("String s1: %s, String s2: %s\n", s1.getIsi(), s2.getIsi());
 
        // --- Tukar sesama keluarga Anabul (Point B) ---
        System.out.printf("da1 adalah %s dan da2 adalah %s.\n", da1.getIsi().getNama(), da2.getIsi().getNama());
        og.Tukar(da1, da2);
        System.out.printf("da1 adalah %s dan da2 adalah %s.\n", da1.getIsi().getNama(), da2.getIsi().getNama());
 
        // --- Fungsi Bobot2 dua keturunan Kucing (Point C) ---
        dk1 = new Datum<>();
        dk1.setIsi(new Anggora("Wowo", 4));
        System.out.printf("Anggora %s bobotnya adalah %d kg\n", dk1.getIsi().getNama(), dk1.getIsi().getBobot());
 
        dk2 = new Datum<>();
        dk2.setIsi(new Kembangtelon("Wiwi", 3));
        System.out.printf("Kembangtelon %s bobotnya adalah %d kg\n", dk2.getIsi().getNama(), dk2.getIsi().getBobot());
 
        System.out.printf("Total bobot keduanya : %d kg\n", og.Bobot2(dk1, dk2));
 
        // System.out.printf("Total berat: %d\n", og.bobot2(a1, a2)); 
        /*
            Kode di atas akan gagal karena da1 dan da2 merupakan Datum bertipe Anabul.
            Meski Kucing merupakan subclass dari Anabul, tapi cuman Kucing dan subclass-nya yang
            diperbolehkan sebagai masukan parameter fungsi.
        */
    }
}
