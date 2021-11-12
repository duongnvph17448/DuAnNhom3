/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JdbcHelper;
import MODEL.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DuongNVPH
 */
public class SanPhamDAO implements HairSalonDAO<SanPham, String>{
    
    
    String insert = "insert into sanpham values(?,?,?,?,?)";
    String update = "update sanpham set tensanpham=?,giatien=?,donvitinh=?,tinhtrang=? where masanpham=? ";
    String delete = "delete from sanpham where masanpham=?";
    String select_by_id = "select * from sanpham where masanpham=?";
    String select_all = "select * from sanpham";
    
    
    
    
    
    
    
    private ArrayList<SanPham> selectBySQL(String sql , Object...args){
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {                
                SanPham model = new SanPham();
                String maSanPham = rs.getString("masanpham");
                String tenSanPham = rs.getString("tensanpham");
                float giaTien = rs.getFloat("giatien");
                String donViTinh = rs.getString("donvitinh");
                String tinhTrang = rs.getString("tinhtrang");
                model.setMaSanPham(maSanPham);
                model.setTenSanPham(tenSanPham);
                model.setGiaTien(giaTien);
                model.setDonViTinh(donViTinh);
                model.setTinhTrang(tinhTrang);
                list.add(model);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
     
        }
        return list ;
    }

    @Override
    public void insert(SanPham model) {
        try {
            JdbcHelper.executeUpdate(insert, model.getMaSanPham(),model.getTenSanPham(),model.getGiaTien(),
                    model.getDonViTinh(),model.getTinhTrang());
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(SanPham model) {
        try {
            JdbcHelper.executeUpdate(update,model.getTenSanPham(),model.getGiaTien(),
                    model.getDonViTinh(),model.getTinhTrang(), model.getMaSanPham());
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            JdbcHelper.executeUpdate(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public SanPham selectByID(String id) {
        ArrayList<SanPham> list = new ArrayList<>();
        list = selectBySQL(select_by_id, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public ArrayList<SanPham> selectAll() {
        return selectBySQL(select_all);
    }
}
