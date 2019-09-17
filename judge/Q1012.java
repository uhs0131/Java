package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1012 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String strT = br.readLine();
			int T = Integer.parseInt(strT);			// 테스트 케이스
			
			
			for(int i=0; i<T; i++) {
				String[] tmp = br.readLine().split(" ");
				int M = Integer.parseInt(tmp[0]);		// 가로길이
				int N = Integer.parseInt(tmp[1]);		// 세로길이
				int tcase = Integer.parseInt(tmp[2]);
				
				int[][] arr = new int[M][N];
				for(int j=0; j<tcase; j++) {
					String[] tmp1 = br.readLine().split(" ");
					int x = Integer.parseInt(tmp1[0]);
					int y = Integer.parseInt(tmp1[1]);
					arr[x][y] = 1;
				}
				
				
				int cnt = 0;
				
				for(int j=0; j<M; j++) {
					for(int k=0; k<N; k++) {
						
						if(arr[j][k] == 1) {
							
							if( (j-1>=0 && arr[j-1][k] == 2) ||
								(j+1<M && arr[j+1][k] == 2) ||
								(k-1>=0 && arr[j][k-1] == 2) ||
								(k+1<N && arr[j][k+1] == 2)
							) {
								
							} else {
								// System.out.printf("j %d , k %d : ", j , k );
								cnt++;
							}
							
							arr[j][k] = 2;
						}
							
					}
				}
				
				System.out.println(cnt);
			}
			/*
			 *  반례
			 *  1
2 2 3
0 1
1 0
1 1
			 * 
			 * */
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
