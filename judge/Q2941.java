package judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str = br.readLine();
		// int idx = str.indexOf("c=");
		croatia c = new croatia();
		c.setStr(str);
		c.countAlpabet();
		
		System.out.println(c.getCount());
	}

}

class croatia {
	// c=, c-, dz=, d-, lj, nj, s=, z=
	String str = "";
	int count = 0;
	
	public void setStr(String str) {
		this.str = str;
		this.count = str.length();
		
	}
	
	public int getCount() {
		return count;
	}
	
	public void countAlpabet() {
		countAlpabet(this.str);
	}
	
	public void countAlpabet(String str) {
		if(str.indexOf("c=") > -1) {
			count--;
			countAlpabet(str.substring(0, str.indexOf("c=")));
			countAlpabet(str.substring(str.indexOf("c=")+2));
		} else if(str.indexOf("c-") > -1) {
			count--;
			countAlpabet(str.substring(0, str.indexOf("c-")));
			countAlpabet(str.substring(str.indexOf("c-")+2));
		} else if(str.indexOf("dz=") > -1) {
			count-=2;
			countAlpabet(str.substring(0, str.indexOf("dz=")));
			countAlpabet(str.substring(str.indexOf("dz=")+3));
		} else if(str.indexOf("d-") > -1) {
			count--;
			countAlpabet(str.substring(0, str.indexOf("d-")));
			countAlpabet(str.substring(str.indexOf("d-")+2));
		} else if(str.indexOf("lj") > -1) {
			count--;
			countAlpabet(str.substring(0, str.indexOf("lj")));
			countAlpabet(str.substring(str.indexOf("lj")+2));
		} else if(str.indexOf("nj") > -1) {
			count--;
			countAlpabet(str.substring(0, str.indexOf("nj")));
			countAlpabet(str.substring(str.indexOf("nj")+2));
		} else if(str.indexOf("s=") > -1) {
			count--;
			countAlpabet(str.substring(0, str.indexOf("s=")));
			countAlpabet(str.substring(str.indexOf("s=")+2));
		} else if(str.indexOf("z=") > -1) {
			count--;
			countAlpabet(str.substring(0, str.indexOf("z=")));
			countAlpabet(str.substring(str.indexOf("z=")+2));
		} 
	}
}