/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.entity;

/**
 *
 * @author user
 */
public class NhaXuatBan {
    private String MaNXB;
    private String TenNXB;

    @Override
    public String toString() {
        return this.getTenNXB();
    }

    public NhaXuatBan() {
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }


    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }
    
}
