/*Nama File     : Mpegawai.java
 *Deskripsi     : Program utama untuk mengimplementasikan class Pegawai, Dosen, Tendik, DosenTetap, dan DosenTamu
 *Pembuat       : Imam Alfarezel
 *Tanggal       : 19/03/2026
 *Lab           : C1 */

public class Mpegawai {
    public static void main(String[] args) {

        /*** IMPLEMENTASI CLASS PEGAWAI ***/
        System.out.println("===== IMPLEMENTASI CLASS PEGAWAI =====");

        // Konstruktor
        Pegawai p1 = new Pegawai("123", "Budi", "01-01-1980", "01-01-2010", 5000000);
        Pegawai p2 = new Pegawai();

        // Mutator
        p2.setNip("456");
        p2.setNama("Andi");
        p2.setTglLahir("02-02-1985");
        p2.setTmt("01-01-2015");
        p2.setGajiPokok(4500000);

        // Selektor
        System.out.println("=== DATA PEGAWAI 1 ===");
        System.out.println("NIP   : " + p1.getNip());
        System.out.println("Nama  : " + p1.getNama());

        System.out.println();

        System.out.println("=== DATA PEGAWAI 2 ===");
        System.out.println("NIP   : " + p2.getNip());
        System.out.println("Nama  : " + p2.getNama());

        // Output
        System.out.println("\n=== METHOD PRINT PEGAWAI ===");
        p1.printInfo();
        p2.printInfo();


        /*** IMPLEMENTASI CLASS TENDIK ***/
        System.out.println("\n===== IMPLEMENTASI CLASS TENDIK =====");

        Tendik t1 = new Tendik("789", "Siti", "03-03-1990", "01-01-2018", 4000000, "Akademik");
        Tendik t2 = new Tendik();

        t2.setNama("Rina");
        t2.setBidang("Keuangan");

        System.out.println("=== DATA TENDIK 1 ===");
        t1.printInfo();

        System.out.println("\n=== DATA TENDIK 2 ===");
        t2.printInfo();


        /*** IMPLEMENTASI CLASS DOSEN ***/
        System.out.println("\n===== IMPLEMENTASI CLASS DOSEN =====");

        Dosen d1 = new Dosen("111", "Muliyo,S.SR", "04-04-1975", "01-01-2005", 7000000, "Informatika");
        Dosen d2 = new Dosen();

        d2.setNama("Muliyo,S.SR");
        d2.setFakultas("(Teknik) Informatika");

        System.out.println("=== DATA DOSEN 1 ===");
        d1.printInfo();

        System.out.println("\n=== DATA DOSEN 2 ===");
        d2.printInfo();


        /*** IMPLEMENTASI CLASS DOSEN TETAP ***/
        System.out.println("\n===== IMPLEMENTASI CLASS DOSEN TETAP =====");

        DosenTetap dt1 = new DosenTetap("222", "Prof. Aimar, M.PL", "05-05-1970", "01-01-2000",
                                        8000000, "Informatika", "NIDN001");

        DosenTetap dt2 = new DosenTetap();
        dt2.setNama("Prof. Lina");
        dt2.setNidn("NIDN002");

        System.out.println("=== DATA DOSEN TETAP 1 ===");
        dt1.printInfo();

        System.out.println("\n=== DATA DOSEN TETAP 2 ===");
        dt2.printInfo();


        /*** IMPLEMENTASI CLASS DOSEN TAMU ***/
        System.out.println("\n===== IMPLEMENTASI CLASS DOSEN TAMU =====");

        DosenTamu dtt1 = new DosenTamu("333", "Dr. John Kaisen, M.Cs", "06-06-1980", "01-01-2020",
                                       6000000, "Informatika", "NIDK001", "01-01-2027");

        DosenTamu dtt2 = new DosenTamu();
        dtt2.setNama("Dr. Leon K");
        dtt2.setNidk("NIDK002");
        dtt2.setTanggalBerakhirKontrak("01-01-2026");

        System.out.println("=== DATA DOSEN TAMU 1 ===");
        dtt1.printInfo();

        System.out.println("\n=== DATA DOSEN TAMU 2 ===");
        dtt2.printInfo();


        /*** IMPLEMENTASI METHOD TAMBAHAN ***/
        System.out.println("\n===== IMPLEMENTASI METHOD TAMBAHAN =====");

        System.out.println("Masa Kerja Dosen Tetap : " + dt1.hitungMasaKerja());
        System.out.println("Tunjangan Dosen Tetap  : " + dt1.hitungTunjangan());

        System.out.println("Tunjangan Dosen Tamu   : " + dtt1.hitungTunjangan());
    }
}