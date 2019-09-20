package judge;

import java.util.Scanner;

public class Q11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		scan.nextLine();
		
		int[] xArr = new int[N];
		int[] yArr = new int[N];
		for(int i=0; i<N; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			scan.nextLine();
			xArr[i] = x;
			yArr[i] = y;
			
		}
		bubbleSort(xArr, yArr);
		for(int i=0; i<N; i++) {
			System.out.println(xArr[i] + " " + yArr[i]);
		}
	}

	
	private static void bubbleSort(int[] xArr, int[] yArr) {
		bubbleSort(xArr, yArr, xArr.length-1);
	}
	
	private static void bubbleSort(int[] xArr, int[] yArr, int last) {
		if(last > 0) {
			for(int i = 1; i<= last; i++) {
				if(xArr[i-1] >= xArr[i]) {
					swap(xArr , i-1, i);
					swap(yArr , i-1, i);
//					if(yArr[i-1] > yArr[i]) {
//						swap(yArr , i-1, i);
//					}
				}
			}
			bubbleSort(xArr, yArr, last-1);
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
