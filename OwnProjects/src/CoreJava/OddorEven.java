package CoreJava;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
	int num;
	System.out.println("Enter the Number");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	if(num%2==0){
		System.out.println("The Number is even");
	}else{
		System.out.println("The Number is odd");
	}
	sc.close();
	}
	
	}


