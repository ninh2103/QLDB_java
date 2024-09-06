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
public class CauThu extends NhanVien {

    @Override
    public double tinhLuong() {
        if (soBanThang >= 5) {
            return (luongThoaThuan + PHU_CAP_MOT_NAM) + luongThoaThuan / 2;

        }
        return luongThoaThuan + PHU_CAP_MOT_NAM;
    }

    int soBanThang;
    double luongThoaThuan;

    public CauThu() {
    }

    public CauThu(int soBanThang, double luongThoaThuan, String maNV, String hoTen, String gioiTinh, String quoctich, Date ngayKHD, Date ngayHHD) {
        super(maNV, hoTen, gioiTinh, quoctich, ngayKHD, ngayHHD);
        this.soBanThang = soBanThang;
        this.luongThoaThuan = luongThoaThuan;
    }

    public int getSoBanThang() {
        return soBanThang;
    }

    public void setSoBanThang(int soBanThang) {
        this.soBanThang = soBanThang;
    }

    public double getLuongThoaThuan() {
        return luongThoaThuan;
    }

    public void setLuongThoaThuan(double luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }

    @Override
    public String toString() {
        return super.toString() + "soBanThang=" + soBanThang + ", luongThoaThuan=" + luongThoaThuan + tinhLuong();
    }

}
