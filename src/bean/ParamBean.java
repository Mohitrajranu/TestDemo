package bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ParamBean{

	private String utr;
	private String bankIfsc, msgType, amount, creationTm,yesUTR;

	public String getUtr() {
		return utr;
	}

	public void setUtr(String utr) {
		this.utr = utr;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc.trim();
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCreationTm() {
		return creationTm;
	}

	public void setCreationTm(String creationTm) {
		this.creationTm = creationTm;
	}
	
	public String getYesUTR() {
		return yesUTR;
	}

	public void setYesUTR(String yesUTR) {
		this.yesUTR = yesUTR;
	}

	@Override
	public String toString() {
		return "utr=>" + utr + "<,bankIfsc=>" + bankIfsc + "<,msgType=>" + msgType + "<,amount=>" + amount + "<,creationTm=>" + creationTm +"<,yesUTR=>"+yesUTR+ "\n";
	}

//	@Override
//	 public int compareTo(ParamBean other) {
//	      return ComparisonChain.start()
//	         .compare(utr, other.utr)
//	         .compare(msgType, other.msgType)
//	         .compare(amount, other.amount)
//	         .result();
//	   }
	
	
	@Override
	public int hashCode() {
	    return new HashCodeBuilder()
	            .append(getUtr())
	            .toHashCode();
	}
	 @Override
	   public boolean equals(Object obj)
	   {
	      if (obj instanceof ParamBean == false)
	      {
	        return false;
	      }
	      if (this == obj)
	      {
	         return true;
	      }
	      final ParamBean otherObject = (ParamBean) obj;

	      return new EqualsBuilder()
	         .append(this.utr, otherObject.utr)
	         .append(this.msgType, otherObject.msgType)
	         .isEquals();
	   }
//	@Override
//	public boolean equals(Object obj) {
//		return this.utr == ((ParamBean) obj).utr;
//	}
//
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return new Integer(utr).hashCode();
//	}

}
