/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.UtilSQL;

/**
 *
 * @author HP
 */
public class Logindao {
    private static Connection conn ;
    private static PreparedStatement ps ;
    private static ResultSet rs ;

    public boolean checklogin(String user, String password) {
        String sql = "SELECT username FROM quanlyquannhau.account where username = ? AND password = ? ;";
        conn = UtilSQL.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,password);
            rs = ps.executeQuery() ;
            while (rs.next()){
                return true ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Logindao.class.getName()).log(Level.SEVERE, null, ex);
        }
    

       return false ;
    }
   
}
