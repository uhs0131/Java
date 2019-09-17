package kakao;

public class W2 {

	public static void main(String[] args) {
		
		int num = 100000;			// 1 ~ 100000
		int cache[] = new int[num + 1];
		int a = fabonacci(num, cache);
		System.out.println(a);
	}
	
	public static int fabonacci(int n, int[] cache) {
		
		if(cache[n] != 0) {
			return cache[n];
		} else {
			if(n == 0) {
				return 0;
			} else if(n == 1) {
				return 1;
			} else {
				cache[n] = fabonacci(n-1, cache) + fabonacci(n-2, cache);
				
				if(cache[n] > 1234567) {
					cache[n] = cache[n] % 1234567;
				}
				
				return cache[n];
			}
		}
	}
}

