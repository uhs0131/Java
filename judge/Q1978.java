package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tcase = Integer.parseInt(br.readLine());
		String[] tmp = br.readLine().split(" ");
		
		int sosu = 0;
		for(int i=0; i<tmp.length; i++) {
			// 소수인지 검사
			int num = Integer.parseInt(tmp[i]);
			
			if(num%2 == 0 && num != 2) {
				continue;
			} else {
				boolean yn = true;
				for(int j=3; j<num; j=j+2) {
					if(num%j == 0) {
						yn = false;
						break;
					}
				}
				if(yn && num != 1) {
					sosu++;
				}
			}
			
		}
		
		System.out.println(sosu);
		
		br.close();
	}

}
