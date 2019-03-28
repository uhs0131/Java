package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tcase = Integer.parseInt(br.readLine());
		
		int[] ori_arr = new int[tcase];
		for(int i=0; i<tcase; i++) {
			ori_arr[i] = Integer.parseInt(br.readLine());
		}
		
		chkStack(ori_arr);
	}
	
	private static void push(ArrayList<Integer> arr, int num) {
		arr.add(num);
	}
	
	private static int pop(ArrayList<Integer> arr) {
		int num = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return num;
	}
	
	private static void chkStack(int[] ori_arr) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<String> op = new ArrayList<String>();
		int count=0;
		
		for(int i=1; i<=ori_arr.length; i++) {
			push(arr, i);
			op.add("+");
			
			while (arr.get(arr.size() - 1) == ori_arr[count]) {
				pop(arr);
				op.add("-");
				count++;
				if(arr.size() <= 0) {
					break;
				}

			}
			
		}
		if(count == ori_arr.length) {
			for(String str : op) {
				System.out.println(str);
			}
		} else {
			System.out.println("NO");
		}
	}
}
