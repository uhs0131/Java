package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2579 {

	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int tcase = Integer.parseInt(br.readLine());
			
			Stair stair = new Stair(tcase);
			
			for(int i=0; i<tcase; i++) {
				int cost = Integer.parseInt(br.readLine());
				stair.list[i] = cost;
				
			}
			stair.calc();
			stair.print();
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


class Stair {
	
	int size;
	int[] list;
	int[] result;
	int cnt = 1;
	
	public Stair(int tcase) {
		size = tcase;
		list = new int[size];
		result = new int[size+1];
	}

	public void calc() {
		
		result[0] = 0;
		result[1] = list[0];
		result[2] = result[1] + list[1];
		
		if(result[1]> list[1]) {
			result[3] = result[1] + list[2];
			cnt = 1;
		} else {
			result[3] = list[1] + list[2];
			cnt = 2;
		}
		
		//System.out.println("i : " + 0 + "    result : " + result[0] + "   cnt : " + cnt);
		//System.out.println("i : " + 1 + "    result : " + result[1] + "   cnt : " + cnt);
		
		for(int i=4; i<=list.length; i++) {
			cnt++;
			if(result[i-1] > result[i-2]) {
				if(cnt == 3) {
					result[i] = Math.max(result[i-2], list[i-2]) + list[i-1];
					if(result[i-2]> list[i-2]) {
						cnt = 1;
					} else {
						cnt = 2;
					}
				} else {
					result[i] = result[i-1] + list[i-1];
				}
			} else {
				result[i] = result[i-2] + list[i-1];
				cnt = 1;
			}
			//System.out.println("i : " + i + "    result : " + result[i] + "   cnt : " + cnt);
		}
	}
	
	public void print() {
		System.out.println(result[list.length]);
	}
	
}