package kakao_2019;

class Q1 {

	public static void main(String[] args) {

		
		int answer = calc("xababcdcdababcdcd");
		System.out.println(answer);
		
	}
	
	public static int calc(String p) {
		
		
		int min = p.length();
		for(int i=1; i<=p.length(); i++) {
			//System.out.println("---------------------------------------" + i);
			
			String str = "";
			String tmpStr = p.substring(0, i);
			int cnt = 1;
			String remain = p.substring(p.length() - p.length()%i);
			for(int j=1; j< p.length() / i; j++) {
				//System.out.println(p.substring(i*j, i*(j+1)));		
				
				
				if(p.substring(i*j, i*(j+1)).equals(tmpStr)) {
					cnt++;
					//System.out.println(cnt);
				} else {
					if(cnt > 1) {
						str = str + cnt + tmpStr;
					} else {
						str = str + tmpStr;
					}
					tmpStr = p.substring(i*j, i*(j+1));
					cnt=1;
				}
			}
			
			if(cnt > 1) {
				str = str + cnt + tmpStr;
			} else {
				str = str + tmpStr;
			}
			str = str + remain;
			//System.out.println("result : " + str);
			
			if(min > str.length()) {
				min =str.length();
			}
		}
		
		return min;
		
	}

}
