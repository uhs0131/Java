package algorithm;

public class MergeSort {
	
	/* 합병정렬(MergeSort)
	 * 1. 주어진 배열을 두개의 값을 가진 배열로 쪼갠다. ex) length 8의 배열이라면 4개의 배열이 나옴 
	 * 2. 쪼갠 배열을 정렬한다.
	 * 3. 쪼갠 배열 중 2개의 배열을 비교하여 앞에 작은수를 보내는 식으로 합친다.
	 * 4. 끝까지 3번을 반복한다.
	 * - 빅오 표기법으로 O(nlogn) 의 시간을 가진다. 단 메모리가 주어진 배열만큼의 추가 메모리가 필요하다.
	 * */
	
	public static void main(String[] args) {
		
		int arr[] = {1, 3, 5, 2, 4, 6, 9, 8, 7, 10};
		mergeSort(arr);
		printArry(arr);
	}
	
	private static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length];
		mergeSort(arr, tmp, 0, arr.length-1);
	}
	
	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if(start < end) {
			int mid = (end + start) / 2;
			mergeSort(arr, tmp, start, mid);
			mergeSort(arr, tmp, mid+1, end);
			merge(arr, tmp, start, mid, end);
		}
	}
	
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for(int i=start; i<=end; i++) {
			tmp[i] = arr[i];
		}
		int part1 = start;
		int part2 = mid + 1;
		int index = start;
		while(part1 <= mid && part2 <= end) {
			if(tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			}else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
			
			// 정렬이 끝난 후 앞에 배열에 데이터가 남은 경우
			for(int i=0; i<=mid-part1; i++) {
				arr[index + i] =tmp[part1 + i];
			}
		}
	}
	
	private static void printArry(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}

}
