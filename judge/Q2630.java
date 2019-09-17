package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2630 {

	static int bcnt = 0;
	static int wcnt = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());	// 입력값 2 4 8 16 32 64 128
			
			int[][] arr = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String[] tmp = br.readLine().split(" ");
				for(int j=0; j<N; j++) {
					arr[i][j] = Integer.parseInt(tmp[j]);
				}
			}
			
			calc(0, 0, N, N, arr);
			
			
			System.out.println(wcnt);
			System.out.println(bcnt);
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void calc(int istart, int jstart, int iend, int jend, int[][] arr) {
		
		System.out.printf("%d, %d, %d, %d\n", istart, jstart, iend, jend);
		
		boolean yn = true;
		int num = arr[istart][jstart];
		for(int i=istart; i<iend; i++) {
			for(int j=jstart; j<jend; j++) {
				System.out.print(arr[i][j] + " " );
				if(num != arr[i][j]) {
					yn = false;
					break;
				}
			}
			System.out.println();
			if(yn == false) {
				break;
			}
		}
		System.out.println("================================================");
		
		if(!yn && (iend - (iend-istart)/2 != istart || jend - (jend-jstart)/2 != jstart)) {
			calc(istart, jstart, iend - (iend-istart)/2, jend - (jend-jstart)/2, arr);
			calc(istart + (iend-istart)/2, jstart, iend, jend - (jend-jstart)/2, arr);
			calc(istart, jstart + (jend-jstart)/2, iend - (iend-istart)/2, jend, arr);
			calc(istart + (iend-istart)/2, jstart + (jend-jstart)/2, iend, jend, arr);
		} else {
			if(num == 0) {
				wcnt++;
			} else if(num ==1){
				bcnt++;
			}
		}
	}
	
}


