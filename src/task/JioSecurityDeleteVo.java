package task;

import java.io.Serializable;
import java.sql.Date;

public class JioSecurityDeleteVo implements Serializable {

	private String msisdn;
	private Date createdOn;
	private Date createdOn1;
	private String custstatus;
	private String custstatus1;
	
	public String getCuststatus() {
		return custstatus;
	}
	public void setCuststatus(String custstatus) {
		this.custstatus = custstatus;
	}
	public String getCuststatus1() {
		return custstatus1;
	}
	public void setCuststatus1(String custstatus1) {
		this.custstatus1 = custstatus1;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getCreatedOn1() {
		return createdOn1;
	}
	public void setCreatedOn1(Date createdOn1) {
		this.createdOn1 = createdOn1;
	}
	
}
