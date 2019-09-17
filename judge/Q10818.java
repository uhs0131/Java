package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tcase = Integer.parseInt(br.readLine());
		
		String[] tmp = br.readLine().split(" ");
		
		int max = -1000000;
		int min = 1000000;
		for(int i=0; i<tcase; i++) {
			if(max < Integer.parseInt(tmp[i])) {
				max = Integer.parseInt(tmp[i]);
			}
			if(min > Integer.parseInt(tmp[i])) {
				min = Integer.parseInt(tmp[i]);
			}
		}
		System.out.println(min);
		System.out.println(max);
		br.close();
	}

}
