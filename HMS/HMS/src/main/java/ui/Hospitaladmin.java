/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public class Hospitaladmin extends javax.swing.JFrame {

    /**
     * Creates new form Hospitaladmin
     */
    public Hospitaladmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        firstpage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        tfadd = new javax.swing.JTextField();
        tfpin = new javax.swing.JTextField();
        tfphoneno = new javax.swing.JTextField();
        CREATEBUTTON = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        LOGOUTB1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tfsearch1 = new javax.swing.JTextField();
        Updateb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstpage.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setText("NAME");

        jLabel2.setText("PINCODE");

        jLabel3.setText("ADDRESS");

        jLabel5.setText("PHONENO");

        CREATEBUTTON.setText("CREATE");
        CREATEBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEBUTTONActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setText("ENTER HOSPITAL DETAILS");

        jTable2.setBackground(new java.awt.Color(255, 51, 102));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "ADDRESS", "PINCODE", "PHONENO", "EMAILID"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        LOGOUTB1.setText("LOGOUT");
        LOGOUTB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTB1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel15.setText("SEARCH");

        tfsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsearch1ActionPerformed(evt);
            }
        });
        tfsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearch1KeyReleased(evt);
            }
        });

        Updateb.setText("UPDATE");
        Updateb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstpageLayout = new javax.swing.GroupLayout(firstpage);
        firstpage.setLayout(firstpageLayout);
        firstpageLayout.setHorizontalGroup(
            firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstpageLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(tfphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(553, 553, 553))
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(99, 99, 99)
                        .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(tfname, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(tfadd)
                            .addComponent(tfpin))
                        .addGap(116, 116, 116)
                        .addComponent(jLabel15)
                        .addGap(34, 34, 34)
                        .addComponent(tfsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addComponent(CREATEBUTTON)
                        .addGap(165, 165, 165)
                        .addComponent(LOGOUTB1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Updateb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
        );
        firstpageLayout.setVerticalGroup(
            firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstpageLayout.createSequentialGroup()
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9))
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tfsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6))
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CREATEBUTTON)
                    .addComponent(LOGOUTB1)
                    .addComponent(Updateb))
                .addContainerGap(495, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CREATEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEBUTTONActionPerformed
        if(tfname.getText().equals("")||tfadd.getText().equals("")||tfpin.getText().equals("")||tfphoneno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please Enter All Details");
    }//GEN-LAST:event_CREATEBUTTONActionPerformed
else
       {
           String data[]={tfname.getText(),tfadd.getText(),tfpin.getText(),tfphoneno.getText()};
              DefaultTableModel tb1Model=(DefaultTableModel)jTable2.getModel();
                tb1Model.addRow(data);
                JOptionPane.showMessageDialog(this,"Add Data Successfully!");
                tfname.setText("");
                tfadd.setText("");
                tfpin.setText("");
                tfphoneno.setText("");
       }
    
    }
    private void LOGOUTB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTB1ActionPerformed
              Loginpage p=new Loginpage();
        p.setVisible(true);
        this.dispose();                    
    }//GEN-LAST:event_LOGOUTB1ActionPerformed

    private void tfsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearch1ActionPerformed

    private void tfsearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearch1KeyReleased
        DefaultTableModel tableModel = (DefaultTableModel)jTable2.getModel();
        jTable2.getModel();
        TableRowSorter <DefaultTableModel> tb = new TableRowSorter <DefaultTableModel>(tableModel);
        jTable2.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(tfsearch1.getText()));             
    }//GEN-LAST:event_tfsearch1KeyReleased

    private void UpdatebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebActionPerformed
        DefaultTableModel tableModel=(DefaultTableModel)jTable2.getModel();
        if(jTable2.getSelectedRowCount()==1)
        {
            String name=tfname.getText();
            String address=tfadd.getText();
             String pincode=tfpin.getText();
              String phno=tfphoneno.getText();
        
          JOptionPane.showMessageDialog(this,"Updated Successfully");
        }
        else{
            if(jTable2.getRowCount()==0)
            {
               JOptionPane.showMessageDialog(this,"Table is Empty"); 
            }
            else{
                JOptionPane.showMessageDialog(this,"Please select a single row for updation"); 
            }
        }                                                                                    

    }//GEN-LAST:event_UpdatebActionPerformed

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
            java.util.logging.Logger.getLogger(Hospitaladmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospitaladmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospitaladmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospitaladmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospitaladmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CREATEBUTTON;
    private javax.swing.JButton LOGOUTB1;
    private javax.swing.JButton Updateb;
    private javax.swing.JPanel firstpage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tfadd;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfphoneno;
    private javax.swing.JTextField tfpin;
    private javax.swing.JTextField tfsearch1;
    // End of variables declaration//GEN-END:variables
}
