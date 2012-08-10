package com.virtual7.programaticPivotTableBinding.model.views;

import com.virtual7.programaticPivotTableBinding.model.views.common.AppModule;

import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 07 18:12:16 EEST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    private String[] querries;
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for EmployeesView1.
     * @return EmployeesView1
     */
    public ViewObjectImpl getEmployeesView1() {
        return (ViewObjectImpl)findViewObject("EmployeesView1");
    }

    /**
     * Container's getter for EmployeesView2.
     * @return EmployeesView2
     */
    public ViewObjectImpl getEmployeesView2() {
        return (ViewObjectImpl)findViewObject("EmployeesView2");
    }

    /**
     * Container's getter for EmployeesPivotedVO.
     * @return EmployeesPivotedVO
     */
    public ViewObjectImpl getEmployeesPivotedVO() {
        return (ViewObjectImpl)findViewObject("EmployeesPivotedVO");
    }

    /**
     * Container's getter for EmpManagerFkLink1.
     * @return EmpManagerFkLink1
     */
    public ViewLinkImpl getEmpManagerFkLink1() {
        return (ViewLinkImpl)findViewLink("EmpManagerFkLink1");
    }
    
    public void changeDynamicQuerry(String querry) {
        ViewObject vo = findViewObject("DynamicVO1");
        vo.remove();
        vo = createViewObjectFromQueryStmt("DynamicVO1", querry);
        vo.executeQuery();
    }

    /**
     * Container's getter for DynamicVO1.
     * @return DynamicVO1
     */
    public ViewObjectImpl getDynamicVO1() {
        ViewObjectImpl vo = (ViewObjectImpl)findViewObject("DynamicVO1");
        if ("select * from dual".equals(vo.getQuery())) {
            changeDynamicQuerry("select * from employees");
        }
        return (ViewObjectImpl)findViewObject("DynamicVO1");
    }
}
