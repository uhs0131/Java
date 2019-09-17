package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10950 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int t = Integer.parseInt(br.readLine());
			
			for(int i=0; i<t; i++) {
				String[] tmp = br.readLine().split(" ");
				int a = Integer.parseInt(tmp[0]);
				int b = Integer.parseInt(tmp[1]);
				
				System.out.println(a + b);
			}
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
