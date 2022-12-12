/*
 * GovernmentAdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package presentation.government.mayor;


import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.network.Network;
import business.userAccount.UserAccount;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Rishabh
 */
public class MayorMayorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network network;
         private DB4OUtil db4OUtil;
     public EcoSystem system;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public MayorMayorJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        db4OUtil = DB4OUtil.getInstance();
        system = db4OUtil.retrieveSystem();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        lblValue.setText(lblValue.getText() + " " + account.getEmployee().getName());

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        btnWastageAvoided = new javax.swing.JButton();
        btnPeopleFed = new javax.swing.JButton();
        btnWastageAvoidedChart = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setText("Mayor Work Area");

        lblValue.setText("Welcome, ");

        btnWastageAvoided.setText("View Wastage Avoided by Restaurants(Tabular)");
        btnWastageAvoided.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWastageAvoidedActionPerformed(evt);
            }
        });

        btnPeopleFed.setText("View People Fed by NGOs");
        btnPeopleFed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleFedActionPerformed(evt);
            }
        });

        btnWastageAvoidedChart.setText("View Wastage Avoided by Restaurant(Chart)");
        btnWastageAvoidedChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWastageAvoidedChartActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/shutdown.png"))); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPeopleFed, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnWastageAvoided, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnWastageAvoidedChart, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(754, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(logoutBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblHeading)))
                .addGap(84, 84, 84)
                .addComponent(lblValue)
                .addGap(49, 49, 49)
                .addComponent(btnWastageAvoided)
                .addGap(24, 24, 24)
                .addComponent(btnWastageAvoidedChart)
                .addGap(24, 24, 24)
                .addComponent(btnPeopleFed)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPeopleFedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleFedActionPerformed

        ViewNGODataJPanel governmentMayorViewPeopleFedJPanel = new ViewNGODataJPanel(userProcessContainer, network);
        userProcessContainer.add("GovernmentMayorViewPeopleFedJPanel", governmentMayorViewPeopleFedJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnPeopleFedActionPerformed

    private void btnWastageAvoidedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWastageAvoidedActionPerformed

        ViewWastageAvoidedByRestaurantsJPanel governmentMayorViewWastageAvoidedByRestaurants = new ViewWastageAvoidedByRestaurantsJPanel(userProcessContainer, network);
        userProcessContainer.add("GovernmentMayorViewWastageAvoidedByRestaurants", governmentMayorViewWastageAvoidedByRestaurants);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWastageAvoidedActionPerformed

    private void btnWastageAvoidedChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWastageAvoidedChartActionPerformed
        // TODO add your handling code here:
        AnalyticViewChartJPanel governmentMayorViewChart = new AnalyticViewChartJPanel(userProcessContainer, network);
        userProcessContainer.add("GovernmentMayorViewChart", governmentMayorViewChart);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWastageAvoidedChartActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) this.getParent().getLayout();
        layout.previous(this.getParent());
        this.getParent().remove(this);
        db4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPeopleFed;
    private javax.swing.JButton btnWastageAvoided;
    private javax.swing.JButton btnWastageAvoidedChart;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblValue;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables

}
