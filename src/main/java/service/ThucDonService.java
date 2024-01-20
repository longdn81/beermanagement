/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.ThucDonDao;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class ThucDonService {
    public static ThucDonDao thucdonDao = new ThucDonDao();
    
    public List <Map<String ,String>> getthucdon(){
        return thucdonDao.getThucDon();
    }

    public List<Map<String, String>> gettenthucdon(String text) {
        return thucdonDao.gettenThucDon(text);
    }

    public void addFood(String ten, String gia, String loai) {
        thucdonDao.addFood(ten, gia, loai);
    }

    public void eraseFood(String name) {
        thucdonDao.eraseFood(name);
    }

}
