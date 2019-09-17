package kakao;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s = "1234";
		// boolean tf = strChk(s);
		// System.out.println(tf);
		 Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        printStar(a, b);
	}
	
	public static void printStar(int a, int b) {
		// 세로
		for(int i=0; i<b; i++) {
			// 가로
			for(int j=0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
