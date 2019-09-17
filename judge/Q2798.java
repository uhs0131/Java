package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2798 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String[] tmp = br.readLine().split(" ");
			int N = Integer.parseInt(tmp[0]);		// 카드의 개수	
			int M = Integer.parseInt(tmp[1]);		// 맞춰야되는 숫자 
			
			
			String[] strArr = br.readLine().split(" ");
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(strArr[i]);
			}
			
			int cha = M;
			int num = 0;
			for(int i=0; i<N; i++) {
				for(int j=i+1; j<N; j++) {
					for(int k=j+1; k<N; k++) {
//						System.out.println( arr[i] + arr[j] + arr[k]);
//						System.out.println(M - arr[i] - arr[j] - arr[k]);
//						System.out.println(M);
//						System.out.println(cha);
//						System.out.println("----------------");
						if( arr[i] + arr[j] + arr[k] <= M && M - arr[i] - arr[j] - arr[k] < cha) {
							num = arr[i] + arr[j] + arr[k] ;
							cha = M - arr[i] - arr[j] - arr[k];
//							System.out.println(num);
//							System.out.println(cha);
						}
						if(cha == 0) {
							break;
						}
					}
					if(cha == 0) {
						break;
					}
				}
				if(cha == 0) {
					break;
				}
			}
//			System.out.println("=============================");
//			System.out.println(cha);
			System.out.println(num);
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
