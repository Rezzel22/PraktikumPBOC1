/*Nama File     : Titik.java
 *Deskripsi     : Berisi atribut dan method dalam class titik
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 19/2/2026 */

public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(5);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
    }
}
