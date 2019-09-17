package kakao;

public class W1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		
		int cnt = countPrime(nums);
		System.out.println(cnt);
	}
	
	public static int countPrime(int[] nums) {
		
		int cnt = 0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				for(int k=j+1; k<nums.length; k++) {
					int num = nums[i] + nums[j] + nums[k];
					//  에라토스테네스의 접근 사용
					boolean yn = true;
					for(int n=2; n<=Math.sqrt(num); n++) {
						if(num % n == 0) {
							yn = false;
							break;
						}
					}
					if(yn) {
						// System.out.println(num);
						cnt++;
					}
				}
			}
		}
		
		return cnt;
				
	}
}
