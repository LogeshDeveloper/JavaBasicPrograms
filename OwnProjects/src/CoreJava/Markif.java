package CoreJava;

import java.util.Scanner;

public class Markif {

	public static void main(String[] args) {
	
		int marks;
		System.out.println("Enter the marks");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		if(marks>=90){
		System.out.println("Very Good");
		}
		else if(marks>=80&&marks<=90){
		System.out.println("Good");	
		}
		else if(marks>=70&&marks<=80){
			System.out.println("Fair");
		}
		else if(marks>=60&&marks<=70){
			System.out.println("Need to improve");
		}
		else if(marks>=50&&marks<=40){
			System.out.println("Bad");
		}
		sc.close();
		
	}

}
