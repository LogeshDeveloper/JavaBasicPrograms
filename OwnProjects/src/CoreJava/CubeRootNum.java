package CoreJava;

import java.util.Scanner;

public class CubeRootNum {

	public static void main(String[] args) {
	
	int num;
	Scanner obj = new Scanner(System.in);
	num = obj.nextInt();
	System.out.println("Enter the number"+num+"The cube root is" +(num*num*num));
	obj.close();
	}

}
