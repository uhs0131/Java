package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q1427 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		try {
			String str = br.readLine();
			int[] arr = new int[str.length()];

			for(int i=0; i<str.length(); i++) {
				arr[i] = Integer.parseInt(str.substring(i, i+1));
			}
			quickSort(arr);
			printArry(arr);
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if(start < part2 -1) {
			quickSort(arr, start, part2-1);
		} 
		if(part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end)/2];
		while(start <= end) {
			while(arr[start] > pivot) {
				start++;
			}
			while(arr[end] < pivot) {
				end--;
			}
			
			if(start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	private static void printArry(int[] arr) {
		for(int data : arr) {
			System.out.print(data);
		}
		System.out.println();
	}

}
