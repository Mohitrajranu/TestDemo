package bean;

import Util.GenericConstants;


public class Book {
	private int id; 
	private String title; 
	private String authors;
	private int substype;
	private GenericConstants.SUBSCRIBER_TYPE subscript_type = GenericConstants.SUBSCRIBER_TYPE.UNKNOWN;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	} 
	

	public int getSubstype() {
		return substype;
	}
	public void setSubstype(int substype) {
		this.substype = substype;
	}
	public GenericConstants.SUBSCRIBER_TYPE getSubscript_type() {
		return subscript_type;
	}
	public void setSubscript_type(GenericConstants.SUBSCRIBER_TYPE subscript_type) {
		this.subscript_type = subscript_type;
	}
	
	public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("TSubCallbackRetry :- title=").append(title)
        .append(" - substype=").append(substype)
        .append(" - authors=").append(authors)
        .append(" - id=").append(id)
        .append(" - subscript_type=").append(subscript_type);
        return sb.toString();
}//End of toString()


}
