package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int tcase = Integer.parseInt(br.readLine());
			int count = 0;
			
			for(int j=0; j<tcase; j++) {
				// A = 65, Z=90, a=97, z=122
				String str = br.readLine();
				char[] arr = str.toCharArray();
				int[] match = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				
				
				boolean tf = true;
				for(int i=0; i<arr.length;i++) {
					match[(int)arr[i] - 97]++;
					if(match[(int)arr[i] - 97] > 1 && arr[i] != arr[i-1]) {
						tf = false;
						break;
					}
				}
				
				if(tf) {
					count++;
				}
				
				
			}
			
			System.out.printf("%d", count);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
