package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1005 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		try {
			String strT = br.readLine();
			int T = Integer.parseInt(strT);					// 테스트케이스 개수 T
			for(int i=0; i<T; i++) {
				String[] NK = br.readLine().split(" ");
				int N = Integer.parseInt(NK[0]);			// 건물의 개수  N
				int K = Integer.parseInt(NK[1]);			// 건물간의 건설규칙 총 개수 K
				//System.out.println("N : " + N);
				//System.out.println("K : " + K);
				
				String[] D = new String[N];
				D = br.readLine().split(" ");		// 각 건물당 걸리는 시간 D
				
				/*for(String a : D) {
					System.out.print("D : "+ a + "  , ");
				}*/
				
				long cost[] = new long[K];
				for(int j=0; j<K; j++) {
					// System.out.println("j : " + j);
					
					String[] XY = br.readLine().split(" ");		// 건설순서 XY
					int X = Integer.parseInt(XY[0]);
					int Y = Integer.parseInt(XY[1]);
					if(j==0) {
						cost[0] = Integer.parseInt(D[0]);
					}
					cost[Y-1] = srch(X, Y, D, cost);
					//System.out.println("cost : " + cost[Y-1]);
					
				}

				
				
				int W = Integer.parseInt(br.readLine());		// 선설해야 할 건물의 번호 W
				
				System.out.printf("%d", cost[W-1]);
				
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static long srch(int X, int Y, String[] D, long[] cost) {
		
		if(cost[Y-1] == 0 ) {
			cost[Y-1] = cost[X-1] + Integer.parseInt(D[Y-1]);
		} else {
			cost[Y-1] = Math.max(cost[X-1] + Integer.parseInt(D[Y-1]), cost[Y-1]);
			// 정렬이 안되서 입력되는 경우....	fn = O^2..
			
			
		}
		// System.out.println("Y : " + cost[Y-1]);
		return cost[Y-1];
	}
}


