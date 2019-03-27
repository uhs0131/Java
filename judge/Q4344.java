package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4344 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int tcase = Integer.parseInt(br.readLine());
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for(int i=0; i<tcase; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int student = Integer.parseInt(st.nextToken());
				
				double sum = 0;
				double avg = 0;
				int[] score = new int[student];
				for(int j=0; j<student; j++) {
					int num = Integer.parseInt(st.nextToken());
					score[j] = num;
					sum += num;
				}
				avg = sum/(double)student;
				// System.out.println("avg : " + avg);
				
				int count = 0;
				for(int j=0; j<student; j++) {
					if(score[j] > avg) {
						count++;
					}
				}
				
				String result = String.format("%.3f", count/(double)student * 100);
				
				bw.write(result+"\n");
				
			}
			
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
