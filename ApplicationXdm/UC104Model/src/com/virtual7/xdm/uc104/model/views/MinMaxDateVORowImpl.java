package com.virtual7.xdm.uc104.model.views;

import com.virtual7.xdm.framework.ViewRowImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 22 18:04:46 EET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MinMaxDateVORowImpl extends ViewRowImpl {

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        MinStartDate {
            public Object get(MinMaxDateVORowImpl obj) {
                return obj.getMinStartDate();
            }

            public void put(MinMaxDateVORowImpl obj, Object value) {
                obj.setMinStartDate((Date)value);
            }
        },
        MaxEndDate {
            public Object get(MinMaxDateVORowImpl obj) {
                return obj.getMaxEndDate();
            }

            public void put(MinMaxDateVORowImpl obj, Object value) {
                obj.setMaxEndDate((Date)value);
            }
        },
        Dummy {
            public Object get(MinMaxDateVORowImpl obj) {
                return obj.getDummy();
            }

            public void put(MinMaxDateVORowImpl obj, Object value) {
                obj.setDummy((String)value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MinMaxDateVORowImpl object);

        public abstract void put(MinMaxDateVORowImpl object, Object value);

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
    public static final int MINSTARTDATE = AttributesEnum.MinStartDate.index();
    public static final int MAXENDDATE = AttributesEnum.MaxEndDate.index();
    public static final int DUMMY = AttributesEnum.Dummy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MinMaxDateVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute MinStartDate.
     * @return the MinStartDate
     */
    public java.util.Date getMinStartDate() {
        return ((Date)getAttributeInternal(MINSTARTDATE)).getValue();
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MinStartDate.
     * @param value value to set the  MinStartDate
     */
    public void setMinStartDate(Date value) {
        setAttributeInternal(MINSTARTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxEndDate.
     * @return the MaxEndDate
     */
    public java.util.Date getMaxEndDate() {
        return ((Date)getAttributeInternal(MAXENDDATE)).getValue();
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MaxEndDate.
     * @param value value to set the  MaxEndDate
     */
    public void setMaxEndDate(Date value) {
        setAttributeInternal(MAXENDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Dummy.
     * @return the Dummy
     */
    public String getDummy() {
        return (String)getAttributeInternal(DUMMY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Dummy.
     * @param value value to set the  Dummy
     */
    public void setDummy(String value) {
        setAttributeInternal(DUMMY, value);
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
