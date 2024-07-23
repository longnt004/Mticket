/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mticket.view;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import mticket.component.report.detailReportFood;
import mticket.component.report.detailReportMovie;
import mticket.component.report.reportPanel;
import static mticket.component.schedule.movieSchedulePanel.mSP;
import mticket.dao.foodDAO;
import mticket.dao.movieDAO;
import mticket.dao.roomDAO;
import mticket.dao.showTimeDAO;
import mticket.dao.staffDAO;
import mticket.utils.mticketUtils;

/**
 *
 * @author HuyTinh
 */
public class managerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form managerJFrame
     */
    public static managerJFrame mFrame;

    public managerJFrame() {
        initComponents();
        dispose();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setVisible(true);
        this.mFrame = this;
        mticketUtils.setFont(jTabbedPane1, "Kodchasan-Bold.ttf", 22f);
        init();
    }

    // Đổ dữ liệu lên form 
    void init() {
        listEditMovieCard.initData(new movieDAO().selectAll());
        listEditStaffCard.initData(new staffDAO().selectAll());
        listEditFoodCard.initData(new foodDAO().selectAll());
        listEditRoomCard.initData(new roomDAO().selectAll());
        listEditShowTimeCard.initData(new showTimeDAO().selectAll());
        
        reportPanel reportPanel1 = new reportPanel();
        reportPanel1.setData();
        formTransition1.showForm(reportPanel1);
        reportPanel1.eventForDetailMovie(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reportPanel1.getChart().clear();
                reportPanel1.getChart().getfTST().showForm(reportPanel1.getChart().getmRP());
                detailReportMovie detailReportMovie1 = new detailReportMovie();
                formTransition1.showForm(detailReportMovie1);
                detailReportMovie1.eventBack(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        reportPanel1.setData();
                        formTransition1.showForm(reportPanel1);
                    }
                });
            }
        });
        reportPanel1.eventForDetailFood(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reportPanel1.getChart().clear();
                reportPanel1.getChart().getfTST().showForm(reportPanel1.getChart().getfRP());
                detailReportFood detailReportFood1 = new detailReportFood();
                formTransition1.showForm(detailReportFood1);
                detailReportFood1.eventBack(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        reportPanel1.setData();
                        formTransition1.showForm(reportPanel1);
                    }
                });
            }
        });
    }

    void logOut() {
        this.dispose();
        loginJDialog lDL = new loginJDialog(this, true);
        lDL.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movieSchedulePanel2 = new mticket.component.schedule.movieSchedulePanel();
        movie3 = new com.k33ptoo.components.KGradientPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        listEditMovieCard = new mticket.component.movie.listEditMovieCard();
        listEditStaffCard = new mticket.component.staff.listEditStaffCard();
        listEditFoodCard = new mticket.component.food.listEditFoodCard();
        listEditRoomCard = new mticket.component.room.listEditRoomCard();
        listEditShowTimeCard = new mticket.component.showTime.listEditShowTimeCard();
        movieSchedulePanel = new mticket.component.schedule.movieSchedulePanel();
        jPanel1 = new javax.swing.JPanel();
        formTransition1 = new mticket.component.transitionForm.FormTransition();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mticket");
        setIconImage(new ImageIcon(this.getClass().getResource("/mticket/image/logo.png")).getImage());

        movie3.setBackground(new java.awt.Color(255, 255, 255));
        movie3.setkBorderRadius(18);
        movie3.setkEndColor(new Color(76,76,153));
        movie3.setkStartColor(new Color(159,153,255));
        movie3.setOpaque(false);

        jTabbedPane1.setForeground(new Color(76,76,153));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });
        jTabbedPane1.addTab("Phim", listEditMovieCard);
        jTabbedPane1.addTab("Nhân Viên", listEditStaffCard);
        jTabbedPane1.addTab("Thức Ăn", listEditFoodCard);
        jTabbedPane1.addTab("Phòng", listEditRoomCard);
        jTabbedPane1.addTab("Suất Chiếu", listEditShowTimeCard);
        jTabbedPane1.addTab("Lịch Chiếu", movieSchedulePanel);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(formTransition1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Thống Kê", jPanel1);

        jButton1.setText("jButton1");
        jTabbedPane1.addTab("LogOut", jButton1);

        javax.swing.GroupLayout movie3Layout = new javax.swing.GroupLayout(movie3);
        movie3.setLayout(movie3Layout);
        movie3Layout.setHorizontalGroup(
            movie3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1502, Short.MAX_VALUE)
                .addContainerGap())
        );
        movie3Layout.setVerticalGroup(
            movie3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(movie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(movie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
//        if (jTabbedPane1.getSelectedIndex() == 5) {
//            movieSchedulePanel.init();
//            mSP.initMovieDrag(new movieDAO().selectAll());
//        }
//        if(jTabbedPane1.getSelectedIndex() == 7){
//            logOut();
//        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
         if (jTabbedPane1.getSelectedIndex() == 5) {
            movieSchedulePanel.init();
            mSP.initMovieDrag(new movieDAO().selectAll());
        }
        if(jTabbedPane1.getSelectedIndex() == 7){
            logOut();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(managerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(managerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(managerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(managerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mticket.component.transitionForm.FormTransition formTransition1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private mticket.component.food.listEditFoodCard listEditFoodCard;
    private mticket.component.movie.listEditMovieCard listEditMovieCard;
    private mticket.component.room.listEditRoomCard listEditRoomCard;
    private mticket.component.showTime.listEditShowTimeCard listEditShowTimeCard;
    private mticket.component.staff.listEditStaffCard listEditStaffCard;
    private com.k33ptoo.components.KGradientPanel movie3;
    private mticket.component.schedule.movieSchedulePanel movieSchedulePanel;
    private mticket.component.schedule.movieSchedulePanel movieSchedulePanel2;
    // End of variables declaration//GEN-END:variables
}
