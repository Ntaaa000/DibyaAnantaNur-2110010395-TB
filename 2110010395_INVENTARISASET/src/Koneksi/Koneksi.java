/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ananta
 */
public class Koneksi {
    Connection cn;
    public static Connection BukaKoneksi(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/aset_db", "root", "");
    return cn;
}catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           return null;
}
    
}
    
}
