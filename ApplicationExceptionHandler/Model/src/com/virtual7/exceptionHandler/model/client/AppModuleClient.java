package com.virtual7.exceptionHandler.model.client;

import com.virtual7.exceptionHandler.model.common.AppModule;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 07 18:27:29 EET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleClient extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleClient() {
    }

    public void methodThatGenerateException() {
        Object _ret = this.riInvokeExportedMethod(this,"methodThatGenerateException",null,null);
        return;
    }
}
