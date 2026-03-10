/*Nama File     : MataKuliah.java
 *Deskripsi     : Berisi atribut dan method dalam class MataKuliah
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 05/03/2026
 *Lab           : C1*/

public class MataKuliah {
    /*Atribut */
    private String idMatkul;
    private String nama;
    private int sks;

    /*Konstruktor */

    //konstruktor tanpa parameter untuk membuat objek MataKuliah dengan nilai awal kosong
    public MataKuliah(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    //konstruktor dengan parameter untuk menginisialisasi id matkul, nama matkul, dan jumlah SKS
    public MataKuliah(String idMatkul, String Nama, int sks){
        this.idMatkul = idMatkul;
        this.nama =  Nama;
        this.sks = sks;
    }

    /*Selektor */

    //method getter untuk mengambil id mata kuliah
    public String getIdMatkul(){
        return idMatkul;
    }

    //method getter untuk mengambil nama mata kuliah
    public String getNamaMatkul(){
        return nama;
    }

    //method getter untuk mengambil jumlah SKS mata kuliah
    public int getSks(){
        return sks;
    }

    /*mutator */

    //method setter untuk mengubah atau menetapkan id mata kuliah
    public void setIdMatkul(String Id){
        idMatkul = Id;
    }

    //method setter untuk mengubah atau menetapkan nama mata kuliah
    public void setNama(String N){
        nama = N;
    }

    //method setter untuk mengubah atau menetapkan nama mata kuliah
    public void setSks(int S){
        sks = S;
    }

    /*method menampilkan data Mata Kuliah */

    //method setter untuk mengubah atau menetapkan jumlah SKS mata kuliah
    public void printMataKuliah(){
        System.out.println("Id MataKuliah : " + idMatkul + "Nama : " + nama + "SKS : " + sks);
    }
}
