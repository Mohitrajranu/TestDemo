insert into mst_bankgroup(ID, group_id, group_descr, neft_type, rtgs_type, cur_status) values
(1,'YBL','YES BANK and Vyavsaik sahkari bank integration', 'NA','0','A');

insert into mst_bankname(ID, group_id, bankname, bankifsc, bank_type, neft_type, rtgs_type, cur_status) values
(1,'YBL','YSB','00000000000', '0','NA','0','A');

  CREATE SEQUENCE mst_bankdetails_ID_SEQ
  MINVALUE 1
  START WITH 1
  INCREMENT BY 1
  NOCACHE;
  
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.nextval, 'YSB','neftHost', '00000000000', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftUserId', 'devftp', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftPassword', 'cedge123', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftFtpProcType', '01', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftPortNo', '22', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftHostKey', '', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftSftpHost', '10.43.0.80', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftSftpHostKey', '', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftSftpUserId', 'yessftp', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftSftpPassword', 'yesinf@123', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftSftpPortNo', '22', 'A');


Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','f27OurBankLocalLoc','E:/YesTest/f27CBS/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','f27TheirBankLocalLoc','E:/YesTest/f27/','A');

Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n02TheirBankLocalLoc','E:/YesTest/n02/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n02OurBankLocalLoc','E:/YesTest/n02CBS/','A');

Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n06OurBankLocalLoc','E:/YesTest/n06/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n06TheirBankLocalLoc','E:/YesTest/n06YBL/','A');

Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n07OurBankLocalLoc','E:/YesTest/n07/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n07TheirBankLocalLoc','E:/YesTest/n07YBL/','A');

Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n09OurBankLocalLoc','E:/YesTest/n09CBS/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n09TheirBankLocalLoc','E:/YesTest/n09/','A');


Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n10OurBankLocalLoc','E:/YesTest/n10CBS/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n10TheirBankLocalLoc','E:/YesTest/n10/','A');

Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n10OurBankLocalLoc','E:/YesTest/n10Out/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','n10TheirBankLocalLoc','E:/YesTest/n10OutYBL/','A');

update mst_bankdetails set param_val='10.1.21.15' where param_key='neftHost';
update mst_bankdetails set param_val='fnsonlu6' where param_key='neftUserId';
update mst_bankdetails set param_val='fnsonlu6@123' where param_key='neftPassword';

insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values (mst_bankdetails_ID_SEQ.nextval, 'YSB','n02OurBankLoc','/fns/u6/r/spool/Interfaces/NEFT/INCOMING/', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values (mst_bankdetails_ID_SEQ.nextval, 'YSB','f27OurBankLoc','/fns/u6/r/spool/Interfaces/NEFT/INCOMING/', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values (mst_bankdetails_ID_SEQ.nextval, 'YSB','n10OurBankLoc','/fns/u6/r/spool/Interfaces/NEFT/INCOMING/N10-INCOMING/', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values (mst_bankdetails_ID_SEQ.nextval, 'YSB','n09OurBankLoc','/fns/u6/r/spool/Interfaces/NEFT/INCOMING/N10-INCOMING/', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values (mst_bankdetails_ID_SEQ.nextval, 'YSB','n06OurBankLoc','/fns/u6/r/spool/Interfaces/NEFT/OUTGOING/', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values (mst_bankdetails_ID_SEQ.nextval, 'YSB','n07OurBankLoc','/fns/u6/r/spool/Interfaces/NEFT/OUTGOING/', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values (mst_bankdetails_ID_SEQ.nextval, 'YSB','n10OutOurBankLoc','/fns/u6/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/', 'A');


Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r41inOurBankLoc','/fns/u6/r/spool/Interfaces/RTGS/RTGS-INCOMING-RBI/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r41inOurBankLocalLoc','E:/YesTest/r41InCBS/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r41inTheirBankLoc','/home/yessftp/testsftp/inward/rtgs/R41_R42/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r41inTheirBankLocalLoc','E:/YesTest/r41In/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r42inOurBankLoc','/fns/u6/r/spool/Interfaces/RTGS/RTGS-INCOMING-RBI/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r42inOurBankLocalLoc','E:/YesTest/r42InCBS/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r42inTheirBankLoc','/home/yessftp/testsftp/inward/rtgs/R41_R42/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r42inTheirBankLocalLoc','E:/YesTest/r42In/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','rr42inOurBankLoc','/fns/u6/r/spool/Interfaces/RTGS/RTGS-INCOMING-RBI/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','rr42inOurBankLocalLoc','E:/YesTest/rr42InCBS/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','rr42inTheirBankLoc','/home/yessftp/testsftp/inward/rtgs/R41_R42/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','rr42inTheirBankLocalLoc','E:/YesTest/rr42In/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r90OurBankLoc','/fns/u6/r/spool/Interfaces/RTGS/RTGS-INCOMING-RBI/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r90OurBankLocalLoc','E:/YesTest/r90CBS/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r90TheirBankLoc','/home/yessftp/testsftp/outward/rtgs/R90/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r90TheirBankLocalLoc','E:/YesTest/r90/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r09OurBankLoc','/fns/u6/r/spool/Interfaces/RTGS/RTGS-INCOMING-RBI/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r09OurBankLocalLoc','E:/YesTest/r09CBS/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r09TheirBankLoc','/home/yessftp/testsftp/outward/rtgs/R09/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r09TheirBankLocalLoc','E:/YesTest/r09/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r41outOurBankLoc','/fns/u6/r/spool/Interfaces/RTGS/NEWMESSAGES/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r41outOurBankLocalLoc','E:/YesTest/r41Out/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r41outTheirBankLoc','/home/yessftp/testsftp/outward/rtgs/R41_R42/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r41outTheirBankLocalLoc','E:/YesTest/r41OutYBL/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r42outOurBankLoc','/fns/u6/r/spool/Interfaces/RTGS/NEWMESSAGES/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r42outOurBankLocalLoc','E:/YesTest/r42Out/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r42outTheirBankLoc','/home/yessftp/testsftp/outward/rtgs/R41_R42/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','r42outTheirBankLocalLoc','E:/YesTest/r42OutYBL/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','rr42outOurBankLoc','/fns/u6/r/spool/Interfaces/RTGS/NEWMESSAGES/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','rr42outOurBankLocalLoc','E:/YesTest/rr42Out/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','rr42outTheirBankLoc','/home/yessftp/testsftp/outward/rtgs/R41_R42/','A');
Insert into mst_bankdetails (ID,BANKNAME,PARAM_KEY,PARAM_VAL,CUR_STATUS) values (mst_bankdetails_ID_SEQ.NEXTVAL,'YSB','rr42outTheirBankLocalLoc','E:/YesTest/rr42OutYBL/','A');

insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','rtgsPortNo', '22', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','neftSftpPortNo', '22', 'A');
insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.NEXTVAL, 'YSB','rtgsSftpPortNo', '22', 'A');


update mst_bankdetails set param_val='E:/YesTest/r41InCBS/' where param_val='E:/YesTest/r42InCBS/';
update mst_bankdetails set param_val='E:/YesTest/r41In/' where param_val='E:/YesTest/r42In/';
update mst_bankdetails set param_val='E:/YesTest/r41InCBS/' where param_val='E:/YesTest/rr42InCBS/';
update mst_bankdetails set param_val='E:/YesTest/r41In/' where param_val='E:/YesTest/rr42In/';
update mst_bankdetails set param_val='E:/YesTest/r41Out/' where param_val='E:/YesTest/r42Out/';
update mst_bankdetails set param_val='E:/YesTest/r41OutYBL/' where param_val='E:/YesTest/r42OutYBL/';
update mst_bankdetails set param_val='E:/YesTest/r41Out/' where param_val='E:/YesTest/rr42Out/';

update mst_bankdetails set param_val='/home/yessftp/CEdge_linux/Output/YES_VSB/' where param_key like '%TheirBankLoc';
update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/N02/' where param_key like 'n02TheirBankLoc';
update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/N02/' where param_key like 'n09TheirBankLoc';

update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/F27/' where param_key like 'f27TheirBankLoc';

update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/N10/' where param_key like 'n10TheirBankLoc';
update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/R41/' where param_key like 'r41inTheirBankLoc';
update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/R41/' where param_key like 'r42inTheirBankLoc';
update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/R41/' where param_key like 'rr42inTheirBankLoc';

update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/R90/' where param_key like 'r90TheirBankLoc';
update mst_bankdetails set param_val='/home/yessftp/Inward_VCB/R09/' where param_key like 'r09TheirBankLoc';
update mst_bankname set bankifsc='YESB0VSBL05' where bankifsc='YESB0000001';


insert into mst_bankdetails(ID, bankname, param_key, param_val, cur_status) values
(mst_bankdetails_ID_SEQ.nextval, 'YSB','n10OutTheirBankLoc', '/home/yessftp/CEdge_linux/Input/N10/', 'A');