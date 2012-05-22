package com.virtual7.bcCaching.model.entities;

import oracle.jbo.Key;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.DSEntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 22 09:43:10 EEST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentservicevoImpl extends DSEntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DepartmentId {
            public Object get(DepartmentservicevoImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(DepartmentservicevoImpl obj, Object value) {
                obj.setDepartmentId((Integer)value);
            }
        }
        ,
        DepartmentName {
            public Object get(DepartmentservicevoImpl obj) {
                return obj.getDepartmentName();
            }

            public void put(DepartmentservicevoImpl obj, Object value) {
                obj.setDepartmentName((String)value);
            }
        }
        ,
        ManagerId {
            public Object get(DepartmentservicevoImpl obj) {
                return obj.getManagerId();
            }

            public void put(DepartmentservicevoImpl obj, Object value) {
                obj.setManagerId((Integer)value);
            }
        }
        ,
        LocationId {
            public Object get(DepartmentservicevoImpl obj) {
                return obj.getLocationId();
            }

            public void put(DepartmentservicevoImpl obj, Object value) {
                obj.setLocationId((Integer)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(DepartmentservicevoImpl object);

        public abstract void put(DepartmentservicevoImpl object, Object value);

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
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DepartmentservicevoImpl() {
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the DepartmentId
     */
    public Integer getDepartmentId() {
        return (Integer)getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for DepartmentName, using the alias name DepartmentName.
     * @return the DepartmentName
     */
    public String getDepartmentName() {
        return (String)getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentName.
     * @param value value to set the DepartmentName
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for ManagerId, using the alias name ManagerId.
     * @return the ManagerId
     */
    public Integer getManagerId() {
        return (Integer)getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManagerId.
     * @param value value to set the ManagerId
     */
    public void setManagerId(Integer value) {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for LocationId, using the alias name LocationId.
     * @return the LocationId
     */
    public Integer getLocationId() {
        return (Integer)getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocationId.
     * @param value value to set the LocationId
     */
    public void setLocationId(Integer value) {
        setAttributeInternal(LOCATIONID, value);
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

    /**
     * @param departmentId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer departmentId) {
        return new Key(new Object[]{departmentId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("com.virtual7.bcCaching.model.entities.Departmentservicevo");
        }
        return mDefinitionObject;
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
