public class MBangunDatar {
    public static void main(String[] args) {

        /* ================== BangunDatar ================== */
        System.out.println("Implementasi BangunDatar");
        System.out.println("==================");

        BangunDatar B1 = new BangunDatar();
        B1.setJmlSisi(5);
        B1.setWarna("Merah");
        B1.setBorder("Hitam");

        B1.printInfo();

        System.out.println("Jumlah sisi (getter) : " + B1.getJmlSisi());
        System.out.println("Warna (getter) : " + B1.getWarna());
        System.out.println("Border (getter) : " + B1.getBorder());

        BangunDatar.printCounterBangunDatar();

        System.out.println("==================");


        /* ================== Persegi ================== */
        System.out.println("Implementasi Persegi");
        System.out.println("==================");

        Persegi P1 = new Persegi();
        P1.setSisi(4);
        P1.setWarna("Biru");
        P1.setBorder("Putih");

        P1.printInfo();

        System.out.println("Sisi (getter) : " + P1.getSisi());

        Persegi P2 = new Persegi(6, "Hijau", "Kuning");
        P2.printInfo();

        BangunDatar.printCounterBangunDatar();

        System.out.println("==================");


        /* ================== Lingkaran ================== */
        System.out.println("Implementasi Lingkaran");
        System.out.println("==================");

        Lingkaran L1 = new Lingkaran();
        L1.setJari(7);
        L1.setWarna("Ungu");
        L1.setBorder("Hitam");

        L1.printInfo();

        System.out.println("Jari-jari (getter) : " + L1.getJari());

        Lingkaran L2 = new Lingkaran(10, "Merah", "Biru");
        L2.printInfo();

        BangunDatar.printCounterBangunDatar();

        System.out.println("==================");
    }
}