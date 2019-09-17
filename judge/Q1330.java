package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1330 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String[] tmp = br.readLine().split(" ");
			int num1 = Integer.parseInt(tmp[0]);
			int num2 = Integer.parseInt(tmp[1]);
			
			if(num1 > num2) {
				System.out.println(">");
			} else if(num1 < num2) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
