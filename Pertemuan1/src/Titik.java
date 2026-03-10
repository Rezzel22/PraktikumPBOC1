/*Nama File     : MataKuliah.java
 *Deskripsi     : Berisi atribut dan method dalam class MataKuliah
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 19/02/2026
 *Lab           : C1*/

public class Titik {
    /*Atribut*/
    double absis;
    double ordinat;

    /*Kontruktor*/ 

    // Konstruktor default untuk membuat titik dengan koordinat awal (0,0)
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
    }

    /*Selektor*/

    // Method untuk mengambil nilai absis (koordinat x)
    double getAbsis(){
        return absis;
    }

    // Method untuk mengambil nilai ordinat (koordinat y)
    double getOrdinat(){
        return ordinat;
    }

    /*Mutator */

    // Method untuk mengubah nilai absis (koordinat x)
    void setAbsis(double x){
        absis = x;
    }

    // Method untuk mengubah nilai ordinat (koordinat y)
    void setOrdinat(double y){
        ordinat = y;
    }

    /*Method Tambahan */
    
    // Method untuk menggeser posisi titik sejauh x pada absis dan y pada ordinat
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    /*Method untuk menampilkan titik */
    void printTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

}