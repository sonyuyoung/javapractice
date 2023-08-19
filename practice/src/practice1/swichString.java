package practice1;

import java.util.Scanner;

public class swichString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("좋아하는 구황작물 이름을 적어봐요>>");
		String str=sc.nextLine();
		
		switch(str) {
		case "감자"  : case "감" :
		System.out.println("감자입니다");
		break;
		case "고구마" :case "고구" :
			System.out.println("고구마입니다");
			break;
		default : 
			System.out.println("감자와 고구마가 아입니다");
			break;
		
		
		}
	}

}
