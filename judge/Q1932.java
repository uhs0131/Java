package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1932 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int size = Integer.parseInt(br.readLine());
			int[][] tree = new int[size][size];
			int[][] result = new int[size][size];
			
			for(int i=0; i<size; i++) {
				String[] tmp = br.readLine().split(" ");
				for(int j=0; j<=i; j++) {
					tree[i][j] = Integer.parseInt(tmp[j]);
					calc(tree, result, i, j);
				}
			}
			
			int max = 0;
			for(int i=0; i<size; i++) {
				max = Math.max(max, result[size-1][i]);
			}
			
			System.out.println(max);
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void calc(int[][] tree, int[][] result, int i, int j) {
		
		if(i == 0) {
			result[i][j] = tree[i][j];
		} else {
			if(j==0) {
				result[i][j] = result[i-1][j] + tree[i][j];
			} else {
				result[i][j] = Math.max(result[i-1][j-1], result[i-1][j]) + tree[i][j];
			}
		}
		
		// System.out.println("i : "+i+", j : "+j + ", result : " + result[i][j]);
		
	}

}
