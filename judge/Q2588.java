package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());

			
			int one = (num2%10);
			int ten = (num2%100) / 10;
			int hun = num2 /100;			// 3자리가 입력됨
			
			System.out.println(num1 * one);
			System.out.println(num1 * ten);
			System.out.println(num1 * hun);
			System.out.println(num1 * num2);
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
