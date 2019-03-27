package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2448 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int count = Integer.parseInt(br.readLine());
			
			// 3 = 5
			// 6 = 11
			// 24 = 47
			
			printStar(count, count*2-1, 0);
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void printStar(int position, int count, int step) {
		/*
		 * for(int i=0; i<3; i++) { switch(i) { case 0 : System.out.print("  *  ");
		 * break; case 1 : System.out.print(" * * "); break; case 2 :
		 * System.out.print("*****"); break; } }
		 */
		
		if(position < 0 || position > count) {
			return;
		}
		
		for(int i=0; i<count*2-1; i=i+5) {
			if(position > i && position < i+5) {
				if(step == 0) {
					System.out.print("  *  ");
					step = 1;
				} else if(step == 1) {
					System.out.print(" * * ");
					step = 2;
				} else if(step == 2) {
					System.out.print("     ");
					step = 0;
				}
				
			}
			else {
				System.out.print("     ");
			}
		}
		
		printStar(position -3, count, step);
		printStar(position +3, count, step);
	}

}
