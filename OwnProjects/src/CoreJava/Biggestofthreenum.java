package CoreJava;

import java.util.Scanner;

public class Biggestofthreenum {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The A Value");
		a =sc.nextInt();
		System.out.println("Enter The B Value");
		b =sc.nextInt();
		System.out.println("Enter The C Value");
		c =sc.nextInt();
		if(a>=b){
			System.out.println("The A Value is Greater");
		}else if(b>=c){
			System.out.println("The B Value is Greater");
		}else if(c>=a){
			System.out.println("The C Value is Greater");
		}
		sc.close();	
		}
	}



