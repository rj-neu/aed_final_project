/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantAdmin.RestaurantManager;

import business.util.request.RequestItem;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class RestaurantManagerViewLogItemJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CollectionWorkRequest collectionWorkRequest;

    /**
     * Creates new form RestaurantWorkerViewLogItemJPanel
     */
    public RestaurantManagerViewLogItemJPanel(JPanel userProcessContainer, CollectionWorkRequest collectionWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.collectionWorkRequest = collectionWorkRequest;
        populateItemTable();
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblFoodItems = new javax.swing.JTable();
        lblRequestFrom = new javax.swing.JLabel();
        lblRequestFromVal = new javax.swing.JLabel();
        lblRequestDate = new javax.swing.JLabel();
        lblRequestDateVal = new javax.swing.JLabel();
        lblRequestStatus = new javax.swing.JLabel();
        lblRequestStatusVal = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblQuantityVal = new javax.swing.JLabel();
        lblNGO = new javax.swing.JLabel();
        lblNGOVal = new javax.swing.JLabel();
        lblLogistics = new javax.swing.JLabel();
        lblLogisticsVal = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblCostVal = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 204, 255));

        tblFoodItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblFoodItems);
        if (tblFoodItems.getColumnModel().getColumnCount() > 0) {
            tblFoodItems.getColumnModel().getColumn(0).setResizable(false);
            tblFoodItems.getColumnModel().getColumn(1).setResizable(false);
        }

        lblRequestFrom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestFrom.setText("Raised by:");

        lblRequestFromVal.setText("<request_from>");

        lblRequestDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestDate.setText("Request Date:");

        lblRequestDateVal.setText("<request_date>");

        lblRequestStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRequestStatus.setText("Request status:");

        lblRequestStatusVal.setText("<request_status>");

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuantity.setText("Food Quantity:");

        lblQuantityVal.setText("<quantity>");

        lblNGO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNGO.setText("NGO delivered to:");

        lblNGOVal.setText("<ngo>");

        lblLogistics.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogistics.setText("Logistics");

        lblLogisticsVal.setText("<logistics>");

        lblCost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCost.setText("Pickup Cost:");

        lblCostVal.setText("<cost>");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setText("                !!!FOOD COLLECTION REQUEST!!!");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/RestaurantManager/res/fast-delivery.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/RestaurantManager/res/fast-food (2).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNGO)
                        .addGap(18, 18, 18)
                        .addComponent(lblNGOVal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCost)
                            .addComponent(lblLogistics))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogisticsVal)
                            .addComponent(lblCostVal)))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblRequestStatus)
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblRequestDate)
                                        .addGap(35, 35, 35)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblQuantity)
                                    .addGap(33, 33, 33)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRequestFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantityVal)
                            .addComponent(lblRequestDateVal)
                            .addComponent(lblRequestStatusVal)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(lblRequestFromVal))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRequestFrom)
                            .addComponent(lblRequestFromVal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestDate)
                    .addComponent(lblRequestDateVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestStatus)
                    .addComponent(lblRequestStatusVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(lblQuantityVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNGO)
                    .addComponent(lblNGOVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogistics)
                    .addComponent(lblLogisticsVal))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCost)
                    .addComponent(lblCostVal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    public void populateItemTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.setRowCount(0);

        for (RequestItem ri : collectionWorkRequest.getRequestItems()) {
            Object row[] = new Object[2];
            row[0] = ri;
            row[1] = ri.getQuantity();

            dtm.addRow(row);
        }
    }

    public void populateData() {

        lblRequestFromVal.setText(collectionWorkRequest.getRaisedBy().getEmployee().getName());
        lblRequestDateVal.setText(collectionWorkRequest.getRequestDate() + "");
        lblRequestStatusVal.setText(collectionWorkRequest.getStatus());
        lblQuantityVal.setText(collectionWorkRequest.getTotalQuantity() + " pounds");

        String ngo = collectionWorkRequest.getDeliverToNGO() == null ? "Undelivered" : collectionWorkRequest.getDeliverToNGO();
        lblNGOVal.setText(ngo);

        String logistics = collectionWorkRequest.getDeliveredByLogistics() == null ? "Undelivered" : collectionWorkRequest.getDeliveredByLogistics();
        lblLogisticsVal.setText(logistics);

        String cost = collectionWorkRequest.getDeliveryCost() == 0d ? "Undelivered" : "$" + collectionWorkRequest.getDeliveryCost();
        lblCostVal.setText(cost);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblCostVal;
    private javax.swing.JLabel lblLogistics;
    private javax.swing.JLabel lblLogisticsVal;
    private javax.swing.JLabel lblNGO;
    private javax.swing.JLabel lblNGOVal;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblRequestDateVal;
    private javax.swing.JLabel lblRequestFrom;
    private javax.swing.JLabel lblRequestFromVal;
    private javax.swing.JLabel lblRequestStatus;
    private javax.swing.JLabel lblRequestStatusVal;
    private javax.swing.JTable tblFoodItems;
    // End of variables declaration//GEN-END:variables
}