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
public class LoaiNhanVien {
    private String maLoaiNhanVien ;
    private String tenLoaiNhanVien ;
    private float luong ;

    public LoaiNhanVien() {
    }

    public LoaiNhanVien(String maLoaiNhanVien, String tenLoaiNhanVien, float luong) {
        this.maLoaiNhanVien = maLoaiNhanVien;
        this.tenLoaiNhanVien = tenLoaiNhanVien;
        this.luong = luong;
    }

    public String getMaLoaiNhanVien() {
        return maLoaiNhanVien;
    }

    public void setMaLoaiNhanVien(String maLoaiNhanVien) {
        this.maLoaiNhanVien = maLoaiNhanVien;
    }

    public String getTenLoaiNhanVien() {
        return tenLoaiNhanVien;
    }

    public void setTenLoaiNhanVien(String tenLoaiNhanVien) {
        this.tenLoaiNhanVien = tenLoaiNhanVien;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    
}
