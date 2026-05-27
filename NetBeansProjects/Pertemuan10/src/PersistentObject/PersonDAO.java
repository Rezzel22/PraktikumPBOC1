/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistentObject;

//File : MySQLPersonDAO.java
//Deskripsi : implementasi PersonDAO untuk MySQL
//@author Imam Alfarezel

public interface PersonDAO{
    public void savePerson (Person p) throws Exception;
}