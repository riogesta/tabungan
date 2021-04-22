/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabungan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author riogesta
 */
public class Conn_db {

    private static Connection mysql_connection;
    /**
     * @param args the command line arguments
     */
    public static Connection mysqlconn() throws SQLException {
        // TODO code application logic here
        if(mysql_connection == null){
            try {
                String db = "jdbc:mysql://localhost:3306/tabungan_us";
                String user = "root"; 
                String pw = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                mysql_connection = (Connection) DriverManager.getConnection(db,user,pw);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi database Gagal!\n"+e);
            }
        }
        
        return mysql_connection;
    }
    
}
