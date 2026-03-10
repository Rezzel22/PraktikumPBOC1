/*Nama File     : Kendaraan.java
 *Deskripsi     : Berisi atribut dan method dalam class Kendaraan
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 05/03/2026
 *Lab           : C1 */

public class Kendaraan {
    /*Atribut*/
    private String noPlat;
    private String jenis;

    /*Konstruktor*/

    //konstruktor tanpa parameter untuk membuat objek kendaraan dengan nilai awal kosong
    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    //konstruktor dengan parameter untuk menginisialisasi nomor plat dan jenis kendaraan saat objek dibuat
    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.jenis = Jenis;
    }

    /*Selektor*/

    //method getter untuk mengambil nilai nomor plat kendaraan
    public String getNoPlat(){
        return noPlat;
    }

    //method getter untuk mengambil jenis kendaraan
    public String getJenis(){
        return jenis;
    }

    /*Mutator*/

    //method setter untuk mengubah atau menetapkan nomor plat kendaraan
    public void setNoPlat(String No){
        noPlat = No;
    }

    //method setter untuk mengubah atau menetapkan jenis kendaraan
    public void setJenis(String J){
        jenis = J;
    }

    /*Method menampilkan data kendaraan*/
    
    //Menampilkan data dari kendaraan
    public void printKendaraan(){
        System.out.println("Nomor Plat :" + noPlat + " Jenis :" + jenis);
    }
}
