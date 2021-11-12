/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JdbcHelper;
import MODEL.NguoiDung;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DuongNVPH
 */
public class NguoiDungDAO implements HairSalonDAO<NguoiDung, String>{
    String insert = "insert into nguoidung values(?,?,?)";
    String update = "update nguoidung set matkhau=?,vaitro=? where tenDangNhap=? ";
    String delete = "delete from nguoidung where tenDangNhap=?";
    String select_by_id = "select * from nguoidung where tenDangNhap=?";
    String select_all = "select * from nguoidung";
    
    
    
    
    
    private ArrayList<NguoiDung> selectBySQL(String sql ,Object... args){
        ArrayList<NguoiDung> list = new ArrayList<>();
        
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql,args);
            while (rs.next()) {
            NguoiDung model = new NguoiDung();
                String tenDangNhap = rs.getString("tenDangNhap");
                String matKhau = rs.getString("matkhau");
                boolean vaiTro = rs.getBoolean("vaiTro");
                model.setTenDangNhap(tenDangNhap);
                model.setMatKhau(matKhau);
                model.setVaiTro(vaiTro);
                list.add(model);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list ;
    }

    @Override
    public void insert(NguoiDung model) {
        try {
            JdbcHelper.executeUpdate(insert, model.getTenDangNhap(),model.getMatKhau(),model.getVaiTro());
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NguoiDung model) {
        try {
            JdbcHelper.executeUpdate(update,model.getMatKhau(),model.getVaiTro(),model.getTenDangNhap());
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            JdbcHelper.executeUpdate(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    public NguoiDung selectByID(String id) {
        ArrayList<NguoiDung> list = new ArrayList<>();
        list = selectBySQL(select_by_id, id);
        if (list.isEmpty()) {
            return null ;
        }else{
            return list.get(0);
        }
    }

    @Override
    public ArrayList<NguoiDung> selectAll() {
        return selectBySQL(select_all);
    }
    
    
}
