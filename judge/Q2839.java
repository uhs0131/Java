package judge;

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int kiro = scan.nextInt();		// 배달해야하는 kirogram
		
		//3 5 6 8 9 10 11 12 13 15 16 18....
		// 3 = 3 * 1
		// 5 = 5 * 1
		// 6 = 3 * 2
		// 8 = 5 + 3
		// 9 = 3 * 3
		// 10 = 5 * 2
		// 11 = 5 + 3 * 2
		// 12 = 3 * 4
		// 13 = 5 * 2 + 3
		// 14 = 5 + 3 * 3
		// 15 = 5 * 3
		// 16 = 5 * 2 + 3 * 2
		
		int mok = kiro / 5;
		int nmg = kiro % 5;
		int result = -1;
		
		if(nmg == 0) {
			result = mok;
		} 
		else if(kiro == 4 || kiro == 7) {
			result = -1;
		}
		else {
			for(int i=1; i<=3; i++) {
				if((nmg + 15 - (5 * i)) % 3 == 0) {
					int tmp = (nmg + 15 - (5 * i)) / 3;
					result = mok - 3 + i + tmp;
					break;
				}
			}
		}
		
		System.out.println(result);
		
		
	}

}
