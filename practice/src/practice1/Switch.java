package practice1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요>>");
	int num = sc.nextInt();
	
	switch(num) {
	case 1:			
		System.out.println("1입니다");
		break;
	case 2:
		System.out.println("2입니다");
		break;
	case 3:
		System.out.println("3입니다");
		break;
	default :
		System.out.println("1,2,3이 아닙니다");
	}

	}

}
