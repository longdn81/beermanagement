/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.beermanagement;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.managerService;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {
    public static managerService ManagerService = new managerService();
                
    private Map<String , List<Map<String, String>>> mapBill = new HashMap<>() ;
    List<JButton> listDesk = new ArrayList<>();
    private String currentDesk = "1"; 
/**
 * 1 - List data in tabe bill deessk 1
 * 2 - List data in tabe bill deessk 2
 */
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setListCategory();
        listDesk.add(ban1);
        listDesk.add(ban2);
        listDesk.add(ban3);
        listDesk.add(ban4);
        listDesk.add(ban5);
        listDesk.add(ban6);
        
        Map<String, String> status = new HashMap<>();
        
        for(int i = 0; i<listDesk.size(); i++){
            
            mapBill.put(String.valueOf(i + 1), new ArrayList<>());
        }
        mnFoodcount.setValue(1);
        
    }
    private void setListCategory() {
        List<String> category = ManagerService.getcategory() ;
        DefaultComboBoxModel listModel = new DefaultComboBoxModel();
        
        listModel.addElement("Tất cả");
        listModel.addAll(category);
        
        
        cmbMenu.setModel(listModel);
    }

    public void setListmonan() {
        List<String> monan = ManagerService.getmonan();
        DefaultComboBoxModel listModel = new DefaultComboBoxModel();
        
        
        listModel.addAll( monan);
        
        
        cmbmonan.setModel(listModel);
    }
    public void setten(String ten) {
        List<String> monan = ManagerService.getten(ten);
        DefaultComboBoxModel listModel = new DefaultComboBoxModel();
        
        
        listModel.addAll( monan);
        
        
        cmbmonan.setModel(listModel);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ban1 = new javax.swing.JButton();
        ban3 = new javax.swing.JButton();
        ban2 = new javax.swing.JButton();
        ban4 = new javax.swing.JButton();
        ban6 = new javax.swing.JButton();
        ban5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cmbMenu = new javax.swing.JComboBox<>();
        cmbmonan = new javax.swing.JComboBox<>();
        jbtadd = new javax.swing.JButton();
        mnFoodcount = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        billtable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        pay = new javax.swing.JTextField();
        thanhtoan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ban1.setText("Bàn 1");
        ban1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ban1ActionPerformed(evt);
            }
        });

        ban3.setText("Bàn 3");
        ban3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ban3ActionPerformed(evt);
            }
        });

        ban2.setText("Bàn 2");
        ban2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ban2ActionPerformed(evt);
            }
        });

        ban4.setText("Bàn 4");
        ban4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ban4ActionPerformed(evt);
            }
        });

        ban6.setText("Bàn 6");
        ban6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ban6ActionPerformed(evt);
            }
        });

        ban5.setText("Bàn 5");
        ban5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ban5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ban3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ban1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ban5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ban6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ban4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ban2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ban1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ban2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ban3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ban4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ban6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ban5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        cmbMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Item 2", "Item 3", "Item 4" }));
        cmbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMenuActionPerformed(evt);
            }
        });

        cmbmonan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbmonan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmonanActionPerformed(evt);
            }
        });

        jbtadd.setText("Thêm món");
        jbtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtaddActionPerformed(evt);
            }
        });

        billtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        billtable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                billtableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(billtable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbmonan, 0, 224, Short.MAX_VALUE)
                            .addComponent(cmbMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jbtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnFoodcount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtadd, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(mnFoodcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cmbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbmonan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        thanhtoan.setText("Thanh toán");
        thanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanhtoanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("TỔNG TIỀN");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.setText("Cài đặt");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem2.setText("Thực đơn");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ban1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ban1ActionPerformed
        List<Map<String, String>> drinks = mapBill.get("1");
        currentDesk = "1";
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        defaultListModel.setRowCount(0);
        for(int i = 0; i < drinks.size(); i++){
            defaultListModel.addRow(new Object[]{
                drinks.get(i).get("ten"),
                drinks.get(i).get("soLuong"),
                drinks.get(i).get("donGia"),
                drinks.get(i).get("thanhTien")
            });
        }
    }//GEN-LAST:event_ban1ActionPerformed

    private void ban3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ban3ActionPerformed
    List<Map<String, String>> drinks = mapBill.get("3");
        currentDesk = "3";
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        defaultListModel.setRowCount(0);
        for(int i = 0; i < drinks.size(); i++){
            defaultListModel.addRow(new Object[]{
                drinks.get(i).get("ten"),
                drinks.get(i).get("soLuong"),
                drinks.get(i).get("donGia"),
                drinks.get(i).get("thanhTien")
            });
        }    
    }//GEN-LAST:event_ban3ActionPerformed

    private void ban2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ban2ActionPerformed
        List<Map<String, String>> drinks = mapBill.get("2");
        currentDesk = "2";
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        defaultListModel.setRowCount(0);
        for(int i = 0; i < drinks.size(); i++){
            defaultListModel.addRow(new Object[]{
                drinks.get(i).get("ten"),
                drinks.get(i).get("soLuong"),
                drinks.get(i).get("donGia"),
                drinks.get(i).get("thanhTien")
            });
        }
    }//GEN-LAST:event_ban2ActionPerformed
   
    private void cmbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMenuActionPerformed
        String ten ;
        ten = cmbMenu.getSelectedItem().toString();
        
        if( cmbMenu.getSelectedItem().equals("Tất cả")){
            cmbmonan.removeAllItems();
            setListmonan() ;
            cmbmonan.setSelectedItem(null);
        }
        else {
            cmbmonan.removeAllItems();
            setten(ten) ;
            cmbmonan.setSelectedItem(null);
            
        }
    }//GEN-LAST:event_cmbMenuActionPerformed

    private void cmbmonanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmonanActionPerformed
        
        
    }//GEN-LAST:event_cmbmonanActionPerformed

    private void jbtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtaddActionPerformed
        List<Map<String, String>> drinks = mapBill.get(currentDesk);
        Map<String, String> map = new HashMap<>();
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        String name = cmbmonan.getSelectedItem().toString() ;
        String price = getprice(cmbmonan.getSelectedItem().toString()) ;
        if(!AddRowBill(name,price)){
            return;
        }
        boolean check = true;
        for (int i = 0; i < drinks.size(); i++) {
            Map<String, String> mapDetail = drinks.get(i);
            if(mapDetail.get("ten").equals(String.valueOf(name))){
                int index =  checknameBill(name);
                drinks.get(i).put("soLuong", String.valueOf(billtable.getValueAt(index, 1)));
                drinks.get(i).put("thanhTien", String.valueOf(billtable.getValueAt(index, 3)));
                check = false;
            }
        }
        if(check){
            map.put("ten", (String) billtable.getValueAt(billtable.getRowCount() - 1, 0));
            map.put("soLuong", String.valueOf(billtable.getValueAt(billtable.getRowCount() - 1, 1)));
            map.put("donGia",(String) billtable.getValueAt(billtable.getRowCount() - 1, 2));
            map.put("thanhTien",String.valueOf(billtable.getValueAt(billtable.getRowCount() - 1, 3)));
            drinks.add(map);
        }
        
        mapBill.put(currentDesk, drinks);
        mnFoodcount.setValue(1);
        listDesk.get(Integer.parseInt(currentDesk)-1).setBackground(new Color(153,255,255));
        
    }//GEN-LAST:event_jbtaddActionPerformed
    private boolean AddRowBill(String name, String price) {
        int index =  checknameBill(name);
        Integer TongTien = Integer.parseInt(price) * (Integer)mnFoodcount.getValue()  ;
        if (index >=0) {
            return setSoLuongVaTongTien(index);
        }
        else{
            if ((Integer)mnFoodcount.getValue()>0){
                DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
                defaultListModel.addRow(new Object[]{
                name , (Integer)mnFoodcount.getValue() , price , TongTien 
                });
            }
            else {
                JOptionPane.showMessageDialog(this," Lỗi thêm món " , "Failure" ,
                     JOptionPane.ERROR_MESSAGE   );
            }
            
        }
        
        
        return true;

    }
    private boolean setSoLuongVaTongTien(int index) {
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        Integer SoLuong =  Integer.parseInt(defaultListModel.getValueAt(index, 1).toString()) + (Integer)mnFoodcount.getValue();
        if(SoLuong>0){
            Integer TongTien = Integer.parseInt(defaultListModel.getValueAt(index, 2).toString()) * SoLuong  ;
            defaultListModel.setValueAt(SoLuong, index, 1);
            defaultListModel.setValueAt(TongTien, index, 3);
        }else if (SoLuong==0){
            defaultListModel.removeRow(index);
            mapBill.get(currentDesk).remove(index);
            return false;
        }
        else {
            JOptionPane.showMessageDialog(this," Lỗi thêm món " , "Failure" ,
                     JOptionPane.ERROR_MESSAGE   );
        }
        
        return true;
        
    }
    private int checknameBill(String name) {
        for(int i =0  ; i < billtable.getRowCount() ; i++){
            if (billtable.getValueAt(i, 0).equals(name)){
                return i ;
            }
        }
        return -1 ;
        
    }
    private String getprice(String toString) {
        return ManagerService.getPrice(toString) ;
    }
    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payActionPerformed

    private void thanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanhtoanActionPerformed
        if(gettotal()==0){
            return ;
        }
        Integer Desk = Integer.valueOf(currentDesk) ;
        ManagerService.insertBill( Desk ,gettotal() );
        for (int i=0 ; i < billtable.getRowCount(); i++){
            String name = billtable.getValueAt(i, 0).toString();
            int number = Integer.parseInt(billtable.getValueAt(i, 1).toString());
            ManagerService.insertBillDetail(name ,number );
        }
        pay.setText("");
        
        List<Map<String, String>> desk = mapBill.get(currentDesk);
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        defaultListModel.setRowCount(0);
        desk.clear();
        listDesk.get(Integer.parseInt(currentDesk)-1).setBackground(null);
                
    }//GEN-LAST:event_thanhtoanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        this.dispose();       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ThucDon().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void billtableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_billtableAncestorAdded

    }//GEN-LAST:event_billtableAncestorAdded

    private void ban4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ban4ActionPerformed
    List<Map<String, String>> drinks = mapBill.get("4");
        currentDesk = "4";
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        defaultListModel.setRowCount(0);
        for(int i = 0; i < drinks.size(); i++){
            defaultListModel.addRow(new Object[]{
                drinks.get(i).get("ten"),
                drinks.get(i).get("soLuong"),
                drinks.get(i).get("donGia"),
                drinks.get(i).get("thanhTien")
            });
        }   
    }//GEN-LAST:event_ban4ActionPerformed

    private void ban5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ban5ActionPerformed
    List<Map<String, String>> drinks = mapBill.get("5");
        currentDesk = "5";
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        defaultListModel.setRowCount(0);
        for(int i = 0; i < drinks.size(); i++){
            defaultListModel.addRow(new Object[]{
                drinks.get(i).get("ten"),
                drinks.get(i).get("soLuong"),
                drinks.get(i).get("donGia"),
                drinks.get(i).get("thanhTien")
            });
        }
    }//GEN-LAST:event_ban5ActionPerformed

    private void ban6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ban6ActionPerformed
    List<Map<String, String>> drinks = mapBill.get("6");
        currentDesk = "6";
        DefaultTableModel defaultListModel = (DefaultTableModel) billtable.getModel();
        defaultListModel.setRowCount(0);
        for(int i = 0; i < drinks.size(); i++){
            defaultListModel.addRow(new Object[]{
                drinks.get(i).get("ten"),
                drinks.get(i).get("soLuong"),
                drinks.get(i).get("donGia"),
                drinks.get(i).get("thanhTien")
            });
        }
    }//GEN-LAST:event_ban6ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       pay.setText(String.valueOf(gettotal()) );
    }//GEN-LAST:event_jLabel2MouseClicked
    private Integer gettotal() {
        Integer total =0 ;
        for (int i=0 ; i < billtable.getRowCount(); i++){
            total +=   Integer.parseInt(billtable.getValueAt(i, 3).toString()) ;
            }
        return total;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ban1;
    private javax.swing.JButton ban2;
    private javax.swing.JButton ban3;
    private javax.swing.JButton ban4;
    private javax.swing.JButton ban5;
    private javax.swing.JButton ban6;
    private javax.swing.JTable billtable;
    private javax.swing.JComboBox<String> cmbMenu;
    private javax.swing.JComboBox<String> cmbmonan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbtadd;
    private javax.swing.JSpinner mnFoodcount;
    private javax.swing.JTextField pay;
    private javax.swing.JButton thanhtoan;
    // End of variables declaration//GEN-END:variables

    

    

    

    

    
}
