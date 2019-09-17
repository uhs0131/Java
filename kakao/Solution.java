package kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = srchLog(record);
        return answer;
    }
    
    private static String[] srchLog(String[] record) {
        
        List<User> list = new ArrayList<User>();
        
        HashMap<String, String> map = new HashMap<String, String>();		// id , nickname
        Queue<User> queue = new LinkedList<User>();
        
        for(int i=0; i<record.length; i++) {
        	String[] tmpStr = record[i].split(" ");
        	
        	String action = tmpStr[0];
        	String id = tmpStr[1];
        	String nickname = "";
    		if(tmpStr.length == 3) {
    			nickname = tmpStr[2];
    		}
        	
        	if("Enter".equals(action)) {
        		
        		User user = new User(id, nickname);
        		// 이미 들어있는 유저라면 기존 채팅방 닉네임 변경
        		if(map.get(id) == nickname) {
        			map.replace(id, nickname);
        		} else {
        			map.put(id, nickname);
        		}
        		
        		// action 쌓는 큐
        		queue.add(new User(id, action));
        	} else if("Leave".contentEquals(action)) {
        		// action 쌓는 큐
        		queue.add(new User(id, action));
        	} else if("Change".equals(action)) {
        		// 닉네임 변경
        		map.replace(id, nickname);
        	}
        }
        
        int j = 0;
        String[] answer = new String[queue.size()];
        while(!queue.isEmpty()) {
        	User user = queue.poll();
        	switch (user.action) {
        		case "Enter":
        			answer[j] = map.get(user.id) + "님이 들어왔습니다.";
        			break;
        		case "Leave":
        			answer[j] = map.get(user.id) + "님이 나갔습니다.";
        			break;
        	}
        	j++;
        }
        return answer;
    }
}

class User {
	String id;
	String action;
	
	User(String id, String action){
		this.id = id;
		this.action = action;
	}
}