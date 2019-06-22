package bo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.log4j.Logger;

public class FileToJavaBo extends FTPClient {

	private static Logger logger = Logger.getLogger("CommonLogger");

	// return neftInStdBean;
	public String getCurrentDateTime() {
		Date date = new Date();
		SimpleDateFormat simpledateformat = new SimpleDateFormat("hhmmssSSSSSS");
		String datetime = simpledateformat.format(date);
		datetime = datetime.substring(0, 2) + ":" + datetime.substring(2, 4) + ":" + datetime.substring(4, 6) + "." + datetime.substring(6);
		return datetime;
	}
}
