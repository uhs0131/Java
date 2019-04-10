package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {

	static int[] c0;
	static int[] c1;
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int tcase = Integer.parseInt(br.readLine());
			
			for(int i=0; i<tcase; i++) {
				
				int num = Integer.parseInt(br.readLine());
				int cache[] = new int[num+1];
				
				c0 = new int[num+1];
				c1 = new int[num+1];
				int a = fabonacci(num, cache);
				
				System.out.printf("%d %d\n", c0[num], c1[num]);
//				for(int t : c0) {
//					System.out.print(t + " ");
//				}
//				System.out.println();
//				for(int t : c1) {
//					System.out.print(t + " ");
//				}
				
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static int fabonacci(int n, int[] cache) {
		
		if(cache[n] != 0) {
			return cache[n];
		} else {
			if(n == 0) {
				c0[n]=1;
				// System.out.print("0 : " + 0);
				return 0;
			} else if(n == 1) {
				// System.out.print("1 : " + 1);
				c1[n]=1;
				return 1;
			} else {
				
				cache[n] = fabonacci(n-1, cache) + fabonacci(n-2, cache);
				c0[n] = c0[n-1] + c0[n-2];
				c1[n] = c1[n-1] + c1[n-2];
				return cache[n];
			}
		}
		
		
		
	}
}

