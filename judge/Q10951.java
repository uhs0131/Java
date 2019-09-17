package judge;

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			scan.hasNextLine();
			
			System.out.println(a+b);
		}
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		try {
//			
//			String input = "";
//			while((input = br.readLine()) != null) {
//				System.out.println(input);
//				
//				String[] tmpStr = input.split(" ");
//				int num1 = Integer.parseInt(tmpStr[0]);
//				int num2 = Integer.parseInt(tmpStr[1]);
//				
//				System.out.println(num1 + num2);
//			}
//			
//			br.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
