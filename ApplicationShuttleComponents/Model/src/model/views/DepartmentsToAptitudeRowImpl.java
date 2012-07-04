package model.views;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 20 10:31:54 EEST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentsToAptitudeRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Aptitudeid {
            public Object get(DepartmentsToAptitudeRowImpl obj) {
                return obj.getAptitudeid();
            }

            public void put(DepartmentsToAptitudeRowImpl obj, Object value) {
                obj.setAptitudeid((Number)value);
            }
        }
        ,
        DepartmentId {
            public Object get(DepartmentsToAptitudeRowImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(DepartmentsToAptitudeRowImpl obj, Object value) {
                obj.setDepartmentId((Number)value);
            }
        }
        ,
        DepartmentName {
            public Object get(DepartmentsToAptitudeRowImpl obj) {
                return obj.getDepartmentName();
            }

            public void put(DepartmentsToAptitudeRowImpl obj, Object value) {
                obj.setDepartmentName((String)value);
            }
        }
        ,
        EmployeestoaptitudeView {
            public Object get(DepartmentsToAptitudeRowImpl obj) {
                return obj.getEmployeestoaptitudeView();
            }

            public void put(DepartmentsToAptitudeRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(DepartmentsToAptitudeRowImpl object);

        public abstract void put(DepartmentsToAptitudeRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int APTITUDEID = AttributesEnum.Aptitudeid.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int EMPLOYEESTOAPTITUDEVIEW = AttributesEnum.EmployeestoaptitudeView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DepartmentsToAptitudeRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Aptitudeid.
     * @return the Aptitudeid
     */
    public Number getAptitudeid() {
        return (Number) getAttributeInternal(APTITUDEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Aptitudeid.
     * @param value value to set the  Aptitudeid
     */
    public void setAptitudeid(Number value) {
        setAttributeInternal(APTITUDEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentId.
     * @return the DepartmentId
     */
    public Number getDepartmentId() {
        return (Number) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepartmentId.
     * @param value value to set the  DepartmentId
     */
    public void setDepartmentId(Number value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentName.
     * @return the DepartmentName
     */
    public String getDepartmentName() {
        return (String) getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepartmentName.
     * @param value value to set the  DepartmentName
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link EmployeestoaptitudeView.
     */
    public RowIterator getEmployeestoaptitudeView() {
        return (RowIterator)getAttributeInternal(EMPLOYEESTOAPTITUDEVIEW);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}