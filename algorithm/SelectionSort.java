package algorithm;

public class SelectionSort {
	
	/* 선택정렬 (Selection Sort) 
	 * - 배열을 돌면서 가장 작은 값을 앞으로 옮긴다. 
	 * - 빅오 표기법으로 O(n^2) 의 시간을 가진다.
	 * */
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 2, 4, 6, 9, 8, 7, 10};
		selectionSort(arr);
		printArry(arr);

	}
	
	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0);
	}
	
	private static void selectionSort(int[] arr, int start) {
		if(start < arr.length-1) {
			int min_index = start;
			for(int i=start; i<arr.length; i++) {
				if(arr[i] < arr[min_index]) {
					min_index = i;
				}
			}
			swap(arr, start, min_index);
			selectionSort(arr, start+1);
		}
	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	private static void printArry(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}
}
