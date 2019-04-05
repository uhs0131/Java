package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q7568 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int tcase = Integer.parseInt(br.readLine());
			ArrayList<People> pList = new ArrayList<People>();
			
			for(int i=0; i<tcase; i++) {
				String[] tmp = br.readLine().split(" ");
				int height = Integer.parseInt(tmp[0]);
				int weight = Integer.parseInt(tmp[1]);
				
				People p = new People();
				p.setHeight(height);
				p.setWeight(weight);
				pList.add(p);
				
			}
			
			for(int i=0; i<tcase; i++) {
				for(int j=0; j<tcase; j++) {
					pList.get(i).compare(pList.get(j));
				}
			}
			
			for(People p : pList) {
				System.out.println(p.getGrade());
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class People{
	
	private int height = 0;
	private int weight = 0;
	private int grade  = 1;
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	public void compare(People p) {
		
		if(p.getHeight() > getHeight() && p.getWeight() > getWeight()) {
			grade++;
		}
	}
}