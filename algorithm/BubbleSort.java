package algorithm;

public class BubbleSort {

	/* 거품정렬(BubbleSort)
	 * 1. 뒤의 수와 비교한다.
	 * 2. 뒷수가 큰 경우 앞 수와 자리를 바군다.
	 * 3. 1~2 를 끝까지 반복한다. 그 결과 맨 뒤에 가장 큰 수가 오게 된다.
	 * 4. 정렬된 수를 제외하고 1~3 까지 다시 반복한다.
	 * - 빅오 표기법으로 O(n^2) 의 시간을 가진다.
	 * */
	
	public static void main(String[] args) {
		
		int arr[] = {1, 3, 5, 2, 4, 6, 9, 8, 7, 10};
		bubbleSort(arr);
		printArry(arr);
		
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
	
	private static void printArry(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}
}
