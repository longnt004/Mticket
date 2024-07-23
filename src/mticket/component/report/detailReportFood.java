/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mticket.component.report;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.text.DateFormatSymbols;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import mticket.component.transitionForm.Transition;
import mticket.dao.foodDAO;
import mticket.dao.reportDAO;
import mticket.entity.Food;
import mticket.utils.mticketUtils;

/**
 *
 * @author HuyTinh
 */
public class detailReportFood extends Transition {

    /**
     * Creates new form detailMovie
     */
    foodDAO fDAO = new foodDAO();
    Map<String, Food> fMovie = new HashMap<>();

    public detailReportFood() {
        initComponents();
        chart.setFillColor(true);
        chart.addLegend("Food", Color.decode("#e65c00"), Color.decode("#F9D423"));
        mticket.utils.mticketUtils.setFont(btnBack, "Kodchasan-Medium.ttf", 14f);
        mticket.utils.mticketUtils.setFont(cboFood, "Kodchasan-Medium.ttf", 14f);
        mticket.utils.mticketUtils.setFont(chart, "Kodchasan-Bold.ttf", 12f);
        chart.setdRF(this);
        chart.setfTST(formTransition1);
        chart.getBlankPlotChart().setCursor(new Cursor(Cursor.HAND_CURSOR));
        new Thread(new Runnable() {
            @Override
            public void run() {
                initDataFood();
                initDataForComboBox();
            }
        }).start();
    }

    void initDataFood() {
        for (Food f : fDAO.selectAll()) {
            fMovie.put(f.getTenThucAn(), f);
        }
    }

    void initDataForComboBox() {
        DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboFood.getModel();
        cboModel.removeAllElements();
        for (String string : fMovie.keySet()) {
            cboModel.addElement(string);
        }
    }

    public void initDetailFood(Food f) {
        if (f.getTenThucAn().length() > 38) {
            txtTenThucAn.setText(f.getTenThucAn().substring(0, 39) + "...");
        } else {
            txtTenThucAn.setText(f.getTenThucAn());
        }
        mticket.utils.mticketUtils.setFont(txtTenThucAn, "Kodchasan-Medium.ttf", 36f);
        mticketUtils.setIcon(new ImageIcon(getClass().getResource("/mticket/image/" + f.getHinhThucAn())), pictureBox1, 20);
        setName(f.getMaThucAn());
        setData(f.getMaThucAn());
    }

    public void setData(String idMovie) {
        for (int i = 0; i < 12; i++) {
            String monthString = new DateFormatSymbols().getMonths()[i];
            List<Object[]> lO = reportDAO.getAmountFoodByIdAdMonth(idMovie, monthString);
            double n = (lO.isEmpty()) ? 0 : Double.parseDouble(String.valueOf(lO.get(0)[0]));
            chart.addData(new ModelChart(monthString, new double[]{n}));
        }
        chart.start();
    }

    public void eventBack(MouseAdapter event) {
        btnBack.addMouseListener(event);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        food1 = new com.k33ptoo.components.KGradientPanel();
        pictureBox1 = new mticket.component.pictureBox.PictureBox();
        txtTenThucAn = new javax.swing.JLabel();
        chart = new mticket.component.report.CurveLineChart();
        btnBack = new com.k33ptoo.components.KButton();
        food2 = new com.k33ptoo.components.KGradientPanel();
        formTransition1 = new mticket.component.transitionForm.FormTransition();
        cboFood = new mticket.component.comboSuggestion.ComboBoxSuggestionFood();

        setBackground(new java.awt.Color(255, 255, 255));

        food1.setBackground(new java.awt.Color(255, 255, 255));
        food1.setkBorderRadius(18);
        food1.setkEndColor(new Color(249,212,35));
        food1.setkStartColor(new Color(230,92,0));
        food1.setOpaque(false);
        food1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        food1.add(pictureBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 572, 740));

        txtTenThucAn.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        txtTenThucAn.setText("Tên Thức Ăn:");
        txtTenThucAn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new Color(230,92,0)));

        chart.setForeground(new java.awt.Color(0, 0, 0));

        btnBack.setText("< Back");
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.setkEndColor(new Color(249,212,35));
        btnBack.setkHoverEndColor(new Color(230,92,0));
        btnBack.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnBack.setkHoverStartColor(new Color(230,92,0));
        btnBack.setkStartColor(new Color(230,92,0));
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackkButton3ActionPerformed(evt);
            }
        });

        food2.setBackground(new java.awt.Color(255, 255, 255));
        food2.setkBorderRadius(18);
        food2.setkEndColor(new Color(249,212,35));
        food2.setkStartColor(new Color(230,92,0));
        food2.setOpaque(false);

        javax.swing.GroupLayout food2Layout = new javax.swing.GroupLayout(food2);
        food2.setLayout(food2Layout);
        food2Layout.setHorizontalGroup(
            food2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 909, Short.MAX_VALUE)
            .addGroup(food2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(food2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(formTransition1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        food2Layout.setVerticalGroup(
            food2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(food2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(food2Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(formTransition1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        cboFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(food1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenThucAn, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                            .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(599, Short.MAX_VALUE)
                    .addComponent(food2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(food1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTenThucAn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(490, Short.MAX_VALUE)
                    .addComponent(food2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackkButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackkButton3ActionPerformed
        // TODO add your handling code here:
        chart.clear();
//         formTransition1.showForm(new detailDateReportFood(1, formTransition1.getName()));
        formTransition1.showForm(chart.dDRF);
    }//GEN-LAST:event_btnBackkButton3ActionPerformed

    private void cboFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboFoodActionPerformed
        // TODO add your handling code here:
                chart.clear();
        Food f = fMovie.get(String.valueOf(cboFood.getSelectedItem()));
        if (f != null) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    initDetailFood(f);
                }
            }).start();
            formTransition1.setName(f.getMaThucAn());
            formTransition1.showForm(chart.dDRF);
            chart.dDRF.initDataDateInMonth(1, formTransition1.getName());
        }
    }//GEN-LAST:event_cboFoodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnBack;
    private mticket.component.comboSuggestion.ComboBoxSuggestionFood cboFood;
    private mticket.component.report.CurveLineChart chart;
    private com.k33ptoo.components.KGradientPanel food1;
    private com.k33ptoo.components.KGradientPanel food2;
    private mticket.component.transitionForm.FormTransition formTransition1;
    private mticket.component.pictureBox.PictureBox pictureBox1;
    private javax.swing.JLabel txtTenThucAn;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component[] initTransition() {
        return new Component[]{};
    }
}
