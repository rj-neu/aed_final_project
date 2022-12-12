/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.logistics.manager;


import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.userAccount.UserAccount;
import presentation.login.LoginNewJPanel;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Rishabh
 */
public class ManagerDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    private DB4OUtil db4OUtil;
    public EcoSystem system;

    public ManagerDashboardJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        db4OUtil = DB4OUtil.getInstance();
        system = db4OUtil.retrieveSystem();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        lblNameVal.setText(account.getEmployee().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameVal = new javax.swing.JLabel();
        btnRestaurantRequest = new javax.swing.JButton();
        btnInvoices = new javax.swing.JButton();
        btnWorkLog = new javax.swing.JButton();
        btnPayementInfo = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblNameVal.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblNameVal.setText("UPS");

        btnRestaurantRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/work-request.png"))); // NOI18N
        btnRestaurantRequest.setText("View Work Requests");
        btnRestaurantRequest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestaurantRequest.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRestaurantRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantRequestActionPerformed(evt);
            }
        });

        btnInvoices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/invoice.png"))); // NOI18N
        btnInvoices.setText("Generate Invoices");
        btnInvoices.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInvoices.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInvoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoicesActionPerformed(evt);
            }
        });

        btnWorkLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/work-logs.png"))); // NOI18N
        btnWorkLog.setText("View Work Log");
        btnWorkLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnWorkLog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnWorkLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkLogActionPerformed(evt);
            }
        });

        btnPayementInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/debit-card.png"))); // NOI18N
        btnPayementInfo.setText("View Payment Info");
        btnPayementInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPayementInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPayementInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayementInfoActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 102, 255));
        lblHeading.setText("Logistics Manager Dashboard");

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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRestaurantRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnWorkLog, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnPayementInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnterprise)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNameVal)))
                        .addContainerGap(308, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeading)
                    .addComponent(logoutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameVal))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRestaurantRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWorkLog, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayementInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoices, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(406, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestaurantRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantRequestActionPerformed
        // TODO add your handling code here:
        ViewRequestsJPanel logisticsManagerViewRequestsJPanel = new ViewRequestsJPanel(userProcessContainer, account, organization, enterprise);
        userProcessContainer.add("ManagerViewRequestsJPanel", logisticsManagerViewRequestsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRestaurantRequestActionPerformed

    private void btnInvoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoicesActionPerformed
        GenerateInvoicesJPanel logisticsManagerGenerateInvoicesJPanel = new GenerateInvoicesJPanel(userProcessContainer, account, network);
        userProcessContainer.add("LogisticsManagerGenerateInvoicesJPanel", logisticsManagerGenerateInvoicesJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnInvoicesActionPerformed

    private void btnWorkLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkLogActionPerformed
        // TODO add your handling code here:
        ViewWorkLogJPanel logisticsManagerViewWorkLogJPanel = new ViewWorkLogJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("LogisticsManagerViewWorkLogJPanel", logisticsManagerViewWorkLogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnWorkLogActionPerformed

    private void btnPayementInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayementInfoActionPerformed
        // TODO add your handling code here:
        ManagerViewChartJPanel logisticsManagerViewChartJPanel = new ManagerViewChartJPanel(userProcessContainer, account);
        userProcessContainer.add("ManagerViewChartJPanel", logisticsManagerViewChartJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPayementInfoActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) this.getParent().getLayout();
        layout.previous(this.getParent());
        this.getParent().remove(this);
        db4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInvoices;
    private javax.swing.JButton btnPayementInfo;
    private javax.swing.JButton btnRestaurantRequest;
    private javax.swing.JButton btnWorkLog;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblNameVal;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
