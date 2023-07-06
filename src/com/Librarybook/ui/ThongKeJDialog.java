/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.ui;

import com.Librarybook.DAO.ThongKeDAO;
import com.Librarybook.utils.Auth;
import com.Librarybook.utils.Ximage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author my
 */
public class ThongKeJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ThongKe
     */
    public ThongKeJDialog(java.awt.Frame parent, boolean modal, int index) {
        super(parent, modal);
        initComponents();
        this.init();
        this.selectTab(index);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        cbobandoc = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbandoc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cbosach = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsach = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        cbotienphat = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbltienphat = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbldongho = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        Tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Tabs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        cbobandoc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbobandoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bạn đọc chưa trả sách ", "Bạn đọc quá hạn ", "Bạn đọc nhiều nhất " }));
        cbobandoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbobandocItemStateChanged(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 0, 0));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/open-book.png"))); // NOI18N
        jLabel34.setText("Lựa chọn thông tin bạn muốn thống kê!");

        tblbandoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblbandoc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(cbobandoc, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cbobandoc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addContainerGap())
        );

        Tabs.addTab("Số người đọc", new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/Clien list.png")), jPanel3); // NOI18N

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 0, 0));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/open-book.png"))); // NOI18N
        jLabel36.setText("Lựa chọn thông tin bạn muốn thống kê!");

        cbosach.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbosach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Số sách mượn theo ngày ", "Tổng số sách mượn tháng " }));
        cbosach.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbosachItemStateChanged(evt);
            }
        });

        tblsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblsach);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbosach, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbosach, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
        );

        Tabs.addTab("Thống kê sách", new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/publisher.png")), jPanel4); // NOI18N

        cbotienphat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbotienphat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thống kê tiền phạt", "Tổng tiền phạt theo tháng ", " " }));
        cbotienphat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbotienphatItemStateChanged(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 0, 0));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/open-book.png"))); // NOI18N
        jLabel35.setText("Lựa chọn thông tin bạn muốn thống kê!");

        tbltienphat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbltienphat);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(cbotienphat, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cbotienphat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addContainerGap())
        );

        Tabs.addTab("Thống kê tiền phạt", new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/bill.png")), jPanel5); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("LibraryBooks");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/favpng_fpt-polytechnic-logo-image-symbol2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Trường Cao Đẳng FPT Polytechnic - Hà Nội");

        lbldongho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldongho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/alarm-clock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbldongho, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbldongho, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel3)
                .addGap(59, 59, 59))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Hệ thống quản lý thư viện ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(441, 441, 441))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ThongKeDAO dao = new ThongKeDAO();
    private void cbobandocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbobandocItemStateChanged
        // TODO add your handling code here:
        try {
            int index = cbobandoc.getSelectedIndex();
            if (index == 0) {
                ResultSet chuatrasach = dao.chuatrasach();
                DefaultTableModel tkdg = (DefaultTableModel) tblbandoc.getModel();
                tkdg.setColumnCount(0);
                tkdg.addColumn("ma Tài Khoản");
                tkdg.addColumn("tên Tài Khoản");
                tkdg.setRowCount(0);
                while (chuatrasach.next()) {
                    tkdg.addRow(new Object[]{chuatrasach.getString(1), chuatrasach.getString(2)});
                }
            }
            if (index == 1) {
                ResultSet quahan = dao.quahantra();
                DefaultTableModel tkdg = (DefaultTableModel) tblbandoc.getModel();
                tkdg.setColumnCount(0);
                tkdg.addColumn("tên Tài Khoản");
                tkdg.addColumn("ngày mượn");
                tkdg.addColumn("số ngày mượn");
                tkdg.addColumn("ngày thực trả");
                tkdg.addColumn("số ngày quá hạn");

                tkdg.setRowCount(0);
                while (quahan.next()) {
                    tkdg.addRow(new Object[]{quahan.getString(1), quahan.getString(2), quahan.getInt(3), quahan.getString(4), quahan.getInt(5)});
                }
            }
            if (index == 2) {
                ResultSet quahan = dao.muonnhiunhat();
                DefaultTableModel tkdg = (DefaultTableModel) tblbandoc.getModel();
                tkdg.setColumnCount(0);
                tkdg.addColumn("tên Tài Khoản");
                tkdg.addColumn("số lần mượn");
                tkdg.setRowCount(0);
                while (quahan.next()) {
                    tkdg.addRow(new Object[]{quahan.getString(2), quahan.getInt(1)});
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cbobandocItemStateChanged

    private void cbosachItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbosachItemStateChanged
        // TODO add your handling code here:
        try {
            int index = cbosach.getSelectedIndex();
            if (index == 0) {
                ResultSet sachmuonnhiunhat = dao.sachdocnhiunhat();
                DefaultTableModel sach = (DefaultTableModel) tblsach.getModel();
                sach.setColumnCount(0);
                sach.addColumn("Mã Sách");
                sach.addColumn("Tên Sách");
                sach.setRowCount(0);
                while (sachmuonnhiunhat.next()) {

                    sach.addRow(new Object[]{sachmuonnhiunhat.getString(2), sachmuonnhiunhat.getString(3), sachmuonnhiunhat.getInt(1), sachmuonnhiunhat.getString(4)});
                }
            }
            if (index == 1) {
                ResultSet quahan = dao.sachnhatthang();
                DefaultTableModel tkdg = (DefaultTableModel) tblsach.getModel();
                tkdg.setColumnCount(0);
                tkdg.addColumn("Tháng");
                tkdg.addColumn("Số Sách Được Mượn");

                tkdg.setRowCount(0);
                while (quahan.next()) {
                    tkdg.addRow(new Object[]{quahan.getString(2), quahan.getInt(1)});
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ThongKeJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbosachItemStateChanged

    private void cbotienphatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbotienphatItemStateChanged
        // TODO add your handling code here:
        try {
            ResultSet chuatrasach = dao.chuatrasach();
            DefaultTableModel tkdg = (DefaultTableModel) tblbandoc.getModel();
            tkdg.setColumnCount(0);
            tkdg.addColumn("ma Tài Khoản");
            tkdg.addColumn("tên Tài Khoản");
            tkdg.setRowCount(0);
            while (chuatrasach.next()) {
                tkdg.addRow(new Object[] {chuatrasach.getString(1), chuatrasach.getString(2)});
            }
            
            ResultSet sachmuonnhiunhat = dao.sachdocnhiunhat();
            DefaultTableModel sach = (DefaultTableModel) tblsach.getModel();
            sach.setColumnCount(0);
            sach.addColumn("Mã Sách");
            sach.addColumn("Tên Sách");
            sach.addColumn("Số Lần Mượn Sách");
            sach.addColumn("Ngày Mượn");
            
            sach.setRowCount(0);
            while (sachmuonnhiunhat.next()) {
                
                sach.addRow(new Object[] {sachmuonnhiunhat.getString(2), sachmuonnhiunhat.getString(3),sachmuonnhiunhat.getInt(1), sachmuonnhiunhat.getString(4)});
            }
            
            DefaultTableModel tien = (DefaultTableModel) tbltienphat.getModel();
            tien.setColumnCount(0);
            tien.addColumn("Tháng");
            tien.addColumn("Tổng Tiền");
            
            ResultSet tienphat = dao.tienphatthang();
            
            tien.setRowCount(0);
            while (tienphat.next()) {
                tien.addRow(new Object[] {tienphat.getString(1), tienphat.getString(2)});
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeJDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbotienphatItemStateChanged

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
            java.util.logging.Logger.getLogger(ThongKeJDialog.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int index = 0;
                ThongKeJDialog dialog = new ThongKeJDialog(new javax.swing.JFrame(), true, index);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JComboBox<String> cbobandoc;
    private javax.swing.JComboBox<String> cbosach;
    private javax.swing.JComboBox<String> cbotienphat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbldongho;
    private javax.swing.JTable tblbandoc;
    private javax.swing.JTable tblsach;
    private javax.swing.JTable tbltienphat;
    // End of variables declaration//GEN-END:variables
private void init() {
                this.selectTab(0);
        if (!Auth.isManager()) {
            Tabs.remove(3);
        }

        this.setLocationRelativeTo(null);
        this.setIconImage(Ximage.getAppIcon());

        new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");//hh : giờ mm : phút ss: giây a : sáng chiều
                String text = formater.format(now);
                lbldongho.setText(text);
            }
        }).start();
    }
    public void selectTab(int index) {
        Tabs.setSelectedIndex(index);
    }
}