package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


public class WriteToFileExample1 {

	private static final String FILENAME = "C:\\test\\DateCheck.txt";
	public static final String s= "|qwerty786|";
	public static void main(String[] args) {
	    	 
	    	 FileOutputStream is = null;
	    	 OutputStreamWriter osw = null;
	    	 BufferedWriter bfw = null;
	    	 File resLog = null;
	    	 try {
	    		 String content = "This is the content to write into file\n";
	    		 resLog = new File(FILENAME);
	    		 if(resLog.exists() && !resLog.isDirectory()) { 
	    			// logger.info("writeToFile() : filealready exist no need to create a new file="+resLog.getName());
	    			}
	    		 else{
	    		 resLog.createNewFile();
	    		 }
	    		 is = new FileOutputStream(resLog,true);
	    		 osw = new OutputStreamWriter(is);
	    		 bfw = new BufferedWriter(osw);
	    		 bfw.write(content);
	    		 bfw.write(s);
	    		 bfw.newLine();
				 bfw.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    	 finally{
	    		 try {
	 				if (is != null)
	 					is.close();
	 				    is = null;
	 			} 
	 			catch (Exception ex) {
	 				ex.printStackTrace();
	 			}
	 			try {
	 				if (osw != null)
	 					osw.close();
	 				    osw = null;
	 			} 
	 			catch (Exception ex) {
	 				ex.printStackTrace();
	 			}
	 			try {
	 				if (bfw != null)
	 					bfw.close();
	 				    bfw = null;
	 			} 
	 			catch (Exception ex) {
	 				ex.printStackTrace();
	 			}
	    	 }
	    	 
	     }

		/*
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = "This is the content to write into file\n";

			fw = new FileWriter(FILENAME,true);
			bw = new BufferedWriter(fw);
			bw.write(content);
			bw.write(s);
            bw.newLine();
			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	
*/
}
