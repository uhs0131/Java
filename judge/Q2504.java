package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q2504 {

	public static void main(String[] args) {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			
			String str = br.readLine();
			Stack<String> stack = new Stack<String>();
			int sum = 0;
			
			for(int i=0 ;i<str.length(); i++) {
				String tmp = str.substring(i, i+1);
				
				switch (tmp){
				case "(":
					
					stack.add(tmp);
					
					break;
				case ")":
					if("(".equals(stack.peek())) {
						stack.pop();
						stack.push("2");
					} else {
						stack.push(")");
					}
					break;
				case "[":
					stack.add(tmp);
					break;
				case "]":
					if("[".equals(stack.peek())) {
						stack.pop();
						stack.push("3");
					}else {
						stack.push("]");
					}
					break;
				}
				
			}
			
			System.out.println(stack.toString());
			
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
