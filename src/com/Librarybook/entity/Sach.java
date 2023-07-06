/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.entity;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Sach {

    private String MaSach;
    private String TenSach;
    private String maTheLoai;
    private String tenTacGia;
    private String tenNXB;
    private int soLuong;
    private String tomTatND;
    private String hinh;

    public Sach(String maSach, String tenSach, String maTheLoai, String tacGia, String NXB, int soLuongC, String tomTatND, String hinhsach) {
        this.MaSach = maSach;
        this.TenSach = tenSach;
        this.maTheLoai = maTheLoai;
        this.tenTacGia = tacGia;
        this.tenNXB = NXB;
        this.soLuong = soLuongC;
        this.tomTatND = tomTatND;
        this.hinh = hinhsach;
    }

    public Sach() {
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTomTatND() {
        return tomTatND;
    }

    public void setTomTatND(String tomTatND) {
        this.tomTatND = tomTatND;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

}
