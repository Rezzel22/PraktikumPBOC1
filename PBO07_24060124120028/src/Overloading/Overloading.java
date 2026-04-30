package Overloading;

public class Overloading {
    /* Atribut */
 
    public static void main(String args[]) {
 
        /* Kamus */
        Mahasiswa MHS1, MHS2, MHS3;
 
        /* Algoritma */
 
        // Test Konstruktor tanpa parameter (c)
        MHS1 = new Mahasiswa();
        MHS1.printMhs();
 
        System.out.println();
 
        // Test Konstruktor dengan tiga parameter sesuai input (d)
        MHS2 = new Mahasiswa("24060124120028", "Rezzel", "Informatika");
        MHS2.printMhs();
 
        System.out.println();
 
        // Test Konstruktor dengan parameter objek Mahasiswa lain / kloning (e)
        MHS3 = new Mahasiswa(MHS2);
        MHS3.setProgramStudi("Ilmu komputer");
        MHS3.printMhs();
 
        System.out.println();
 
        // Test setProgramStudi varian 1: tanpa parameter -> "Kosong" (b-VA)
        MHS1.setProgramStudi();
        MHS1.printMhs();
 
        System.out.println();
 
        // Test setProgramStudi varian 2: satu parameter String -> "Ilmu Komputer" (b-VB)
        MHS1.setProgramStudi("Ilmu Komputer");
        MHS1.printMhs();
 
        System.out.println();
 
        // Test setProgramStudi varian 3: satu parameter objek Mahasiswa -> salin dari MHS2 (b-VC)
        MHS1.setProgramStudi(MHS2);
        MHS1.printMhs();
    }
}

