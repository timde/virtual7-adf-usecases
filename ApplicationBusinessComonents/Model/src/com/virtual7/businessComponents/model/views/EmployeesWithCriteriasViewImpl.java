package com.virtual7.businessComponents.model.views;

import java.math.BigDecimal;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 15 12:51:58 EEST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesWithCriteriasViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesWithCriteriasViewImpl() {
    }

    /**
     * Returns the variable value for EmailVar.
     * @return variable value for EmailVar
     */
    public String getEmailVar() {
        return (String)ensureVariableManager().getVariableValue("EmailVar");
    }

    /**
     * Returns the bind variable value for SalaryVar.
     * @return bind variable value for SalaryVar
     */
    public BigDecimal getSalaryVar() {
        return (BigDecimal)getNamedWhereClauseParam("SalaryVar");
    }

    /**
     * Sets <code>value</code> for bind variable SalaryVar.
     * @param value value to bind as SalaryVar
     */
    public void setSalaryVar(BigDecimal value) {
        setNamedWhereClauseParam("SalaryVar", value);
    }

    /**
     * Returns the variable value for LName.
     * @return variable value for LName
     */
    public String getLName() {
        return (String)ensureVariableManager().getVariableValue("LName");
    }

    /**
     * Sets <code>value</code> for variable LName.
     * @param value value to bind as LName
     */
    public void setLName(String value) {
        ensureVariableManager().setVariableValue("LName", value);
    }


    /**
     * Sets <code>value</code> for variable EmailVar.
     * @param value value to bind as EmailVar
     */
    public void setEmailVar(String value) {
        ensureVariableManager().setVariableValue("EmailVar", value);
    }
}
