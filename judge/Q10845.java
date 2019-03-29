package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q10845 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int tcase = Integer.parseInt(br.readLine());
			
			Queue queue = new Queue();
			for(int i=0; i<tcase; i++) {
				String[] str = br.readLine().split(" ");
				String op = str[0];
				int num = 0;
				if(str.length > 1) {
					num = Integer.parseInt(str[1]);
				}
				
				switch(op) {
					case "push" :
						queue.push(num);
						break;
					case "pop" :
						System.out.println(queue.pop());
						break;
					case "size" :
						System.out.println(queue.size());
						break;
					case "empty" :
						System.out.println(queue.empty());
						break;
					case "front" :
						System.out.println(queue.front());
						break;
					case "back" :
						System.out.println(queue.back());
						break;
				}
				
			}
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Queue{
	// push, pop, size, empty, front, back
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void push(int num) {
		list.add(num);
	}
	
	public int pop() {
		int num = -1;
		if(list.size() > 0) {
			num = list.get(0);
			list.remove(0);
		}
		return num;
	}
	
	public int size() {
		return list.size();
	}
	
	public int empty() {
		return list.isEmpty() ? 1 : 0;
	}
	
	public int front() {
		int num = -1;
		if(!list.isEmpty()) {
			num = list.get(0);
		}
		return num;
	}
	
	public int back() {
		int num = -1;
		if(!list.isEmpty()) {
			num = list.get(list.size()-1);
		}
		return num;
	}
}
