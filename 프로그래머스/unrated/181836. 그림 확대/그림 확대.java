import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < picture.length; i++){
            String temp = "";
            for(int j = 0; j < picture[i].length(); j++){
                String a = picture[i].substring(j, j + 1);
                int cnt = k;
                while(cnt > 0){
                    temp = temp + a;
                    cnt--;
                }
            }
            
            for(int j = 0; j < k; j++){
                list.add(temp);
            }
        }

        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
 
        return answer;
    }
}