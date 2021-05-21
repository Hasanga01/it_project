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

/**
 *
 * @author sithi
 */
public class Sessions extends javax.swing.JFrame {

        java.sql.Connection con= null;
        java.sql.PreparedStatement pst=null;
        ResultSet rs = null;
    
    public Sessions() {
        initComponents();
        
        //connect to DB
        con = DBconnect.connect();
        
        //Load table
        tableload();
    }

    
    
     public void tableload(){
        
        try{
          String sql = "SELECT ID,RoomName,Session,Session1,Session2 FROM sessions";
          pst = con.prepareStatement(sql);  
          rs = pst.executeQuery();
          
//          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable4.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch (Exception e){
            
       }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        Room = new javax.swing.JLabel();
        sess = new javax.swing.JLabel();
        Rnbox = new javax.swing.JTextField();
        sebox = new javax.swing.JTextField();
        sess1 = new javax.swing.JLabel();
        sess2 = new javax.swing.JLabel();
        se1box = new javax.swing.JComboBox<>();
        se2box = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tt = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        vroom = new javax.swing.JLabel();
        vses = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(962, 642));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("ID No:");

        idno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idno.setText("ID");

        jTable4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable4);

        Room.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Room.setText("Room Name");

        sess.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sess.setText("Session");

        Rnbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Rnbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RnboxKeyReleased(evt);
            }
        });

        sebox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seboxKeyReleased(evt);
            }
        });

        sess1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sess1.setText("Session 1");

        sess2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sess2.setText("Session 2");

        se1box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        se1box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select First Session-", "Lecture", "Tute", "Lab Sheet" }));
        se1box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se1boxActionPerformed(evt);
            }
        });

        se2box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        se2box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Second Session-", "Lecture", "Tute", "Lab Sheet" }));
        se2box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se2boxActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Room Name");

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

        vses.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vses.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jButton1)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sess)
                                    .addComponent(Room))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Rnbox, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(sebox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(sess2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(se2box, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(sess1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(se1box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(46, 46, 46)))))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(vses, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(vroom, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rnbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room)
                    .addComponent(se1box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sess1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vroom, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sess)
                    .addComponent(se2box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sess2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vses, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //validation
        if(Rnbox.getText().trim().isEmpty() && sebox.getText().trim().isEmpty()) {
            vroom.setText("Room Name is Empty");
            vses.setText("Session is Empty");
           
        }
        else if (Rnbox.getText().trim().isEmpty()){
            vroom.setText("Room Name is Empty");
        }
        
        else if (sebox.getText().trim().isEmpty()){
            vses.setText("Session is Empty");
        }
        
        else {
        String room=Rnbox.getText();
        String session=sebox.getText();
        String session1=se1box.getSelectedItem().toString();
        String session2=se2box.getSelectedItem().toString();
        
        
        //Clear feilds
        
        Rnbox.setText("");
        sebox.setText("");
        se1box.setSelectedItem("-Select First Session-");
        se2box.setSelectedItem("-Select Second Session-");
        
        
        try{
            String q ="INSERT INTO sessions (RoomName,Session,Session1,Session2) values('"+room+"','"+session+"','"+session1+"','"+session2+"')";
        pst = con.prepareStatement(q);
        pst.execute();
        
         //Load table
           tableload();
            
        }
        catch (Exception e){
            
       }
        
        } 
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void se2boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se2boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_se2boxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu m1=new Menu();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null, "Do you want to Delete this?");
        
        
        if(x==0)
        {
        String id = idno.getText();
        String sql = "DELETE from sessions where ID = '"+ id+"'";
        
        //clear fields
        Rnbox.setText("");
        sebox.setText("");
        se1box.setSelectedItem("-Select First Session-");
        se2box.setSelectedItem("-Select Second Session-");
        
        try {
                pst = con.prepareStatement(sql);
                pst.execute();
              
//                Load table
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
          String b = Rnbox.getText();
          String c = sebox.getText();
          String d = se1box.getSelectedItem().toString();
          String e = se2box.getSelectedItem().toString();
          
               
          String sql = "UPDATE sessions SET RoomName = '"+ b +"',Session = '"+ c +"',Session1 = '"+ d +"',Session2 = '"+ e +"' where ID = '"+ a +"'";
             
          
          //clear
        Rnbox.setText("");
        sebox.setText("");
        se1box.setSelectedItem("-Select First Session-");
        se2box.setSelectedItem("-Select Second Session-");
          
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

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        
         int raw = jTable4.getSelectedRow();
        
        String id= jTable4.getValueAt(raw,0 ).toString();
        String namer= jTable4.getValueAt(raw,1 ).toString();
        String sess= jTable4.getValueAt(raw,2 ).toString();
        String sess1= jTable4.getValueAt(raw,3 ).toString();
        String sess2= jTable4.getValueAt(raw,4 ).toString();
        
        Rnbox.setText(namer);
        sebox.setText(sess);
        se1box.setSelectedItem(sess1);
        se2box.setSelectedItem(sess2);
        idno.setText(id);
        
        
        
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
         String name1 = tt.getText();
         String sql = "Select ID,RoomName,Session,Session1,Session2 from sessions where RoomName LIKE '%"+ name1 +"%'"; 
        
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable4.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void se1boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se1boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_se1boxActionPerformed

    private void RnboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RnboxKeyReleased
        // TODO add your handling code here:
         vroom.setText("");
    }//GEN-LAST:event_RnboxKeyReleased

    private void seboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seboxKeyReleased
        // TODO add your handling code here:
         vses.setText("");
    }//GEN-LAST:event_seboxKeyReleased

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
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sessions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Rnbox;
    private javax.swing.JLabel Room;
    private javax.swing.JTextField idno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JComboBox<String> se1box;
    private javax.swing.JComboBox<String> se2box;
    private javax.swing.JTextField sebox;
    private javax.swing.JLabel sess;
    private javax.swing.JLabel sess1;
    private javax.swing.JLabel sess2;
    private javax.swing.JTextField tt;
    private javax.swing.JLabel vroom;
    private javax.swing.JLabel vses;
    // End of variables declaration//GEN-END:variables
}
