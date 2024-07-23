/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mticket.component.report;

import com.k33ptoo.components.KGradientPanel;
import java.awt.Color;
import java.util.List;
import mticket.dao.reportDAO;
import mticket.utils.mticketUtils;

/**
 *
 * @author HuyTinh
 */
public class dateReportFoodCard extends javax.swing.JPanel {

    /**
     * Creates new form dateReportMovieCard
     */
    public KGradientPanel dateReportCard;
    
    public dateReportFoodCard() {
        initComponents();
        this.dateReportCard = movie15;
        mticket.utils.mticketUtils.setFont(jLabel2, "Kodchasan-Medium.ttf", 14f);
        mticket.utils.mticketUtils.setFont(jLabel1, "Kodchasan-Bold.ttf", 12f);
    }

    public dateReportFoodCard(String text, String idFood) {
        initComponents();
        jLabel1.setText(text);
        List<Object[]> lO = reportDAO.getAmountFoodByIdAdDate(idFood, text);
        double n = (lO.isEmpty()) ? 0 : Double.parseDouble(String.valueOf(lO.get(0)[0]));
        String currency = "Doanh thu: "+mticketUtils.toCurrency(n).substring(2) + " VND";
        jLabel2.setText(currency);
        mticket.utils.mticketUtils.setFont(jLabel2, "Kodchasan-Medium.ttf", 14f);
        mticket.utils.mticketUtils.setFont(jLabel1, "Kodchasan-Bold.ttf", 12f);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movie15 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);

        movie15.setBackground(new java.awt.Color(255, 255, 255));
        movie15.setkBorderRadius(18);
        movie15.setkEndColor(new Color(249,212,35));
        movie15.setkStartColor(new Color(230,92,0));
        movie15.setOpaque(false);

        kGradientPanel1.setkBorderRadius(18);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("01/10/2023");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(249,212,35)));

        jLabel2.setText("Doanh thu: 100,000,000,000 VND");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout movie15Layout = new javax.swing.GroupLayout(movie15);
        movie15.setLayout(movie15Layout);
        movie15Layout.setHorizontalGroup(
            movie15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        movie15Layout.setVerticalGroup(
            movie15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movie15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(movie15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(movie15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel movie15;
    // End of variables declaration//GEN-END:variables
}
