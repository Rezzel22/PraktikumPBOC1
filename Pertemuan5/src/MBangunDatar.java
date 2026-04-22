public class MBangunDatar {
    public static void main(String[] args) {

        /*=== Membuat Objek ===*/
        //Error BangunDatar itu Abstract gabisa di inisiallisasi
        /*BangunDatar B1 = new BangunDatar();*/

        BangunDatar P1 = new Persegi(10,"","");
        Persegi P2 = new Persegi(5,"","");
        BangunDatar L1 = new Lingkaran(7,"","");
        Lingkaran L2 = new Lingkaran(14,"","");
        Persegi P3 = new Persegi(10,"Merah","Hitam");
        Lingkaran L3 = new Lingkaran(7,"Biru","Putih");


        /* Pemanggilan method */
        System.out.println("Luas P1 : " + P1.getLuas());
        System.out.println("Keliling P2 : " + P2.getKeliling());
        System.out.println("Luas L1 : " + L1.getLuas());

        /*perbandingan  */
        //Sesama Persegi
        System.out.println("P1 vs P2 (Luas)      : " + P1.IsEqualLuas(P2));
        System.out.println("P1 vs P2 (Keliling) : " + P1.IsEqualKeliling(P2));

        //Sesama Lingkaran
        System.out.println("L1 vs L2 (Luas)      : " + L1.IsEqualLuas(L2));
        System.out.println("L1 vs L2 (Keliling) : " + L1.IsEqualKeliling(L2));

        //Beda jenis bangun datar
        System.out.println("P1 vs L1 (Luas)      : " + P1.IsEqualLuas(L1));
        System.out.println("P1 vs L1 (Keliling) : " + P1.IsEqualKeliling(L1));

        /*Implementasi INterface */
        // Sebelum Resize
        System.out.println("\n=== SEBELUM RESIZE ===");
        P3.printInfo();
        System.out.println("\n");
        L3.printInfo();

        System.out.println("\n=== SETELAH ZOOM IN ===");
        P3.printInfo();
        System.out.println("\n");
        L3.printInfo();

        // zoomOut
        P3.zoomOut();
        L3.zoomOut();

        System.out.println("\n=== SETELAH ZOOM OUT ===");
        P3.printInfo();
        System.out.println("\n");
        L3.printInfo();

        // zoom percent
        P3.zoom(50);
        L3.zoom(100);

        System.out.println("\n=== SETELAH ZOOM ===");
        P3.printInfo();
        System.out.println("\n");
        L3.printInfo();

    }
}
