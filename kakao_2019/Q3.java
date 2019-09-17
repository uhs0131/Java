package kakao_2019;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
		int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		
		calc(key, lock);
	}
	
	public static void calc(int[][] key, int[][] lock) {
		// 정사각형임으로
		int key_length = key.length;
		
		int[][] key1 = new int[key_length][key_length];		// 위아래
		int[][] key2 = new int[key_length][key_length];		// 위아래
		int[][] key3 = new int[key_length][key_length];		// 위아래
		for(int i=0; i<key_length; i++) {
			for(int j=0; j<key_length; j++) {
				//System.out.print(key[key_length-i-1][key_length-j-1] + " ");
				key1[i][j] = key[key_length-i-1][key_length-j-1];
				
				key2[i][j] = key[j][key_length-i-1];
				
				// System.out.print(key[key_length-j-1][i] + " ");
				
				key3[i][j] = key[key_length-j-1][i];
				
			}
//			System.out.println();
		}
	//	System.out.println("===========================");
		
		boolean y1 = false;
		boolean y2 = false;
		boolean y3 = false;
		for(int i=0; i<lock.length; i++) {
			for(int j=0; j<lock.length; j++) {
				
			}
		}
	}
}
