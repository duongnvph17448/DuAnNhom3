/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author DuongNVPH
 */
public class NhanVien {
    private String maNhanVien ;
    private String hoTen ;
    private Date ngaySinh ;
    private Date ngayNhanVien ;
    private String diaChi ;
    private String soDienThoai ;
    private String ghiChu ;
    private String maLoaiNhanVien ;
    private String tenDangNhap ;

    public NhanVien(String maNhanVien, String hoTen, Date ngaySinh, Date ngayNhanVien, String diaChi, String soDienThoai, String ghiChu, String maLoaiNhanVien, String tenDangNhap) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngayNhanVien = ngayNhanVien;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.ghiChu = ghiChu;
        this.maLoaiNhanVien = maLoaiNhanVien;
        this.tenDangNhap = tenDangNhap;
    }


    public NhanVien() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayNhanVien() {
        return ngayNhanVien;
    }

    public void setNgayNhanVien(Date ngayNhanVien) {
        this.ngayNhanVien = ngayNhanVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaLoaiNhanVien() {
        return maLoaiNhanVien;
    }

    public void setMaLoaiNhanVien(String maLoaiNhanVien) {
        this.maLoaiNhanVien = maLoaiNhanVien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }
    
    
    
}
