package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1009 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String strT = br.readLine();
			int T = Integer.parseInt(strT);
			
			for(int i=0; i<T; i++) {
				String[] number = br.readLine().split(" ");
				
				int a = Integer.parseInt(number[0]);		
				int b = Integer.parseInt(number[1]);
				
				List<Integer> list = new ArrayList<Integer>();
				if(a%10 ==0) {					// 밑이 10의 배수인 경우는 무조건 10번째 컴퓨터가 계산한다.
					System.out.println(10);
					continue;
				}
				list.add(a%10);	
				
				
				// 일의 자리가 중복될 때까지만 계산한다.
				for(int j=1; j<=b; j++) {
					long num = (long)Math.pow(a%10, j+1);		// 10으로 나누기 때문에 끝자리만 계산한다.
					
					int tmpNum = (int)(num%10);				// 배수의 나머지
					if(list.get(0) == tmpNum ) {			// 배수의 나머지가 첫번째와 같아지면 끝낸다.
						break;
					} else {
						list.add(tmpNum);
					}
				}
				
				int idx = b % (list.size());
				if(idx == 0) {
					System.out.println(list.get(list.size()-1));	// list는 1베이스 임으로 -1
				} else {
					System.out.println(list.get(idx-1));
				}
			}

			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
