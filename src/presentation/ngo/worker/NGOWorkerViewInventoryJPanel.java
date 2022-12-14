/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.ngo.worker;

import business.enterprise.Enterprise;
import business.enterprise.NGOEnterprise;
import business.util.food.FoodQuantity;
import business.util.request.RequestItem;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;

/**
 *
 * @author Shubham Idekar
 */
public class NGOWorkerViewInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkerViewInventoryJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public NGOWorkerViewInventoryJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblQuantityVal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Quantity", "Hours to perish"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventory);
        if (tblInventory.getColumnModel().getColumnCount() > 0) {
            tblInventory.getColumnModel().getColumn(0).setResizable(false);
            tblInventory.getColumnModel().getColumn(1).setResizable(false);
            tblInventory.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NGO Worker Inventory Panel");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantity.setText("Total Quantity :");

        lblQuantityVal.setText("<quantity>");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/ngo/manager/res/inventory (1).png"))); // NOI18N

        btnBack1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(51, 51, 255));
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/back-button.png"))); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(null);
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(197, 197, 197)
                            .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblQuantityVal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(642, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JTable tblInventory;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblInventory.getModel();
        dtm.setRowCount(0);

        double amount = 0;

        NGOEnterprise ent = (NGOEnterprise) enterprise;
        for (RequestItem ri : ent.getInventory().getRequestItemList()) {

            if (ri.getHoursToPerish() > 0 && ri.getQuantity() > 0) {
                Object row[] = new Object[3];

                row[0] = ri;
                row[1] = ri.getQuantity();
                row[2] = ri.getHoursToPerish();
                dtm.addRow(row);

                amount += FoodQuantity.getQuantity(ri.getFoodName()) * ri.getQuantity();
            }
        }

        // For sorting
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(dtm);
        tblInventory.setRowSorter(sorter);

        lblQuantityVal.setText(amount + " pounds");
    }
}
