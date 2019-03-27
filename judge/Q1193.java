package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193 {

	public static void main(String[] args) {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 int num = Integer.parseInt(br.readLine());
			 
			 int i=1;
			 int sum=0;
			 while(true) {
				 
				 sum = sum + i;
				 if(sum >= num) {
					 break;
				 }
				 i++;
			 }
			 int bunja = 0;
			 int bunmo = 0;
			 
			 if(i%2 == 1 ) {
				 bunja = sum - num + 1;
				 bunmo = i-bunja + 1;
			 } else {
				 bunmo = sum - num + 1;
				 bunja = i-bunmo + 1;
			 }
			 
			 System.out.println(bunja + "/" + bunmo);
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
