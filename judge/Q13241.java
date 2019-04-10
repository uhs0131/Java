package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int tcase = Integer.parseInt(br.readLine());
		
		//for(int i=0; i<tcase; i++) {
			String[] arr = br.readLine().split(" ");
			long num1 = Integer.parseInt(arr[0]);
			long num2 = Integer.parseInt(arr[1]);
			
			long besu = minBesu(num1, num2);		// 최소공약수
			long result = besu * (num1/besu) * (num2/besu);
			
			

			System.out.println(result);
		//}
	}
	
	// 유클리드 호제법 사용
	public static long minBesu(long num1, long num2) {
		
		long result = 0;
		if(num1 == num2) {
			result = num1;
			return result;
		} else {
			if(num1 > num2) {
				result = minBesu(num1-num2, num2);
			} else {
				result = minBesu(num1, num2-num1);
			}
		}
		
		return result;
	}

}
