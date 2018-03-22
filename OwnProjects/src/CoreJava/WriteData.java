package CoreJava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
	String filename = "E:Logesh.docx";
	
	try{
		FileWriter filewriter = new FileWriter("Logesh.docx");
		BufferedWriter bufferreader = new BufferedWriter(filewriter);
		bufferreader.write("Hello welcome to chennai");
		bufferreader.write("I am new to chennai");
		bufferreader.newLine();
		bufferreader.write("Thankyou");
		bufferreader.close();
	}catch(IOException e){
		System.out.println("The File cant be written"+filename);
	}
	
	}

}
