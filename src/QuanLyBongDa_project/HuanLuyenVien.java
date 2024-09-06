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
public class HuanLuyenVien extends NhanVien {

    @Override
    public double tinhLuong() {
        int soNamCongtac = (int) (new Date().getTime() - ngayKHD.getTime())/(24 * 50 * 60 * 1000);
        double phuCapThamnien = soNamCongtac + PHU_CAP_MOT_NAM;
        return heSoluong * LUONG_CO_BAN * phuCap + phuCapThamnien;
    }
    double phuCap;
    int heSoluong;

    public HuanLuyenVien() {
    }

    public HuanLuyenVien(double phuCap, int heSoluong, String maNV, String hoTen, String gioiTinh, String quoctich, Date ngayKHD, Date ngayHHD) {
        super(maNV, hoTen, gioiTinh, quoctich, ngayKHD, ngayHHD);
        this.phuCap = phuCap;
        this.heSoluong = heSoluong;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public int getHeSoluong() {
        return heSoluong;
    }

    public void setHeSoluong(int heSoluong) {
        this.heSoluong = heSoluong;
    }

    public HuanLuyenVien(double phuCap, int heSoluong) {
        this.phuCap = phuCap;
        this.heSoluong = heSoluong;
    }

    @Override
    public String toString() {
        return super.toString() + "phuCap=" + phuCap + ", heSoluong=" + heSoluong + tinhLuong();
    }

}
