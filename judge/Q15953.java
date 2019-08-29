package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15953 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println(Long.MAX_VALUE);
			// 9,223,372,036,854,775,807
			// 1,000,000,000,000,000,000
			int tcase = Integer.parseInt(br.readLine());
			
            // 0일때는 본선 진출하지 못했음으로 0원
			int[] money1 = {0, 500, 300, 300, 200, 200, 200, 50, 50, 50,
							50, 30, 30, 30, 30, 30, 10, 10, 10, 10
							, 10, 10};
			int[] money2 = {0, 512, 256, 256, 128, 128, 128, 128, 64, 64,
							64, 64, 64, 64, 64, 64, 32, 32, 32, 32,
							32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
							32, 32};
			
			for(int i=0; i<tcase; i++) {
				String[] tmp = br.readLine().split(" ");
				int grade1 = Integer.parseInt(tmp[0]);
				int grade2 = Integer.parseInt(tmp[1]);
				
				int sum = 0;
				if(grade1 < money1.length) {
					sum += money1[grade1];
				}
				if(grade2 < money2.length) {
					sum += money2[grade2];
				}
				
				System.out.println(sum * 10000);
				
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
