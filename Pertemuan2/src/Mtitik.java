/*Nama File     : Mtitik.java
 *Deskripsi     : Program utama untuk menguji seluruh method pada class Titik
 *Pembuat       : Imam Alfarezel (24060124120028)
 *Tanggal       : 19/02/2026
 *Lab           : C1 */

public class Mtitik {
    public static void main(String[] args) {

        // Membuat objek titik
        Titik T1 = new Titik();
        Titik T2 = new Titik(3,4);

        System.out.println("Titik awal:");
        T1.printTitik();
        T2.printTitik();

        // Mengubah nilai titik dengan setter
        T1.setAbsis(2);
        T1.setOrdinat(5);

        System.out.println("\nSetelah setAbsis dan setOrdinat:");
        T1.printTitik();

        // Getter
        System.out.println("\nAbsis T1: " + T1.getAbsis());
        System.out.println("Ordinat T1: " + T1.getOrdinat());

        // Geser titik
        T1.geser(3,2);
        System.out.println("\nT1 setelah digeser (3,2):");
        T1.printTitik();

        // Kuadran
        System.out.println("\nKuadran T1: " + T1.getKuadran());

        // Jarak antar titik
        System.out.println("\nJarak T1 ke T2: " + T1.getJarak(T2));

        // Jarak ke pusat
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());

        // Refleksi terhadap sumbu X
        T1.refleksiX();
        System.out.println("\nT1 setelah refleksi terhadap sumbu X:");
        T1.printTitik();

        // Refleksi terhadap sumbu Y
        T1.refleksiY();
        System.out.println("\nT1 setelah refleksi terhadap sumbu Y:");
        T1.printTitik();

        // Membuat titik hasil refleksi (objek baru)
        Titik T3 = T2.getRefleksiX();
        System.out.println("\nRefleksi X dari T2:");
        T3.printTitik();

        Titik T4 = T2.getRefleksiY();
        System.out.println("Refleksi Y dari T2:");
        T4.printTitik();

        // Counter objek
        System.out.println("\nJumlah objek Titik = " + Titik.getCounterTitik());
    }
}