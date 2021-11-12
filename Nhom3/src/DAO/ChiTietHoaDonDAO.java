/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JdbcHelper;
import MODEL.ChiTietHoaDon;
import MODEL.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DuongNVPH
 */
public class ChiTietHoaDonDAO implements HairSalonDAO<ChiTietHoaDon, Integer>{
    String insert = "insert into chitiethoadon(giamgia,thanhtien,mahoadon,masanpham,madichvu)  values(?,?,?,?,?)";
    String update = "update chitiethoadon set giamgia=?,thanhtien=?,mahoadon=? ,masanpham=?,madichvu=? where machitiethoadon=?" ;
    String delete = "delete from chitiethoadon where machitiethoadon=?";
    String select_by_id = "select * from chitiethoadon where machitiethoadon=?";
    String select_all = "select * from chitiethoadon";
    private ArrayList<ChiTietHoaDon> selectBySQL(String sql , Object...args){
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {                
                ChiTietHoaDon model = new ChiTietHoaDon();
                model.setMaChiTietHoaDon(rs.getInt("machitiethoadon"));
                model.setGiamGia(rs.getFloat("giamgia"));
                model.setThanhTien(rs.getFloat("thanhtien"));
                model.setMaHoaDon(rs.getString("mahoadon"));
                model.setMaSanPham(rs.getString("masanpham"));
                model.setMaDichVu(rs.getString("madichvu"));
                list.add(model);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
     
        }
        return list ;
    }

    @Override
    public void insert(ChiTietHoaDon model) {
        try {
            JdbcHelper.executeUpdate(insert, model.getGiamGia(),model.getThanhTien(),model.getMaHoaDon(),model.getMaSanPham(),model.getMaDichVu());
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ChiTietHoaDon model) {
        try {
            JdbcHelper.executeUpdate(update,model.getGiamGia(),model.getThanhTien(),model.getMaHoaDon(),model.getMaSanPham(),model.getMaDichVu(),model.getMaChiTietHoaDon());
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            JdbcHelper.executeUpdate(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietHoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ChiTietHoaDon selectByID(Integer id) {
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        list = selectBySQL(select_by_id, id);
        if (list.isEmpty()) {
            return null ;
        }else{
            return list.get(0);
        }
    }

    @Override
    public ArrayList<ChiTietHoaDon> selectAll() {
        return selectBySQL(select_all);
    }

    
}
