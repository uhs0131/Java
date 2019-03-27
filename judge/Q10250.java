package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int tcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tcase; i++) {
			String[] tmp = br.readLine().split(" ");
			int height = Integer.parseInt(tmp[0]);
			int width = Integer.parseInt(tmp[1]);
			int n = Integer.parseInt(tmp[2]);
			
			int ceng, ho;
			if(n % height != 0) {
				ho = n / height + 1;
				ceng = n % height;
			} else {
				ho = n / height;
				ceng = height;
			}
			
			System.out.printf("%d%02d\n",  ceng, ho);
		}
	}

}
