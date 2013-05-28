-- modify manually VERSION_START/VERSION_END to binary_double on all history tables; might need to delete data before!!!
ALTER TABLE DEPARTMENTS_HIST MODIFY (VERSION_START BINARY_DOUBLE);
ALTER TABLE DEPARTMENTS_HIST MODIFY (VERSION_END BINARY_DOUBLE);
ALTER TABLE EMPLOYEES_HIST MODIFY (VERSION_START BINARY_DOUBLE);
ALTER TABLE EMPLOYEES_HIST MODIFY (VERSION_END BINARY_DOUBLE);
ALTER TABLE JOBS_HIST MODIFY (VERSION_START BINARY_DOUBLE);
ALTER TABLE JOBS_HIST MODIFY (VERSION_END BINARY_DOUBLE);

-- modify LAST_CHANGE_DATE to timestamp
ALTER TABLE DEPARTMENTS MODIFY (LAST_CHANGE_DATE TIMESTAMP DEFAULT (systimestamp));
ALTER TABLE DEPARTMENTS_HIST MODIFY (LAST_CHANGE_DATE TIMESTAMP DEFAULT (systimestamp));
ALTER TABLE EMPLOYEES MODIFY (LAST_CHANGE_DATE TIMESTAMP DEFAULT (systimestamp));
ALTER TABLE EMPLOYEES_HIST MODIFY (LAST_CHANGE_DATE TIMESTAMP DEFAULT (systimestamp));
ALTER TABLE JOBS MODIFY (LAST_CHANGE_DATE TIMESTAMP DEFAULT (systimestamp));
ALTER TABLE JOBS_HIST MODIFY (LAST_CHANGE_DATE TIMESTAMP DEFAULT (systimestamp));

--create FKs from history tables to main tables PK
ALTER TABLE DEPARTMENTS_HIST ADD CONSTRAINT DEPARTMENTS_HIST_DEPARTME_FK1 FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS (DEPARTMENT_ID) ENABLE;
ALTER TABLE EMPLOYEES_HIST ADD CONSTRAINT EMPLOYEES_HIST_DEPARTME_FK1 FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEES (EMPLOYEE_ID) ENABLE;
ALTER TABLE JOBS_HIST ADD CONSTRAINT JOBS_HIST_DEPARTME_FK1 FOREIGN KEY (JOB_ID) REFERENCES JOBS (JOB_ID) ENABLE;

--create some indexes for testing performance improovements
CREATE INDEX DEPARTMENTS_HIST_DN ON DEPARTMENTS_HIST (DEPARTMENT_NAME);
CREATE INDEX DEPARTMENTS_HIST_VS ON DEPARTMENTS_HIST (VERSION_START);
CREATE INDEX DEPARTMENTS_HIST_VE ON DEPARTMENTS_HIST (VERSION_END);
CREATE INDEX DEPARTMENTS_HIST_VSE ON DEPARTMENTS_HIST (VERSION_START,VERSION_END);
CREATE INDEX DEPARTMENTS_HIST_DI ON DEPARTMENTS_HIST (DEPARTMENT_ID);
CREATE INDEX DEPARTMENTS_HIST_LCD ON DEPARTMENTS_HIST (LAST_CHANGE_DATE);
CREATE INDEX DEPARTMENTS_LCD ON DEPARTMENTS (LAST_CHANGE_DATE);

CREATE INDEX EMPLOYEES_HIST_LN ON EMPLOYEES_HIST (LAST_NAME);
CREATE INDEX EMPLOYEES_HIST_DI ON EMPLOYEES_HIST (DEPARTMENT_ID);
CREATE INDEX EMPLOYEES_HIST_VS ON EMPLOYEES_HIST (VERSION_START);
CREATE INDEX EMPLOYEES_HIST_VE ON EMPLOYEES_HIST (VERSION_END);
CREATE INDEX EMPLOYEES_HIST_VSE ON EMPLOYEES_HIST (VERSION_START,VERSION_END);
CREATE INDEX EMPLOYEES_HIST_EI ON EMPLOYEES_HIST (EMPLOYEE_ID);
CREATE INDEX EMPLOYEES_HIST_LCD ON EMPLOYEES_HIST (LAST_CHANGE_DATE);
CREATE INDEX EMPLOYEES_LCD ON EMPLOYEES (LAST_CHANGE_DATE);

CREATE INDEX JOBS_HIST_JT ON JOBS_HIST (JOB_TITLE);
CREATE INDEX JOBS_HIST_VS ON JOBS_HIST (VERSION_START);
CREATE INDEX JOBS_HIST_VE ON JOBS_HIST (VERSION_END);
CREATE INDEX JOBS_HIST_VSE ON JOBS_HIST (VERSION_START, VERSION_END);
CREATE INDEX JOBS_HIST_JI ON JOBS_HIST (JOB_ID);
CREATE INDEX JOBS_HIST_LCD ON JOBS_HIST (LAST_CHANGE_DATE);
CREATE INDEX JOBS_LCD ON JOBS (LAST_CHANGE_DATE);

ALTER INDEX DEPARTMENTS_HIST_PK REBUILD;
ALTER INDEX DEPARTMENTS_HIST_DN REBUILD;
ALTER INDEX DEPARTMENTS_HIST_VS REBUILD;
ALTER INDEX DEPARTMENTS_HIST_VE REBUILD;
ALTER INDEX DEPARTMENTS_HIST_VSE REBUILD;
ALTER INDEX DEPARTMENTS_HIST_DI REBUILD;
ALTER INDEX DEPARTMENTS_HIST_LCD REBUILD;
ALTER INDEX DEPARTMENTS_LCD REBUILD;

ALTER INDEX EMPLOYEES_HIST_PK REBUILD;
ALTER INDEX EMPLOYEES_HIST_LN REBUILD;
ALTER INDEX EMPLOYEES_HIST_DI REBUILD;
ALTER INDEX EMPLOYEES_HIST_VS REBUILD;
ALTER INDEX EMPLOYEES_HIST_VE REBUILD;
ALTER INDEX EMPLOYEES_HIST_VSE REBUILD;
ALTER INDEX EMPLOYEES_HIST_EI REBUILD;
ALTER INDEX EMPLOYEES_HIST_LCD REBUILD;
ALTER INDEX EMPLOYEES_LCD REBUILD;

ALTER INDEX JOBS_HIST_PK REBUILD;
ALTER INDEX JOBS_HIST_JT REBUILD;
ALTER INDEX JOBS_HIST_VS REBUILD;
ALTER INDEX JOBS_HIST_VE REBUILD;
ALTER INDEX JOBS_HIST_VSE REBUILD;
ALTER INDEX JOBS_HIST_JI REBUILD;
ALTER INDEX JOBS_HIST_LCD REBUILD;
ALTER INDEX JOBS_LCD REBUILD;


analyze table employees compute statistics for table for all indexes for all indexed columns;
analyze table employees_hist compute statistics for table for all indexes for all indexed columns;
analyze table departments compute statistics for table for all indexes for all indexed columns;
analyze table departments_hist compute statistics for table for all indexes for all indexed columns;
analyze table jobs compute statistics for table for all indexes for all indexed columns;
analyze table jobs_hist compute statistics for table for all indexes for all indexed columns;
