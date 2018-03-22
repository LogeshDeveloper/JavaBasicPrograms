package CoreJava;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
	Random obj = new Random();
	System.out.println("The Random numbers are...");
	for(int i = 0;i<=5;i++){
		System.out.println(obj.nextInt(500));
	}
		
		
		
		
	}

}
