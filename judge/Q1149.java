package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1149 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int tcase = Integer.parseInt(br.readLine());
			
			int sum = 0;
			RGB rgb = new RGB(tcase);
			
			for(int i=0; i<tcase; i++) {
				String[] tmp = br.readLine().split(" ");
				
				rgb.rgb[i][0] = Integer.parseInt(tmp[0]);
				rgb.rgb[i][1] = Integer.parseInt(tmp[1]);
				rgb.rgb[i][2] = Integer.parseInt(tmp[2]);
			}
			
			rgb.calc();
			rgb.print();
//			for(int i=0; i<tcase; i++) {
//				System.out.println(rgb.result[i][0]+" "+rgb.result[i][1]+" "+rgb.result[i][2]);
//			}
			
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}

class RGB{
	int[][] rgb;
	int sum = 0;
	int[][] result;
	
	public RGB(int size) {
		rgb = new int[size][size];
		result = new int[size][size];
	}
	
	public void calc() {
		
		for(int i=0; i<rgb.length; i++) {
			
			if(i==0) {
				result[i][0] = rgb[i][0];
				result[i][1] = rgb[i][1];
				result[i][2] = rgb[i][2];
			}
			else {
				result[i][0] = Math.min(result[i-1][1], result[i-1][2]) + rgb[i][0];
				result[i][1] = Math.min(result[i-1][0], result[i-1][2]) + rgb[i][1];
				result[i][2] = Math.min(result[i-1][0], result[i-1][1]) + rgb[i][2];
			}
		}
	}
	
	public void print() {
		int min = Math.min(
				Math.min(result[result.length-1][0], result[result.length-1][1])
				, Math.min(result[result.length-1][1], result[result.length-1][2]));
		System.out.println(min);
	}
}
