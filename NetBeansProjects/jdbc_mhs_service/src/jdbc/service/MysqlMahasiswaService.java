/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author Imam Alfarezel
 */
public class MysqlMahasiswaService {
    private static Connection koneksi;
    
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    
    public void add(Mahasiswa m){
        try{
            String query = "INSERT INTO mahasiswa VALUES('"+m.getId()+"', '"+m.getNama()+"')";
            Statement ts = koneksi.createStatement();
            ts.executeUpdate(query);
            System.out.println("Berhasil Add Query :D");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Mahasiswa> getAll(){
        List<Mahasiswa> listMhs = new ArrayList<>();
        try{
            String query = "SELECT * FROM mahasiswa";
            Statement ts = koneksi.createStatement();
            ResultSet fr = ts.executeQuery(query);
            while(fr.next()){
                listMhs.add(new Mahasiswa(fr.getInt("id"), fr.getString("nama"))); 
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return listMhs;
    }
    
    public void update(Mahasiswa m){
        try{
            String query = "UPDATE mahasiswa SETnama = '"+m.getNama()+"' where id = '"+m.getId()+"'";
            Statement ts = koneksi.createStatement();
            ts.executeUpdate(query);
            System.out.println("Berhasil Update Query :D");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(int id){
        try{
            String query = "Delete From mahasiswa where id = '"+id+"'";
            Statement ts = koneksi.createStatement();
            ts.executeUpdate(query);
            System.out.println("Berhasil delete Query :D");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Mahasiswa getById(int id){
        Mahasiswa listMhs = new Mahasiswa() ;
        try{
            String query = "SELECT * FROM mahasiswa";
            Statement ts = koneksi.createStatement();
            ResultSet fr = ts.executeQuery(query);
            if(fr.next()){
                listMhs= new Mahasiswa(fr.getInt("id"), fr.getString("nama")); 
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return listMhs;
    }
}
