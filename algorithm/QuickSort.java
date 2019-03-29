package algorithm;

public class QuickSort {

	/* 퀵정렬(QuickSort)
	 * 1. 기준값을 잡는다.
	 * 2. 기준값을 기준으로 큰값을 오른쪽으로 작은값을 왼쪽으로 보내 정렬한다.
	 * 3. 정렬이 끝날 때까지 반복한다.
	 * - 빅오 표기법으로 O(nlogn) 의 시간을 가진다. 최고값은 n^2까지 걸릴 수 있다.
	 * */
	
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 2, 4, 6, 9, 8, 7, 10};
		quickSort(arr);
		printArry(arr);

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
			while(arr[start] < pivot) {
				start++;
			}
			while(arr[end] > pivot) {
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
			System.out.print(data + ",");
		}
		System.out.println();
	}

}
