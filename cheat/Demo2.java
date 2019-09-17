package cheat;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

       
    	for(int j=0; j<y; j++) {
    		 for(int i=0; i<x; i++) {
	        	System.out.print("*");
		   }
    		 System.out.println("");
    	}
     
	}
}
