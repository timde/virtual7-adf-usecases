package com.virtual7.amComplexParams.model.common;

import com.virtual7.amComplexParams.model.UserBean;

import com.virtual7.amComplexParams.model.UserList;

import java.util.List;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 10 15:31:04 EET 2011
// ---------------------------------------------------------------------
public interface AppModule extends ApplicationModule {
    void saveUsers(List<UserBean> users);

    void saveUsers1(UserList userList);
}
