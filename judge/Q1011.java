package judge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1011 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int tcase = Integer.parseInt(br.readLine());
			for(int k=0; k<tcase; k++) {
				String[] tmp = br.readLine().split(" ");
				int pos = Integer.parseInt(tmp[0]);
				int des = Integer.parseInt(tmp[1]);
				int length = des - pos;
				
				for(int i=1; i<=length; i++) {
					
					//System.out.println(i);
					if( (1 + i)*i >= length ) {
						
						if((1 + i)*i == length) {
							bw.write(i + "\n");
						} else if( (length - i*(i-1)) == 2*i-2 || (length - i*(i-1)) == 2*i || (length - i*(i-1)) == 2*i+2){
							bw.write(i+1 + "\n");
						} else {
							bw.write(i+2 + "\n");
						}
						
						break;
					}
					
				}
			}
			
			bw.flush();
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
