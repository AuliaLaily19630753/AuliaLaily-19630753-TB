/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengelolaanKRS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    public static Connection getConnection(){
        Connection conn = null;
          String url = "jdbc:mysql://localhost:3306/pengelolaan_krs";
          String user = "root";
          String pass = "";
          
          try{
              conn=DriverManager.getConnection(url, user, pass);
          }catch( SQLException e){
              System.out.println(e);
                    
        }
          
          return conn;
          
    }
    
    public static void main (String[]args){
        try{
            Connection con = Koneksi.getConnection();
            System.out.println(String.format("Database Terkoneksi %s"+"Berhasil", con.getCatalog()));
        }catch (SQLException e) {
            System.out.println(e);
        }
    }

    static Connection prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Object createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
