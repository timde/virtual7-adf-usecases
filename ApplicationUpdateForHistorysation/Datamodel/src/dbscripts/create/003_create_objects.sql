ALTER TABLE DEPARTMENTS 
    ADD (IS_CURRENT_VERSION NUMBER(1, 0),
         CREATION_DATE DATE
    );
    
ALTER TABLE DEPARTMENTS MODIFY IS_CURRENT_VERSION DEFAULT 1;
ALTER TABLE DEPARTMENTS MODIFY CREATION_DATE DEFAULT SYSDATE;