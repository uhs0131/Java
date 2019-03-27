package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] scale = new int[8];
			int i=0;
			while(st.hasMoreTokens()) {
				scale[i] = Integer.parseInt(st.nextToken());
				i++;
			}
			
			
			String result = "mixed";
			for(int j=1;j<=scale.length;j++) {
				if(scale[j-1]/j != 1) {
					break;
				} 
				else if(j==scale.length){
					result = "ascending";
				}
			}

			for(int j=1;j<=scale.length;j++) {
				if(scale[j-1]/(scale.length-j+1) != 1) {
					break;
				} 
				else if(j==scale.length){
					result = "descending";
				}
			}
			
			bw.write(result);
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
