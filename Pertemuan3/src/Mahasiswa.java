/*Nama File     : Mahasiswa.java
 *Deskripsi     : Berisi atribut dan method dalam class Mahasiswa
 *Pembuat       : Imam Alfarezel(24060124120028)
 *Tanggal       : 09/03/2026
 *Lab           : C1 */

import java.util.ArrayList;

public class Mahasiswa {
    /*Atribut */ 
    private String nama;
    private String nim;
    private String jurusan;
    private Dosen dosenWali;
    private ArrayList<MataKuliah> listMatkul;
    private ArrayList<Kendaraan> listKendaraan;

    /*Konstruktor */

    ////konstruktor tanpa parameter untuk membuat objek Mahasiswa dengan nilai dan list awal kosong
    public Mahasiswa(){
        nama = "";
        nim = "";
        jurusan = "";
        listMatkul = new ArrayList<MataKuliah>();
        listKendaraan = new ArrayList<Kendaraan>();
    }

    //konstruktor dengan parameter untuk menginisialisasi atribut Mahasiswa saat objek dibuat
    public Mahasiswa(String nama, String nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.listMatkul = new ArrayList<MataKuliah>();
        this.listKendaraan = new ArrayList<Kendaraan>();
    }

    /*Selektor */

    // method untuk mengambil atau mendapatkan nama mahasiswa
    public String getNama(){
        return nama;
    }

    //method untuk mengambil atau mendapatkan NIM mahasiswa
    public String getNim(){
        return nim;
    }

    //method untuk mengambil atau mendapatkan jurusan mahasiswa
    public String getJurusan(){
        return jurusan;
    }

    //method untuk mendapatkan objek dosen wali dari mahasiswa
    public Dosen getDosenWali(){
        return dosenWali;
    }

    //method untuk mendapatkan daftar mata kuliah yang diambil mahasiswa
    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    //method untuk mendapatkan daftar mata kuliah yang diambil mahasiswa
    public ArrayList<Kendaraan> getListKendaraan(){
        return listKendaraan;
    }

    /*Mutator */ 

    //method untuk mengubah atau menetapkan nama mahasiswa
    public void setNama(String nama){
        this.nama = nama;
    }

    //method untuk mengubah atau menetapkan NIM mahasiswa
    public void setNim(String nim){
        this.nim = nim;
    }

    //method untuk mengubah atau menetapkan NIM mahasiswa
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    //method untuk menetapkan dosen wali bagi mahasiswa
    public void setDosenWali(Dosen dosen){
        this.dosenWali = dosen;
    }

    /*Method Tambahan */

    // method untuk menambah mata kuliah
    public void tambahMatkul(MataKuliah mk){
        listMatkul.add(mk);
    }

    //method menambah kendaraan
    public void tambahKendaraan(Kendaraan k){
        listKendaraan.add(k);
    }

    /*Method menampilkan detail mahasiswa */

    //Method untuk menampilkan seluruh informasi mahasiswa
    //meliputi nama, nim, jurusan, dosen wali, mata kuliah, dan kendaraan
    public void printDetail(){
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);

        if(dosenWali != null){
            System.out.println("Dosen Wali : " + dosenWali.getNamaDosen());
        }

        System.out.println("\nMata Kuliah yang diambil:");
        for(MataKuliah mk : listMatkul){
            System.out.println("- " + mk.getNamaMatkul());
        }

        System.out.println("\nKendaraan Mahasiswa:");
        for(Kendaraan k : listKendaraan){
            System.out.println("- " + k.getNoPlat());
        }
    }
}