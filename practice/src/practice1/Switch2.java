package practice1;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
//		char ch = 'a'; //문자를 의미 
		switch(ch) {
		case 'a' : 
		case 'A' :
			System.out.println("A입니다");
			break;
		case 'b' : 
		case 'B' :
			System.out.println("B입니다");
			break;
		case 'c' : 
		case 'C' :
			System.out.println("C입니다");
			 break;
		default : 
			System.out.println("A,B,C 가 아닙니다 ");
		}
	}

}
