/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBongDa_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ninh
 */
public class DanhSachNhanVien {

    ArrayList<NhanVien> a = new ArrayList<>();

    public void themVaoNV(NhanVien nv) {
        a.add(nv);
    }

    public void readFile(String nameFile) {
        try {
            FileReader fr = new FileReader(nameFile);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;

                }
                String[] s = line.split(",");
                String maNV = s[1];
                String hoten = s[2];
                String gioiTinh = s[3];
                String quocTich = s[4];
                Date ngayKHD = chuyenChuoiThanhNgay(s[5]);
                Date ngayHHD = chuyenChuoiThanhNgay(s[6]);
                if (s[0].equalsIgnoreCase("1")) {
                    int soBanThang = Integer.parseInt(s[7]);
                    double luongThoaThuan = Double.parseDouble(s[8]);
                    CauThu ct = new CauThu(soBanThang, luongThoaThuan, maNV, hoten, gioiTinh, quocTich, ngayKHD, ngayHHD);
                    themVaoNV(ct);

                } else {
                    double phuCap = Double.parseDouble(s[7]);
                    int heSoLuong = Integer.parseInt(s[8]);
                    HuanLuyenVien hlv = new HuanLuyenVien(phuCap, heSoLuong, maNV, hoten, gioiTinh, quocTich, ngayKHD, ngayHHD);
                    themVaoNV(hlv);
                }

            }
            br.close();
            fr.close();

        } catch (Exception ex) {
        }
    }

    private Date chuyenChuoiThanhNgay(String nextline) {
        try {

            return new SimpleDateFormat("dd/MM/yyyy").parse(nextline);

        } catch (Exception e) {
        }

        return null;
    }

    public void xoaCauThuTruocNgayHHD(Date ngay) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof CauThu) {
                CauThu ct = (CauThu) a.get(i);
                if (ct.getNgayHHD().after(ngay)) {
                    a.remove(i);
                    i--;

                }

            }

        }

    }

    public NhanVien timkiemNVTheoMa(String ma) {
        for (NhanVien nv : a) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                return nv;

            }

        }
        return null;
    }

    public void sapXep() {
        Collections.sort(a, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                int cmp = Double.compare(o1.tinhLuong(), o2.tinhLuong());
                if (cmp > 0) {
                    return -1;

                }
                return 1;
            }
        });
    }

    public void ghifile(String tenFile) {
        try {
            FileWriter fw = new FileWriter(tenFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (NhanVien nv : a) {
                bw.write(nv.toString());

                bw.newLine();

            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(null, "loi ghi file");
        }

    }

    public double tongtien() {
        double s = 0;
        for (NhanVien nv : a) {
            if (nv instanceof CauThu) {
                s += nv.tinhLuong();

            }

        }
        return s;

    }
    public ArrayList<CauThu> layDSCauThuTheoBanThang(int sobanthang) {
        ArrayList<CauThu> b = new ArrayList<>();

        for (NhanVien nv : a) {
            if (nv instanceof CauThu && ((CauThu) nv).getSoBanThang()>= sobanthang) {
                b.add((CauThu) nv);

            }

        }
        return b;
    }

}
