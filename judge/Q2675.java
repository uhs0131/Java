package judge;

import java.util.Scanner;

public class Q2675 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
			
		
		for(int k=0;k<n;k++){
			int repeat = scan.nextInt();
			String tmp = scan.nextLine().trim();
			scan.nextLine();
			
			StringBuilder result = new StringBuilder();
			
			for(int i=0; i<tmp.length(); i++) {
				result.append(tmp.substring(i, i+1).repeat(repeat) );
			}
			
			System.out.println(result.toString());
		}
	}	

}
