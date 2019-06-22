  drop table mst_bankname;
  CREATE TABLE mst_bankname 
   (
   	ID NUMBER(10) NOT NULL,
    GROUP_ID varchar2(20) NOT NULL,
    bankname varchar2(100) not null,
    bankifsc varchar2(11) not null,
    bank_type varchar2(3),
    neft_type varchar2(3),
    rtgs_type varchar2(3),
  	CUR_STATUS VARCHAR2(2),
  CONSTRAINT mst_bankname_pk PRIMARY KEY (ID)
   );
   
     drop table mst_bankdetails;
  CREATE TABLE mst_bankdetails 
   (
   	ID NUMBER(10) NOT NULL,
    bankname varchar2(100) not null,
    param_key varchar2(20) not null,
    param_val varchar2(100),
  	CUR_STATUS VARCHAR2(2),
  CONSTRAINT mst_bankdetails_pk PRIMARY KEY (ID)
   );
   
     CREATE TABLE MST_PARAM(
  PARAM_KEY VARCHAR2(50 BYTE), 
	PARAM_VAL VARCHAR2(500 BYTE), 
	CUR_STATUS VARCHAR2(2 BYTE)
   );