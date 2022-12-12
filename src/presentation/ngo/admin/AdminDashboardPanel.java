/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentation.ngo.admin;


import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.userAccount.UserAccount;

import javax.swing.*;
import java.awt.*;
import presentation.login.LoginNewJPanel;

/**
 *
 * @author Shubham Idekar
 */
public class AdminDashboardPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOadminPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private DB4OUtil db4OUtil;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    public EcoSystem system;

    public AdminDashboardPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business) {
        initComponents();
        db4OUtil = DB4OUtil.getInstance();
        system = db4OUtil.retrieveSystem();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        lblValue.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageUser = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnManageOrganization = new javax.swing.JButton();
        lblValue = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        btnManageUser.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        btnManageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/admin/res/management_ngo.png"))); // NOI18N
        btnManageUser.setText("Manage User");
        btnManageUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManageUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });

        btnManageEmployee.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        btnManageEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/admin/res/partners.png"))); // NOI18N
        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManageEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });

        btnManageOrganization.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        btnManageOrganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/admin/res/recycle_ngo.png"))); // NOI18N
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnManageOrganization.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        lblValue.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblValue.setText("<value>");

        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEnterprise.setText("Welcome");

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("NGO Dashboard");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/admin/res/hands_ngo.png"))); // NOI18N

        logoutBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/shutdown.png"))); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/admin/res/heart_ngo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(lblEnterprise)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 488, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageEmployee, btnManageOrganization, btnManageUser});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoutBtn)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageEmployee)
                    .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageUser))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageEmployee, btnManageOrganization, btnManageUser});

    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
        AdminManageUser muajp = new AdminManageUser(userProcessContainer, enterprise, business);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed

        AdminManageEmployee manageNGOEmployeeJPanel = new AdminManageEmployee(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageNGOEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed

        AdminManageOrg manageNGOOrganizationJPanel = new AdminManageOrg(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageNGOOrganizationJPanel", manageNGOOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) this.getParent().getLayout();
        layout.previous(this.getParent());
        this.getParent().remove(this);
        db4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblValue;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
