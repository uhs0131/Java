package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q1260 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String[] tmp = br.readLine().split(" ");
			int point = Integer.parseInt(tmp[0]);	// 정점의 수
			int xian = Integer.parseInt(tmp[1]);	// 간선의 수 
			int start = Integer.parseInt(tmp[2]);	// start 하는 Node
			
			Graph gh = new Graph(xian, point);
//			Queue q = new Queue();
//			
			for(int i=0; i<xian; i++) {
				String[] tmp1 = br.readLine().split(" ");
				gh.insHang(Integer.parseInt(tmp1[0]), Integer.parseInt(tmp1[1]));
			}
			gh.searchDFS(start);
			System.out.println();
			gh.srchBFS(start);
//				gh.insHang(Integer.parseInt(tmp1[0]), Integer.parseInt(tmp1[1]));
//			}
//			
//			while(q.size() != 0) {
//				System.out.println(q.pop());
//			}
//			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class Graph{
	int[][] hang;
	int[] point;
	int[] point2;
	int size = 0;
	Queue<Integer> queue = new LinkedList<Integer>();
	
	Graph(int xian, int point){
		
		size = xian;
		hang = new int[point][point];
		this.point = new int[point];
		this.point2 = new int[point];
	}
	
	public void insHang(int start, int end) {
		hang[start-1][end-1] = 1;
		hang[end-1][start-1] = 1;
	}
	
	public void searchDFS(int start) {

		for(int i=0; i<point.length; i++) {

			//System.out.println("size : " + size);
			//System.out.println("start : " + start  + "   i : " + i);
			if(point[i] == 1) {			// 이미 추가된 노드는 방문하지 않음
				continue;
			}
			
		// System.out.println("start : " + start  + "   i : " + i);
			if(point[start-1] != 1) {			// 방문중인 노드 출력하고 노드 방문한 것 표시하기
				System.out.print(start + " ");
				point[start-1] = 1;
			}
			
			if( hang[start-1][i] == 1 || hang[i][start-1] == 1 ) {	// 간선이 연결되어 있는 노드 탐색
				
				searchDFS(i+1);
			}
		}
	}
	
	public void srchBFS(int start) {
		point2[start-1] = 1;
		System.out.print(start + " ");
		searchBFS(start);
	}
	
	public void searchBFS(int start) {
		
		int tmp[] = new int[point2.length];
		int tmpCnt = 0;
		
		
		for(int i=0; i<point2.length; i++) {

			if(point2[i] == 1) {			// 이미 갔던 노드는 방문하지 않음
				continue;
			}
			
			//System.out.println("start : " + start  + "   i : " + i);
			
			if( hang[start-1][i] == 1 || hang[i][start-1] == 1 ) {
				// System.out.print(i+1 + " ");
				queue.add(i+1);
				tmp[tmpCnt] = i+1;
				tmpCnt++;
				// searchBFS(i+1);
				point2[i] = 1;
			}
		}
		
		if(!queue.isEmpty()) {
			System.out.print(queue.peek() + " ");
			searchBFS(queue.poll());
		}
		
	}
}
