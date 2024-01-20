/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.Logindao;

/**
 *
 * @author HP
 */
public class LoginService {
    private static Logindao Logindao = new Logindao();

    public boolean checkLogin(String user, String password) {
        return Logindao.checklogin(user, password);
    }

    
    
}
