package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10039 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int student = 5;
		int[] grade = new int[student];
		int sum = 0;
		
		try {
			for(int i=0; i<student; i++) {
				
				grade[i] = Integer.parseInt(br.readLine());
				if(grade[i] < 40) {
					grade[i] = 40;
				}
				sum+=grade[i];
			}
			
			int avg = sum/student;
			bw.write(String.valueOf(avg));
			bw.flush();
			
			br.close();
			bw.close();
		
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
