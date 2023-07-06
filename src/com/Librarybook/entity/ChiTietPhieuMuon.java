/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Librarybook.entity;

import java.util.Date;

/**
 *
 * @author user
 */
public class ChiTietPhieuMuon {

    private String maPM;
    private String maSach;
    private Date NgayTra;
    private String tinhTrangSach;
    private int tienPhat;

    public ChiTietPhieuMuon(String maPM, String maSach, Date NgayTra, String tinhTrangSach, int tienPhat) {
        this.maPM = maPM;
        this.maSach = maSach;
        this.NgayTra = NgayTra;
        this.tinhTrangSach = tinhTrangSach;
        this.tienPhat = tienPhat;
    }

    public ChiTietPhieuMuon() {
    }

    public String getMaPM() {
        return maPM;
    }

    public void setMaPM(String maPM) {
        this.maPM = maPM;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getTinhTrangSach() {
        return tinhTrangSach;
    }

    public void setTinhTrangSach(String tinhTrangSach) {
        this.tinhTrangSach = tinhTrangSach;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

}
