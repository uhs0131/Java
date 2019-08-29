package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2455 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int pass = 0;		// 현재 승객 수
			int max = 0;
			for(int i=0; i<4; i++) {
				String[] tmp = br.readLine().split(" ");
				
				int down = Integer.parseInt(tmp[0]);		// 내리는 사람
				int load = Integer.parseInt(tmp[1]);		// 타는사람
				
				
				pass = pass + load - down;
				if(pass > max) {
					max = pass;
				}
			}
			
			System.out.println(max);
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
