package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11399 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int N = Integer.parseInt(br.readLine());	// 줄 서있는 사람의 수
			String[] tmpStr = br.readLine().split(" ");
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(tmpStr[i]);
			}
			
			bubbleSort(arr);

			int sum = 0;
			for(int i=arr.length; i>0; i--) {
				sum = sum + arr[arr.length-i] * i;
			}
			System.out.println(sum);
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length-1);
	}
	
	private static void bubbleSort(int[] arr, int last) {
		if(last > 0) {
			for(int i = 1; i<= last; i++) {
				if(arr[i-1] > arr[i]) {
					swap(arr, i-1, i);
				}
			}
			bubbleSort(arr, last-1);
		}
	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
}
