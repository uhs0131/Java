package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2775 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tcase = Integer.parseInt(br.readLine());
		
		int floor=0;
		for(int i=0; i<tcase*2; i++) {
			String tmp = br.readLine();
			if(i%2==0) {
				floor = Integer.parseInt(tmp);
			} else {
				int room = Integer.parseInt(tmp);
				int p = count(floor, room);
				System.out.println(p);
			}
			
			
		}
		
		
	}
	
	private static int count(int floor, int room) {
		
		int p =0;
		
		if(floor == 0) {
			p = room;
		} else {
			for(int i=1; i<=room; i++) {
				p = p + i;
			}
			
			p =  count(floor-1, room);
		}
		
		return p;
	}

}
