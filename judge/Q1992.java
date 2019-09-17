package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1992 {

	public static String str = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			
			int N = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[N][N];
			
			for(int i=0; i<N; i++) {
				String a = br.readLine();
				for(int j=0; j<a.length(); j++) {
					arr[i][j] = a.charAt(j) - 48;
				}
			}
			calc(arr, 0, 0, N, N);
			System.out.println(str);
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void calc(int[][] arr, int xStart, int yStart, int xEnd, int yEnd) {
		
		//str += "(";
		boolean stopYn = false;
		
		for(int i=xStart; i<xEnd - (xEnd - xStart)/2; i++) {
			for(int j=yStart; j<yEnd - (yEnd - yStart)/2; j++) {
				if(arr[xStart][yStart] != arr[i][j]) {
					calc(arr, xStart, yStart, xEnd - (xEnd - xStart)/2, yEnd - (yEnd - yStart)/2);					
					stopYn = true;
					break;
				}
			}
			if(stopYn) {
				break;
			}
		}
		str += arr[xStart][yStart];
		
		
		stopYn = false;
		for(int i=xStart; i<xEnd - (xEnd-xStart)/2; i++) {
			for(int j=yStart + (yEnd-yStart)/2; j<yEnd; j++) {
				if(arr[xStart][(yEnd-yStart)/2] != arr[i][j]) {
					calc(arr, xStart, yStart + (yEnd-yStart)/2, xEnd - (xEnd-xStart)/2, yEnd);
					stopYn = true;
					break;
				}
			}
			if(stopYn) {
				break;
			}
		}
		str += arr[xStart][yStart + (yEnd-yStart)/2];
		
		stopYn = false;
		for(int i=xStart + (xEnd - xStart)/2; i<xEnd; i++) {
			for(int j=yStart; j<yEnd -(yEnd - yStart)/2; j++) {
				calc(arr, xStart + (xEnd - xStart)/2, yStart , xEnd, yEnd -(yEnd - yStart)/2);
				stopYn = true;
				break;
			}
			if(stopYn) {
				break;
			}
		}
		str += arr[xStart + (xEnd - xStart)/2][yStart];
		
		stopYn = false;
		for(int i=xStart + (yEnd-yStart)/2; i<xEnd; i++) {
			for(int j=yStart + (yEnd-yStart)/2; j<yEnd; j++) {
				calc(arr, xStart + (yEnd-yStart)/2, yStart + (yEnd-yStart)/2, xEnd, yEnd);
				stopYn = true;
				break;
			}
			if(stopYn) {
				break;
			}
		}
		str += arr[xStart + (yEnd-yStart)/2][yStart + (yEnd-yStart)/2];
		
		
//		for(int i=xStart; i<xEnd; i++) {
//			for(int j=yStart; j<yEnd; j++) {
//				
//				//
//				
//				if(arr[xStart][yStart] != arr[i][j]) {
//					str += "(";
//					calc(arr, xStart, yStart, xEnd - (xEnd - xStart)/2, yEnd - (yEnd - yStart)/2);
//					calc(arr, xStart, yStart + (yEnd-yStart)/2, xEnd - (xEnd-xStart)/2, yEnd);
//					calc(arr, xStart + (xEnd - xStart)/2, yStart , xEnd, yEnd -(yEnd - yStart)/2);
//					calc(arr, xStart + (yEnd-yStart)/2, yStart + (yEnd-yStart)/2, xEnd, yEnd);
//					
//					
//					str += ")";
//					stopYn = true;
//					break;
//				}
//			}
//			if(stopYn) {
//				break;
//			}
//		}
//		str += arr[xStart][yStart];
		//str += ")";
		
//		calc(istart, jstart, iend - (iend-istart)/2, jend - (jend-jstart)/2, arr);
//		calc(istart + (iend-istart)/2, jstart, iend, jend - (jend-jstart)/2, arr);
//		calc(istart, jstart + (jend-jstart)/2, iend - (iend-istart)/2, jend, arr);
//		calc(istart + (iend-istart)/2, jstart + (jend-jstart)/2, iend, jend, arr);
		
	}
}

class aa{
	
}
