/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author DuongNVPH
 */
public class ChiTietHoaDon {
    private int maChiTietHoaDon ;
    private float giamGia ;
    private float thanhTien ;
    private String maHoaDon ;
    private String maSanPham ;
    private String maDichVu ;
    
    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maChiTietHoaDon, float giamGia, float thanhTien, String maHoaDon, String maSanPham, String maDichVu) {
        this.maChiTietHoaDon = maChiTietHoaDon;
        this.giamGia = giamGia;
        this.thanhTien = thanhTien;
        this.maHoaDon = maHoaDon;
        this.maSanPham = maSanPham;
        this.maDichVu = maDichVu;
    }

    public int getMaChiTietHoaDon() {
        return maChiTietHoaDon;
    }

    public void setMaChiTietHoaDon(int maChiTietHoaDon) {
        this.maChiTietHoaDon = maChiTietHoaDon;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    
    
    
}
