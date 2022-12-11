/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.logistics;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import presentation.logistics.manager.ManagerDashboardJPanel;

import javax.swing.*;

/**
 *
 * @author Rishabh
 */
public class LogisticsManagerRole extends Role{

    public LogisticsManagerRole() {
        super(RoleType.LogisticsManager);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ManagerDashboardJPanel(userProcessContainer, account, organization, enterprise, network);
    }
    
}
