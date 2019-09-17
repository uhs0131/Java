package kakao;

public class FoodLive {

	static int result = -1;
	
	public static void main(String[] args) {

		int[] food_times = {3, 1, 2};	
		long k = 4;						// 지연시간
		
		
		calc(food_times, k);
		
		System.out.println(result);
	}
	
	public static void calc(int[] food_times, long k) {
//		long mok = k/food_times.length;		// 몇번 순회하는 지
//		long remain = k%food_times.length;	// 순회하고 남은 숫자
//		
//		
//		find(food_times, k, mok, remain);
		//	while(k>0) {
			// System.out.println("K : " + k);
			// k = find(food_times, k);
			
		//}
		while(k!=-1) {
			k = find(food_times, k);
		}
	}
	
	public static long find(int[] food_times, long k) {

		long tmp = k;
		
		for(int i=0; i<food_times.length; i++) {
			if(food_times[i] == 0) {
				continue;
			} else {
				food_times[i]--;
				tmp--;
				if(tmp == -1) {		// -1 인 값이 다음에 먹을 값임
					result = i + 1;	// 결과는 1 base 로 출력
					break;
				}
			}
		}
		
		if(tmp == k) {		// 모든 음식을 먹은 경우
			result = -1;
			return -1;		// 검색 종료
		}
		
		return tmp;
	}
	
}
