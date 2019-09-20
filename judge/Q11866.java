package judge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Q11866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b= scan.nextInt();
		
		
		int cnt = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0; i<a; i++) {
			queue.add(i+1);
		}
		
		System.out.print("<");
		while(queue.size() > 0) {
			cnt++;
			if(cnt == b) {
				System.out.print(queue.poll());
				cnt = 0;
				if(queue.size() != 0) {
					System.out.print(", ");
				}
			} else {
				queue.add(queue.poll());
			}
		}
		System.out.print(">");
	}

}
