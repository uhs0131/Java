package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15954 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			
			// 입력받는 부분
			String tmpStr  = br.readLine();
			String arr[] = tmpStr.split(" ");
			int max = Integer.parseInt(arr[0]);		// 총 인형수(N)
			int K = Integer.parseInt(arr[1]);	// 선택할 인형 수(K)
			tmpStr = br.readLine();
			arr = tmpStr.split(" ");
			int num[] = new int[arr.length];		// 인형 당 선호하는 사람
			
			// int 형태로 변경
			for(int i=0; i<max; i++) {
				num[i] = Integer.parseInt(arr[i]);	
			}

			// 계산하는 부분
			double min = 10000000;
			int hitPoint = 0;
			double minAvg = 0;
			int count=K;
			int minCount = 0;
			
			
			int k=0;
			do {
				count = K + k;
				for(int i=0; i<=max-count; i++) {
					
					int sum = 0;		// 선택한 사람의 총합 
					double avg = 0;
					
					for(int j=0; j<count; j++) {
						sum = sum + num[i+j];
					}
					// 평균 계산
					avg = (double)sum / count;
					
					// |선호하는 사람 - 평균| 의 합이 제일 적은 부분 => 가장 적은 표준편차
					double sum2 = 0;
					for(int j=0; j<count; j++) {
						sum2 = sum2 + Math.abs(num[i+j] - avg);
						//System.out.println("sum2 : " + sum2);
					}
					
					if(sum2 < min) {
						min = sum2;
						hitPoint = i;
						minAvg = avg;
						minCount = count;
					}
				}
				
				k++;
			} while (k+K<=max);
			
			// 가장 적은 부분의 표준편차를 계싼한다.
			double sum3 = 0;
			for(int i=hitPoint; i<hitPoint+minCount; i++) {
				sum3 = sum3 + Math.pow(num[i]-minAvg, 2);
				//System.out.println("sum3 : " + sum3);
				
			}
			
			System.out.println(Math.pow(sum3/minCount, 0.5));
			
			
			bw.flush();
			
			br.close();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
