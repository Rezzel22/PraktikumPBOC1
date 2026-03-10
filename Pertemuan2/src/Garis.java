/*Nama File     : Garis.java
 *Deskripsi     : Berisi atribut dan method dalam class Garis
 *Pembuat       : Imam Alfarezel (24060124120028)
 *Tanggal       : 19/02/2026
 *Lab           : C1 */

public class Garis {
    /*Atribut */
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*Konstruktor */
    public Garis(){
        titikAwal = new Titik(0,0);
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    public Garis(Titik titikAwal , Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    /*Selektor */
    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    /*Mutator */
    public void setTitikAwal(Titik t){
        this.titikAwal = t;
    }

    public void setTitikAkhir(Titik t){
        this.titikAkhir = t;
    }

    /*Method Tambahan */

    // Method untuk mendapatkan jumlah objek garis yang telah dibuat
    public static int getCounterGaris(){
        return counterGaris;
    }

    // Method untuk menghitung panjang garis menggunakan jarak dua titik
    public double PanjangGaris(){
        return this.titikAwal.getJarak(titikAkhir);
    }

    // Method untuk menghitung gradien (kemiringan) garis
    public double getGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0){
            return Double.POSITIVE_INFINITY;
        }
        return (dy)/(dx);
    }

    // Method untuk mendapatkan titik tengah dari garis
    public Titik getTitikTengah(){
        double xTengah;
        double yTengah;

        xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
        yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat())/2;

        return new Titik(xTengah,yTengah);
    }

    // Method untuk mengecek apakah dua garis sejajar
    public boolean isSejajar(Garis G) {
        double dx1 = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy1 = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double dx2 = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();
        double dy2 = G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat();

        return dy1 * dx2 == dy2 * dx1;
    }

    // Method untuk mengecek apakah dua garis saling tegak lurus
    public boolean isTegakLurus(Garis G) {
        double dx1 = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy1 = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double dx2 = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();
        double dy2 = G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat();

        return dx1 * dx2 + dy1 * dy2 == 0;
    }

    // Method untuk menampilkan titik awal dan titik akhir dari garis
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // Method untuk mendapatkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double m = getGradien();

        double c = y1 - m * x1;

        if (c >= 0) {
            return "y = " + m + "x + " + c;
        } else {
            return "y = " + m + "x - " + (-c);
        }
    }
}