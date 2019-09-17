package kakao;

public class BlockGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,0,0,0,0,9,0,0,0,0}
						,{0,0,0,0,0,9,0,0,0,0}
						,{0,0,7,0,0,9,9,8,0,0}
						,{0,0,7,7,7,8,8,8,0,0}
						,{0,6,0,0,0,0,4,0,0,0}
						,{0,6,0,0,0,0,4,4,0,0}
						,{0,6,6,0,3,0,4,0,0,0}
						,{0,0,0,2,3,0,0,0,5,5}
						,{1,2,2,2,3,3,0,0,0,5}
						,{1,1,1,0,0,0,0,0,0,5}};
		
		
		// 4, 1, 2, 6, 5, 3
		int result = calc(board);
		System.out.println(result);
	}

	public static int calc(int[][] board) {

		int cnt = 0;
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				// 0이 아닌 블록을 만났을 경우
				if(board[i][j] != 0) {
					// 삭제가능 블록 여부
					// ================== One ==================
					if (i+1<board.length && 
						j+2 < board[i].length &&
						board[i][j] == board[i+1][j] &&
						board[i][j] == board[i+1][j+1] &&
						board[i][j] == board[i+1][j+2]
					) {
						
						boolean delAble = true;
						// 해당 블록 위에 제거 안된 블록이 있는지 확인
						for(int k=0; k<i+1; k++) {
							if( board[k][j+1] !=0 ||
								board[k][j+2] !=0
							) {
								delAble = false;
								break;
							}
							
						}
						if(delAble) {
							cnt++;
							board[i][j] = 0;
							board[i+1][j] = 0;
							board[i+1][j+1] = 0;
							board[i+1][j+2] = 0;
							j = 0;		// 두줄인  모양인 경우 처음부터 다시 검색
							//System.out.println("DELETE 1  ");
							//printArr(board);
							continue;
						}
					}
					
					
					// ================== Two ==================
					if (i+2 < board.length && 
						j-1 >= 0 &&
						board[i][j] == board[i+1][j] &&
						board[i][j] == board[i+2][j] &&
						board[i][j] == board[i+2][j-1]
					) {
						
						boolean delAble = true;
						// 해당 블록 위에 제거 안된 블록이 있는지 확인
						for(int k=0; k<i+2; k++) {
							if( board[k][j-1] != 0) {
								delAble = false;
								break;
							}
							
						}
						if(delAble) {
							cnt++;
							board[i][j] = 0;
							board[i+1][j] = 0;
							board[i+2][j] = 0;
							board[i+2][j-1] = 0;
							//System.out.println("DELETE 2  ");
							//printArr(board);
							continue;
						}
					}
					
					// ================== Three ==================
					if (i+2 < board.length && 
						j+1 < board[i].length &&
						board[i][j] == board[i+1][j] &&
						board[i][j] == board[i+2][j] &&
						board[i][j] == board[i+2][j+1]
					) {
						
						boolean delAble = true;
						// 해당 블록 위에 제거 안된 블록이 있는지 확인
						for(int k=0; k<i+2; k++) {
							if( board[k][j+1] != 0 ) {
								delAble = false;
								break;
							}
							
						}
						if(delAble) {
							cnt++;
							board[i][j] = 0;
							board[i+1][j] = 0;
							board[i+2][j] = 0;
							board[i+2][j+1] = 0;
							//System.out.println("DELETE 3  ");
							//printArr(board);
							continue;
						}
					}
					
					
					// ================== Four ==================
					if (i+1<board.length && 
						j-2 >= 0 &&
						board[i][j] == board[i+1][j] &&
						board[i][j] == board[i+1][j-1] &&
						board[i][j] == board[i+1][j-2]
					) {
						
						boolean delAble = true;
						// 해당 블록 위에 제거 안된 블록이 있는지 확인
						for(int k=0; k<i+1; k++) {
							if( board[k][j-1] !=0 ||
								board[k][j-2] !=0
							) {
								delAble = false;
								break;
							}
							
						}
						if(delAble) {
							cnt++;
							board[i][j] = 0;
							board[i+1][j] = 0;
							board[i+1][j-1] = 0;
							board[i+1][j-2] = 0;
							j = 0;		// 두줄인  모양인 경우 처음부터 다시 검색
							///System.out.println("DELETE 4  ");
						//	printArr(board);
							continue;
						}
					}
					
					// ================== Five ==================
					if (i+1<board.length && 
						j-1 >= 0 &&
						j+1 < board[0].length &&
						board[i][j] == board[i+1][j-1] &&
						board[i][j] == board[i+1][j] &&
						board[i][j] == board[i+1][j+1]
					) {
						
						boolean delAble = true;
						// 해당 블록 위에 제거 안된 블록이 있는지 확인
						for(int k=0; k<i+1; k++) {
							if( board[k][j-1] !=0 ||
								board[k][j+1] !=0
							) {
								delAble = false;
								break;
							}
							
						}
						if(delAble) {
							cnt++;
							board[i][j] = 0;
							board[i+1][j-1] = 0;
							board[i+1][j] = 0;
							board[i+1][j+1] = 0;
							//System.out.println("DELETE 5 ");
							j = 0;		// 두줄인  모양인 경우 처음부터 다시 검색
							//printArr(board);
							continue;
						}
					}
					
				}
			}
			
		}
		return cnt;
		
	}
	
	public static void printArr(int[][] arr){
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
