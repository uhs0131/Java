package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1094 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int stickSize = Integer.parseInt(br.readLine());
			
			// 최대 64 cm
			int[] size = {64, 32, 16, 8, 4, 2, 1};
			int cnt = 0;
			int sum = 0;
			
			for(int i=0;i<7; i++) {
				if(size[i] <= stickSize && sum + size[i] <= stickSize) {
					sum += size[i];
					cnt++;
					if(sum == stickSize) {
						break;
					}
				}
			}
			
			System.out.println(cnt);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
