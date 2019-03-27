package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1924 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] dow = { "SUN", "MON", "TUE", "WEN", "THU", "FRI", "SAT"};
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		String[] tmp = br.readLine().split(" ");
		int month = Integer.parseInt(tmp[0]);
		int day = Integer.parseInt(tmp[1]);
		
		int sum = 0;
		for(int i=0; i<month-1; i++) {
			sum = sum + months[i];
		}
		sum = sum + day;
		System.out.println(dow[sum%7]);
		
	}
}
