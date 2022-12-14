/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.logistics.worker;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import presentation.login.LoginNewJPanel;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Rishabh
 */
public class WorkerDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsWorkerJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;
    private DB4OUtil db4OUtil;
    public EcoSystem system;

    public WorkerDashboardJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        db4OUtil = DB4OUtil.getInstance();
        system = db4OUtil.retrieveSystem();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.network = network;
        lblName.setText(account.getEmployee().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        btnPickup = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblName.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblName.setText("Amit");

        btnPickup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/logistics.png"))); // NOI18N
        btnPickup.setText("Pickup Requests");
        btnPickup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPickup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupActionPerformed(evt);
            }
        });

        btnDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/work-request.png"))); // NOI18N
        btnDelivery.setText("Delivery Requests");
        btnDelivery.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelivery.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 102, 255));
        lblHeading.setText("Dashboard");

        lblEnterprise.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblEnterprise.setText("Welcome");

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
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnPickup, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnterprise)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(786, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPickup, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        DeliveryJPanel logsiticsWorkerDeliveryJPanel = new DeliveryJPanel(userProcessContainer, account, enterprise, network);
        userProcessContainer.add("WorkerDeliveryJPanel", logsiticsWorkerDeliveryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void btnPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupActionPerformed

        PickUpJPanel logisticsWorkerPickUpJPanel = new PickUpJPanel(userProcessContainer, account);
        userProcessContainer.add("LogisticsWorkerPickUpJPanel", logisticsWorkerPickUpJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnPickupActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) this.getParent().getLayout();
        layout.previous(this.getParent());
        this.getParent().remove(this);
        db4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnPickup;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
