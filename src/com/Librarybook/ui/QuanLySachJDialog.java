    package com.Librarybook.ui;

import java.awt.Color;
import com.Librarybook.DAO.NhaXuatBanDAO;
import com.Librarybook.DAO.SachDAO;
import com.Librarybook.DAO.TacGiaDAO;
import com.Librarybook.DAO.TheLoaiDAO;
import com.Librarybook.entity.TheLoai;
import com.Librarybook.entity.Sach;
import com.Librarybook.entity.TheLoai;
import com.Librarybook.utils.MsgBox;
import com.Librarybook.utils.Ximage;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LE THANH TUAN
 */
public class QuanLySachJDialog extends javax.swing.JDialog {
JFileChooser fileChooser = new JFileChooser();
    /**
     * Creates new form QuanLySach
     */
    public QuanLySachJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        tblsach.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    boolean validates() {
        String masach = txtmatacgia.getText();
        if (sdao.selectById(masach) != null) {
            MsgBox.alert(this, "Trùng Mã Rồi!");
            this.clear();
        }
        if (txtmatacgia.getText().trim().length() == 0) {
            MsgBox.alert(this, "Mã Sách Không Được Bỏ Trống!");
            txtmatacgia.setBackground(Color.RED);
            txtmatacgia.requestFocus();
            return false;
        } else if (txttensach.getText().trim().length() == 0) {
            MsgBox.alert(this, "Tên Sách Không Được Bỏ Trống!");
            txttensach.setBackground(Color.RED);
            txttensach.requestFocus();
            return false;
        } else if (txtnoidung.getText().trim().length() == 0) {
            MsgBox.alert(this, "Nội Dung Không Được Để Trống Có Thể Điền Tên Sách Vào!");
            txtnoidung.setBackground(Color.red);
            txtnoidung.requestFocus();
        } else if (txtsoluong.getText().trim().length() == 0 || txtsoluong.getText().length() > 3) {
            MsgBox.alert(this, "Số Lượng Không Được Bỏ Trống và Không Được Quá 1000");
            txtsoluong.setBackground(Color.RED);
            txtsoluong.requestFocus();
            return false;
        }
        try {
            int Soluong = Integer.parseInt(txtsoluong.getText());
        } catch (Exception e) {
            MsgBox.alert(this, "Số Lượng Phải là Số");
            txtsoluong.setBackground(Color.red);
            txtsoluong.requestFocus();
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmatacgia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttensach = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtnoidung = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtmasach = new javax.swing.JTextField();
        txtmatheloai = new javax.swing.JTextField();
        txtmanhaxuatban = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FPoly_QuanLySach");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Quản Lý Sách ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã sách");

        txtmatacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatacgiaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tên tác giả");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Số lượng ");

        txtsoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoluongActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tên Sách ");

        txttensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttensachActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mã thể loại ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mã NXB");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Nội dung ");

        txtnoidung.setColumns(20);
        txtnoidung.setRows(5);
        jScrollPane2.setViewportView(txtnoidung);

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel5.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/icons8-waste-24.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel5.add(btnXoa);

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/Up.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel5.add(btnMoi);

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Librarybook/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel5.add(btnThem);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        btnFirst.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnFirst.setText("<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel6.add(btnFirst);

        btnPrev.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel6.add(btnPrev);

        btnNext.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel6.add(btnNext);

        btnLast.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLast.setText(">");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel6.add(btnLast);

        txtmasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmasachActionPerformed(evt);
            }
        });

        txtmatheloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatheloaiActionPerformed(evt);
            }
        });

        txtmanhaxuatban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanhaxuatbanActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ảnh sách ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        lblAnh.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        lblAnh.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblAnhAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnhMouseClicked(evt);
            }
        });
        jPanel7.add(lblAnh);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtmasach, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtmatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtsoluong, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtmatheloai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttensach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txtmanhaxuatban)))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txttensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmatheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmanhaxuatban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        tabs.addTab("Sách", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách ", "Mã thể loại ", "Tác Giả ", "NXB", "Số lượng ", "Nội dung"
            }
        ));
        tblsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsach);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        tabs.addTab("Thông tin", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 868, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txttensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttensachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttensachActionPerformed

    private void txtsoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoluongActionPerformed

    private void txtmatacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatacgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatacgiaActionPerformed

    private void txtmasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmasachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmasachActionPerformed

    private void txtmatheloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatheloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatheloaiActionPerformed

    private void txtmanhaxuatbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanhaxuatbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanhaxuatbanActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
        this.filltableSach();
        this.clear();
        this.row = -1;
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void tblsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsachMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblsach.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblsachMouseClicked

    private void lblAnhAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblAnhAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnhAncestorAdded

    private void lblAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnhMouseClicked
        // TODO add your handling code here
        this.chonAnh();
    }//GEN-LAST:event_lblAnhMouseClicked

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
            java.util.logging.Logger.getLogger(QuanLySachJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySachJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySachJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySachJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLySachJDialog dialog = new QuanLySachJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblsach;
    private javax.swing.JTextField txtmanhaxuatban;
    private javax.swing.JTextField txtmasach;
    private javax.swing.JTextField txtmatacgia;
    private javax.swing.JTextField txtmatheloai;
    private javax.swing.JTextArea txtnoidung;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttensach;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
    SachDAO sdao = new SachDAO();

    int row = -1;

    void init() {
        this.setLocationRelativeTo(null);

        this.filltableSach();
        this.row = -1;
        this.updateStatus();
    }
    public boolean checkNullHinh(){
        if(lblAnh.getToolTipText()!=null){
            return true;
        }else{
            MsgBox.alert(this, "Không được để trống hình.");
            return false;
        }
    }
    void filltableSach() {
        DefaultTableModel model = (DefaultTableModel) tblsach.getModel();
        model.setRowCount(0);
        try {
            String keywork = txttimkiem.getText();
            List<Sach> list = sdao.selectByKeyword(keywork);
            for (Sach s : list) {
                Object[] row = {
                    s.getMaSach(),
                    s.getTenSach(),
                    s.getMaTheLoai(),
                    s.getTenTacGia(),
                    s.getTenNXB(),
                    s.getSoLuong(),
                    s.getTomTatND(),
                    s.getHinh()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");
        }
    }

    void clear() {
        Sach s = new Sach();
        this.setform(s);
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String MaSach = (String) tblsach.getValueAt(this.row, 0);
        Sach s = sdao.selectById(MaSach);
        this.setform(s);
        this.updateStatus();
        tabs.setSelectedIndex(0);
    }

    void setform(Sach s) {
        txtmasach.setText(s.getMaSach());
        txttensach.setText(s.getTenSach());
        txtmatheloai.setText(s.getMaTheLoai());
        txtmatacgia.setText(s.getTenTacGia());
        txtmanhaxuatban.setText(s.getTenNXB());
        txtsoluong.setText(String.valueOf(s.getSoLuong()));
        txtnoidung.setText(s.getTomTatND());
        if (s.getHinh() != null) {
            lblAnh.setToolTipText(s.getHinh());
            lblAnh.setIcon(Ximage.read(s.getHinh()));
        }
    }

    Sach GetForm() {
        Sach s = new Sach();
        s.setMaSach(txtmatacgia.getText());
        s.setTenSach(txttensach.getText());
        s.setMaTheLoai(txtmatheloai.getText());
        s.setTenTacGia(txtmatacgia.getText());
        s.setTenNXB(txtmanhaxuatban.getText());
        s.setSoLuong(Integer.valueOf(txtsoluong.getText()));
        s.setTomTatND(txtnoidung.getText());
        s.setHinh(lblAnh.getToolTipText());
        return s;
    }

    void insert() {
        Sach s = GetForm();
        try {
            sdao.insert(s);
            this.filltableSach();
            this.clear();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (HeadlessException e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        Sach s = GetForm();
        try {
            sdao.update(s);
            this.filltableSach();
            this.clear();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        String s = txtmasach.getText();
        try {
            sdao.delete(s);
            this.filltableSach();
            this.clear();
            MsgBox.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Xóa thất bại!");
        }
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblsach.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblsach.getRowCount() - 1;
        this.edit();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblsach.getRowCount() - 1);
        // Trạng thái form
        txtmasach.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        // Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }
    void chonAnh() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            Ximage.save(file);
            ImageIcon icon = Ximage.read(file.getName());
            lblAnh.setIcon(icon);
            lblAnh.setToolTipText(file.getName());
        }
    }
}
