/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.Sach;
import com.Librarybook.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class SachDAO extends SystemDAO<Sach, String> {

    @Override
    public void insert(Sach entity) {
        String sql = "INSERT INTO Sach (MaSach, TenSach, MaTheLoai, TenTacGia, TenNXB, SoLuong, NoiDung, Hinh) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Xjdbc.update(sql, entity.getMaSach(),
                entity.getTenSach(),
                entity.getMaTheLoai(),
                entity.getTenTacGia(),
                entity.getTenNXB(),
                entity.getSoLuong(),
                entity.getTomTatND(),
                entity.getHinh()
        );
    }

    @Override
    public void update(Sach entity) {
        String sql = "UPDATE Sach SET TenSach=?, MaTheLoai=?, TenTacGia=?, TenNXB=?, SoLuong=?, NoiDung = ? Hinh = ? WHERE MaSach=?";
        Xjdbc.update(sql, entity.getTenSach(),
                entity.getMaTheLoai(),
                entity.getTenTacGia(),
                entity.getTenNXB(),
                entity.getSoLuong(),
                entity.getTomTatND(),
                entity.getHinh(),
                entity.getMaSach()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM Sach WHERE MaSach=?";
        Xjdbc.update(sql, id);
    }

    @Override
    public List<Sach> selectAll() {
        String sql = "select * from Sach";
        return this.selectBySql(sql);
    }

    @Override
    public Sach selectById(String MaSach) {
        String sql = "select * from Sach where MaSach = ?";
        List<Sach> list = this.selectBySql(sql, MaSach);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<Sach> selectBySql(String sql, Object... args) {
        List<Sach> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                Sach entity = new Sach();
                entity.setMaSach(rs.getString("MaSach"));
                entity.setTenSach(rs.getString("TenSach"));
                entity.setMaTheLoai(rs.getString("MaTheLoai"));
                entity.setTenTacGia(rs.getString("TenTacGia"));
                entity.setTenNXB(rs.getString("TenNXB"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setTomTatND(rs.getString("NoiDung"));
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public List<Sach> selectByKeyword(String keyword) {
        String sql = "select * from Sach where TenSach LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    public List<Sach> selectByNXBvaTG(String nxb, String tacGia) {
        String sql = "select * from Sach where MaNXB = ? and MaTacGia =?";
        return this.selectBySql(sql, nxb, tacGia);
    }

    public List<Sach> selectByNXBvaTG2(String nxb) {
        String sql = "select * from Sach where MaNXB = ?";
        return this.selectBySql(sql, nxb);
    }

    public List<Sach> selectByNXBvaTG3(String tacGia) {
        String sql = "select * from Sach where MaTacGia= ?";
        return this.selectBySql(sql, tacGia);
    }
}
