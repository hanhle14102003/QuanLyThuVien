/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.NhanVien;
import com.Librarybook.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class NhanVienDAO extends SystemDAO<NhanVien, String> {

    @Override
    public void insert(NhanVien entity) {
        String sql = "INSERT INTO NhanVien (MaNV, TenNV, SoDienThoai, GioiTinh, Email, MatKhau, VaiTro) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Xjdbc.update(sql,
                entity.getMaNV(),
                entity.getTenNV(),
                entity.getSoDienThoai(),
                entity.isGioiTinh(),
                entity.getEmail(),
                entity.getMatKhau(),
                entity.isVaiTRo());
    }

    @Override
    public void delete(String MaNV) {
        String sql = "DELETE FROM NhanVien WHERE MaNV=?";
        Xjdbc.update(sql, MaNV);
    }

    @Override
    public void update(NhanVien entity) {
        String sql = "UPDATE NhanVien SET TenNV=?, SoDienThoai=?, GioiTinh=?, Email=?, MatKhau=?, VaiTro=? WHERE MaNV=?";
        Xjdbc.update(sql,
                entity.getTenNV(),
                entity.getSoDienThoai(),
                entity.isGioiTinh(),
                entity.getEmail(),
                entity.getMatKhau(),
                entity.isVaiTRo(),
                entity.getMaNV());
    }

    @Override
    public List<NhanVien> selectAll() {
        String sql = "SELECT * FROM NhanVien";
        return this.selectBySql(sql);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setSoDienThoai(rs.getString("SoDienThoai"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setEmail(rs.getString("Email"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTRo(rs.getBoolean("VaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public NhanVien selectById(String manv) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV=?";
        List<NhanVien> list = this.selectBySql(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<NhanVien> selectByKeyword(String keyword) {
        String sql = "select * from NhanVien where TenNV LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
