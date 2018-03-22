package CoreJava;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
	int mark;
	System.out.println("Enter the marks");
	Scanner sc = new Scanner(System.in);
	mark = sc.nextInt();
	switch (mark) {
	case 90:
		System.out.println("Very Good");
		break;
	case 80:
		System.out.println("Good");
		break;
	case 70:
		System.out.println("Fair");
		break;
	case 60:
		System.out.println("Need to Improve");
		break;
	case 50:
		System.out.println("Bad");
		break;
	default:
		System.out.println("FAILLL!!!");
		break;
	}
	sc.close();
	}

}
