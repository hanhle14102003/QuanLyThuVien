/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.DAO;

import com.Librarybook.entity.TacGia;
import com.Librarybook.utils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class TacGiaDAO extends SystemDAO<TacGia, String> {

    @Override
    public void insert(TacGia entity) {
        String sql = "insert into TacGia (MaTacGia,TenTacGia) values (?,?)";
        Xjdbc.update(sql, entity.getMaTacGia(),
                entity.getTenTacGia()
        );
    }

    @Override
    public void update(TacGia entity) {
        String sql = "update TacGia set TenTacGia = ? where MaTacGia = ?";
        Xjdbc.update(sql, entity.getTenTacGia(),
                entity.getMaTacGia()
        );
    }

    @Override
    public void delete(String id) {
        String sql = "Delete from TacGia where MaTacGia = ?";
        Xjdbc.update(sql, id);
    }

    @Override
    public List<TacGia> selectAll() {
        String sql = "select * from TacGia";
        return selectBySql(sql);
    }

    @Override
    public TacGia selectById(String id) {
        String sql = "select * from TacGia where MaTacGia = ?";
        List<TacGia> list = this.selectBySql(sql, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public TacGia selectByIdd(String TenTG) {
        String sql = "select * from TacGia where TenTacGia = ?";
        List<TacGia> list = this.selectBySql(sql, TenTG);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<TacGia> selectBySql(String sql, Object... args) {
        List<TacGia> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                TacGia tg = new TacGia();
                tg.setMaTacGia(rs.getString("MaTacGia"));
                tg.setTenTacGia(rs.getString("TenTacGia"));
                list.add(tg);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<TacGia> selectByKeyword(String keyword) {
        String sql = "select * from TacGia where TenTacGia LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
}
