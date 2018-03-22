package CoreJava;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
	int store,a,b;
	System.out.println("Enter the Value of a");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	System.out.println("Enter the Value of b");
	Scanner scr = new Scanner(System.in);
	b = scr.nextInt();
	System.out.println("Before Swapping...");
	System.out.println("a="+a);
	System.out.println("b ="+b);
	store=a;
	a=b;
	b=store;
	System.out.println("---------------------------------");
	System.out.println("After Swapping...");
	System.out.println("a="+a);
	System.out.println("b ="+b);
	sc.close();
	scr.close();
	}

}
