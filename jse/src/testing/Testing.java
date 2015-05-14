package testing;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력");
		String ssn = scanner.next();
		System.out.println(ssn);
		char ch1 = ssn.charAt(1);
		char ch2 = ssn.charAt(2);
		char ch3 = ssn.charAt(3);
		char ch4 = ssn.charAt(4);
		char ch5 = ssn.charAt(5);
		char ch6 = ssn.charAt(6);
		char ch7 = ssn.charAt(7);
		char ch8 = ssn.charAt(8);
		char ch9 = ssn.charAt(9);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
		System.out.println(ch8);
		System.out.println(ch9);
	}
}
