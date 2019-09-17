package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			int cnt = 0;
			for(int i=666; i<Integer.MAX_VALUE; i++) {
				
				for(int j=0; j<i;j++) {
					
				}
				
				if( String.valueOf(i).matches("^[0-9]*[6]{3}[0-9]*$")) {
					cnt++;
					
					if(cnt == num) {
						System.out.println(i);
						break;
					}
				}
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
