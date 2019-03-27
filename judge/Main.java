package judge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<100; i++) {
			try {
				String str= br.readLine();
				if(str == null) {
					break;
				}else {
					strList.add(str);
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
