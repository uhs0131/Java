package judge;

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int count = scan.nextInt();
		scan.nextLine();
		String num = scan.nextLine();
		int result = 0;
		
		for(int i=0; i<count; i++) {
			result += Integer.parseInt(num.substring(i, i+1));
		}
		
		System.out.println(result);
	}

}
