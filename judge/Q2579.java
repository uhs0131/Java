package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q2579 {

	static int cnt = 0;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int tcase = Integer.parseInt(br.readLine());
			
			Stack<Integer> s = new Stack<Integer>();
			for(int i=0; i<tcase; i++) {
				int cost = Integer.parseInt(br.readLine());
				
				calc(s, cost, i, tcase);
			}
			
			int sum = 0;
			while(s.size() > 0) {
				sum += s.pop();
			}
			System.out.println(sum);
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void calc(Stack<Integer> s, int cost, int i, int tcase) {
		// System.out.println(i);
		if(cnt == 0) {
			s.push(cost);
			//System.out.println("push : " + cost);
			cnt = 1;
		} else {
			cnt++;
			if(cnt == 3) {
				if(s.lastElement() <= cost || i==tcase) {
					//System.out.println("pop : " + s.top());
					s.pop();
					
					s.push(cost);
					//System.out.println("push : " + cost);
					cnt=1;
				} else {
					//System.out.println("push : " + cost);
					//s.push(cost);
					cnt=0;
				}
			} else {
				s.push(cost);
				//System.out.println("push : " + cost);
				
			}
		}
	}

}
