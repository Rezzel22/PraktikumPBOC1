/*Nama File     : Dosen.java
 *Deskripsi     : Berisi atribut dan method dalam class Dosen
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 05/03/2026 
 *Lab           : C1*/

public class Dosen {
    /*Atribut*/
    
    private String nip;
    private String nama;
    private String prodi;
    private static int CountDosen; 

    /*Konstruktor*/

    //konstruktor tanpa parameter untuk membuat objek dosen dengan nilai awal kosong
    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
        CountDosen ++;
    }

    //konstruktor dengan parameter untuk menginisialisasi atribut dosen saat objek dibuat
    public Dosen(String Nip, String Nama, String Prodi){
        this.nip = Nip;
        this.nama = Nama;
        this.prodi = Prodi;
        CountDosen++;
    }

    /*Selektor*/

    //method getter untuk mengambil nilai NIP dosen
    public String getNip(){
        return nip;
    }

    //method getter untuk mengambil nilai NIP dosen
    public String getNamaDosen(){
        return nama;
    }

    //method getter untuk mengambil nilai program studi dosen
    public String getProdi(){
        return prodi;
    }
    
    //method static untuk mendapatkan jumlah objek dosen yang telah dibuat
    public static int getCounterDosen(){
        return CountDosen;
    }

    /*Mutator*/

    //method setter untuk mengubah nilai NIP dosen
    public void setNip(String N){
        nip = N;
    }

    //method setter untuk mengubah nama dosen
    public void setNama(String M){
        nama = M;
    }

    //method setter untuk mengubah program studi dosen
    public void setProdi(String P){
        prodi = P;
    }

    /*Method menampilkan data dosen*/

    //method untuk menampilkan seluruh informasi dosen ke layar
    public void printDosen(){
        System.out.println("NIP : " + nip + "Nama : " + nama + "Prodi : " + prodi);
    }
}
