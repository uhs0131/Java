package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// A = 65, Z=90
			String str = br.readLine().toUpperCase();
			char[] arr = str.toCharArray();
			int[] match = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			
			int max = 0;
			int num = 0;
			for(int i=0; i<arr.length;i++) {
				match[(int)arr[i] - 65]++;
				if(match[(int)arr[i] - 65] > max) {
					max = match[(int)arr[i] - 65];
					num = (int)arr[i];
				} else if(match[(int)arr[i] - 65] == max) {
					num = 63;		// ?
				}
			}
			System.out.printf("%c", num);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}