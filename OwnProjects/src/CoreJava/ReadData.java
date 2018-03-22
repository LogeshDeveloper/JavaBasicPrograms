package CoreJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadData {

	public static void main(String[] args) {
	
	String filename = "E:/Logesh.docx";
	String line = null;
	try{
		FileReader filereader = new FileReader("Logesh.docx");
		BufferedReader buffedreader = new BufferedReader(filereader);
		while((line=buffedreader.readLine())!=null)
		System.out.println(line);	
		buffedreader.close();
	}catch(FileNotFoundException e){
		System.out.println("Unable to open the file"+filename);
		
	}catch (Exception ee) {
	 System.out.println("File cant be read"+filename);
	 ee.printStackTrace();
	} {
		
	}
		
	}

}
