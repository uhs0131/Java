package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2749 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] fibonacci = new long[1000002];
		long num = Long.parseLong(br.readLine());
		
		int mod = 1000000;
		int p = 15 * (1000000 / 10);		// 주기
		// System.out.println(p);
		
		for(long i=0; i<=num; i++) {
			fibonacci((int)(i % p), fibonacci, p);
		}
		System.out.printf("%d", fibonacci[(int)(num % p) ]);
		
		// 1100087778366101890
		// 1779979416004713980
		// 2880067194370816000
		
		// 1,000,000
		br.close();
		
	}
	
	public static long fibonacci(int cnt, long[] arr, int p) {
		
		if(cnt >= p) {
			return arr[(int)(cnt % p)];
		} else {
			if(arr[cnt] != 0) {
				return arr[cnt];
			}else {
				if(cnt == 0) {
					arr[0] = 0;
				} else if(cnt == 1) {
					arr[1] = 1;
				} else { 
					arr[cnt] = (arr[cnt-1] + arr[cnt-2]) % p;
				}
			}
		}
		
		return arr[cnt];
	}

}
