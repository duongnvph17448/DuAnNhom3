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
public class SanPham {
    private String maSanPham ;
    private String tenSanPham ;
    private float giaTien ;
    private String donViTinh ;
    private String tinhTrang ;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, float giaTien, String donViTinh, String tinhTrang) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;

        this.giaTien = giaTien;
        this.donViTinh = donViTinh;
        this.tinhTrang = tinhTrang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
}
