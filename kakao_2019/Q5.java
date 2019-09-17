package kakao_2019;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 
		// x, y, a(0 : 기둥 , 1 : 보), b ( 0:삭제 , 1;설치)
		int[][] build_frame = 	{{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}};
		calc(n, build_frame);
	}
	
	public static void calc(int n, int[][] build_frame) {
		
		int[][] status = new int[n][3];
		
		for(int i=0; i<status.length; i++) {
			status[i][2] = -1;		// 건축상태 0 -> -1로 변경
		}
		
		
		for(int i=0; i<build_frame.length; i++) {
			// 설치
			if(build_frame[i][3] == 1) {
				install(status, build_frame[i][0], build_frame[i][1], build_frame[i][2]);
			} else if(build_frame[i][3] == 0) {
			//	delelte();
			}
		}
		
		for(int i=0; i<status.length; i++) {
			for(int j=0; j<status[i].length; j++) {
				System.out.print(status[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void install(int[][] status, int x, int y, int struc) {
		
		// 규칙에 맞는지 체크 - 안맞으면 return;
		if(struc==0) {	// 기둥
			for(int i=0; i<status.length; i++) {
				if( (y-1 > 0) ||
					(status[i][0] == x && status[i][1] == y-1 && status[i][2] == 0) ||	// 밑에가 기둥인 경우
					(status[i][0] == x-1 && status[i][1] == y && status[i][2] == 1) || 	// 보의 왼쪽인 경우
					(status[i][0] == x+1 && status[i][1] == y && status[i][2] == 1) 	// 보의 오른쪽인 경우
				) {	
					int[] tmp = new int[3];
					tmp[0] = x;
					tmp[1] = y;
					tmp[2] = struc;
					
					status[status.length][0] = x;
					status[status.length][1] = y;
					status[status.length][2] = struc;
					
				}
			}
		}
		if(struc == 1) {
			for(int i=0; i<status.length; i++) {
				if( (status[i][0] == x && status[i][1] == y-1 && status[i][2] == 0) ||	// 밑에가 기둥인 경우
					((status[i][0] == x-1 && status[i][1] == y && status[i][2] == 1) && 	// 보의 왼쪽인 경우
					(status[i][0] == x+1 && status[i][1] == y && status[i][2] == 1)) 	// 보의 오른쪽인 경우
				) {	
					status[status.length][0] = x;
					status[status.length][1] = y;
					status[status.length][2] = struc;
					
				}
			}
		}
		
//		
//		if(struc==1) {	// 보
//			if(! (status[x][y] == 1 && status[x+1][y]==1) ||
//				 (status[x][y] == 1 && y-1 > 0 && status[x][y-1] == 1)
//			) {
//				return;
//			}
//			
//			status[x][y] = 1;
//			status[x+1][y] = 1;
//		}
	}
	
	public static void delete(int[][] status, int x, int y, int struc) {
		
		// 규칙에 맞는지 체크 - 안맞으면 return;
		if(struc==0) {	// 기둥
			if( status[x][y-1] == 0) {
				return;
			}
			status[x][y+1] = 0;
		}
		
		if(struc==1) {	// 보
//			if( status[x-1]
//					
//			) {
//				return;
//			}
			
			status[x+1][y] = 0;
			
		}
	}
}
