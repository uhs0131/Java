package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0;
		int max_i = 0;
		// TODO Auto-generated method stub
		for(int i=0; i<9; i++) {
			int a = Integer.parseInt(br.readLine());
			
			if(a > max) {
				max = a;
				max_i = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(max_i);
	}

}
