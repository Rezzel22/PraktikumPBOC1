/*Nama File     : Titik.java
 *Deskripsi     : Berisi atribut dan method dalam class Titik
 *Pembuat       : Imam Alfarezel (24060124120028)
 *Tanggal       : 19/02/2026
 *Lab           : C1 */

public class Titik {
    /*Atribut*/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*Konstruktor */

    // konstruktor tanpa parameter untuk membuat titik dengan nilai awal (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }

    //konstruktor dengan parameter untuk menginisialisasi nilai absis dan ordinat
    Titik (double absis ,  double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik ++;
    }

    /* Method untuk mengambil nilai counter titik */
    static int getCounterTitik(){
        return counterTitik;
    }

    /*Selektor */

    //method getter untuk mengambil nilai absis dari titik
    double getAbsis(){
        return absis;
    }

    //method getter untuk mengambil nilai ordinat dari titik
    double getOrdinat(){
        return ordinat;
    }

    /*Mutator */

    //method setter untuk mengubah nilai absis
    void setAbsis(double x){
        absis = x;    
    }

    //method setter untuk mengubah nilai ordinat
    void setOrdinat(double y){
        ordinat = y;
    }

    /*Method untuk menampilkan titik */
    void printTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

    /*Method Tambahan */

    //method untuk menggeser posisi titik sejauh x pada absis dan y pada ordinat
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //method untuk menentukan kuadran tempat titik berada
    public int getKuadran(){
        if (absis > 0 && ordinat > 0)
            return 1;
        if (absis < 0 && ordinat > 0)
            return 2;
        if (absis < 0 && ordinat < 0)
            return 3;
        if (absis > 0 && ordinat < 0)
            return 4;
        else
            return 0;
    }

    //method untuk menghitung jarak antara titik ini dengan titik lain
    public double getJarak(Titik t){
        return Math.sqrt(((this.absis - t.getAbsis()) * (this.absis - t.getAbsis())) + ((this.ordinat - t.getOrdinat()) * (this.ordinat - t.getOrdinat())));
    }

    //method untuk menghitung jarak titik terhadap titik pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }

    //method untuk merefleksikan titik terhadap sumbu X
    void refleksiX(){
        ordinat = ordinat * -1;
    }

    //method untuk merefleksikan titik terhadap sumbu Y
    void refleksiY(){
        absis = absis * -1;
    }

    //method untuk menghasilkan titik baru hasil refleksi terhadap sumbu X
    Titik getRefleksiX(){
        return new Titik(absis , ordinat * -1);
    }

    //method untuk menghasilkan titik baru hasil refleksi terhadap sumbu Y
    Titik getRefleksiY(){
        return new Titik(absis * -1 , ordinat);
    }
}