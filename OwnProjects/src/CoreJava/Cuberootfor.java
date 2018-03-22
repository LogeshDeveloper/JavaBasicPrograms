package CoreJava;

import java.util.Scanner;

public class Cuberootfor {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the loop");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		for(int i=0;i<=num;i++){
			System.out.println("Entered Number is "+i+"cube root is"+(i*i*i));
		}
		obj.close();
	}

}
