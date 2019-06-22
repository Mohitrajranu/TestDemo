package bo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
 
public class LineNumberReaderExample
{
   public static void main(String[] args)
   {
	  File f =null;
	  boolean bool = false;
      readFromFile("C:/FileReader/mohitfl.txt");
      File file1= new File("C:/FileReader/mohitfl.txt");
      File newFile = new File(("C:/FileProcessed/mohitfl.txt.done"));
      if(file1.renameTo(newFile)){
          System.out.println("File rename success");
      }else{
          System.out.println("File rename failed");
      } 
      f = new File("C:/FileReader/Filecounter.txt");
	  if(f.exists() && !f.isDirectory()) {
		  bool = f.delete();
	         // print
	         System.out.println("Counter File deleted: "+bool);
	  }
      
   }
   private static void writeToFileCounter(String Filename,int Filecounter){

		 FileOutputStream is = null;
		 OutputStreamWriter osw = null;
		 BufferedWriter bfw = null;
		 String uploadDirectory = null;
		 String uploadPath = "C:/FileReader";

		 File resLog = null;
		 try {
			 uploadDirectory = uploadPath + "//" + Filename;
			 resLog = new File(uploadDirectory);
			 if(resLog.exists() && !resLog.isDirectory()) { 
				 System.out.println("writeToFile() : filealready exist no need to create a new file="+resLog.getName());
				}
			 else{
			 resLog.createNewFile();
			 }
			 is = new FileOutputStream(resLog);
			 osw = new OutputStreamWriter(is);
			 bfw = new BufferedWriter(osw);
			 bfw.write(String.valueOf(Filecounter));
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
   private static void readFromFile(String filename)
   {
	   LineNumberReader lineNumberReader = null;
	   String text =null;
	   String[] strArray = null;
	   File f =null;
	   int filecount = 0;
	   BufferedReader brTest = null;
	   try
	   {  
		   f = new File("C:/FileReader/Filecounter.txt");
		   if(f.exists() && !f.isDirectory()) { 
			   brTest = new BufferedReader(new FileReader("C:/FileReader/Filecounter.txt"));
			   while ((text=brTest .readLine())!=null){
				   if(!text.equals("")){//Ommit Empty lines
					   //System.out.println("text = " + text );
					   strArray= text.split(",");
					   //System.out.println("No of lines in the FileCounter is: "+Arrays.toString(strArray));
					   filecount = Integer.parseInt(strArray[0]);
					   break;
				   }
			   }
		   }

		   lineNumberReader = new LineNumberReader(new FileReader(filename));
		   String[] recStrArr = null;
		   String line = null;
		   int lineNumber =0;
		   String comma = " , ";
		   String sep = "\\"+comma.trim();
		   while ((line = lineNumberReader.readLine()) != null)
		   {
			   lineNumber = lineNumberReader.getLineNumber();
			   if (lineNumber > filecount) {
				   recStrArr = line.split(sep,-1);
				   System.out.println("Line " + lineNumberReader.getLineNumber() + ": "+"Records are :"+recStrArr[0]+","+recStrArr[1]+","+recStrArr[2]);
				   writeToFileCounter("Filecounter.txt",lineNumber);
			   }
		   }
		   // writeToFileCounter("Filecounter.txt",lineNumber);

	   } 
	   catch (Exception ex)
	   {
		   ex.printStackTrace();
	   } finally
	   {
		   //Close the LineNumberReader
		   try {
			   if (lineNumberReader != null){
				   lineNumberReader.close();
			   }
		   } catch (IOException ex){
			   ex.printStackTrace();
		   }
		   try {
			   if (brTest != null){
				   brTest.close();
			   }
		   } catch (IOException ex){
			   ex.printStackTrace();
		   }
	   }
   }
}