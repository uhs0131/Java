package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1260 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String[] tmp = br.readLine().split(" ");
			int point = Integer.parseInt(tmp[0]);	// 정점의 수
			int xian = Integer.parseInt(tmp[1]);	// 간선의 수 
			int start = Integer.parseInt(tmp[1]);
			
			Graph gh = new Graph(xian);
			Queue q = new Queue();
			
			for(int i=0; i<xian; i++) {
				String[] tmp1 = br.readLine().split(" ");
				
				gh.insHang(Integer.parseInt(tmp1[0]), Integer.parseInt(tmp1[1]));
			}
			
			while(q.size() != 0) {
				System.out.println(q.pop());
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class Graph{
	int[][] hang;
	
	int size = 0;
	
	Graph(int xian){
		size = xian;
		hang = new int[size][size];
	}
	
	public void insHang(int start, int end) {
		hang[start][end] = 1;
		hang[end][start] = 1;
	}
	
	public void search(int start, Queue q) {
		for(int i=0; i<size; i++) {
			if(hang[start][i] == 1) {
				q.push(i);
				hang[start][i] = -1;
				search(i,q);
			}
		}
	}
	
}
