/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class ClassDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        try{
            if(koneksi == null){
            String url = "jdbc:mysql://localhost:3306/myjavaproject";
            String name = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, name, password);
        }
        }catch(SQLException s){
            System.out.println("Gagal membuat koneksi = " + s);
        }
        
        return koneksi;
    }
}
