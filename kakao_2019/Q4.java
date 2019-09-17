package kakao_2019;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"frodo", "front", "aaaaoa", "frost", "frozen", "frame", "kakao", "frofrofro"};
		String[] queries = {"fro??", "fro??", "????o", "fr???", "fro???", "pro?"};
		
		int[] answer = calc(words, queries);
	}
	
	public static int[] calc(String[] words, String[] queries) {
		
		int[] result = new int[queries.length];
		for(int i=0; i<queries.length;i++) {
			result[i] = srch(words, queries[i]);
		}
		
		
		for(int a : result) {
			System.out.print(a + " ");
		}
		return result;
	}
	
	public static int srch(String[] words, String query) {
		
		int headYn = 0;			// 0 접두, 1 접미
		// 접두인지 접미 인지 판단
		// ? 하나이상 포함된
		int first_idx = query.indexOf("?");
		int last_idx = query.lastIndexOf("?");
		if(first_idx == 0) {
			headYn = 0;
		} else {
			headYn = 1;
		}
		
		int cnt = last_idx - first_idx + 1;
		
		//System.out.println("headYn : " + headYn);
		//System.out.println("cnt : " + cnt);
		//String str = "";
		//str.indexOf();
		int matchCnt = 0;
		for(int i=0; i<words.length; i++) {
			// 글자수가 틀리면 체크하지 않음
			if(words[i].length() != query.length()) {
				continue;
			}
			
			// 접두인 경우
			if(headYn == 0) {	// 접두인 경우
				//System.out.println(words[i]);
				//System.out.println(query.substring(cnt));
				//System.out.println(words[i].lastIndexOf(query.substring(cnt)));
				if(cnt == words[i].lastIndexOf(query.substring(cnt))) {
					matchCnt++;
				}
			}
			// 접미인 경우
			else if(headYn == 1) {
				String tmpStr = query.substring(0, query.length()-cnt);
// 				System.out.println(query.substring(0, query.length()-cnt));
				
				if(words[i].indexOf(tmpStr) == 0
				) {
					matchCnt++;
				}
			}
			
		}
		
		return matchCnt;
	}
}
