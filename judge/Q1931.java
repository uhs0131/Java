package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int N = Integer.parseInt(br.readLine());		// 회의의 수
			int[][] arr = new int[100000][100000]; 
			
			for(int i=0; i<N; i++) {
				String[] tmpStr = br.readLine().split(" ");
				arr[i][0] = Integer.parseInt(tmpStr[0]);		// 시작시간 
				arr[i][1] = Integer.parseInt(tmpStr[1]);		// 종료시간
			}
			
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
