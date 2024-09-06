/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBongDa_project;

import java.util.Date;

/**
 *
 * @author Ninh
 */
public abstract class NhanVien implements IBongDa {

    String maNV, hoTen, gioiTinh, quoctich;
    Date ngayKHD, ngayHHD;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String gioiTinh, String quoctich, Date ngayKHD, Date ngayHHD) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.quoctich = quoctich;
        this.ngayKHD = ngayKHD;
        this.ngayHHD = ngayHHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public Date getNgayKHD() {
        return ngayKHD;
    }

    public void setNgayKHD(Date ngayKHD) {
        this.ngayKHD = ngayKHD;
    }

    public Date getNgayHHD() {
        return ngayHHD;
    }

    public void setNgayHHD(Date ngayHHD) {
        this.ngayHHD = ngayHHD;
    }

    @Override
    public String toString() {
        return "maNV=" + maNV + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", quoctich=" + quoctich + ", ngayKHD=" + ngayKHD + ", ngayHHD=" + ngayHHD;
    }

}
