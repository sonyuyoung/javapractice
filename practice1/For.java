package practice1;

public class For {

	public static void main(String[] args) {
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		for(int i=1;i<=9;i++) {
//			System.out.println("1*"+i+"="+(1*i));
//		}
//		for(int k=2;k<=9;k++) {
//		for(int i=1;i<=9;i++) {	
//		
//			if(k%2!=0) {
//			break;
//		}
//		System.out.println(k+"*"+i+"="+(k*i));
//		}
//		System.out.println();
//		}
//		for(int i=5;i>0;i--) {
//		for(int k=0;k<i;k++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		}
	for(int i=0;i<5;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=5;j>i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
		}}
