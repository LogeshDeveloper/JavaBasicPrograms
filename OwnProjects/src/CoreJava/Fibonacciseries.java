package CoreJava;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
	int f1,f2,n;
	System.out.println("Enter The Number");
	Scanner sc = new Scanner(System.in);
	n =sc.nextInt();
	f1=0;
	f2=1;
	for(int i=1;i<n;i++){
	int f3 = f1+f2;
	f1=f2;
	f2=f3;
	System.out.println("The fibonnaci series is" +f3);
	}
	sc.close();
		
	}

}
