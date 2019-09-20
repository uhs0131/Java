package judge;

import java.util.Scanner;

public class Q2869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();		// 올라가는 미터
		int B = scan.nextInt();		// 내려가는 미터
		int V = scan.nextInt();		// 총 올라가야되는 길이
		
		for(int i=1; i<=V; i++) {
			
			// V <= (A-B) * (i-1) + A 
			// => Ai - Bi -A + B + A
			// => (A-B) * i + B
			if((V-B)/i <= (A-B)    ) {
				System.out.println(i);
				break;
			}
			
		}
	}

}
