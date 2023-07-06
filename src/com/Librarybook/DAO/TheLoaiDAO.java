/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.NhanVien;
import com.Librarybook.entity.TheLoai;
import com.Librarybook.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class TheLoaiDAO extends SystemDAO<TheLoai, String> {

    @Override
    public void insert(TheLoai entity) {
        String sql = "insert into TheLoaiSach (MaTheLoai, TenTheLoai) values(?,?)";
        Xjdbc.update(sql, entity.getMaTheLoai(),
                entity.getTenTheLoai()
        );
    }

    @Override
    public void update(TheLoai entity) {
        String sql = "update TheLoaiSach set TenTheLoai = ? where MaTheLoai = ?";
        Xjdbc.update(sql, entity.getTenTheLoai(),
                    entity.getMaTheLoai()
                );
    }

    @Override
    public void delete(String id) {
        String sql = "Delete from TheLoaiSach where MaTheLoai = ?";
        Xjdbc.update(sql, id);
    }

    @Override
    public List<TheLoai> selectAll() {
        String sql = "select * from TheLoaiSach";
        return this.selectBySql(sql);
    }

    @Override
    public TheLoai selectById(String MaTheLoai) {
        String sql = "select * from TheLoaiSach where MaTheLoai = ?";
                        List<TheLoai> list = this.selectBySql(sql, MaTheLoai);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<TheLoai> selectBySql(String sql, Object... args) {
            List<TheLoai> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                TheLoai entity = new TheLoai();
                entity.setMaTheLoai(rs.getString("MaTheLoai"));
                entity.setTenTheLoai(rs.getString("TenTheLoai"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
    public List<TheLoai> selectByKeyword(String keyword) {
        String sql = "select * from TheLoaiSach where MaTheLoai LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
