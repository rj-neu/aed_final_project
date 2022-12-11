/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role.government;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import presentation.government.admin.AdminDashboardJPanel;

import javax.swing.*;

/**
 *
 * @author indap.n
 */
public class GovernmentAdminRole extends Role {

    public GovernmentAdminRole() {
        super(RoleType.GovernmentAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AdminDashboardJPanel(userProcessContainer, enterprise);
    }

}
