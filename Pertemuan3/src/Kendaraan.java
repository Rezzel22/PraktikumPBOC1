/*Nama File     : Kendaraan.java
 *Deskripsi     : Berisi atribut dan method dalam class Kendaraan
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 05/03/2026
 *Lab           : C1 */

public class Kendaraan {
    private String noPlat;
    private String Jenis;

    public Kendaraan(){
        noPlat = "";
        Jenis = "";
    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return Jenis;
    }

    //Mutator
    public void setNoPlat(String No){
        noPlat = No;
    }

    public void setJenis(String J){
        Jenis = J;
    }

    public void printDosen(){
        System.out.println("Nomor Plat :" + noPlat + " Jenis :" + Jenis);
    }
}
