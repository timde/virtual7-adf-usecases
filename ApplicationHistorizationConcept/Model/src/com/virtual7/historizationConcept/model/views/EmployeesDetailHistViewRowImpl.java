package com.virtual7.historizationConcept.model.views;

import name.fraser.neil.plaintext.diff_match_patch;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 29 16:58:53 EET 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesDetailHistViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        LastChangeDate {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getLastChangeDate();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setLastChangeDate((Date)value);
            }
        }
        ,
        IsLast {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getIsLast();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setIsLast((String)value);
            }
        }
        ,
        EmployeeId {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getEmployeeId();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setEmployeeId((Number)value);
            }
        }
        ,
        FirstName {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getFirstName();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setFirstName((String)value);
            }
        }
        ,
        LastName {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getLastName();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        JobId {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getJobId();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setJobId((String)value);
            }
        }
        ,
        JobTitle {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getJobTitle();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setJobTitle((String)value);
            }
        }
        ,
        DepartmentId {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getDepartmentId();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setDepartmentId((Number)value);
            }
        }
        ,
        DepartmentName {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getDepartmentName();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setDepartmentName((String)value);
            }
        }
        ,
        LastNameDiff {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getLastNameDiff();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setLastNameDiff((String)value);
            }
        }
        ,
        DepartmentNameDiff {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getDepartmentNameDiff();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setDepartmentNameDiff((String)value);
            }
        }
        ,
        JobTitleDiff {
            public Object get(EmployeesDetailHistViewRowImpl obj) {
                return obj.getJobTitleDiff();
            }

            public void put(EmployeesDetailHistViewRowImpl obj, Object value) {
                obj.setJobTitleDiff((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(EmployeesDetailHistViewRowImpl object);

        public abstract void put(EmployeesDetailHistViewRowImpl object, Object value);

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


    public static final int LASTCHANGEDATE = AttributesEnum.LastChangeDate.index();
    public static final int ISLAST = AttributesEnum.IsLast.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int JOBTITLE = AttributesEnum.JobTitle.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int LASTNAMEDIFF = AttributesEnum.LastNameDiff.index();
    public static final int DEPARTMENTNAMEDIFF = AttributesEnum.DepartmentNameDiff.index();
    public static final int JOBTITLEDIFF = AttributesEnum.JobTitleDiff.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesDetailHistViewRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute LastChangeDate.
     * @return the LastChangeDate
     */
    public Date getLastChangeDate() {
        return (Date)getAttributeInternal(LASTCHANGEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LastChangeDate.
     * @param value value to set the  LastChangeDate
     */
    public void setLastChangeDate(Date value) {
        setAttributeInternal(LASTCHANGEDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute IsLast.
     * @return the IsLast
     */
    public String getIsLast() {
        return (String)getAttributeInternal(ISLAST);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute IsLast.
     * @param value value to set the  IsLast
     */
    public void setIsLast(String value) {
        setAttributeInternal(ISLAST, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeId.
     * @return the EmployeeId
     */
    public Number getEmployeeId() {
        return (Number)getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EmployeeId.
     * @param value value to set the  EmployeeId
     */
    public void setEmployeeId(Number value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FirstName.
     * @return the FirstName
     */
    public String getFirstName() {
        return (String)getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FirstName.
     * @param value value to set the  FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LastName.
     * @return the LastName
     */
    public String getLastName() {
        return (String)getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LastName.
     * @param value value to set the  LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute JobId.
     * @return the JobId
     */
    public String getJobId() {
        return (String)getAttributeInternal(JOBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute JobId.
     * @param value value to set the  JobId
     */
    public void setJobId(String value) {
        setAttributeInternal(JOBID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute JobTitle.
     * @return the JobTitle
     */
    public String getJobTitle() {
        return (String)getAttributeInternal(JOBTITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute JobTitle.
     * @param value value to set the  JobTitle
     */
    public void setJobTitle(String value) {
        setAttributeInternal(JOBTITLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentId.
     * @return the DepartmentId
     */
    public Number getDepartmentId() {
        return (Number)getAttributeInternal(DEPARTMENTID);
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
        return (String)getAttributeInternal(DEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepartmentName.
     * @param value value to set the  DepartmentName
     */
    public void setDepartmentName(String value) {
        setAttributeInternal(DEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LastNameDiff.
     * @return the LastNameDiff
     */
    public String getLastNameDiff() {
        return (String)getAttributeInternal(LASTNAMEDIFF);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LastNameDiff.
     * @param value value to set the  LastNameDiff
     */
    public void setLastNameDiff(String value) {
        setAttributeInternal(LASTNAMEDIFF, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepartmentNameDiff.
     * @return the DepartmentNameDiff
     */
    public String getDepartmentNameDiff() {
        return (String)getAttributeInternal(DEPARTMENTNAMEDIFF);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepartmentNameDiff.
     * @param value value to set the  DepartmentNameDiff
     */
    public void setDepartmentNameDiff(String value) {
        setAttributeInternal(DEPARTMENTNAMEDIFF, value);
    }

    /**
     * Gets the attribute value for the calculated attribute JobTitleDiff.
     * @return the JobTitleDiff
     */
    public String getJobTitleDiff() {
        return (String)getAttributeInternal(JOBTITLEDIFF);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute JobTitleDiff.
     * @param value value to set the  JobTitleDiff
     */
    public void setJobTitleDiff(String value) {
        setAttributeInternal(JOBTITLEDIFF, value);
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
     * Peeks in the view rowset the next row, without navigating to it.
     * @param row The view row for which to peek for the next row.
     * @return The next row peeked
     */
    public static Row peekNextRow(ViewRowImpl row) {
        RowSetIterator it = null;
        try {
            it = row.getViewObject().createRowSetIterator(null);
            it.setCurrentRow(row);
            if (it.hasNext()) {
                return it.next();
            }
        } finally {
            if (it != null) {
                it.closeRowSetIterator();
            }
        }

        return null;
    }

    /**
     * Peeks in the view rowset the previous row, without navigating to it.
     * @param row The view row for which to peek for the previous row.
     * @return The previous row peeked
     */
    public static Row peekPreviousRow(ViewRowImpl row) {
        RowSetIterator it = null;
        try {
            it = row.getViewObject().createRowSetIterator(null);
            it.setCurrentRow(row);
            if (it.hasPrevious()) {
                return it.previous();
            }
        } finally {
            if (it != null) {
                it.closeRowSetIterator();
            }
        }
        return null;
    }

    public static String diff(String curValue, String otherValue) {
        if (otherValue != null && curValue != null) {
            diff_match_patch patcher = new diff_match_patch();
            return patcher.diff_prettyHtml(patcher.diff_main(otherValue, curValue));
        } else {
            return curValue;
        }

    }

    private String getAttributeDiff(int attrIndex) {
        String otherValue = null;
        String curValue = (String)getAttributeInternal(attrIndex);

        EmployeesDetailHistViewRowImpl prevRow = (EmployeesDetailHistViewRowImpl)peekNextRow(this);
        if (prevRow != null) {
            otherValue = (String)prevRow.getAttributeInternal(attrIndex);
        }
        return diff(curValue, otherValue);
    }

    public String calculateLastNameDiff() {
        return getAttributeDiff(LASTNAME);
    }

    public String calculateDepartmentNameDiff() {
        return getAttributeDiff(DEPARTMENTNAME);
    }

    public String calculateJobTitleDiff() {
        return getAttributeDiff(JOBTITLE);
    }
}
