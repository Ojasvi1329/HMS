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

        jPanel1 = new javax.swing.JPanel();
        CREATEB = new javax.swing.JButton();
        UPDATEB = new javax.swing.JButton();
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
        secondpage = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfsearch = new javax.swing.JTextField();
        UPDATEB1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LOGOUTB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(null);

        CREATEB.setText("CREATE");
        CREATEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEBActionPerformed(evt);
            }
        });
        jPanel1.add(CREATEB);
        CREATEB.setBounds(10, 160, 100, 22);

        UPDATEB.setText("VIEW");
        UPDATEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEBActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATEB);
        UPDATEB.setBounds(10, 250, 110, 22);

        jPanel2.setLayout(new java.awt.CardLayout());

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

        javax.swing.GroupLayout firstpageLayout = new javax.swing.GroupLayout(firstpage);
        firstpage.setLayout(firstpageLayout);
        firstpageLayout.setHorizontalGroup(
            firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstpageLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(firstpageLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, firstpageLayout.createSequentialGroup()
                        .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(99, 99, 99)
                        .addGroup(firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(tfname, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(tfadd)
                            .addComponent(tfpin)))
                    .addComponent(CREATEBUTTON, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, firstpageLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(553, Short.MAX_VALUE))
        );
        firstpageLayout.setVerticalGroup(
            firstpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstpageLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
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
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CREATEBUTTON)
                .addContainerGap(618, Short.MAX_VALUE))
        );

        jPanel2.add(firstpage, "card2");

        secondpage.setBackground(new java.awt.Color(153, 255, 255));

        jLabel13.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        jLabel13.setText("VIEW/UPDATE PATIENTS DETAILS");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setText("SEARCH");

        tfsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsearchActionPerformed(evt);
            }
        });
        tfsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfsearchKeyReleased(evt);
            }
        });

        UPDATEB1.setText("UPDATE");
        UPDATEB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEB1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 51, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "ADDRESS", "PINCODE", "PHONENO", "BODYTEMP", "BP", "AGE", "WARDNO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        LOGOUTB.setText("LOGOUT");
        LOGOUTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout secondpageLayout = new javax.swing.GroupLayout(secondpage);
        secondpage.setLayout(secondpageLayout);
        secondpageLayout.setHorizontalGroup(
            secondpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondpageLayout.createSequentialGroup()
                .addGroup(secondpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secondpageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(secondpageLayout.createSequentialGroup()
                        .addGroup(secondpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(secondpageLayout.createSequentialGroup()
                                .addGap(598, 598, 598)
                                .addComponent(UPDATEB1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LOGOUTB))
                            .addGroup(secondpageLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(jLabel14)))
                        .addGap(27, 27, 27)
                        .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        secondpageLayout.setVerticalGroup(
            secondpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondpageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(secondpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(secondpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATEB1)
                    .addComponent(LOGOUTB))
                .addGap(384, 384, 384))
        );

        jPanel2.add(secondpage, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CREATEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEBActionPerformed
       jPanel2.removeAll();
       jPanel2.add(firstpage);
        jPanel2.repaint();
       jPanel2.revalidate();
    }//GEN-LAST:event_CREATEBActionPerformed

    private void UPDATEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEBActionPerformed
        jPanel2.removeAll();
        jPanel2.add(secondpage);
       jPanel2.repaint();
       jPanel2.revalidate();
    }//GEN-LAST:event_UPDATEBActionPerformed

    private void CREATEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEBUTTONActionPerformed
        if(tfname.getText().equals("")||tfadd.getText().equals("")||tfpin.getText().equals("")||tfphoneno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please Enter All Details");
    }//GEN-LAST:event_CREATEBUTTONActionPerformed
else
       {
           String data[]={tfname.getText(),tfadd.getText(),tfpin.getText(),tfphoneno.getText()};
              DefaultTableModel tb1Model=(DefaultTableModel)jTable1.getModel();
                tb1Model.addRow(data);
                JOptionPane.showMessageDialog(this,"Add Data Successfully!");
                tfname.setText("");
                tfadd.setText("");
                tfpin.setText("");
                tfphoneno.setText("");
       }
    
    }
    private void tfsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchActionPerformed

    private void tfsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfsearchKeyReleased
        DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
        jTable1.getModel();
        TableRowSorter <DefaultTableModel> tb = new TableRowSorter <DefaultTableModel>(tableModel);
        jTable1.setRowSorter(tb);
        tb.setRowFilter(RowFilter.regexFilter(tfsearch.getText()));
    }//GEN-LAST:event_tfsearchKeyReleased

    private void UPDATEB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEB1ActionPerformed
        DefaultTableModel tableModel=(DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRowCount()==1)
        {
            String name=tfname.getText();
            String address=tfadd.getText();
            String pincode=tfpin.getText();
            String phno=tfphoneno.getText();
            
            JOptionPane.showMessageDialog(this,"Updated Successfully");
        }
        else{
            if(jTable1.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(this,"Table is Empty");
            }
            else{
                JOptionPane.showMessageDialog(this,"Please select a single row for updation");
            }
        }
    }//GEN-LAST:event_UPDATEB1ActionPerformed

    private void LOGOUTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTBActionPerformed
        Loginpage p=new Loginpage();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUTBActionPerformed

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
    private javax.swing.JButton CREATEB;
    private javax.swing.JButton CREATEBUTTON;
    private javax.swing.JButton LOGOUTB;
    private javax.swing.JButton UPDATEB;
    private javax.swing.JButton UPDATEB1;
    private javax.swing.JPanel firstpage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel secondpage;
    private javax.swing.JTextField tfadd;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfphoneno;
    private javax.swing.JTextField tfpin;
    private javax.swing.JTextField tfsearch;
    // End of variables declaration//GEN-END:variables
}
