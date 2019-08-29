package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1002 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int count = Integer.parseInt(br.readLine());

			for(int j=0; j<count; j++) {
				String[] strArr = br.readLine().split(" ");
				int arr[] = new int[strArr.length];
			
		
				for(int i=0; i<strArr.length; i++) {
					arr[i] = Integer.parseInt(strArr[i]);
				}
				
				int x1 = arr[0];
				int y1 = arr[1];
				int x2 = arr[2];
				int y2 = arr[3];
				int r1 = arr[4];
				int r2 = arr[5];
				
				
				
				// (x1, y1)을 중심으로 하고 r1 을 지름으로 하는 원과
				// (x2, y2)을 중심으로 하고 r2 을 지름으로 하는 원이 겹치는 점이 몇개 있는가? 로 생각할 수 있다.
				double r3 = Math.pow( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
				
				int min = r1;
				int big = r2;
				if(r2 < r1) {
					min = r2;
					big = r1;
				}
				
				/*
				 *	 두 원이 일치할 때, 답은 -1
					두 원이 외접할 때, 답은 1
					두 원이 내접할 때, 답은 1
					두 원이 서로 떨어져 있고 만나지 않을 때, 답은 0
					한 원이 다른 원의 내부에 있고 두 원이 만나지 않을 때, 답은 0. 꼭 두 원의 중심이 같을 필요는 없습니다!
					나머지 경우, 답은 2
				 * 
				 * */
				if(min + big == r3 && x1==x2 && y1==y2) {
					System.out.println(-1);
				} else if(min + big == r3) {
					System.out.println(1);
				}
				
				
				if(min + r3 > big) {
					System.out.println(2);
				} else if(min + r3 == big) {
					if(x1==x2 && y1==y2) {
						System.out.println(-1);
					} else {
						System.out.println(1);
					}
				} else {
					System.out.println(0);
				}
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
