package cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	
	public static void main(String[] args) {
		int[][] param = {{1,4},{3,4},{3,10}};
		int[] a = solution(param);
		
		System.out.println(a);
		
	}
	
    private static int[] solution(int[][] v) {
        int[] answer = new int[2];
        
        int x = 0;
        int y = 0;

        for(int i=1; i<3; i++) {
            if(v[0][0] == v[i][0]) {
                x = 3 - i;
            }

            if(v[0][1] == v[i][1]) {
                y = 3 - i;
            }
        }
        
        answer[0] = v[x][0];
        answer[1] = v[y][1];
           
        return answer;
    }
}