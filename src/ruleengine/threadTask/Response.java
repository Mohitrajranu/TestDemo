package ruleengine.threadTask;

public class Response {

	private String responseBody;
	private int responseCode;

	public Response(int responseCode, String responseBody) {
	    this.responseBody = responseBody;
	    this.responseCode = responseCode;
	}

	public int getResponseCode() {
	    return responseCode;
	}

	public String getResponseBody() {
	    return responseBody;
	}

	
}
