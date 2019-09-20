package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10872 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int N = Integer.parseInt(br.readLine());
			// 이것도 정답
//			int cnt = 1;
//			for(int i=1; i<=N; i++) {
//				cnt = cnt * i;
//			}
//			
//			System.out.println(cnt);
			
			// 재귀함수로 해결해보자
			int sum = 1;
			for(int i=1; i<=N; i++) {
				sum = calc(sum, i);
			}
			
			System.out.println(sum);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int calc(int sum, int num) {
		int factorio = sum;
		factorio *= num;
		
		return factorio;
	}
}
