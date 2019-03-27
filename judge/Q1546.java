package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Q1546 {

public static void main(String[] args) throws IOException {
    Vector<Integer> grade = new Vector<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    while(st.hasMoreTokens()) {
        grade.add(Integer.parseInt(st.nextToken()));
    }
    Collections.sort(grade);
    int m = grade.lastElement(); 
    float sum = 0; 
    for(int i=0; i<grade.size(); i++) {
			sum = sum + (grade.get(i)*100)/(float)m;	
			System.out.println(sum);
		}
		System.out.println(sum/testCase);
	}
}
