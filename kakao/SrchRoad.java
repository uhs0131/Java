package kakao;

public class SrchRoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] nodeinfo = {{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}};

		// y축에 대하여 내림차순, y가 같은 경우 x에 대하여 오름차순으로 정렬한다.
		bubbleSort(nodeinfo);
		
		Tree tree = new Tree();
		
		
		Node root_node = new Node(nodeinfo[0][0], nodeinfo[0][1], null, null);
		tree.root = root_node;

		// Node top = root_node;
		
		Node tmpNode = root_node;
		for(int i=1; i<nodeinfo.length; i++) {
			Node node = new Node(nodeinfo[i][0], nodeinfo[i][1], null, null);

			if(node.x < tmpNode.x) {
				tmpNode.preNode = node;
				
			} else {
				tmpNode.nextNode = node;
			}
			
			// 다음 스텝
			if(tmpNode.y != nodeinfo[i][1]) {
				tmpNode = node;
				// node 만들기
			}
			
		}
		
		
		for(int i=0; i<nodeinfo.length; i++) {
			// Node node = new Node(nodeinfo[i][0], nodeinfo[i][1], null, null);
			
		}
			
	}	
	
	
	
	
	// 2 중 배열 BubbleSort
	private static void bubbleSort(int[][] arr) {
		bubbleSort(arr, arr.length-1);
	}
	
	private static void bubbleSort(int[][] arr, int last) {
		if(last > 0) {
			for(int i = 1; i<= last; i++) {
				// y에 대해서 내림차순 정렬
				if(arr[i-1][1] < arr[i][1]) {
					swap(arr, i-1, i);
				} 
				// y가 같은 경우
				else if(arr[i-1][1] == arr[i][1]) {
					// x에 대해여 오름챃순 정렬
					if(arr[i-1][0] > arr[i][0]) {
						swap(arr, i-1, i);
					}
				}
			}
			bubbleSort(arr, last-1);
		}
	}
	
	private static void swap(int[][] arr, int index1, int index2) {
		int tmp = arr[index1][0];
		arr[index1][0] = arr[index2][0];
		arr[index2][0] = tmp;
		
		int tmp1 = arr[index1][1];
		arr[index1][1] = arr[index2][1];
		arr[index2][1] = tmp1;
	}
}


class Node {
	
	int x;
	int y;
	Node topNode;
	Node preNode;
	Node nextNode;
	
	Node(int x, int y, Node preNode, Node nextNode){
		this.x = x;
		this.y = y;
		this.preNode = preNode;
		this.nextNode = nextNode;
	}
	
	public void setPre(Node node){
		this.preNode = node;
	}
	
	public void setNext(Node node) {
		this.nextNode = node;
	}
}

class Tree{
	
	Node root;
	

	public void addNode(Node node) {
		
	}
	
}