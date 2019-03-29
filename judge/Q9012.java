package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tcase = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tcase; i++) {
			String str = br.readLine();
			chkVps(str);
		}
		
		br.close();

	}
	
	private static void chkVps(String str) {
		
		ArrayList<String> list = new ArrayList<String>();
		Boolean yn = true;
		
		for(int i=0; i<str.length(); i++) {
			String subStr = str.substring(i, i+1);
			
			if("(".equals(subStr)) {
				push(list, subStr);
			} else if(")".equals(subStr)) {
				String a = pop(list);
				if(!"(".equals(a)) {
					yn = false;
					break;
				}
			}
		}
		
		if(list.size() > 0) {
			yn = false;
		}
		System.out.printf("%s\n", yn ? "YES" : "NO");
	}
	
	private static void push(ArrayList<String> list, String str) {
		list.add(str);
	}
	
	private static String pop(ArrayList<String> list) {
		
		String str;
		if(list.size() > 0) {
			str = list.get(list.size()-1);
			list.remove(list.size()-1);
		} else {
			str = "";
		}
		
		return str;
	}
	
}
