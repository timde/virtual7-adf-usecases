package com.virtual7.amComplexParams.model.client;

import com.virtual7.amComplexParams.model.UserBean;
import com.virtual7.amComplexParams.model.UserList;
import com.virtual7.amComplexParams.model.common.AppModule;

import java.util.List;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 10 15:31:04 EET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleClient extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleClient() {
    }

    public void saveUsers(List<UserBean> users) {
        Object _ret =
            this.riInvokeExportedMethod(this,"saveUsers",new String [] {"java.util.List<com.virtual7.amComplexParams.model.UserBean>"},new Object[] {users});
        return;
    }

    public void saveUsers1(UserList userList) {
        Object _ret =
            this.riInvokeExportedMethod(this,"saveUsers1",new String [] {"com.virtual7.amComplexParams.model.UserList"},new Object[] {userList});
        return;
    }
}
