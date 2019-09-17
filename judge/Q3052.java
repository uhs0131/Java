package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q3052 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			List<Integer> list = new ArrayList<Integer>();
			int cnt = 0;
			for(int i=0; i<10; i++) {
				int num = Integer.parseInt(br.readLine());
				int a = num % 42;
				
				boolean b = true;
				for(int j=0; j<list.size(); j++) {
					if(list.get(j) == a) {
						b = false;
						break;
					}
				}
				
				if(b) {
					// ystem.out.println(a);
					list.add(a);
				}
			}
			
			System.out.println(list.size());
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
