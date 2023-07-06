/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.NhaXuatBan;
import com.Librarybook.entity.NhanVien;
import com.Librarybook.utils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class NhaXuatBanDAO extends SystemDAO<NhaXuatBan, String> {

    @Override
    public void insert(NhaXuatBan entity) {
        String sql = "insert into NhaXuatBan (MaNXB, TenNXB) values(?,?)";
        Xjdbc.update(sql, entity.getMaNXB(),
                entity.getTenNXB()
        );
    }

    @Override
    public void update(NhaXuatBan entity) {
        String sql = "update NhaXuatBan set TenNXB = ? where MaNXB = ?";
        Xjdbc.update(sql, entity.getTenNXB(),
                entity.getMaNXB()
        );
    }

    @Override
    public void delete(String MaNXB) {
        String sql = "DELETE FROM NhaXuatBan where MaNXB = ?";
        Xjdbc.update(sql, MaNXB);
    }

    @Override
    public List<NhaXuatBan> selectAll() {
        String sql = "select * from NhaXuatBan";
        return this.selectBySql(sql);
    }

    @Override
    public NhaXuatBan selectById(String MaNXB) {
        String sql = "SELECT * from NhaXuatBan where MaNXB = ?";
        List<NhaXuatBan> list = this.selectBySql(sql, MaNXB);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    public NhaXuatBan selectByIdd(String TenNXB) {
        String sql = "select * from NhaXuatBan where tenNXB = ?";
        List<NhaXuatBan> list = this.selectBySql(sql, TenNXB);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    @Override
    protected List<NhaXuatBan> selectBySql(String sql, Object... args) {
        List<NhaXuatBan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Xjdbc.query(sql, args);
                while (rs.next()) {
                    NhaXuatBan entity = new NhaXuatBan();
                    entity.setMaNXB(rs.getString("MaNXB"));
                    entity.setTenNXB(rs.getString("TenNXB"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return list;
    }
        public List<NhaXuatBan> selectByKeyword(String keyword) {
        String sql = "select * from NhaXuatBan where TenNXB LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
