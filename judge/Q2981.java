package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2981 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String[] tmp = br.readLine().split(" ");
			
			int num1 = Integer.parseInt(tmp[0]);
			int num2 = Integer.parseInt(tmp[1]);
			
			int besu = minBesu(num1, num2);
			System.out.println(besu);
			System.out.println( (num1/besu)*(num2/besu)*besu );
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int minBesu(int num1, int num2) {
		
		if(num2 > num1) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		int num = num1;
		if(num1 != num2) {
			num = minBesu(num1-num2, num2);
		}
		return num;
		
	}

}
