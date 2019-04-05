package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231 {

	public static void main(String[] args) {
		// 부루트 포스 - 분해합 구하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.parseInt(br.readLine());
			// 자리수를 구한다. 일의자리 0 십의자리 1 백의자리 2...
			int jali = (int)Math.log10(num);
			// 모든 자리가 9로 이루어진 경우가 가장 작은 분해합이라고 생각하고 계산한다.
			int start = num - (jali * 9 + 9);
			boolean exsit = false;			// 존재여부
			
			for(int i=start; i<num; i++) {
				int num1 = i;
				int sum = i;

				for(int j=0; j<=jali; j++) {
					sum = sum + num1%10;
					num1 = num1/10;
				}
				
				if(sum == num) {
					System.out.println(i);
					exsit = true;
					break;
				}
			}
			
			if(!exsit) {			// 존재하지 않으면
				System.out.println(0);
			}
			
		
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
