package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int count = scan.nextInt(); scan.nextLine();
		 * 
		 * for(int i=0; i<count; i++) { int num1 = scan.nextInt(); int num2 =
		 * scan.nextInt(); scan.nextLine(); System.out.println(num1 + num2); }
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int count = Integer.parseInt(br.readLine());
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			for(int i=0; i<count; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				bw.write(num1 + num2 + "\n");
			}
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
