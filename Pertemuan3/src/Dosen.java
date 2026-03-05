/*Nama File     : Dosen.java
 *Deskripsi     : Berisi atribut dan method dalam class Dosen
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 05/03/2026 */

public class Dosen {
    private String Nip;
    private String Nama;
    private String Prodi;
    private static int CountDosen; 

    //Konstruktor
    public Dosen(){
        Nip = "";
        Nama = "";
        Prodi = "";
        CountDosen ++;
    }

    public Dosen(String Nip, String Nama, String Prodi){
        this.Nip = Nip;
        this.Nama = Nama;
        this.Prodi = Prodi;
        CountDosen++;
    }

    //Selektor
    public String getNip(){
        return Nip;
    }

    public String getNamaDosen(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }
    
    static int getCounterDosen(){
        return CountDosen;
    }

    //Mutator
    public void setNip(String N){
        Nip = N;
    }

    public void setNama(String M){
        Nama = M;
    }

    public void setProdi(String P){
        Prodi = P;
    }

    public void printDosen(){
        System.out.println("NIP :" + Nip + "Nama :" + Nama + "Prodi :" + Prodi);
    }
}
