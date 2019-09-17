package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12865 {

	static int tot_space;
	static int tot_gaci;
	static int N;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String[] tmp = br.readLine().split(" ");
			int K = Integer.parseInt(tmp[1]);			// 물품의 수
			N = Integer.parseInt(tmp[0]);			// 버틸수 있는 무게
			
			tot_space = 0;
			tot_gaci = 0;
			
			int[][] a = new int[K][2];
			for(int i=0; i<K; i++) {
				String[] tmpK = br.readLine().split(" ");
				a[i][0] = Integer.parseInt(tmpK[0]);	// 무게
				a[i][1] = Integer.parseInt(tmpK[1]);	// 가치
			}
			
			int[] b = new int[K];
			for(int i=0; i<K; i++) {
			}
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void calc(int muge, int gaci) {
		
		if(tot_space+muge > N) {
			return;
		} else {
			tot_gaci += gaci;
			tot_space += muge;
			calc(N-tot_space, gaci);
		}
	}
	
	public static void calc2(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			// arr[i];
		}
	}
}


