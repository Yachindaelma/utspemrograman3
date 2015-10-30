/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

package akuntan;
import java.sql.*;

public class koneksi {
    Connection conec = null;
    
    public koneksi(){
    }
    public Connection getkoneksi(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conec = DriverManager.getConnection("jdbc:mysql://localhost/property","root","");
            System.out.println ("Berhasil");
        }
        catch(Exception w){
        System.out.println ("Masih Eror");    
        }
        return conec;
    }   
}
