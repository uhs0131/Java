package kakao;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234";
		boolean tf = strChk(s);
		System.out.println(tf);
	}
	
	
	public static boolean strChk(String s) {
		boolean tf = true;
		
		// 문자열의 길이가 4 또는 6인지 체크
		if(!(s.length() == 4 || s.length() == 6)) {
			tf = false;
		}
		
		// 숫자로만 구성되어 있는지 체크
		if(!s.matches("^[0-9]*$")) {
			tf = false;
		}
		
		return tf;
	}
}
