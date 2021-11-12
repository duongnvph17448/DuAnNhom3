/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import DAO.NguoiDungDAO;
import HELPER.DialogHelper;
import HELPER.ShareHelper;
import MODEL.NguoiDung;

/**
 *
 * @author DuongNVPH
 */
public class DangNhapJDialog extends javax.swing.JDialog {

    /**
     * Creates new form DangNhapJDialog
     */
    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        lblQuenMatKhau = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDangKy = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        lblInvisible = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đăng Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 204, 204))); // NOI18N

        jLabel1.setText("Tài khoản :");

        jLabel2.setText("Mật khẩu :");

        txtTenDangNhap.setText("DuongNV");

        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        lblQuenMatKhau.setForeground(new java.awt.Color(0, 0, 255));
        lblQuenMatKhau.setText("Quên mật khẩu ?");
        lblQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseClicked(evt);
            }
        });

        jLabel4.setText("Bạn đã có tài khoản ?");

        lblDangKy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDangKy.setText("Đăng ký");
        lblDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangKyMouseClicked(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblInvisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/invisible.png"))); // NOI18N
        lblInvisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInvisibleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblInvisibleMouseReleased(evt);
            }
        });

        txtPassWord.setText("123456");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblQuenMatKhau)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(btnThoat)
                                .addGap(18, 18, 18)
                                .addComponent(btnDangNhap))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenDangNhap)
                                    .addComponent(txtPassWord))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblInvisible)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDangKy)
                        .addGap(38, 38, 38))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInvisible, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap)
                    .addComponent(lblQuenMatKhau)
                    .addComponent(btnThoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDangKy))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        dangNhap();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void lblQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblQuenMatKhauMouseClicked

    private void lblDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangKyMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.dispose();
            DangKyJDialog dk = new DangKyJDialog(null,true);
            dk.setVisible(true);
        }
    }//GEN-LAST:event_lblDangKyMouseClicked

    private void lblInvisibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvisibleMousePressed
        // TODO add your handling code here:
        txtPassWord.setEchoChar((char) 0);
    }//GEN-LAST:event_lblInvisibleMousePressed

    private void lblInvisibleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvisibleMouseReleased
        // TODO add your handling code here:
        txtPassWord.setEchoChar('*');
    }//GEN-LAST:event_lblInvisibleMouseReleased

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        thoat();
    }//GEN-LAST:event_btnThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDangKy;
    private javax.swing.JLabel lblInvisible;
    private javax.swing.JLabel lblQuenMatKhau;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
    NguoiDungDAO dao = new NguoiDungDAO();
    void init(){
        setLocationRelativeTo(null);
        setFocusable(true);
    }
    void dangNhap(){
        String tenDangNhap = txtTenDangNhap.getText();
        String matKhau = new String(txtPassWord.getPassword());
        NguoiDung nguoiDung = dao.selectByID(tenDangNhap);
        if (tenDangNhap.equals("")) {
            DialogHelper.alert(this, "Vui lòng điền tên đăng nhập");
        }else if(matKhau.equals("")){
            DialogHelper.alert(this, "Vui lòng điền mật khẩu");
        }else if(nguoiDung == null){
            DialogHelper.alert(this, "Sai tên đăng nhập");
        }else if(!nguoiDung.getMatKhau().equals(matKhau)){
            DialogHelper.alert(this, "Sai mật khẩu");
        }else{
            ShareHelper.user= nguoiDung  ;
            DialogHelper.alert(this, "Đăng nhập thành công !");
            this.dispose();
        }
    }
    void thoat(){
        System.exit(0);
    }
}
