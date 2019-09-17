package kakao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FailPercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 500;						// 스테이지의 개수
		
		// int[] stages = new int[200000];		// 도전중인 스테이지 번호 (1 ~ 501)
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		N = 5;

		int[] answer = calc(N, stages);
		
	}
	
	public static int[] calc(int N, int[] stages){
		
		int[] result = new int[N+1];
	
		int tot_stages = stages.length;			// 총 사람수
		int[] count = new int[N+1];		
		
		
		for(int i=0; i<stages.length; i++) {
			// System.out.println(stages[i]);
			count[stages[i]-1]++;
		}
		
		double[] failePercent = new double[count.length-1];
		int[] iArr = new int[count.length-1];
		// 실패율 계산
		for(int i=0; i<count.length-1; i++) {
			failePercent[i] = (double)count[i]/tot_stages;
			iArr[i] = i+1;
			
			tot_stages= tot_stages-count[i];
			System.out.println("i : " + i + "   count: " + count[i] + "   fail : " + failePercent[i]);
		}

		System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		bubbleSort(failePercent, iArr);
		
		 for(int i=0; i<count.length-1; i++) {
			 System.out.println("i : " + i + "   count: " + count[i]+ "   fail : " + failePercent[i] + "   iArr : " + iArr[i]);
		 }
		
//		
//		for(int i=0; i<failePercent.length; i++) {
//			//System.out.println("i : " + i + "   count: " + count[i] + "   fail : " + failePercent[i]);
//			System.out.println(map.get(failePercent[i]));
//		}
		
		// 실패율 높은 순서대로 정렬
		 return iArr;
		
	}
	
	private static void bubbleSort(double[] arr, int[] iArr) {
		bubbleSort(arr, arr.length-1, iArr);
	}
	
	private static void bubbleSort(double[] arr, int last, int[] iArr) {
		if(last > 0) {
			for(int i = 1; i<= last; i++) {
				if(arr[i-1] < arr[i]) {
					swap2(iArr, i-1, i);
					swap(arr, i-1, i);
				}
			}
			bubbleSort(arr, last-1, iArr);
		}
	}
	
	private static void swap(double[] arr, int index1, int index2) {
		double tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}
	
	private static void swap2(int[] arr, int index1, int index2) {
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
