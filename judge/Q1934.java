package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tcase; i++) {
			String[] arr = br.readLine().split(" ");
			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);
			
			int besu = minBesu(num1, num2, 1);
			
			System.out.println(besu);
		}
	}
	
	public static int minBesu(int num1, int num2, int besu) {
		for(int i=2; i<=45000; i++) {
			if(num1%i==0 && num2%i==0) {
				besu = besu * i;
				besu = minBesu(num1/i, num2/i, besu);
				return besu;
			}
			if(i > num1 || i > num2) {
				besu = besu * num1 * num2;
				return besu;
			}
		}
		return besu;
	}
	
}

/*
 * class besu{ public static int besu = 1;
 * 
 * public besu(){ besu = 1; }
 * 
 * 
 * 
 * public int printBesu() { return besu; } }
 */

