package kakao;

import java.util.ArrayList;
import java.util.List;

public class Database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] relation = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
		List<String> result = new ArrayList<String>();
		
		calc(relation, result);
		
		
		for(String str : result) {
			System.out.println(str);
		}
	}
	
	public static void calc(String[][] relation, List<String> saveList) {
		
		int count = 0;
		
		
		
		for(int i=1; i<=relation[0].length; i++) {
			calc2(relation, saveList, i);
		}
		
		
//		for(int j=0; j<relation[0].length; j++) {
//			List<String> list = new ArrayList<String>();
//			for(int i=0; i<relation.length; i++) {
//				if(list.contains(relation[i][j])) {
//					break;
//				} else {
//					list.add(relation[i][j]);
//				}
//			}
//			// 전부 추가된 경우 모두 다른 값임으로
//			if(list.size() == relation.length) {
//				saveList.add(String.valueOf(j));
//			}
//		}
		
		
		
	}
	
	public static void calc2(String[][] relation, List<String> saveList, int col) {
		
		
		for(int j=0; j<relation[0].length; j++) {
			List<String> list = new ArrayList<String>();
			for(int i=0; i<relation.length; i++) {
				if(list.contains(relation[i][j])) {
					break;
				} else {
					list.add(relation[i][j]);
				}
			}
			// 전부 추가된 경우 모두 다른 값임으로
			if(list.size() == relation.length) {
				saveList.add(String.valueOf(j));
			}
		}

	}
}
