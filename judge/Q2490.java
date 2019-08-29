package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2490 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			for(int j=0;j<3; j++) {
				
				String tmp[] = br.readLine().split(" ");
				int cnt = 0; 	// 0의 갯수   0:배,1:등 
				
				for(int i=0; i<tmp.length; i++) {
					if(Integer.parseInt(tmp[i]) == 0) {
						cnt++;
					}
				}
				
				switch(cnt) {
				case 1:
					System.out.println("A");		// 도
					break;
				case 2:
					System.out.println("B");		// 개
					break;
				case 3:
					System.out.println("C");		// 걸
					break;
				case 4:
					System.out.println("D");		// 윷
					break;
				case 0:
					System.out.println("E");		// 모
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
