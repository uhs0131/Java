package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2908 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			String[] grade = br.readLine().split(" ");
			
			String num1 = grade[0].substring(2, 3) + grade[0].substring(1, 2) + grade[0].substring(0, 1);
			String num2 = grade[1].substring(2, 3) + grade[1].substring(1, 2) + grade[1].substring(0, 1);
			
			int max = Math.max(Integer.parseInt(num1), Integer.parseInt(num2));

			bw.write(String.valueOf(max));
			bw.flush();
			
			br.close();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
