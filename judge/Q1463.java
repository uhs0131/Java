package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463 {
	
	static int cnt = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int num = Integer.parseInt(br.readLine());
			int cnt = calc(num, 0);
			
			//Node node = new Node(num);
			 // node.calc();
			System.out.println("1");
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int calc(int num, int cnt) {
		
		
		System.out.println("num : " + num + "   cnt : " + cnt);
		if(num == 1) {
			return cnt;
		}
		
		cnt++;
		if(num%3!=0 && num%2!=0) {
			calc(num-1, cnt);
		} else if(num%3==0) {
			calc(num/3, cnt);
		} else if(num%2==0) {
			calc(num/2, cnt);
		}
		
		return cnt;
	}

	
}

//class Node{
//	
//	int num = 0;
//	int depth = 1;
//	Node nextNode1;
//	Node nextNode2;
//	Node nextNode3;
//	
//	Node(int num){
//		this.num = num;
//	}
//	
//	public int calc(){
//		if(num == 1) {
//			return depth;
//		} else {
//			System.out.println("num : " + num + " , depth: "+ depth);
//			if(num%3 == 0) {
//				//System.out.println("node1");
//				nextNode1 = new Node(num / 3);
//				nextNode1.depth = this.depth+1;
//				nextNode1.calc();
//			}
//			if(num%2 == 0){
//				//System.out.println("node2");
//				nextNode2 = new Node(num / 2);
//				nextNode2.depth = this.depth+1;
//				nextNode2.calc();
//			} 
//			//System.out.println("node3");
//			nextNode3 = new Node(num - 1);
//			nextNode3.depth = this.depth+1;
//			nextNode3.calc();
//			
//			return depth;
//		}
//	}
//}