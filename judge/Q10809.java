package judge;

import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		// a : 97, z : 122
		int[] alpabet = new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)=='a')
				alpabet[0]=i;
			else if(str.charAt(i)=='b')
				alpabet[1]=i;
			else if(str.charAt(i)=='c')
				alpabet[2]=i;
			else if(str.charAt(i)=='d')
				alpabet[3]=i;
			else if(str.charAt(i)=='e')
				alpabet[4]=i;
			else if(str.charAt(i)=='f')
				alpabet[5]=i;
			else if(str.charAt(i)=='g')
				alpabet[6]=i;
			else if(str.charAt(i)=='h')
				alpabet[7]=i;
			else if(str.charAt(i)=='i')
				alpabet[8]=i;
			else if(str.charAt(i)=='j')
				alpabet[9]=i;
			else if(str.charAt(i)=='k')
				alpabet[10]=i;
			else if(str.charAt(i)=='l')
				alpabet[11]=i;
			else if(str.charAt(i)=='m')
				alpabet[12]=i;
			else if(str.charAt(i)=='n')
				alpabet[13]=i;
			else if(str.charAt(i)=='o')
				alpabet[14]=i;
			else if(str.charAt(i)=='p')
				alpabet[15]=i;
			else if(str.charAt(i)=='q')
				alpabet[16]=i;
			else if(str.charAt(i)=='r')
				alpabet[17]=i;
			else if(str.charAt(i)=='s')
				alpabet[18]=i;
			else if(str.charAt(i)=='t')
				alpabet[19]=i;
			else if(str.charAt(i)=='u')
				alpabet[20]=i;
			else if(str.charAt(i)=='v')
				alpabet[21]=i;
			else if(str.charAt(i)=='w')
				alpabet[22]=i;
			else if(str.charAt(i)=='x')
				alpabet[23]=i;
			else if(str.charAt(i)=='y')
				alpabet[24]=i;
			else if(str.charAt(i)=='z')
				alpabet[25]=i;
		}
		for(int j=0;j<26;j++)
			System.out.printf("%d ",alpabet[j]);

	}

}