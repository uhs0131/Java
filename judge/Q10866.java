package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Q10866 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tcase = Integer.parseInt(br.readLine());
		Deque dq = new Deque();
		
		for(int i=0; i<tcase; i++) {
			String[] tmp = br.readLine().split(" ");
			String op = tmp[0];
			int num = 0;
			if(tmp.length > 1) {
				num = Integer.parseInt(tmp[1]);
			}
			
			switch(op) {
			case "push_front" :
				dq.push_front(num);
				break;
			case "push_back" :
				dq.push_back(num);
				break;
			case "pop_front" :
				System.out.println(dq.pop_front());
				break;
			case "pop_back" :
				System.out.println(dq.pop_back());
				break;
			case "size" :
				System.out.println(dq.size());
				break;
			case "empty" :
				System.out.println(dq.empty());
				break;
			case "front" :
				System.out.println(dq.front());
				break;
			case "back" :
				System.out.println(dq.back());
				break;
			}
			
		}
	}
}


class Deque {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void push_front(int num) {
		
		list.add(0, num);
	}
	
	public void push_back(int num) {
		list.add(num);
	}
	
	public int pop_front() {
		
		int tmp = -1;
		if(!list.isEmpty()) {
			tmp = list.get(0);
			list.remove(0);
		}
		
		return tmp;
	}
	
	public int pop_back() {
		
		int tmp = -1;
		if(!list.isEmpty()) {
			tmp = list.get(list.size()-1);
			list.remove(list.size()-1);
		}
		
		return tmp;
	}
	
	public int size() {
		return list.size();
	}
	
	public int empty() {
		return list.size()==0 ? 1 : 0;
	}
	
	public int front() {
		return list.size()==0 ? -1 : list.get(0);
	}
	
	public int back() {
		return list.size()==0 ? -1 : list.get(list.size()-1);
	}
}
