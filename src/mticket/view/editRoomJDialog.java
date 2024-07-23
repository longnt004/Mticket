/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package mticket.view;

import java.awt.Color;
import java.awt.Cursor;
import java.util.List;
import mticket.component.room.listEditRoomCard;
import mticket.component.sweetAlert.SweetAlert;
import mticket.dao.roomDAO;
import mticket.entity.Room;
import mticket.utils.mticketUtils;

/**
 *
 * @author HuyTinh
 */
public class editRoomJDialog extends SweetAlert {

    /**
     * Creates new form editMovieJDialog
     */
    roomDAO rDAO = new roomDAO();

    public editRoomJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().setOpaque(false);
        getContentPane().setBackground(new Color(0, 0, 0, 0));
        setBackground(new Color(0, 0, 0, 0));
        mticketUtils.setFont(lblTenPhong, "Kodchasan-Bold.ttf", 14f);
        mticketUtils.setFont(txtTenPhong, "Kodchasan-Medium.ttf", 14f);
        mticketUtils.setFont(btnLuu, "Kodchasan-Medium.ttf", 14f);
        mticketUtils.setFont(btnThoat, "Kodchasan-Medium.ttf", 14f);
    }

    // Đổ dữ liệu lên form
    public void initData(Room r) {
        txtTenPhong.setText(r.getTenPhong());
    }

    // Lấy dữ liệu từ form
    Room getForm() {
        List<Room> lR = rDAO.selectAll();
        String maPhong = lR.get(lR.size() - 1).getMaPhong();
        return new Room(mticketUtils.autoIncreaseId(maPhong), txtTenPhong.getText());
    }

    // Thêm dữ liệu vào CSDL
    void insertRoom() {
        Room stf = getForm();
        if (rDAO.selectById(stf.getMaPhong()) != null) {
            rDAO.update(stf);
            mticketUtils.alert("Cập nhật thành công!");
            this.dispose();
        } else {
            rDAO.insert(stf);
            mticketUtils.alert("Thêm thành công!");
            this.dispose();
        }
        listEditRoomCard.lR.initData(rDAO.selectAll());
    }

    boolean validateForm() {
        if (txtTenPhong.getText().isEmpty()) {
            mticketUtils.alert("Vui lòng nhập tên nhân viên!");
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        movie4 = new com.k33ptoo.components.KGradientPanel();
        movie3 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        lblTenPhong = new javax.swing.JLabel();
        btnLuu = new com.k33ptoo.components.KButton();
        txtTenPhong = new javax.swing.JTextField();
        btnThoat = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new Color(0,0,0,0));

        movie4.setBackground(new java.awt.Color(255, 255, 255));
        movie4.setkBorderRadius(18);
        movie4.setkEndColor(new Color(76,76,153));
        movie4.setkFillBackground(false);
        movie4.setkStartColor(new Color(159,153,255));
        movie4.setOpaque(false);
        movie4.setLayout(new java.awt.BorderLayout());

        movie3.setBackground(new java.awt.Color(255, 255, 255));
        movie3.setkBorderRadius(18);
        movie3.setkEndColor(new java.awt.Color(204, 204, 204));
        movie3.setkStartColor(new java.awt.Color(204, 204, 204));
        movie3.setMinimumSize(new java.awt.Dimension(100, 100));
        movie3.setOpaque(false);
        movie3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new Color(159, 153, 255));
        kGradientPanel2.setkStartColor(new Color(76, 76, 153));
        kGradientPanel2.setOpaque(false);

        kGradientPanel3.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setOpaque(false);

        lblTenPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenPhong.setText("Tên Phòng:");
        lblTenPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(159,153,255)));

        btnLuu.setText("Lưu");
        btnLuu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLuu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLuu.setkEndColor(new Color(159,153,255));
        btnLuu.setkHoverEndColor(new Color(76,76,153));
        btnLuu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnLuu.setkHoverStartColor(new Color(159,153,255));
        btnLuu.setkStartColor(new Color(76,76,153));
        btnLuu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuukButton3ActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setkEndColor(new Color(159,153,255));
        btnThoat.setkHoverEndColor(new Color(76,76,153));
        btnThoat.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnThoat.setkHoverStartColor(new Color(159,153,255));
        btnThoat.setkStartColor(new Color(76,76,153));
        btnThoat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatkButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(lblTenPhong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenPhong)
                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        movie3.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 470, 90));

        movie4.add(movie3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(movie4, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(movie4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuukButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuukButton3ActionPerformed
        // TODO add your handling code here:
        if (validateForm()) {
            insertRoom();
        }
    }//GEN-LAST:event_btnLuukButton3ActionPerformed

    private void btnThoatkButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatkButton3ActionPerformed
        // TODO add your handling code here:
        closeAlert();
    }//GEN-LAST:event_btnThoatkButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(editStaffJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editStaffJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editStaffJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editStaffJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editRoomJDialog dialog = new editRoomJDialog(new javax.swing.JFrame(), true);
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
    private com.k33ptoo.components.KButton btnLuu;
    private com.k33ptoo.components.KButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblTenPhong;
    private com.k33ptoo.components.KGradientPanel movie3;
    private com.k33ptoo.components.KGradientPanel movie4;
    private javax.swing.JTextField txtTenPhong;
    // End of variables declaration//GEN-END:variables
}
