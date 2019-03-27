package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1110 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			int num1 = num/10;
			int num2 = num%10;
			
			int result = 0;
			int calData = -1;
			
			while(num != calData) {
				
				calData = calCycle(num1, num2);
				num1 = calData/10;
				num2 = calData%10;
				
				result++;
			}
			
			String str = String.valueOf(result);
			
			bw.write(str);
			bw.flush();
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	private static int calCycle(int num1, int num2) {
		
		return num2 * 10 + ((num1 + num2) % 10);
	}
}

