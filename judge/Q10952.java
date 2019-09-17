package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Q10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while(true) {
				String[] tmpStr = br.readLine().split(" ");
				int num1 = Integer.parseInt(tmpStr[0]);
				int num2 = Integer.parseInt(tmpStr[1]);

				if(num1 == 0 && num2 == 0) {
					break;
				}
				
				System.out.println(num1 + num2);
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
