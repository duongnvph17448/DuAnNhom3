/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JdbcHelper;
import MODEL.LoaiNhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DuongNVPH
 */
public class LoaiNhanVienDAO implements HairSalonDAO<LoaiNhanVien, String>{
    
    String insert = "insert into loainhanvien values(?,?,?)";
    String update = "update loainhanvien set tenloainhanvien=?,luong=? where maloainhanvien=?" ;
    String delete = "delete from loainhanvien where maloainhanvien=?";
    String select_by_id = "select * from loainhanvien where maloainhanvien=?";
    String select_all = "select * from loainhanvien";
    
    
    
    
    private ArrayList<LoaiNhanVien> selectBySQL(String sql , Object...args){
        ArrayList<LoaiNhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {                
                LoaiNhanVien model = new LoaiNhanVien();
                String maLoaiNhanVien = rs.getString("maloainhanvien");
                String tenLoaiNhanVien = rs.getString("tenloainhanvien");
                float luong = rs.getFloat("luong");
                model.setMaLoaiNhanVien(maLoaiNhanVien);
                model.setTenLoaiNhanVien(tenLoaiNhanVien);
                model.setLuong(luong);
                list.add(model);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
     
        }
        return list ;
    }

    @Override
    public void insert(LoaiNhanVien model){
        try {
            JdbcHelper.executeUpdate(insert, model.getMaLoaiNhanVien(),model.getTenLoaiNhanVien(),model.getLuong());
        } catch (SQLException ex) {
            Logger.getLogger(LoaiNhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(LoaiNhanVien model) {
        try {
            JdbcHelper.executeUpdate(update, model.getTenLoaiNhanVien(),model.getLuong(),model.getMaLoaiNhanVien());
        } catch (SQLException ex) {
            Logger.getLogger(LoaiNhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try { 
            JdbcHelper.executeUpdate(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(LoaiNhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LoaiNhanVien selectByID(String id) {
        ArrayList<LoaiNhanVien> list = new ArrayList<>();
        list = selectBySQL(select_by_id, id);
        if (list.isEmpty()) {
            return null ;
        }else{
            return list.get(0);
        }
    }
    

    @Override
    public ArrayList<LoaiNhanVien> selectAll() {
        return selectBySQL(select_all);
    }
    
}
