package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2884 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String[] tmp = br.readLine().split(" ");
			int hour = Integer.parseInt(tmp[0]);
			int mini = Integer.parseInt(tmp[1]);
			
			int h = 0;
			int m = 0;
			if(mini >= 45) {
				h = hour;
				m = mini - 45;
			} else {
				h = hour - 1;
				m = mini + 60 - 45;
				
				if(h < 0) {
					h = 23;
				}
			}
			
			System.out.println(h + " " + m);
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
