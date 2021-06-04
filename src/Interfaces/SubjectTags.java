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
public class SubjectTags extends javax.swing.JFrame {

    java.sql.Connection con= null;
        java.sql.PreparedStatement pst=null;
        ResultSet rs = null;
        
    public SubjectTags() {
        initComponents();
        
         //connect to DB
        con = DBconnect.connect();
        
        
         //Load table
        tableload();
        
    }

    
    
     public void tableload(){
        
        try{
          String sql = "SELECT ID,RoomName,Subject,Tag FROM subject";
          pst = con.prepareStatement(sql);  
          rs = pst.executeQuery();
          
//          jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch (Exception e){
            
       }
        
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        snamebox = new javax.swing.JTextField();
        rnamebox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ss = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        tagbox = new javax.swing.JComboBox<>();
        idno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vroom = new javax.swing.JLabel();
        vsname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(962, 642));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Room Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Subject Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tag ");

        snamebox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        snamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameboxActionPerformed(evt);
            }
        });
        snamebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                snameboxKeyReleased(evt);
            }
        });

        rnamebox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rnamebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rnameboxKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 102, 255));
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
        jButton2.setMaximumSize(new java.awt.Dimension(71, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(71, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(71, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.setMaximumSize(new java.awt.Dimension(71, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(71, 25));
        jButton3.setPreferredSize(new java.awt.Dimension(71, 25));
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

        ss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tagbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tagbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Tag-", "Lecture", "Tutorial", "Lab" }));
        tagbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagboxActionPerformed(evt);
            }
        });

        idno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idno.setText("ID");

        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("ID No:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Room Name");

        vroom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vroom.setForeground(new java.awt.Color(255, 51, 0));

        vsname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vsname.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton5)
                    .addGap(62, 62, 62))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(65, 65, 65))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(357, 357, 357)
                            .addComponent(vroom, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(347, 347, 347)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(snamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tagbox, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(357, 357, 357)
                            .addComponent(vsname, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(273, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(idno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rnamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(vroom)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addComponent(vsname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tagbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void snameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu m1=new Menu();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
         String name1 = ss.getText();
         String sql = "Select ID,RoomName,Subject,Tag from subject where RoomName LIKE '%"+ name1 +"%'"; 
        
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception ex) {
//            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        
        //validation
        if(rnamebox.getText().trim().isEmpty() && snamebox.getText().trim().isEmpty()) {
            vroom.setText("Room Name is Empty");
            vsname.setText("Subject Name is Empty");
           
        }
        else if (rnamebox.getText().trim().isEmpty()){
            vroom.setText("Room Name is Empty");
        }
        
        else if (snamebox.getText().trim().isEmpty()){
            vsname.setText("Subject Name is Empty");
        }
        
        else {
        String rname = rnamebox.getText();
        String sub = snamebox.getText();
        String tug = tagbox.getSelectedItem().toString();
        
        //Clear feilds
        rnamebox.setText("");
        snamebox.setText("");
        tagbox.setSelectedItem("-Select Tag-");
        
        try{
            String q ="INSERT INTO subject (RoomName,Subject,Tag) values('"+rname+"','"+sub+"','"+tug+"')";
        pst = con.prepareStatement(q);
        pst.execute();
        
        //Load table
          tableload();
        
        
            
        }
        catch (Exception e){
            
       }
        
        
        }  
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tagboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tagboxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        int x = JOptionPane.showConfirmDialog(null, "Do you want to Delete this?");
        
        
        if(x==0)
        {
        String id = idno.getText();
        String sql = "DELETE from subject where ID = '"+ id+"'";
        
        //Clear feilds
        rnamebox.setText("");
        snamebox.setText("");
        tagbox.setSelectedItem("-Select Tag-");
        
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

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int raw = jTable2.getSelectedRow();
        
        String id= jTable2.getValueAt(raw,0 ).toString();
        String rname= jTable2.getValueAt(raw,1 ).toString();
        String subj= jTable2.getValueAt(raw,2 ).toString();
        String tagg= jTable2.getValueAt(raw,3 ).toString();
        
        
        rnamebox.setText(rname);
        snamebox.setText(subj);
        tagbox.setSelectedItem(tagg);
        idno.setText(id);
        
        
        
        
        
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null, "Do you want to Update this?");
        
          
               if(x==0)
               {
               
          String a = idno.getText();
          String b = rnamebox.getText();
          String c = snamebox.getText();
          String d = tagbox.getSelectedItem().toString();
          
               
          String sql = "UPDATE subject SET RoomName = '"+ b +"',Subject = '"+ c +"',Tag = '"+ d +"' where ID = '"+ a +"'";
             
          
          //clear
        rnamebox.setText("");
        snamebox.setText("");
        tagbox.setSelectedItem("-Select Tag-");
          
          
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

    private void ssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssActionPerformed

    private void rnameboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rnameboxKeyReleased
        // TODO add your handling code here:
        vroom.setText("");
    }//GEN-LAST:event_rnameboxKeyReleased

    private void snameboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snameboxKeyReleased
        // TODO add your handling code here:
        vsname.setText("");
    }//GEN-LAST:event_snameboxKeyReleased

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
            java.util.logging.Logger.getLogger(SubjectTags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectTags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectTags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectTags.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectTags().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField rnamebox;
    private javax.swing.JTextField snamebox;
    private javax.swing.JTextField ss;
    private javax.swing.JComboBox<String> tagbox;
    private javax.swing.JLabel vroom;
    private javax.swing.JLabel vsname;
    // End of variables declaration//GEN-END:variables
}
