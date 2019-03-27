package judge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11718 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<100; i++) {
			if(scan.hasNextLine()){
                String str = scan.nextLine();
                if(str == null || str.isEmpty()) {
				    break;
			    } else {
			    	list.add(str);
			    }
            } else {
                break;
            }
		}
		
        for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
