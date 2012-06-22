package com.virtual7.updateForHistorysation.model.entities;

import com.virtual7.util.model.BaseEntityImpl;


import com.virtual7.util.model.JBOUtils;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;

import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 20 16:44:37 EEST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DepartmentsImpl extends BaseEntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DepartmentId {
            public Object get(DepartmentsImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(DepartmentsImpl obj, Object value) {
                obj.setDepartmentId((DBSequence)value);
            }
        },
        DepartmentName {
            public Object get(DepartmentsImpl obj) {
                return obj.getDepartmentName();
            }

            public void put(DepartmentsImpl obj, Object value) {
                obj.setDepartmentName((String)value);
            }
        },
        ManagerId {
            public Object get(DepartmentsImpl obj) {
                return obj.getManagerId();
            }

            public void put(DepartmentsImpl obj, Object value) {
                obj.setManagerId((Number)value);
            }
        },
        LocationId {
            public Object get(DepartmentsImpl obj) {
                return obj.getLocationId();
            }

            public void put(DepartmentsImpl obj, Object value) {
                obj.setLocationId((Number)value);
            }
        },
        IsCurrentVersion {
            public Object get(DepartmentsImpl obj) {
                return obj.getIsCurrentVersion();
            }

            public void put(DepartmentsImpl obj, Object value) {
                obj.setIsCurrentVersion((Number)value);
            }
        },
        CreationDate {
            public Object get(DepartmentsImpl obj) {
                return obj.getCreationDate();
            }

            public void put(DepartmentsImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(DepartmentsImpl object);

        public abstract void put(DepartmentsImpl object, Object value);

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
    public static final int ISCURRENTVERSION = AttributesEnum.IsCurrentVersion.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DepartmentsImpl() {
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the DepartmentId
     */
    public DBSequence getDepartmentId() {
        return (DBSequence)getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(DBSequence value) {
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
    public Number getManagerId() {
        return (Number)getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManagerId.
     * @param value value to set the ManagerId
     */
    public void setManagerId(Number value) {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for LocationId, using the alias name LocationId.
     * @return the LocationId
     */
    public Number getLocationId() {
        return (Number)getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocationId.
     * @param value value to set the LocationId
     */
    public void setLocationId(Number value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for IsCurrentVersion, using the alias name IsCurrentVersion.
     * @return the IsCurrentVersion
     */
    public Number getIsCurrentVersion() {
        return (Number)getAttributeInternal(ISCURRENTVERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsCurrentVersion.
     * @param value value to set the IsCurrentVersion
     */
    public void setIsCurrentVersion(Number value) {
        setAttributeInternal(ISCURRENTVERSION, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
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
    public static Key createPrimaryKey(DBSequence departmentId) {
        return new Key(new Object[] { departmentId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject =
                    EntityDefImpl.findDefObject("com.virtual7.updateForHistorysation.model.entities.Departments");
        }
        return mDefinitionObject;
    }

    @Override
    public void doDML(int operation, TransactionEvent e) {
        if (operation == DML_UPDATE) {
            EntityDefImpl newDeptDef = getDefinitionObject();
            DepartmentsImpl newDept = (DepartmentsImpl)newDeptDef.createInstance2(getDBTransaction(), null);
            newDept.setDepartmentName(this.getDepartmentName());
            newDept.setLocationId(this.getLocationId());
            newDept.setIsCurrentVersion(new Number(1));
            newDept.setCreationDate(JBOUtils.getJBODate(Date.getCurrentDate()));

            this.revert();
            this.setAttribute(this.ISCURRENTVERSION, new Number(0));
        }
        super.doDML(operation, e);
    }


    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }
}
