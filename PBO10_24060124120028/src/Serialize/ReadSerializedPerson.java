/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialize;

import java.io.*;


// File : ReadSerializedPerson.java
// Deskripsi : Program untuk membaca objek Person yang terserialisasi
// @author Imam Alfarezel

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            // KOREKSI: Menggunakan ObjectInputStream untuk membaca file
            ObjectInputStream s = new ObjectInputStream(f); 
            person = (Person) s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
