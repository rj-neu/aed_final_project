/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.restaurant.restaurantWorker;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.ngo.NGOManagerOrganization;
import business.userAccount.UserAccount;
import business.util.food.Food;
import business.util.food.FoodQuantity;
import business.util.request.RequestItem;
import business.util.request.RequestStatus;
import business.workQueue.CollectionWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class RestaurantWorkerRaiseRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    private String enterpriseName;

    /**
     * Creates new form RestaurantWorkerJPanel
     */
    public RestaurantWorkerRaiseRequestJPanel(JPanel userProcessContainer, UserAccount account, String enterpriseName, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
        this.enterpriseName = enterpriseName;

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.setRowCount(0);

        populateFoodCombo();
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
        lblSubHeader = new javax.swing.JLabel();
        lblFoodType = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        lblPerishTime = new javax.swing.JLabel();
        spnPerishTime = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblFoodItems = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRaiseRequest = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        cmbFood = new javax.swing.JComboBox<>();
        lblWarning = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Restaurant Worker Work Area - Collection Request");

        lblSubHeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubHeader.setText("Add Food Items :");

        lblFoodType.setText("Food Type:");

        lblQuantity.setText("Quantity:");

        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblPerishTime.setText("Hours to perish*:");

        spnPerishTime.setModel(new javax.swing.SpinnerNumberModel(4, 4, null, 1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblFoodItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Quantity", "Hours to perish"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblFoodItems);
        if (tblFoodItems.getColumnModel().getColumnCount() > 0) {
            tblFoodItems.getColumnModel().getColumn(0).setResizable(false);
            tblFoodItems.getColumnModel().getColumn(1).setResizable(false);
            tblFoodItems.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRaiseRequest.setText("Raise Request");
        btnRaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseRequestActionPerformed(evt);
            }
        });

        lbMessage.setText("Message:");

        lblWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblWarning.setText("<HTML>* Considering the logsitics, we only accept food which would last for atleast 4 hours.</HTML>");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/restaurantWorker/res/salad.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/restaurantWorker/res/salad.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RestaurantAdmin/restaurantWorker/res/salad.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRemove)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbMessage)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBack)
                                        .addGap(407, 407, 407)
                                        .addComponent(btnRaiseRequest)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblQuantity)
                                                .addComponent(lblPerishTime)
                                                .addComponent(lblFoodType))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(spnPerishTime, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmbFood, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(lblSubHeader))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3)
                                            .addGap(57, 57, 57)
                                            .addComponent(jLabel1)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSubHeader)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFoodType)
                                    .addComponent(cmbFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblQuantity)
                                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPerishTime)
                            .addComponent(spnPerishTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMessage)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRaiseRequest)
                            .addComponent(btnBack)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateFoodCombo() {

        cmbFood.removeAllItems();

        Set foodNames = Food.getFoodMap().keySet();

        for (Object name : foodNames) {
            cmbFood.addItem((String) name);
        }

    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String food = cmbFood.getSelectedItem().toString();
        int quantity = (Integer) spnQuantity.getValue();
        int hours = (Integer) spnPerishTime.getValue();

        if (quantity < 1) {
            JOptionPane.showMessageDialog(null,
                    "Quantity of food cannot be less than 1",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (hours < 4) {
            JOptionPane.showMessageDialog(null,
                    "Food items perishable under 4 hours not accepted!",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        Object row[] = new Object[3];
        row[0] = food;
        row[1] = quantity;
        row[2] = hours;

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.addRow(row);

//        JOptionPane.showMessageDialog(null, "Food Item Added");
        cmbFood.setSelectedIndex(0);
        spnQuantity.setValue(1);
        spnPerishTime.setValue(4);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseRequestActionPerformed

        String message = txtMessage.getText();

        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();

        if (dtm.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No food items selected to be distributed");
            return;
        }

        ArrayList<RequestItem> requestList = new ArrayList();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String food = (String) dtm.getValueAt(i, 0);
            int quantity = (Integer) dtm.getValueAt(i, 1);
            int hours = (Integer) dtm.getValueAt(i, 2);

            RequestItem ri = new RequestItem(food, quantity, hours);
            requestList.add(ri);
        }

        CollectionWorkRequest request = new CollectionWorkRequest();
        request.setSender(account);
        request.setMessage(message);
        request.setRequestItems(requestList);
        request.setStatus(RequestStatus.getPickupStatusMessage(1));
        request.setTotalQuantity(FoodQuantity.calculateQuantity(request.getRequestItems()));
        request.setRaisedBy(account);
        request.setRaisedByRestaurant(enterpriseName);

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof NGOManagerOrganization) {
                    o.getWorkQueue().getWorkRequestList().add(request);
                }
            }
        }

        account.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null, "Request raised with NGO for further processing", "Information", JOptionPane.INFORMATION_MESSAGE);
        dtm.setRowCount(0);

        txtMessage.setText("");

    }//GEN-LAST:event_btnRaiseRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = tblFoodItems.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select an item to be removed",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DefaultTableModel dtm = (DefaultTableModel) tblFoodItems.getModel();
        dtm.removeRow(selectedRow);        
        
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRaiseRequest;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbFood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JLabel lblFoodType;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblPerishTime;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSubHeader;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JSpinner spnPerishTime;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblFoodItems;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
