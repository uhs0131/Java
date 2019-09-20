package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tcase = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<tcase; i++) {
			String[] tmpStr = br.readLine().split(" ");
			int num1 = Integer.parseInt(tmpStr[0]);
			int num2 = Integer.parseInt(tmpStr[1]);
			Queue<Integer> queue = new LinkedList<Integer>();
			String[] tmpStr1 = br.readLine().split(" ");
			for(int j=0; j<num1; j++) {
				
				
				queue.add(Integer.parseInt(tmpStr1[j]));
			}
			
			while(!queue.isEmpty()) {
			
				for(int j=0; j<queue.size(); j++) {
					
				}
			}
			
			System.out.println();
//			while(!queue.isEmpty()) {
//				System.out.println(queue.poll());
//			}
			
		}
	}

}
