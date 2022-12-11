/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.ngo;

import business.organization.Organization;
import business.role.Role;
import business.role.ngo.NGOWorkerRole;

import java.util.ArrayList;

/**
 *
 * @author indap.n
 */
public class NGOWorkerOrganization extends Organization {

    public NGOWorkerOrganization() {
        super(Type.NGOWorker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOWorkerRole());
        return roles;
    }

}
