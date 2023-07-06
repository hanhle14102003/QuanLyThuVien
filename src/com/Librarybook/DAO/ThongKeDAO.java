/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.utils.Xjdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ThongKeDAO {
//    --- 1. Bạn đọc chưa trả sách

    public ResultSet chuatrasach() {
        String sql = "SELECT b.MaNV, b.TenNV \n"
                + "FROM dbo.PhieuMuon AS a, dbo.NhanVien AS b\n"
                + "WHERE a.MaNV = b.MaNV AND a.trangThai = N'Chưa trả'";
        try {
            PreparedStatement pre = Xjdbc.getConnection().prepareStatement(sql);
            ResultSet result = pre.executeQuery();

            return result;
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//    --- 2. Bạn đọc mượn quá hạn

    public ResultSet quahantra() {
        String sql = "SELECT c.TenNV, a.ngayMuon, a.soNgayMuon, b.NgayTra, ((DAY(b.NgayTra) - DAY(a.ngayMuon)) - a.soNgayMuon) AS 'Số ngày quá hạn' \n"
                + "                    FROM dbo.PhieuMuon AS a, dbo.CTPhieuMuon AS b, dbo.NhanVien AS c\n"
                + "                    WHERE a.MaPM = b.MaPM AND a.MaNV = c.MaNV \n"
                + "                    	AND DAY(b.NgayTra) - DAY(a.NgayMuon) > a.SoNgayMuon";
        try {
            PreparedStatement pre = Xjdbc.getConnection().prepareStatement(sql);
            ResultSet result = pre.executeQuery();

            return result;
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//    --- 3. Bạn đọc mượn nhiều nhất

    public ResultSet muonnhiunhat() {
        String sql = "SELECT DISTINCT TOP 1 COUNT(a.MaNV) AS 'Số lần mượn', b.TenNV\n"
                + "                    FROM dbo.PhieuMuon AS a, dbo.NhanVien AS b\n"
                + "                    WHERE a.MaNV = b.MaNV\n"
                + "                    GROUP BY b.TenNV\n"
                + "                    ORDER BY [Số lần mượn] DESC";
        try {
            PreparedStatement pre = Xjdbc.getConnection().prepareStatement(sql);
            ResultSet result = pre.executeQuery();

            return result;
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

//    --- 4. Sách được mượn nhiều nhất theo ngày
    public ResultSet sachdocnhiunhat() {
        String sql = "SELECT DISTINCT TOP 1 COUNT(a.MaSach) AS 'Số lần mượn trong ngày', a.maSach, b.tenSach, c.ngayMuon\n"
                + "                    FROM dbo.CTPhieuMuon AS a, dbo.Sach AS b, dbo.PhieuMuon AS c\n"
                + "                    WHERE a.MaPM = c.MaPM AND a.maSach = b.maSach\n"
                + "                    GROUP BY c.ngayMuon, a.maSach, b.tenSach";
        try {
            PreparedStatement pre = Xjdbc.getConnection().prepareStatement(sql);
            ResultSet result = pre.executeQuery();

            return result;
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//--- 5. Tổng số sách đượn mượn theo từng tháng
    public ResultSet sachnhatthang() {
        String sql = "SELECT COUNT(a.maSach) AS 'Số sách được mượn trong tháng',MONTH(c.ngayMuon) AS 'Tháng'\n"
                + "                FROM dbo.CTPhieuMuon AS a, dbo.Sach AS b, dbo.PhieuMuon AS c\n"
                + "                WHERE a.MaPM = c.MaPM AND a.maSach = b.maSach\n"
                + "                GROUP BY MONTH(c.ngayMuon)";
        try {
            PreparedStatement pre = Xjdbc.getConnection().prepareStatement(sql);
            ResultSet result = pre.executeQuery();

            return result;
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//--- 6. Tổng tiền phạt theo tháng

    public ResultSet tienphatthang() {
        String sql = "SELECT MONTH(a.NgayTra) AS 'Tháng', SUM(a.TienPhat) AS 'Tổng tiền phạt'\n"
                + "                    FROM dbo.CTPhieuMuon AS a, dbo.PhieuMuon AS b\n"
                + "                    WHERE a.MaPM = b.MaPM\n"
                + "                    GROUP BY MONTH(a.NgayTra)";
        try {
            PreparedStatement pre = Xjdbc.getConnection().prepareStatement(sql);
            ResultSet result = pre.executeQuery();

            return result;
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
