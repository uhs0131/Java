package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] tmp = br.readLine().split(" ");
			int N = Integer.parseInt(tmp[0]);
			int K = Integer.parseInt(tmp[1]);
			
			int[] arr = new int[N];
			// 오름차순으로 주어진다. 
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(br.readLine());		// 동전의 가치
			}
			
			int num = K;		// 거스름돈
			int cnt = 0;		// 필요한 동전 개수
			
			int i=arr.length;
			for(i=arr.length-1; i>=0; i--) {
				if(arr[i] <= num) {
					cnt = cnt + num/arr[i];
					num = num%arr[i];
					//System.out.println("cnt : " + cnt);
					//System.out.println("num : " + num);
				}
			}

			System.out.println(cnt);
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

