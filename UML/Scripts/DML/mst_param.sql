--GENERAL PATHS
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_FOLDERPATH', 'D:\\Java Program\\NEFT_Proj\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_EXPPATH', 'D:\\Java Program\\Excep_Msg\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUTPUTFOLDER', 'D:\\Java Program\\DownloadFile\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRBOUTPATH', 'D:\\Java Program\\RRB_OUT_File\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUTDONE', 'D:\\Java Program\\OUT_Done\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUTERROR', 'D:\\Java Program\\OUT_Error\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUTERRORDONE', 'D:\\Java Program\\OUT_Error_Done\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUTACKNACK', 'D:\\Java Program\\OUT_acknack\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ABRRBOUTPATH', 'D:\\Java Program\\AB_RRB_OUT_File\\','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_UPLOADFILEPPATH', 'E:\\Java Program\\UploadFile\\','A');



--FTP ERROR 
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_FTPERRORHOST', '10.32.32.101','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_FTPERRORUSER', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_FTPERRORPASS', 'neft@101','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_FTPERRORPATH', '/fns/rb/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_FTPOUTACKNACKPATH', '/fns/rb/r/spool/Interfaces/NEFT/NEFT-R41-STAT/','A');


--APGB
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_APGB', 'APGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_APGB', '10.32.32.210','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_APGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_APGB', 'neft@101','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_APGB', 'RRB_APGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_APGB', '/fns/ad/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_APGB', '/fns/ad/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_APGB', '/fns/ad/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_APGB', '/fns/ad/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_APGB', '/fns/ad/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_APGB', '/fns/ad/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_APGB', '/fns/ad/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_APGB', '/fns/ad/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--DCGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_DCGB', 'DCGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_DCGB', '10.32.32.207','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_DCGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_DCGB', 'neft@102','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_DCGB', 'AB_RRB_DCGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_DCGB', '/fns/dd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_DCGB', '/fns/dd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_DCGB', '/fns/dd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_DCGB', '/fns/dd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_DCGB', '/fns/dd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_DCGB', '/fns/dd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_DCGB', '/fns/dd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_DCGB', '/fns/dd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--MRGB


insert into mst_param(param_key, param_value, cur_status) values
('NEFT_MRGB', 'MRGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_MRGB', '10.32.32.218','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_MRGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_MRGB', 'neft@102','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_MRGB', 'AB_RRB_MRGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_MRGB', '/fns/rd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_MRGB', '/fns/rd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_MRGB', '/fns/rd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_MRGB', '/fns/rd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_MRGB', '/fns/rd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_MRGB', '/fns/rd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_MRGB', '/fns/rd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_MRGB', '/fns/rd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');



--MEGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_MEGB', 'MEGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_MEGB', '10.32.32.219','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_MEGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_MEGB', 'neft@102','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_MEGB', 'RRB_MEGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_MEGB', '/fns/gd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_MEGB', '/fns/gd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_MEGB', '/fns/gd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_MEGB', '/fns/gd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_MEGB', '/fns/gd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_MEGB', '/fns/gd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_MEGB', '/fns/gd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_MEGB', '/fns/gd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--SRGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_SRGB', 'SRGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_SRGB', '10.32.32.204','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_SRGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_SRGB', 'neft@102','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_SRGB', 'RRB_SRGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_SRGB', '/fns/sd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_SRGB', '/fns/sd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_SRGB', '/fns/sd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_SRGB', '/fns/sd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_SRGB', '/fns/sd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_SRGB', '/fns/sd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_SRGB', '/fns/sd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_SRGB', '/fns/sd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--UKGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_UKGB', 'UKGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_UKGB', '10.32.32.217','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_UKGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_UKGB', 'neft@103','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_UKGB', 'RRB_UKGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_UKGB', '/fns/ud/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_UKGB', '/fns/ud/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_UKGB', '/fns/ud/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_UKGB', '/fns/ud/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_UKGB', '/fns/ud/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_UKGB', '/fns/ud/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_UKGB', '/fns/ud/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_UKGB', '/fns/ud/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--PUGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PUGB', 'PUGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_PUGB', '10.32.32.203','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_PUGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_PUGB', 'neft@103','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_PUGB', 'RRB_PUGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_PUGB', '/fns/pd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_PUGB', '/fns/pd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_PUGB', '/fns/pd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_PUGB', '/fns/pd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_PUGB', '/fns/pd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_PUGB', '/fns/pd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_PUGB', '/fns/pd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_PUGB', '/fns/pd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');

--ARGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ARGB', 'ARGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_ARGB', '10.32.32.224','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_ARGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_ARGB', 'neft@102','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_ARGB', 'RRB_ARGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_ARGB', '/fns/hd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_ARGB', '/fns/hd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_ARGB', '/fns/hd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_ARGB', '/fns/hd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_ARGB', '/fns/hd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_ARGB', '/fns/hd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_ARGB', '/fns/hd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_ARGB', '/fns/hd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');

--LDGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_LDGB', 'LDGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_LDGB', '10.32.32.222','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_LDGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_LDGB', 'neft@103','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_LDGB', 'RRB_LDGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_LDGB', '/fns/ld/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_LDGB', '/fns/ld/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_LDGB', '/fns/ld/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_LDGB', '/fns/ld/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_LDGB', '/fns/ld/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_LDGB', '/fns/ld/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_LDGB', '/fns/ld/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_LDGB', '/fns/ld/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--CKGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_CKGB', 'CKGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_CKGB', '10.32.32.215','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_CKGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_CKGB', 'neft@104','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_CKGB', 'AB_RRB_CKGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_CKGB', '/fns/id/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_CKGB', '/fns/id/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_CKGB', '/fns/id/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_CKGB', '/fns/id/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_CKGB', '/fns/id/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_CKGB', '/fns/id/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_CKGB', '/fns/id/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_CKGB', '/fns/id/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--CHGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_CHGB', 'CHGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_CHGB', '10.32.32.211','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_CHGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_CHGB', 'neft@104','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_CHGB', 'RRB_CHGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_CHGB', '/fns/cd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_CHGB', '/fns/cd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_CHGB', '/fns/cd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_CHGB', '/fns/cd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_CHGB', '/fns/cd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_CHGB', '/fns/cd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_CHGB', '/fns/cd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_CHGB', '/fns/cd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--MIGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_MIGB', 'MIGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_MIGB', '10.32.32.221','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_MIGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_MIGB', 'neft@104','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_MIGB', 'RRB_MIGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_MIGB', '/fns/fd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_MIGB', '/fns/fd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_MIGB', '/fns/fd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_MIGB', '/fns/fd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_MIGB', '/fns/fd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_MIGB', '/fns/fd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_MIGB', '/fns/fd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_MIGB', '/fns/fd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');



--MLGB


insert into mst_param(param_key, param_value, cur_status) values
('NEFT_MLGB', 'MLGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_MLGB', '10.32.32.214','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_MLGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_MLGB', 'neft@104','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_MLGB', 'AB_RRB_MLGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_MLGB', '/fns/wd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_MLGB', '/fns/wd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_MLGB', '/fns/wd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_MLGB', '/fns/wd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_MLGB', '/fns/wd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_MLGB', '/fns/wd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_MLGB', '/fns/wd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_MLGB', '/fns/wd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--VCGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_VCGB', 'VCGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_VCGB', '10.32.32.216','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_VCGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_VCGB', 'neft@105','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_VCGB', 'RRB_VCGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_VCGB', '/fns/vd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_VCGB', '/fns/vd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_VCGB', '/fns/vd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_VCGB', '/fns/vd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_VCGB', '/fns/vd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_VCGB', '/fns/vd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_VCGB', '/fns/vd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_VCGB', '/fns/vd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');



--KRGB


insert into mst_param(param_key, param_value, cur_status) values
('NEFT_KRGB', 'KRGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_KRGB', '10.32.32.205','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_KRGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_KRGB', 'neft@105','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_KRGB', 'RRB_KRGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_KRGB', '/fns/kr/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_KRGB', '/fns/kr/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_KRGB', '/fns/kr/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_KRGB', '/fns/kr/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_KRGB', '/fns/kr/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_KRGB', '/fns/kr/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_KRGB', '/fns/kr/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_KRGB', '/fns/kr/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--MBGB


insert into mst_param(param_key, param_value, cur_status) values
('NEFT_MBGB', 'MBGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_MBGB', '10.32.32.208','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_MBGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_MBGB', 'neft@106','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_MBGB', 'RRB_MBGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_MBGB', '/fns/md/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_MBGB', '/fns/md/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_MBGB', '/fns/md/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_MBGB', '/fns/md/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_MBGB', '/fns/md/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_MBGB', '/fns/md/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_MBGB', '/fns/md/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_MBGB', '/fns/md/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');



--UTGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_UTGB', 'UTGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_UTGB', '10.32.32.206','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_UTGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_UTGB', 'neft@106','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_UTGB', 'RRB_UTGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_UTGB', '/fns/td/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_UTGB', '/fns/td/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_UTGB', '/fns/td/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_UTGB', '/fns/td/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_UTGB', '/fns/td/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_UTGB', '/fns/td/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_UTGB', '/fns/td/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_UTGB', '/fns/td/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--ELGB

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ELGB', 'ELGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_ELGB', '10.32.32.220','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_ELGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_ELGB', 'neft@102','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_ELGB', 'RRB_ELGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_ELGB', '/fns/ed/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_ELGB', '/fns/ed/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_ELGB', '/fns/ed/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_ELGB', '/fns/ed/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_ELGB', '/fns/ed/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_ELGB', '/fns/ed/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_ELGB', '/fns/ed/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_ELGB', '/fns/ed/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');


--NLGB


insert into mst_param(param_key, param_value, cur_status) values
('NEFT_NLGB', 'NLGB','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_HOST_NLGB', '10.32.32.220','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_USER_NLGB', 'neft','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PASS_NLGB', 'neft@102','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QUEUE_NLGB', 'RRB_NLGB_IN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_IN_NLGB', '/fns/nd/r/spool/Interfaces/NEFT/INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_OUT_NLGB', '/fns/nd/r/spool/Interfaces/NEFT/OUTGOING/RTGS-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_STATUS_NLGB', '/fns/nd/r/spool/Interfaces/NEFT/NEFT-STATUS-INCOMING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_R41_RET_NLGB', '/fns/nd/r/spool/Interfaces/NEFT/NEFT-R41-RETURN/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_N10_OUT_NLGB', '/fns/nd/r/spool/Interfaces/NEFT/OUTGOING/N10-OUTGOING/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_ERROR_NLGB', '/fns/nd/r/spool/Interfaces/NEFT/ACKNACK-ERROR/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_RRB_DUP_NLGB', '/fns/nd/r/spool/Interfaces/NEFT/RRB-DUP/','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_ACK_DUP_NLGB', '/fns/nd/r/spool/Interfaces/NEFT/ACKNACK-DUP/','A');



--MQ CONFIGURATIONS

insert into mst_param(param_key, param_value, cur_status) values
('NEFT_MQHOSTNAME', '192.168.253.20','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_MQHOSTNAME', '192.168.252.5','X');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_MQCHANNEL', 'RRBQM.SVRCONN','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_QMANAGER', 'RRBQM','A');
insert into mst_param(param_key, param_value, cur_status) values
('NEFT_PORT', '1601','A');
