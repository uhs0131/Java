package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q10828 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tcase = Integer.parseInt(br.readLine());
		Stack stack = new Stack();
		
		for(int i=0; i<tcase; i++) {
			String[] str = br.readLine().split(" ");
			if(str.length == 1) {
				stack.operation(str[0]);
			} else if(str.length == 2) {
				stack.operation(str[0], Integer.parseInt(str[1]));
			}
		}
		
		br.close();
	}
}


class Stack{
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public void operation(String op) {
		operation(op, -1);
	}
	public void operation(String op, int num) {
		if("push".equals(op)) {
			push(num);
		} else if("pop".equals(op)) {
			System.out.println(pop());
		} else if("size".equals(op)) {
			System.out.println(size());
		} else if("empty".equals(op)) {
			System.out.println(empty());
		} else if("top".equals(op)) {
			System.out.println(top());
		}
	}
	
	public void push(int num) {
		arr.add(num);
	}
	
	public int pop() {
		int num = -1;
		
		if(!arr.isEmpty()) {
			num= arr.get(arr.size()-1);
			arr.remove(arr.size()-1);
		}
		
		return num;
	}
	
	public int size() {
		return arr.size();
	}
	
	public int empty() {
		
		if(arr.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int top() {
		int num = -1;
		
		if(!arr.isEmpty()) {
			num= arr.get(arr.size()-1);
		}
		
		return num;
	}
}