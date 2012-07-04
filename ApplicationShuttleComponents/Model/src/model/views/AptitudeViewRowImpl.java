package model.views;

import model.entities.AptitudeImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 19 16:11:49 EEST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AptitudeViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Id {
            public Object get(AptitudeViewRowImpl obj) {
                return obj.getId();
            }

            public void put(AptitudeViewRowImpl obj, Object value) {
                obj.setId((DBSequence)value);
            }
        }
        ,
        Name {
            public Object get(AptitudeViewRowImpl obj) {
                return obj.getName();
            }

            public void put(AptitudeViewRowImpl obj, Object value) {
                obj.setName((String)value);
            }
        }
        ,
        EmployeestoaptitudeView {
            public Object get(AptitudeViewRowImpl obj) {
                return obj.getEmployeestoaptitudeView();
            }

            public void put(AptitudeViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DepartmentsToAptitude {
            public Object get(AptitudeViewRowImpl obj) {
                return obj.getDepartmentsToAptitude();
            }

            public void put(AptitudeViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AptitudeViewRowImpl object);

        public abstract void put(AptitudeViewRowImpl object, Object value);

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

    public static final int ID = AttributesEnum.Id.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int EMPLOYEESTOAPTITUDEVIEW = AttributesEnum.EmployeestoaptitudeView.index();
    public static final int DEPARTMENTSTOAPTITUDE = AttributesEnum.DepartmentsToAptitude.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AptitudeViewRowImpl() {
    }

    /**
     * Gets Aptitude entity object.
     * @return the Aptitude
     */
    public AptitudeImpl getAptitude() {
        return (AptitudeImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ID using the alias name Id.
     * @return the ID
     */
    public DBSequence getId() {
        return (DBSequence)getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as attribute value for ID using the alias name Id.
     * @param value value to set the ID
     */
    public void setId(DBSequence value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for NAME using the alias name Name.
     * @return the NAME
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as attribute value for NAME using the alias name Name.
     * @param value value to set the NAME
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link EmployeestoaptitudeView.
     */
    public RowIterator getEmployeestoaptitudeView() {
        return (RowIterator)getAttributeInternal(EMPLOYEESTOAPTITUDEVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link DepartmentsToAptitude.
     */
    public RowIterator getDepartmentsToAptitude() {
        return (RowIterator)getAttributeInternal(DEPARTMENTSTOAPTITUDE);
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