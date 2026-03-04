public class Garis {
    //atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

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

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(Titik t){
        this.titikAwal = t;
    }

    public void setTitikAkhir(Titik t){
        this.titikAkhir = t;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public double PanjangGaris(){
        return this.titikAwal.getJarak(titikAkhir);
    }

    public double getGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0){
            return Double.POSITIVE_INFINITY;
        }
        return (dy)/(dx);
    }

    public Titik getTitikTengah(){
        double xTengah;
        double yTengah;
        xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis())/2;
        yTengah = (titikAwal.getOrdinat() + titikAkhir.getAbsis())/2;
        return new Titik(xTengah,yTengah);
    }

    public boolean isSejajar(Garis G) {
        double dx1 = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy1 = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double dx2 = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();
        double dy2 = G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat();

        return dy1 * dx2 == dy2 * dx1;
    }

    public boolean isTegakLurus(Garis G) {
        double dx1 = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy1 = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double dx2 = G.titikAkhir.getAbsis() - G.titikAwal.getAbsis();
        double dy2 = G.titikAkhir.getOrdinat() - G.titikAwal.getOrdinat();

        return dx1 * dx2 + dy1 * dy2 == 0;
    }

    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

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