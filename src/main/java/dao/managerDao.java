/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.UtilSQL;

/**
 *
 * @author HP
 */
public class managerDao {
    
    private static Connection conn ;
    private static PreparedStatement ps ;
    private static ResultSet rs ;

    public static void insertBillDetail(String name, int number) {
        String idFood = getIdFood(name);
        String idBill = getIdBill();
        try {
            String sqlInsert= "INSERT INTO `quanlyquannhau`.`billdetail` (`id_Food`, `id_bill`, `count`) VALUES (?, ?, ?);" ;
            conn = UtilSQL.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setInt(1, Integer.valueOf(idFood));
            ps.setInt(2, Integer.valueOf(idBill));
            ps.setInt(3, number);
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    private static String getIdBill() {
        conn = UtilSQL.getConnection();
        String sql = "SELECT max(id) as id FROM quanlyquannhau.bill;";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }
    private static String getIdFood(String name) {
        conn = UtilSQL.getConnection();
        String sql = "SELECT id FROM quanlyquannhau.monan where name = ? " ;       
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery() ;
            while (rs.next()){
                return rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "" ;
    }

    
    
    
    public List <String> getCatogory(){
        
        List <String> results = new ArrayList<>();
        conn = UtilSQL.getConnection();
        String sql = "SELECT * FROM quanlyquannhau.menu" ;
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery() ;
            while (rs.next()){
                results.add( rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results ;
    }
    
    
    public List <String> getMonan(){
        
        List <String> results = new ArrayList<>();
        conn = UtilSQL.getConnection();
        String sql = "SELECT * FROM quanlyquannhau.monan" ;
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery() ;
            while (rs.next()){
                results.add( rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results ;
    }
    public List <String> getTen(String ten){
        
        List <String> results = new ArrayList<>();
        conn = UtilSQL.getConnection();
        String sql = "SELECT * FROM monan LEFT JOIN menu On monan.id_Menu = menu.id where menu.name = ? ;"  ;
        
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,ten);
            rs = ps.executeQuery() ;
            while (rs.next()){
                results.add( rs.getString("monan.name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results ;
    }

    public String getprive(String gia) {
        String sql = "SELECT price FROM monan LEFT JOIN menu On monan.id_Menu = menu.id where monan.name = ? " ;
        conn = UtilSQL.getConnection();
        String results = null  ;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,gia);
            rs = ps.executeQuery() ;
            while (rs.next()){
                results = rs.getString("monan.price") ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results ;
    }

    public void insertBill(Integer currentDesk, Integer total) {
        try {
            String sqlInsert= "INSERT INTO `quanlyquannhau`.`bill` ( `inday`, `outdate`, `id_Foodtable`, `totalPrice`) VALUES ( now(), now(), ?, ?);" ;
            conn = UtilSQL.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setInt(1, currentDesk);
            ps.setInt(2, total);
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
