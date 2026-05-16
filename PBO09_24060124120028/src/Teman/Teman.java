package Teman;

/* Nama File : Teman.java
 * Deskripsi : Kelas koleksi yang mengoleksi objek generik
 * Pembuat   : Imam Alfarezel
 * Tanggal   : 07/05/2026
 */

import java.util.ArrayList;
// import java.util.Queue;
// import java.util.LinkedList;

public class Teman {
    /*Atribut */
    private int nbelm;
    private ArrayList<String> Lnama;

    /*Konstruktor */
    public Teman(){
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    /*Selektor */
        //Method untuk mengambil nama dari Teman
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }

        //Method untuk mengambil nbelm dari Teman
    public int getNbelm() {
        return nbelm;
    }

    /*Mutator */
        //Method untuk set nama dalam Teman
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }

        // Method untuk set nbelm dalam Teman
    public void setNbelm(int nbelm) {
        this.nbelm = nbelm;
    }

    /*Method Lainnya*/
        //Method untuk menambahkan Lnama
    public void addNama(String nama){
        Lnama.add(nama);
    }

        //Method untuk menghapus Lnama
    public void delNama(String nama){
        Lnama.remove(nama);
    }
        //Method untuk menentukan objek member
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

        //Method untuk mengganti Nama 
    public void gantiNama(String nama, String namabaru){
        setNama(Lnama.indexOf(nama), namabaru);
    }

        //Method untuk menghitung nama
    public int countNama(String nama){
        int count = 0;

        for(String n : Lnama){
            if(n.equals(nama)){
                count ++;
            }
        }
        return count;
    }

        //Metho yang menampilkan seluruh nama teman dalam Lnama
    public void showTeman(){
        for(String nama : Lnama){
            System.out.println(nama);
        }
    }
}
