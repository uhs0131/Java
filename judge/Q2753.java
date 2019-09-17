package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2753 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int year = Integer.parseInt(br.readLine());
			
			// 0 - 윤년아님, 1 - 윤년
			if(year % 400 == 0) {
				System.out.println("1");
			} else if(year%100 == 0) {
				System.out.println("0");
			} else if(year%4 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
