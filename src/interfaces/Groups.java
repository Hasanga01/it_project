/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Codes.DBconnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;




public class Groups extends javax.swing.JFrame {

    java.sql.Connection con= null;
    java.sql.PreparedStatement pst=null;
    ResultSet rs = null;
    
    
    
    public Groups() {
        initComponents();
        
        //connect to DB
        con = DBconnect.connect();
        
        //Load table
        tableload();
    }

    
    public void tableload(){
        
        try{
          String sql = "SELECT ID,RoomName,GrpName,SubGroup FROM groups";
          pst = con.prepareStatement(sql);  
          rs = pst.executeQuery();
          
//          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch (Exception e){
            
       }
        
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idno = new javax.swing.JTextField();
        rname = new javax.swing.JLabel();
        grp = new javax.swing.JLabel();
        sgrp = new javax.swing.JLabel();
        boxrname = new javax.swing.JTextField();
        boxgrp = new javax.swing.JTextField();
        boxsgrp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cc = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        vroom = new javax.swing.JLabel();
        vgrp = new javax.swing.JLabel();
        vsgrp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(962, 642));

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("ID No:");

        idno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idno.setText("ID");

        rname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rname.setText("Room Name");

        grp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        grp.setText("Group");

        sgrp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sgrp.setText("Sub Group");

        boxrname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boxrname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boxrnameKeyReleased(evt);
            }
        });

        boxgrp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boxgrp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boxgrpKeyReleased(evt);
            }
        });

        boxsgrp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boxsgrp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boxsgrpKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 102, 255));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Room Name");

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        vroom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vroom.setForeground(new java.awt.Color(255, 0, 0));

        vgrp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vgrp.setForeground(new java.awt.Color(255, 0, 0));

        vsgrp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vsgrp.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxrname, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(boxgrp)
                            .addComponent(boxsgrp))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(vsgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(vroom, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(vgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxrname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rname))
                .addGap(3, 3, 3)
                .addComponent(vroom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grp)
                    .addComponent(boxgrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(vgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sgrp)
                    .addComponent(boxsgrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vsgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu m1=new Menu();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //validation
        if(boxrname.getText().trim().isEmpty() && boxgrp.getText().trim().isEmpty() && boxsgrp.getText().trim().isEmpty()) {
            vroom.setText("Room Name is Empty");
            vgrp.setText("Group Name is Empty");
            vsgrp.setText("Sub-Group Name is Empty");
           
        }
        else if (boxrname.getText().trim().isEmpty()){
            vroom.setText("Room Name is Empty");
        }
        
        else if (boxgrp.getText().trim().isEmpty()){
            vgrp.setText("Group Name is Empty");
        }
         else if (boxsgrp.getText().trim().isEmpty()){
            vsgrp.setText("Sub-Group Name is Empty");
        }
        
        else {
        
        String roomname=boxrname.getText();
        String grp=boxgrp.getText();
        String sgrp=boxsgrp.getText();
        
        //Clear feilds
        boxrname.setText("");
        boxgrp.setText("");
        boxsgrp.setText("");
        
        try{
            String q ="INSERT INTO groups (RoomName,GrpName,SubGroup) values('"+roomname+"','"+grp+"','"+sgrp+"')";
        pst = con.prepareStatement(q);
        pst.execute();
        
        //Load table
                 tableload();
            
        }
        catch (Exception e){
            
       }
        
        } 
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null, "Do you want to Delete this?");
        
        
        if(x==0)
        {
        String id = idno.getText();
        String sql = "DELETE from groups where ID = '"+ id+"'";
        
        //clear fields
        boxrname.setText("");
        boxgrp.setText("");
        boxsgrp.setText("");
        
        try {
                pst = con.prepareStatement(sql);
                pst.execute();
              
                //Load table
                 tableload();
                
                
            } catch (SQLException ex) {
//                Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null, "Do you want to Update this?");
        
          
               if(x==0)
               {
               
          String a = idno.getText();
          String b = boxrname.getText();
          String c = boxgrp.getText();
          String d = boxsgrp.getText();
               
          String sql = "UPDATE groups SET RoomName = '"+ b +"',GrpName = '"+ c +"',SubGroup = '"+ d +"' where ID = '"+ a +"'";
             
          
          //clear
          boxrname.setText("");
          boxgrp.setText("");
          boxsgrp.setText("");
          
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
              
                //Load table
                 tableload();
                
                
            } catch (SQLException ex) {
//                Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            }
          
               }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        
        int raw = jTable3.getSelectedRow();
        
        String id= jTable3.getValueAt(raw,0 ).toString();
        String name= jTable3.getValueAt(raw,1 ).toString();
        String gr= jTable3.getValueAt(raw,2 ).toString();
        String sgr= jTable3.getValueAt(raw,3 ).toString();
        
        
        
        boxrname.setText(name);
        boxgrp.setText(gr);
        boxsgrp.setText(sgr);
        idno.setText(id);
        
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String name1 = cc.getText();
        String sql = "Select ID,RoomName,GrpName,SubGroup from groups where RoomName LIKE '%"+ name1 +"%'"; 
        
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void boxrnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxrnameKeyReleased
        // TODO add your handling code here:
        vroom.setText("");
    }//GEN-LAST:event_boxrnameKeyReleased

    private void boxgrpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxgrpKeyReleased
        // TODO add your handling code here:
        vgrp.setText("");
    }//GEN-LAST:event_boxgrpKeyReleased

    private void boxsgrpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxsgrpKeyReleased
        // TODO add your handling code here:
        vsgrp.setText("");
    }//GEN-LAST:event_boxsgrpKeyReleased

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
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Groups().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxgrp;
    private javax.swing.JTextField boxrname;
    private javax.swing.JTextField boxsgrp;
    private javax.swing.JTextField cc;
    private javax.swing.JLabel grp;
    private javax.swing.JTextField idno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel rname;
    private javax.swing.JLabel sgrp;
    private javax.swing.JLabel vgrp;
    private javax.swing.JLabel vroom;
    private javax.swing.JLabel vsgrp;
    // End of variables declaration//GEN-END:variables
}
