package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2747 {

	//static int fibonaci = 0;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int num = Integer.parseInt(br.readLine());
			
			int result[] = new int[num+1];
			System.out.println(fibonaci(num, result));
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int fibonaci(int i, int[] result) {
		
		int fibonaci = 0;
		
		if(result[i] != 0) {
			return result[i];
		} else {
			if(i == 0) {
				fibonaci = 0;
				result[i] = fibonaci;
			} else if(i == 1) {
				fibonaci = 1;
				result[i] = fibonaci;
			} else {
				
				fibonaci = fibonaci(i-2, result) + fibonaci(i-1, result);
				result[i] = fibonaci;
			}
		}
		
		return fibonaci; 
	}

}
