package kakao_2018;

import java.util.ArrayList;
import java.util.List;

public class Webpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "blind";
		String[] pages = {"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://a.com\"/>\n</head>  \n<body>\nBlind Lorem Blind ipsum dolor Blind test sit amet, consectetur adipiscing elit. \n<a href=\"https://b.com\"> Link to b </a>\n</body>\n</html>"
						, "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://b.com\"/>\n</head>  \n<body>\nSuspendisse potenti. Vivamus venenatis tellus non turpis bibendum, \n<a href=\"https://a.com\"> Link to a </a>\nblind sed congue urna varius. Suspendisse feugiat nisl ligula, quis malesuada felis hendrerit ut.\n<a href=\"https://c.com\"> Link to c </a>\n</body>\n</html>"
						, "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://c.com\"/>\n</head>  \n<body>\nUt condimentum urna at felis sodales rutrum. Sed dapibus cursus diam, non interdum nulla tempor nec. Phasellus rutrum enim at orci consectetu blind\n<a href=\"https://a.com\"> Link to a </a>\n</body>\n</html>"};
		
		int result = calc(word, pages);
		
		
	}
	
	public static int calc(String word, String[] pages) {

		Page[] pArr = new Page[pages.length];
		for(int i=0; i<pages.length; i++) {
			Page page = new Page(pages[i]);
			pArr[i] = page;
			pArr[i].calcMatchPoint(word);
			System.out.println("gibon : " + page.basic_point + "   link : " + page.link_point);
		}
		
		for(int i=0; i<pArr.length; i++) {
			pArr[i].point += pArr[i].basic_point;
			
			for(int j=0; j<pArr[i].link.size(); j++) {
				for(int k=0; k<pArr.length; k++) {
					if(pArr[k].url.equals(pArr[i].link.get(j))) {
						System.out.println("======================================");
						System.out.println(pArr[k].url);
						System.out.println(pArr[i].basic_point);
						System.out.println(pArr[k].basic_point);
						System.out.println(pArr[k].link_point);
						System.out.println("======================================");
						pArr[k].point = pArr[k].point + (double)pArr[i].basic_point/pArr[i].link_point;
						// pArr[i].point =  (double)pArr[k].basic_point / pArr[k].link_point;
					}
				}
			}
		}
		
		double max = 0;
		int maxi = 0;
		for(int i=0; i<pArr.length; i++) {
			if(pArr[i].point > max) {
				max = pArr[i].point;
				maxi = i;
			}
			System.out.println(pArr[i].point);
		}
		
		return maxi;
	}
}


class Page{
	String page;
	int basic_point;
	int link_point;
	String url;
	List<String> link;
	double point;
	
	Page(String page){
		this.page = page;
		
		link = new ArrayList<String>();
		
		String[] tagArr = page.split("<");		// 테그 별로 분리
		for(int i=0; i<tagArr.length; i++) {
			if(tagArr[i].startsWith("meta")){
				String[] metaArr = tagArr[i].substring(5).split(" ");
				for(int j=0; j<metaArr.length; j++) {
					// System.out.println(metaArr[j]);
					String[] arr = metaArr[j].split("=");
					for(int k=0; k<arr.length; k++) {
						// System.out.println(arr[k].substring(arr[k].length() - 7));
						if("content".equals(arr[k].substring(arr[k].length() - 7))) {
							// System.out.println("meta : " +arr[k+1].substring(0, arr[k+1].lastIndexOf("\"")+1));
							url = arr[k+1].substring(0, arr[k+1].lastIndexOf("\"")+1);
						}
					}
				}
			}
			
			if(tagArr[i].startsWith("a")) {
				String[] aArr = tagArr[i].substring(2, tagArr[i].lastIndexOf(">")).split(" ");
				
				link_point++;
				for(int j=0; j<aArr.length; j++) {
					// System.out.println(aArr[j]);
					String[] arr = aArr[j].split("=");
					for(int k=0; k<arr.length; k++) {
						// System.out.println(arr[k].substring(arr[k].length() - 7));
						if("href".equals(arr[k].substring(arr[k].length() - 4))) {
							// System.out.println("link : " + arr[k+1].substring(0, arr[k+1].lastIndexOf("\"")+1));
							link.add(arr[k+1].substring(0, arr[k+1].lastIndexOf("\"")+1));
						}
					}
				}
			}
		}
		
	}
	
	public void calcMatchPoint(String word) {
		Boolean tagYn = false;
		
		StringBuilder strBuilder = new StringBuilder();
		
		for(int i=0; i<page.length(); i++) {
			
			// TO-DO 문자로 들어오는 경우 체크
			if(page.charAt(i) == '>') {
				tagYn = false;
				continue;
			}
			// 테그인 경우 넘어감
			if(tagYn) {
				continue;
			}
						
			strBuilder.append(page.charAt(i));
		}
		
		
		 
		String str = strBuilder.toString().replaceAll("[^a-zA-Z ]", " ");
		
		// System.out.println(str);
		
		String[] tmpArr = str.split(" ");
		for(int i=0; i<tmpArr.length; i++) {
			if(tmpArr[i].equalsIgnoreCase(word)) {
				basic_point++;
			}
		}
		// System.out.println(cnt);
	}
	
}