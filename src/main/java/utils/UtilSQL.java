/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class UtilSQL {
    private static Connection connection;
    
    public static Connection getConnection(){
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver") ;
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlyquannhau", "root","Daonhatlong8125@" );
            } catch (Exception ex) {
                Logger.getLogger(UtilSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection ;
    }
    
}
