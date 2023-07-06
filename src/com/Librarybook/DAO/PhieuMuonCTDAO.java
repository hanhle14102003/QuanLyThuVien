/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.ChiTietPhieuMuon;
import com.Librarybook.utils.Xjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class PhieuMuonCTDAO extends SystemDAO<ChiTietPhieuMuon, String> {

    @Override
    public void insert(ChiTietPhieuMuon entity) {
        String sql = "insert into CTPhieuMuon(MaPM, MaSach) values(?,?)";
        Xjdbc.update(sql, entity.getMaPM(),
                entity.getMaSach()
        );
    }

    @Override
    public void update(ChiTietPhieuMuon entity) {
        String sql = "update CTPhieuMuon set NgayTra = ?, TinhTrangSach = ? where MaPM = ?";
        Xjdbc.update(sql,
                entity.getNgayTra(),
                entity.getTinhTrangSach(),
                entity.getMaPM()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "delete from CTPhieuMuon where MaPM = ?";
        Xjdbc.update(sql, id);
    }

    @Override
    public ChiTietPhieuMuon selectById(String id) {
        String sql = "select * from CTPhieuMuon where MaPM = ?";
        List<ChiTietPhieuMuon> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<ChiTietPhieuMuon> selectBySql(String sql, Object... args) {
        List<ChiTietPhieuMuon> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                ChiTietPhieuMuon entity = new ChiTietPhieuMuon();
                entity.setMaPM(rs.getString("MaPM"));
                entity.setMaSach(rs.getString("MaSach"));
                entity.setNgayTra(rs.getDate("NgayTra"));
                entity.setTinhTrangSach(rs.getString("TinhTrangSach"));
                entity.setTienPhat(rs.getInt("TienPhat"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<ChiTietPhieuMuon> selectAll() {
        String sql = "Select * from CTPhieuMuon";
        return this.selectBySql(sql);
    }

}
