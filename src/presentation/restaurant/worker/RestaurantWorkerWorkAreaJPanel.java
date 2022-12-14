/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.restaurant.worker;

import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;


import javax.swing.*;
import java.awt.*;


public class RestaurantWorkerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;
    private DB4OUtil db4OUtil;
    public EcoSystem system;

    /**
     * Creates new form RestaurantWorkerWorkArea
     */
    public RestaurantWorkerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        db4OUtil = DB4OUtil.getInstance();
        system = db4OUtil.retrieveSystem();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.network = network;

        populateLoginDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblWastage = new javax.swing.JLabel();
        lblWastageValue = new javax.swing.JLabel();
        btnCollectionReq = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Restaurant Worker Work Area");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Welcome, ");

        lblWastage.setText("Total wastage avoided :");

        lblWastageValue.setText("<wastage_avoided>");

        btnCollectionReq.setText("Raise Collection Request");
        btnCollectionReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectionReqActionPerformed(evt);
            }
        });

        btnLog.setText("View Request Log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 1114, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCollectionReq, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblWastage)
                        .addGap(42, 42, 42)
                        .addComponent(lblWastageValue, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(778, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblHeader)
                        .addGap(29, 29, 29)
                        .addComponent(lblName)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWastage)
                            .addComponent(lblWastageValue))
                        .addGap(35, 35, 35)
                        .addComponent(btnCollectionReq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(logoutBtn)))
                .addContainerGap(479, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollectionReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectionReqActionPerformed
        RestaurantWorkerRaiseRequestJPanel restaurantWorkerRaiseRequestJPanel = new RestaurantWorkerRaiseRequestJPanel(userProcessContainer, account, enterprise.getName(), network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RestaurantWorkerRaiseRequestJPanel", restaurantWorkerRaiseRequestJPanel);
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCollectionReqActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        RestaurantWorkerViewRequestLogJPanel restaurantWorkerViewRequestLogJPanel = new RestaurantWorkerViewRequestLogJPanel(userProcessContainer, account);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RestaurantWorkerViewRequestLogJPanel", restaurantWorkerViewRequestLogJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLogActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:

        //        userProcessContainer.removeAll();

        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        LoginNewJPanel mpjp = new LoginNewJPanel();
        //        userProcessContainer.add("LoginPanel", mpjp);
        //        layout.next(userProcessContainer);

        CardLayout layout = (CardLayout) this.getParent().getLayout();
        layout.previous(this.getParent());
        this.getParent().remove(this);
        db4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void populateLoginDetails() {
        double quantity = 0;
        lblName.setText(lblName.getText() + " " + account.getEmployee().getName());
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                quantity += cwr.getTotalQuantity();
            }
        }
        lblWastageValue.setText(quantity + " pounds");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectionReq;
    private javax.swing.JButton btnLog;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWastage;
    private javax.swing.JLabel lblWastageValue;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
