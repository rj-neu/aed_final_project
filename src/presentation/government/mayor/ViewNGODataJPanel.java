package presentation.government.mayor;

import business.enterprise.Enterprise;
import business.enterprise.NGOEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.ngo.NGOManagerOrganization;
import business.userAccount.UserAccount;
import business.util.food.FoodQuantity;
import business.util.inventory.Distributed;
import business.util.request.RequestItem;
import business.workQueue.PaymentWorkRequest;
import business.workQueue.WorkRequest;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;


public class ViewNGODataJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network network;

    /**
     * Creates new form GovernmentMayorViewPeopleFed
     */
    public ViewNGODataJPanel(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        populateFedChart();
        //populateExpensesChart();
    }

    public void populateFedChart() {

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        int peopleFed = 0;
        double amount = 0;
        double avoided = 0;
        double wastage = 0;

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Enterprise.EnterpriseType.NGO) {
                String name = e.getName();

                NGOEnterprise ne = (NGOEnterprise) e;

                //Wastage Avoided
                for (RequestItem ri : ne.getInventory().getRequestItemList()) {
                    avoided += FoodQuantity.getQuantity(ri.getFoodName()) * ri.getQuantity();
                }

                // Wastage
                for (RequestItem ri : ne.getWasteInventory().getRequestItemList()) {
                    wastage += FoodQuantity.getQuantity(ri.getFoodName()) * ri.getQuantity();
                }

                // People fed
                for (Distributed d : ne.getDistributedList()) {
                    peopleFed += d.getPeopleFed();
                }

                // Expenses
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof NGOManagerOrganization) {
                        for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                            for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                                if (wr instanceof PaymentWorkRequest) {
                                    PaymentWorkRequest pwr = (PaymentWorkRequest) wr;
                                    amount += pwr.getCollectionWorkRequest().getDeliveryCost();
                                }
                            }
                        }
                    }
                }

                dataSet.setValue(avoided, name, "Wastage Avoided (in pounds)");
                dataSet.setValue(wastage, name, "Wastage in inventory (in pounds)");
                dataSet.setValue(peopleFed, name, "People Fed");
                dataSet.setValue(amount, name, "Expenses Inccured (in $)");

                peopleFed = 0;
                avoided = 0;
                wastage = 0;
                amount = 0;
            }
        }
        JFreeChart chart = ChartFactory.createBarChart("Analysis report for NGO",
                "NGO",
                "Values",
                dataSet,
                PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = chart.getCategoryPlot();

        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel chartPanel = new ChartPanel(chart);
        pnlChartFed.removeAll();
        pnlChartFed.add(chartPanel, BorderLayout.CENTER);
        pnlChartFed.validate();

    }

    /*
    public void populateExpensesChart() {

        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        double amount = 0;

        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType() == Enterprise.EnterpriseType.NGO) {
                    String name = e.getName();
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof NGOManagerOrganization) {
                            for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                                for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                                    if (wr instanceof PaymentWorkRequest) {
                                        PaymentWorkRequest pwr = (PaymentWorkRequest) wr;
                                        amount += pwr.getCollectionWorkRequest().getDeliveryCost();
                                    }
                                }
                            }
                        }
                    }
                    dataSet.setValue(amount, "Expenses Incured", name);
                    amount = 0;
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart("Expenses Incured by each NGO",
                "NGO",
                "Expenses Incured (in $)",
                dataSet,
                PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = chart.getCategoryPlot();

        plot.setRangeGridlinePaint(Color.BLACK);
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel chartPanel = new ChartPanel(chart);
        pnlChartExpenses.removeAll();
        pnlChartExpenses.add(chartPanel, BorderLayout.CENTER);
        pnlChartExpenses.validate();

    } */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        pnlChartFed = new javax.swing.JPanel();
        btnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Mayor Work Area - Poeple Fed By NGO Chart");

        pnlChartFed.setLayout(new java.awt.BorderLayout());

        btnBack2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(51, 51, 255));
        btnBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentation/res/back-button.png"))); // NOI18N
        btnBack2.setText("Back");
        btnBack2.setBorder(null);
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack2)
                        .addGap(58, 58, 58)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlChartFed, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack2)
                    .addComponent(lblHeader))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(pnlChartFed, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel pnlChartFed;
    // End of variables declaration//GEN-END:variables
}
