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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.UtilSQL;

/**
 *
 * @author HP
 */
public class ThucDonDao {
    private static Connection conn ;
    private static PreparedStatement ps ;
    private static ResultSet rs ;
    
    public List <Map<String ,String>> getThucDon(){
        Map<String ,String> data = new HashMap<>();
        List <Map<String ,String>> results = new ArrayList<>();
        conn = UtilSQL.getConnection();
        String sql = "SELECT * FROM monan LEFT JOIN menu On monan.id_Menu = menu.id " ;
        
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery() ;
            while (rs.next()){
                data= new HashMap<>() ;
                data.put("Tên", rs.getString("monan.name")) ;
                data.put("Giá", rs.getString("price")) ;
                data.put("Loại", rs.getString("menu.name")) ;
                results.add(data) ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results ;
    }

    public List<Map<String, String>> gettenThucDon(String text) {
        Map<String ,String> data = new HashMap<>();
        List <Map<String ,String>> results = new ArrayList<>();
        conn = UtilSQL.getConnection();
        String sql = "SELECT * FROM monan LEFT JOIN \n" +
"menu On monan.id_Menu = menu.id where monan.name like ?   " ;
        
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + text + "%");
            rs = ps.executeQuery() ;
            while (rs.next()){
                data= new HashMap<>() ;
                data.put("Tên", rs.getString("monan.name")) ;
                data.put("Giá", rs.getString("price")) ;
                data.put("Loại", rs.getString("menu.name")) ;
                results.add(data) ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return results ;
    }

    public void addFood(String ten, String gia, String loai) {
        String idFood = getIdFood(loai);
        try {
            String sqlInsert= "INSERT INTO `quanlyquannhau`.`monan` (`name`, `price`, `id_Menu`) VALUES (?, ?, ?);" ;
            conn = UtilSQL.getConnection();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, ten);
            ps.setInt(2, Integer.valueOf(gia));
            ps.setInt(3, Integer.valueOf(idFood));
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    private String getIdFood(String loai) {
        conn = UtilSQL.getConnection();
        String sql = "SELECT id FROM quanlyquannhau.menu where name = ? " ;       
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, loai);
            rs = ps.executeQuery() ;
            while (rs.next()){
                return rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(managerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "" ;
    }

    public void eraseFood(String name) {
        String sql = "DELETE FROM monan WHERE monan.name = ?";
        conn = UtilSQL.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Logindao.class.getName()).log(Level.SEVERE, null, ex);
        }
    

       
    }
}
