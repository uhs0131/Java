package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 9;
		int[] people = new int[max];
		int sum = 0;
		for(int i=0; i<max; i++) {
			people[i] = Integer.parseInt(br.readLine());
			sum = sum + people[i];
		}
		
		chk(people, sum);
		
		br.close();
	}
	
	private static void chk(int[] people, int sum) {
		int tmp = sum;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int i = 0;
		int j = 0;
		for(i=0; i<people.length; i++) {
			for(j=i+1; j<people.length;j++) {
				tmp = sum;
				tmp = tmp - people[i] - people[j];
				if(tmp == 100) {
					break;
				}
			}
			if(tmp == 100) {
				break;
			}
		}
		
		
		
		for(int k=0; k<people.length; k++) {
			if(k == i || k== j) {
				continue;
			}
			
			list.add(people[k]);
		}
		
		list.sort(null);
		for(int num : list) {
			System.out.println(num);
		}
	}

}
