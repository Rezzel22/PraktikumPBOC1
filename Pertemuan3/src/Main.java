/*Nama File     : Main.java
 *Deskripsi     : Program utama untuk mengimplementasikan class Mahasiswa, Dosen, dan MataKuliah
 *Pembuat       : Imam Alfarezel (24060124120028)
 *Tanggal       : 05/03/2026
 *Lab           : C1 */

public class Main {
    public static void main(String[] args) {
        /*** IMPLEMENTASI CLASS DOSEN ***/
        System.out.println("===== IMPLEMENTASI CLASS DOSEN =====" );

        /* IMPLEMENTASI KONSTRUKTOR */
        // Konstruktor dengan parameter
        Dosen dos1 = new Dosen("1980010 ", "Khadijah, S.Kom, M.Cs ", "Informatika ");

        // Konstruktor tanpa parameter
        Dosen dos2 = new Dosen();

        /* IMPLEMENTASI MUTATOR */
        dos2.setNip("19770707 ");
        dos2.setNama("Joko, S.S ");
        dos2.setProdi("Sastra Indonesia ");

        /* IMPLEMENTASI SELEKTOR */
        System.out.println("=== DATA DOSEN 1 ===");
        System.out.println("NIP   : " + dos1.getNip());
        System.out.println("Nama  : " + dos1.getNamaDosen());
        System.out.println("Prodi : " + dos1.getProdi());

        System.out.println();

        System.out.println("=== DATA DOSEN 2 ===");
        System.out.println("NIP   : " + dos2.getNip());
        System.out.println("Nama  : " + dos2.getNamaDosen());
        System.out.println("Prodi : " + dos2.getProdi());

        /* IMPLEMENTASI METHOD OUTPUT */
        System.out.println("\n=== METHOD MENAMPILKAN DATA DOSEN ===");
        dos1.printDosen();
        dos2.printDosen();

        /* IMPLEMENTASI COUNTER STATIC */
        System.out.println("\nJumlah objek dosen : " + Dosen.getCounterDosen());


        /*** IMPLEMENTASI CLASS Kendaraan ***/
        System.out.println("\n===== IMPLEMENTASI CLASS KENDARAAN =====" );
        /* IMPLEMENTASI KONSTRUKTOR */
        // Motor
        Kendaraan motor = new Kendaraan(" H 1212 IV", " Sepeda Motor");

        // Mobil
        Kendaraan mobil = new Kendaraan();

        /* IMPLEMENTASI MUTATOR */
        mobil.setNoPlat(" H 9876 CD");
        mobil.setJenis(" Mobil");

        /* IMPLEMENTASI SELEKTOR */
        System.out.println("=== DATA KENDARAAN 1===");
        System.out.println("Nomor Plat : " + motor.getNoPlat());
        System.out.println("Jenis      : " + motor.getJenis());

        System.out.println();

        System.out.println("=== DATA Kendaraan 2 ===");
        System.out.println("Nomor Plat : " + mobil.getNoPlat());
        System.out.println("Jenis      : " + mobil.getJenis());

        /* IMPLEMENTASI METHOD OUTPUT */
        System.out.println("\n=== METHOD MENAMPILKAN DATA KENDARAAN ===");
        motor.printKendaraan();
        mobil.printKendaraan();


        /*** IMPLEMENTASI CLASS MATAKULIAH ***/
        System.out.println("\n===== IMPLEMENTASI CLASS MATAKULIAH =====" );
        /* IMPLEMENTASI KONSTRUKTOR */
        // Mata kuliah PBO
        MataKuliah matkul1 = new MataKuliah("IF302 ", "PBO ", 3);

        // Mata kuliah MBD
        MataKuliah matkul2 = new MataKuliah("IF301 ", "MBD ", 3);

        // Mata Kuliah Kosong (ASA)
        MataKuliah matkul3 = new MataKuliah();

        /* IMPLEMENTASI MUTATOR */
        matkul3.setIdMatkul("IF201 ");
        matkul3.setNama("ASA ");
        matkul3.setSks(3);

        /* IMPLEMENTASI SELEKTOR */
        System.out.println("=== DATA MATA KULIAH 1 ===");
        System.out.println("ID   : " + matkul1.getIdMatkul());
        System.out.println("Nama : " + matkul1.getNamaMatkul());
        System.out.println("SKS  : " + matkul1.getSks());

        System.out.println();

        System.out.println("=== DATA MATA KULIAH 2 ===");
        System.out.println("ID   : " + matkul2.getIdMatkul());
        System.out.println("Nama : " + matkul2.getNamaMatkul());
        System.out.println("SKS  : " + matkul2.getSks());

        System.out.println();

        System.out.println("=== DATA MATA KULIAH 3 ===");
        System.out.println("ID   : " + matkul3.getIdMatkul());
        System.out.println("Nama : " + matkul3.getNamaMatkul());
        System.out.println("SKS  : " + matkul3.getSks());

        /* IMPLEMENTASI METHOD OUTPUT */
        System.out.println("\n=== METHOD MENAMPILKAN DATA MATA KULIAH ===");
        matkul1.printMataKuliah();
        matkul2.printMataKuliah();
        matkul3.printMataKuliah();


        /*** IMPLEMENTASI CLASS MAHASISWA ***/
        System.out.println("\n===== IMPLEMENTASI CLASS MAHASISWA =====" );
        /*IMPLEMENTASI KONSTRUKTOR*/
        Dosen d1 = new Dosen("1980010 ", "Khadijah, S.kom, M.cs ", "Informatika");
        Dosen d2 = new Dosen();
        MataKuliah mk1 = new MataKuliah("iF302", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("IF301", "MBD", 3);
        Kendaraan k1 = new Kendaraan("H 1212 IV","Sepeda Motor");
        Mahasiswa m1 = new Mahasiswa("Imam Alfarezel", "24060124120028", "Informatika");
            //Untuk Kontruktor 0 Parameter
        Mahasiswa m2 = new Mahasiswa();
        
        /*IMPLEMENTASI MUTATOR*/
        //Menetapkan nama
        m2.setNama("Rezzel_");

        //Menetapkan nim
        m2.setNim("24060124120028");

        // Mentapkan jurusan
        m2.setJurusan("(Teknik) Informatika");

        // Menetapkan dosen wali
            //Untuk m2
        d2.setNama("Joko Wdd , S.S");
        d2.setNip("H 6767 CD");
        d2.setProdi("(Teknik) Informatika");
        m2.setDosenWali(d2);
            //Untuk m1
        m1.setDosenWali(d1);
    
        /*IMPLEMENTASI SELEKTOR*/
        System.out.println("=== IMPLEMENTASI UNTUK M2 === \n");
        System.out.println("Detail Mahasiswa:");
        System.out.println("Nama Mahasiswa      : " + m2.getNama());
        System.out.println("NIM Mahasiswa       : " + m2.getNim());
        System.out.println("Jurusan             : " + m2.getJurusan());
        System.out.println("Dosen Wali          : " + m2.getDosenWali().getNamaDosen()+"\n");

        /*IMPLEMENTASI METHOD TAMBAHAN*/
        // Menambahkan mata kuliah ke mahasiswa m1
        m1.tambahMatkul(mk1);
        m1.tambahMatkul(mk2);

        // Menambahkan kendaraan ke mahasiswa m1
        m1.tambahKendaraan(k1);

        /*IMPLEMENTASI METHOD OUTPUT*/
        System.out.println("=== IMPLEMENTASI UNTUK M1 ===");
        System.out.println("\nDetail Mahasiswa:");
        //Menampilkan detail dari data mahasiswa termasuk dosen wali dan kendaraan
        m1.printDetail();
    }
}