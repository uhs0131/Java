package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		try {
			
			String[] tmp = br.readLine().split(" ");
			int A = Integer.parseInt(tmp[0]);		// 고정지출
			int B = Integer.parseInt(tmp[1]);		// 가변지출
			int C = Integer.parseInt(tmp[2]);		// 한대당 가격
			
			
			int i=0;
			while(true) {
				if(B>C) {		// 가변지출이 한대당 가격보다 큰 경우
					System.out.println(-1);
					break;
				}
				i++;
				if(A+ i*B < C*i) {
					System.out.println(i);
					break;
				}
				
			}
			
			
			
			bw.flush();
			
			br.close();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
