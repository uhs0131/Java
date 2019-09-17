package kakao_2019;

import java.util.Stack;

public class Q2 {

	public static String answer = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "()))((()";
		
		String answer = calc(p);
		
		System.out.println("answer : " +answer);
	}

	
	public static String calc(String p) {
		
		if(p.length() == 0) {
			return "";
		}
		int cnt1 = 0;
		int cnt2 = 0;
		// System.out.println("p : " + p);
		for(int i=0; i<p.length(); i++) {
			if(p.charAt(i) == '(') {
				cnt1++;
			} else {
				cnt2++;
			}
			
			// . 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 
			// 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다. 
			if(cnt1==cnt2 && cnt1 != 0) {
				
				String u = p.substring(0, i+1);
				String v = p.substring(i+1);
				// . 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
				if(chkVps(u)) {
					u += calc(v);
					return u;
				} else {
					String tmp = "(";
					tmp += calc(v);
					tmp += ")";
					for(int j=1; j<u.length()-1; j++) {
						if(u.charAt(j) == '(') {
							tmp += ")";
						} else {
							tmp += "(";
						}
					}
					return tmp;
				}
			}
		}
		
		return "";
	}
	
private static Boolean chkVps(String str) {
		
		Boolean yn = true;
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<str.length(); i++) {
			String subStr = str.substring(i, i+1);
			
			if("(".equals(subStr)) {
				stack.push(subStr);
			} else if(")".equals(subStr)) {
				if(stack.isEmpty() || !"(".equals(stack.pop())) {
					yn = false;
					break;
					
				}
			}
		}
		
		return yn;
	}
}
