/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.NguoiMuon;
import com.Librarybook.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author my
 */
public class NguoiMuonDao extends SystemDAO<NguoiMuon, String> {

    @Override
    public void insert(NguoiMuon entity) {
        String sql = "INSERT INTO NguoiMuon (MaNguoiMuon, TenNguoiMuon, SDT, DiaChi, GioiTinh) VALUES (?, ?, ?, ?, ?)";
        Xjdbc.update(sql,
                entity.getMaNguoiMuon(),
                entity.getTenNguoiMuon(),
                entity.getSDT(),
                entity.getDiaChi(),
                entity.isGioiTinh());
               
    }

    @Override
    public void delete(String MaNM) {
        String sql = "DELETE FROM NguoiMuon WHERE MaNM=?";
        Xjdbc.update(sql, MaNM);
    }

    @Override
    public void update(NguoiMuon entity) {
        String sql = "UPDATE NhanVien SET TenNguoiMuon=?, SDT?=, DiaChi=?, GioiTinh=? WHERE MaNguoiMuon=?";
        Xjdbc.update(sql,
                entity.getTenNguoiMuon(),
                entity.getSDT(),
                entity.getDiaChi(),
                entity.isGioiTinh(),
                entity.getMaNguoiMuon());
    }

    @Override
    public List<NguoiMuon> selectAll() {
        String sql = "SELECT * FROM NguoiMuon";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NguoiMuon> selectBySql(String sql, Object... args) {
        List<NguoiMuon> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                NguoiMuon entity = new NguoiMuon();
                entity.setMaNguoiMuon(rs.getString("MaNguoiMuon"));
                entity.setTenNguoiMuon(rs.getString("TenNguoiMuon"));
                entity.setSDT(rs.getString("SDT"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public NguoiMuon selectById(String manm) {
        String sql = "SELECT * FROM NguoiMuon WHERE MaNguoiMuon=?";
        List<NguoiMuon> list = this.selectBySql(sql, manm);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<NguoiMuon> selectByKeyword(String keyword) {
        String sql = "select * from NguoiMuon where TenNguoiMuon LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
