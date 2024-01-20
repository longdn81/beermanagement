/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.managerDao;
import java.util.List;


/**
 *
 * @author HP
 */
public class managerService {
    
    public static managerDao ManagerDao = new managerDao();
    
    public List<String> getcategory(){
        
        return ManagerDao.getCatogory();
    }
    public List<String> getmonan(){
        
        return ManagerDao.getMonan() ;
    }
    public List<String> getten(String ten){
        
        return ManagerDao.getTen(ten) ;
    }

    public String getPrice(String gia) {
        return ManagerDao.getprive(gia) ;
    }

    public void insertBillDetail(String name, int number) {
        ManagerDao.insertBillDetail(name,number);
    }

    public void insertBill(Integer currentDesk, Integer total) {
        ManagerDao.insertBill(currentDesk,total);
    }
    
    
}
