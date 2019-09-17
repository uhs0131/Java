package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int num = Integer.parseInt(br.readLine());
			
			Queue<Integer> queue = new LinkedList<Integer>();
			
			for(int i=1; i<=num; i++) {
				queue.add(i);
			}
			
			while(queue.size() != 1) {
				queue.poll();		// 제일 위에 카드 제거
				int pollNum = queue.poll();		// 다음카드를 제일 위로 쌓는다.
				queue.add(pollNum);
			}
			
			System.out.println(queue.poll());
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}


