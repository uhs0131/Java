package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1038 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 감소하는 수 Max 9876543210
			// Integer Max 2147483647
			
			int tnum = 123;
			int num = Integer.parseInt(br.readLine());
			
			int count = 0;
			
			for(double i=0; i<9876543211.0; i++) {
				
				int jali = (int)Math.log10(i);
				boolean yn = true;
				double mok = i;
				double nmj = -1;
				for(int j=0; j<=jali; j++) {
					
					if( (int)(mok % 10) <= nmj    ) {
						yn = false;
						System.out.println(i);
						break;
					} else {
						nmj = (int)(mok % 10);
						mok = (int)(mok / 10);
					}
					
//					if(i==tnum) {
//						System.out.println("j : "+j);
//						System.out.println("mok : "+mok);
//						System.out.println("nmj : "+nmj);
//					}
				}
				
				if(yn) {
					count++;
					System.out.println(count + " : " + i);
				}
				
				if(num == count -1) {
					System.out.println((int)i);
					break;
				}
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
