package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] t = new int[] {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		try {
			char[] arr = br.readLine().toCharArray();
			
			int time = 0;
			for(int i=0; i<arr.length;i++) {
				time += t[arr[i]-65];
			}
			System.out.println(time);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
