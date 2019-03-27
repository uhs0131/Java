package judge;

import java.util.Scanner;

public class Q11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		for(int i=0; i< Math.ceil(str.length()/10.0); i++ ) {
			if(i*10 + 10 <= str.length()){
				System.out.println(str.substring(i*10, i*10+10));
			}else {
				System.out.println(str.substring(i*10));
			}
		}
	}
}
