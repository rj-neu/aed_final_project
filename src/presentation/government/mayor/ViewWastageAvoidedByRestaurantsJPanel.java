/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.government.mayor;

import business.enterprise.Enterprise;
import business.enterprise.RestaurantEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import business.workQueue.CollectionWorkRequest;
import business.workQueue.WorkRequest;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author indap.n
 */
public class ViewWastageAvoidedByRestaurantsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network network;

    /**
     * Creates new form GovernmentMayorViewWastageAvoidedByRestaurants
     */
    public ViewWastageAvoidedByRestaurantsJPanel(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        populateRestaurantCombo();
        populateData(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblRestaurant = new javax.swing.JLabel();
        cmbRestaurant = new javax.swing.JComboBox();
        jScrollPane = new javax.swing.JScrollPane();
        tblWastageAvoided = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        lblTotalWastage = new javax.swing.JLabel();
        lblWastageValue = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeading.setText("Mayor Work Area - View Restaurant Wastage Avoided");

        lblRestaurant.setText("Restaurant :");

        cmbRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRestaurantActionPerformed(evt);
            }
        });

        tblWastageAvoided.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Wastage Avoided(in pounds)", "Status", "NGO delivered to"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblWastageAvoided);
        if (tblWastageAvoided.getColumnModel().getColumnCount() > 0) {
            tblWastageAvoided.getColumnModel().getColumn(0).setResizable(false);
            tblWastageAvoided.getColumnModel().getColumn(1).setResizable(false);
            tblWastageAvoided.getColumnModel().getColumn(2).setResizable(false);
            tblWastageAvoided.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDetails.setText("View Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        lblTotalWastage.setText("Total Wastage Avoided:");

        lblWastageValue.setText("<wastage>");

        btnExport.setText("Export Data");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(290, 290, 290)
                                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotalWastage, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblWastageValue, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblHeading)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRestaurant)
                    .addComponent(cmbRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalWastage)
                    .addComponent(lblWastageValue))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetails)
                    .addComponent(btnBack)
                    .addComponent(btnExport))
                .addGap(110, 110, 110))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRestaurantActionPerformed
        // TODO add your handling code here:
        if (cmbRestaurant.getSelectedIndex() < 1) {
            populateData(null);
        } else {
            RestaurantEnterprise e = (RestaurantEnterprise) cmbRestaurant.getSelectedItem();
            populateData(e);
        }
    }//GEN-LAST:event_cmbRestaurantActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWastageAvoided.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,
                    "Please select a request item to view details",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            CollectionWorkRequest request = (CollectionWorkRequest) tblWastageAvoided.getValueAt(selectedRow, 2);

            ViewRequestDetailsJPanel governmentMayorViewRequestDetailsJPanel = new ViewRequestDetailsJPanel(userProcessContainer, request);
            userProcessContainer.add("GovernmentMayorViewRequestDetailsJPanel", governmentMayorViewRequestDetailsJPanel);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblWastageAvoided.getModel();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet worksheet = workbook.createSheet();

        TreeMap<String, Object[]> dataMap = new TreeMap<>();
        dataMap.put("0", new Object[]{
            dtm.getColumnName(0), dtm.getColumnName(1), dtm.getColumnName(2), dtm.getColumnName(3)
        });

        for (int i = 0; i < dtm.getRowCount(); i++) {
            dataMap.put(i + 1 + "", new Object[]{
                dtm.getValueAt(i, 0).toString(),
                dtm.getValueAt(i, 1).toString(),
                dtm.getValueAt(i, 2).toString(),
                dtm.getValueAt(i, 3).toString()
            });
        }

        Set<String> ids = dataMap.keySet();
        XSSFRow row;
        int rowId = 0;

        XSSFCellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
        style.setFont(font);

        for (String key : ids) {
            row = worksheet.createRow(rowId++);

            Object[] values = dataMap.get(key);

            int cellId = 0;
            for (Object o : values) {
                Cell cell = row.createCell(cellId++);
                cell.setCellValue((String) o);
                if (rowId== 1) {
                    cell.setCellStyle(style);
                }
            }
        }

        try {
            String date = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss").format(new Date());
            String fileName = "Mayor_" + network.getName() + "_" + date + ".xlsx";
            FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.home") + "/Desktop/"+fileName));
            workbook.write(fos);
            fos.close();
            JOptionPane.showMessageDialog(null, "Data exported to excel");
        } catch (FileNotFoundException fnfe) {
            // File Not Found
        } catch (IOException iex) {
            // IO Exception block
        }
    }//GEN-LAST:event_btnExportActionPerformed

    public void populateRestaurantCombo() {
        cmbRestaurant.removeAllItems();
        cmbRestaurant.addItem(null);
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.Restaurant) {
                cmbRestaurant.addItem(e);
            }
        }
    }

    public void populateData(RestaurantEnterprise restaurant) {

        DefaultTableModel dtm = (DefaultTableModel) tblWastageAvoided.getModel();
        dtm.setRowCount(0);

        double wastage = 0;

        // All data
        if (restaurant == null) {

            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType() == Enterprise.EnterpriseType.Restaurant) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                            if ((ua.getRole().getRoleType().getValue()).equals(Role.RoleType.RestaurantWorker.getValue())) {
                                for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
                                    if (wr instanceof CollectionWorkRequest) {
                                        CollectionWorkRequest cwr = (CollectionWorkRequest) wr;

                                        Object row[] = new Object[4];
                                        row[0] = cwr.getRaisedByRestaurant();
                                        row[1] = cwr.getTotalQuantity();
                                        row[2] = cwr;
                                        row[3] = cwr.getDeliverToNGO() == null ? "Undelivered" : cwr.getDeliverToNGO();
                                        dtm.addRow(row);

                                        wastage += cwr.getTotalQuantity();
                                    }
                                }
                            }
                        }
                    }
                }
            }

        } // Filtered
        else {

            for (Organization o : restaurant.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                    if ((ua.getRole().getRoleType().getValue()).equals(Role.RoleType.RestaurantWorker.getValue())) {
                        for (WorkRequest wr : ua.getWorkQueue().getWorkRequestList()) {
                            CollectionWorkRequest cwr = (CollectionWorkRequest) wr;

                            Object row[] = new Object[4];
                            row[0] = cwr.getRaisedByRestaurant();
                            row[1] = cwr.getTotalQuantity();
                            row[2] = cwr;
                            row[3] = cwr.getDeliverToNGO() == null ? "Undelivered" : cwr.getDeliverToNGO();
                            dtm.addRow(row);

                            wastage += cwr.getTotalQuantity();
                        }
                    }
                }
            }

        }

        lblWastageValue.setText(wastage + " pounds");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnExport;
    private javax.swing.JComboBox cmbRestaurant;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblRestaurant;
    private javax.swing.JLabel lblTotalWastage;
    private javax.swing.JLabel lblWastageValue;
    private javax.swing.JTable tblWastageAvoided;
    // End of variables declaration//GEN-END:variables
}