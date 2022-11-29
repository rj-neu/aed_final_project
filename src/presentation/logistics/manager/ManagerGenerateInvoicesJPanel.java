/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.logistics.manager;

import business.enterprise.Enterprise;
import business.enterprise.NGOEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.ngo.NGOManagerOrganization;
import business.userAccount.UserAccount;
import business.util.request.RequestStatus;
import static business.util.request.RequestStatus.pickupRequestStatusList;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.PaymentWorkRequest;
import business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indap.n
 */
public class ManagerGenerateInvoicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogisticsManagerGenerateInvoices
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;

    public ManagerGenerateInvoicesJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.account = account;
        populateComboBox();
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
        tblDetails = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        cmbNGO = new javax.swing.JComboBox();
        btnGenerateAll = new javax.swing.JButton();
        btnGenerateInovice = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Completion Date", "Request Status", "Cost", "Invoice Generated", "Paid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDetails.getColumnModel().getColumn(3).setResizable(false);
            tblDetails.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBack.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/back-button.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblName.setText("NGO Name:");

        cmbNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNGOActionPerformed(evt);
            }
        });

        btnGenerateAll.setText("Generate All Invoices");
        btnGenerateAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateAllActionPerformed(evt);
            }
        });

        btnGenerateInovice.setText("Generate Invoice");
        btnGenerateInovice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateInoviceActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(0, 102, 255));
        lblHeading.setText("Generate Invoice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbNGO, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGenerateInovice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerateAll, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbNGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerateInovice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerateAll, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateComboBox() {
        cmbNGO.removeAllItems();
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.NGO)) {
                cmbNGO.addItem(e);
            }
        }
    }


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNGOActionPerformed
        // TODO add your handling code here:
        NGOEnterprise ngo = (NGOEnterprise) cmbNGO.getSelectedItem();
        if (ngo != null) {
            populateTable(ngo);
        }
    }//GEN-LAST:event_cmbNGOActionPerformed

    private void btnGenerateInoviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateInoviceActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDetails.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request to generate invoice for",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest cwr = (CollectionWorkRequest) tblDetails.getValueAt(selectedRow, 1);
            String status = cwr.getStatus();
            if (status.equals(pickupRequestStatusList.get(5)) || status.equals(pickupRequestStatusList.get(6))) {
                if (cwr.getPaid()) {
                    JOptionPane.showMessageDialog(null,
                            "Selected Invoice has already been paid for",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if (cwr.getInvoiceGenerated()) {
                    JOptionPane.showMessageDialog(null,
                            "Selected Invoice has already been generated",
                            "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                NGOEnterprise ngo = (NGOEnterprise) cmbNGO.getSelectedItem();

                PaymentWorkRequest pwr = new PaymentWorkRequest();
                cwr.setInvoiceGenerated(true);
                pwr.setCollectionWorkRequest(cwr);
                pwr.setStatus(RequestStatus.getInvoiceStatusMessage(1));
                pwr.setSender(account);

                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getName().equals(ngo.getName())) {
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            if (o instanceof NGOManagerOrganization) {
                                o.getWorkQueue().getWorkRequestList().add(pwr);
                                break;
                            }
                        }
                    }
                }

                // Add to own work queue
                account.getWorkQueue().getWorkRequestList().add(pwr);
                JOptionPane.showMessageDialog(null, "Invoice request raised with NGO for further processing", "Information", JOptionPane.INFORMATION_MESSAGE);
                populateTable(ngo);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Request not delivered yet to generate an Invoice for",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGenerateInoviceActionPerformed

    private void btnGenerateAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateAllActionPerformed

        NGOEnterprise ngo = (NGOEnterprise) cmbNGO.getSelectedItem();
        boolean generated = false;

        for (int i = 0; i < tblDetails.getRowCount(); i++) {
            WorkRequest wr = (WorkRequest) tblDetails.getValueAt(i, 1);
            if (wr instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                if (!cwr.getPaid() && !cwr.getInvoiceGenerated()) {
                    generated = true;

                    PaymentWorkRequest pwr = new PaymentWorkRequest();
                    cwr.setInvoiceGenerated(true);
                    pwr.setCollectionWorkRequest(cwr);
                    pwr.setStatus(RequestStatus.getInvoiceStatusMessage(1));
                    pwr.setSender(account);

                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.getName().equals(ngo.getName())) {
                            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                if (o instanceof NGOManagerOrganization) {
                                    o.getWorkQueue().getWorkRequestList().add(pwr);
                                    break;
                                }
                            }
                        }
                    }

                    // Add to own work queue
                    account.getWorkQueue().getWorkRequestList().add(pwr);

                }
            }
        }
        if (!generated) {
            JOptionPane.showMessageDialog(null, "All invoices already generated", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "All ungenerated invoices are now generated", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable(ngo);
    }//GEN-LAST:event_btnGenerateAllActionPerformed

    public void populateTable(NGOEnterprise ngo) {

        DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CollectionWorkRequest) {
                CollectionWorkRequest cwr = (CollectionWorkRequest) wr;
                if ((cwr.getStatus().equals(pickupRequestStatusList.get(5))) || (cwr.getStatus().equals(pickupRequestStatusList.get(6)))) {
                    if (cwr.getDeliverToNGO() != null) {
                        if (cwr.getDeliverToNGO().equals(ngo.getName())) {
                            Object row[] = new Object[5];
                            row[0] = cwr.getResolveDate();
                            row[1] = cwr;
                            row[2] = "$" + cwr.getDeliveryCost();
                            row[3] = cwr.getInvoiceGenerated() ? "Yes" : "No";
                            row[4] = cwr.getPaid() ? "Yes" : "No";

                            dtm.addRow(row);
                        }
                    }
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateAll;
    private javax.swing.JButton btnGenerateInovice;
    private javax.swing.JComboBox cmbNGO;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables
}
